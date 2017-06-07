package com.test.xstream.jdpay;

import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;

/**
 * Created by xiangdong.duan on 2017/6/6.
 */
public class RandomLabelConverter implements Converter {
    public void marshal(Object o, HierarchicalStreamWriter hierarchicalStreamWriter, MarshallingContext marshallingContext) {

    }

    public Object unmarshal(HierarchicalStreamReader reader, UnmarshallingContext unmarshallingContext) {
        WechatRefundQueryResultXml xml = new WechatRefundQueryResultXml();
        while (reader.hasMoreChildren()) {
            reader.moveDown();
            if ("return_code".equals(reader.getNodeName())) {
                xml.setReturn_code(reader.getValue());
            } else if ("return_msg".equals(reader.getNodeName())) {
                xml.setReturn_msg(reader.getValue());
            } else if ("result_code".equals(reader.getNodeName())) {
                xml.setResult_code(reader.getValue());
            } else if ("err_code".equals(reader.getNodeName())) {
                xml.setErr_code(reader.getValue());
            } else if ("err_code_des".equals(reader.getNodeName())) {
                xml.setErr_code_des(reader.getValue());
            } else if ("appid".equals(reader.getNodeName())) {
                xml.setAppid(reader.getValue());
            } else if ("mch_id".equals(reader.getNodeName())) {
                xml.setMch_id(reader.getValue());
            } else if ("nonce_str".equals(reader.getNodeName())) {
                xml.setNonce_str(reader.getValue());
            } else if ("sign".equals(reader.getNodeName())) {
                xml.setSign(reader.getValue());
            } else if ("transaction_id".equals(reader.getNodeName())) {
                xml.setTransaction_id(reader.getValue());
            } else if ("out_trade_no".equals(reader.getNodeName())) {
                xml.setOut_trade_no(reader.getValue());
            } else if ("total_fee".equals(reader.getNodeName())) {
                xml.setTotal_fee(reader.getValue());
            } else if ("fee_type".equals(reader.getNodeName())) {
                xml.setFee_type(reader.getValue());
            } else if ("cash_fee".equals(reader.getNodeName())) {
                xml.setCash_fee(reader.getValue());
            } else if ("cash_fee_type".equals(reader.getNodeName())) {
                xml.setCash_fee_type(reader.getValue());
            } else if ("settlement_total_fee".equals(reader.getNodeName())) {
                xml.setSettlement_total_fee(reader.getValue());
            } else if ("refund_count".equals(reader.getNodeName())) {
                xml.setRefund_count(reader.getValue());
            } else {
                // nothing to do
            }
            reader.moveUp();
        }
        return xml;
    }

    public boolean canConvert(Class aClass) {
        return true;
    }
}
