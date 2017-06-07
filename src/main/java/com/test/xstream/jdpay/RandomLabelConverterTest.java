package com.test.xstream.jdpay;

import com.thoughtworks.xstream.XStream;

/**
 * Created by xiangdong.duan on 2017/6/6.
 */
public class RandomLabelConverterTest {
    public static void main(String[] args) {
        XStream xstream = new XStream();
        xstream.processAnnotations(WechatRefundQueryResultXml.class);
        RandomLabelConverter converter = new RandomLabelConverter();
        xstream.registerConverter(converter);
        String xml = "<xml>\n" +
                "   <appid><![CDATA[wx2421b1c4370ec43b]]></appid>\n" +
                "   <mch_id><![CDATA[10000100]]></mch_id>\n" +
                "   <nonce_str><![CDATA[TeqClE3i0mvn3DrK]]></nonce_str>\n" +
                "   <out_refund_no_0><![CDATA[1415701182]]></out_refund_no_0>\n" +
                "   <out_trade_no><![CDATA[1415757673]]></out_trade_no>\n" +
                "   <refund_count>1</refund_count>\n" +
                "   <refund_fee_0>1</refund_fee_0>\n" +
                "   <refund_id_0><![CDATA[2008450740201411110000174436]]></refund_id_0>\n" +
                "   <refund_status_0><![CDATA[PROCESSING]]></refund_status_0>\n" +
                "   <result_code><![CDATA[SUCCESS]]></result_code>\n" +
                "   <return_code><![CDATA[SUCCESS]]></return_code>\n" +
                "   <return_msg><![CDATA[OK]]></return_msg>\n" +
                "   <sign><![CDATA[1F2841558E233C33ABA71A961D27561C]]></sign>\n" +
                "   <transaction_id><![CDATA[1008450740201411110005820873]]></transaction_id>\n" +
                "</xml>";

        WechatRefundQueryResultXml wechatRefundQueryResultXml = (WechatRefundQueryResultXml)xstream.fromXML(xml);
        System.out.println(wechatRefundQueryResultXml.getAppid());
        System.out.println(wechatRefundQueryResultXml.getMch_id());
    }
}
