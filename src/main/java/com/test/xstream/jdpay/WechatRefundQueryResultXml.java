package com.test.xstream.jdpay;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Created by xiangdong.duan on 2017/6/6.
 */

@XStreamAlias("xml")
public class WechatRefundQueryResultXml {
    @XStreamAlias("return_code")
    private String return_code;
    @XStreamAlias("return_msg")
    private String return_msg;

    @XStreamAlias("result_code")
    private String result_code;
    @XStreamAlias("err_code")
    private String err_code;
    @XStreamAlias("err_code_des")
    private String err_code_des;
    @XStreamAlias("appid")
    private String appid;
    @XStreamAlias("mch_id")
    private String mch_id;
    @XStreamAlias("nonce_str")
    private String nonce_str;
    @XStreamAlias("sign")
    private String sign;
    @XStreamAlias("transaction_id")
    private String transaction_id;
    @XStreamAlias("out_trade_no")
    private String out_trade_no;
    @XStreamAlias("total_fee")
    private String total_fee;
    @XStreamAlias("fee_type")
    private String fee_type;
    @XStreamAlias("cash_fee")
    private String cash_fee;
    @XStreamAlias("cash_fee_type")
    private String cash_fee_type;
    @XStreamAlias("settlement_total_fee")
    private String settlement_total_fee;
    @XStreamAlias("refund_count")
    private String refund_count;

    public String getReturn_code() {
        return return_code;
    }

    public void setReturn_code(String return_code) {
        this.return_code = return_code;
    }

    public String getReturn_msg() {
        return return_msg;
    }

    public void setReturn_msg(String return_msg) {
        this.return_msg = return_msg;
    }

    public String getResult_code() {
        return result_code;
    }

    public void setResult_code(String result_code) {
        this.result_code = result_code;
    }

    public String getErr_code() {
        return err_code;
    }

    public void setErr_code(String err_code) {
        this.err_code = err_code;
    }

    public String getErr_code_des() {
        return err_code_des;
    }

    public void setErr_code_des(String err_code_des) {
        this.err_code_des = err_code_des;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getMch_id() {
        return mch_id;
    }

    public void setMch_id(String mch_id) {
        this.mch_id = mch_id;
    }

    public String getNonce_str() {
        return nonce_str;
    }

    public void setNonce_str(String nonce_str) {
        this.nonce_str = nonce_str;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getTransaction_id() {
        return transaction_id;
    }

    public void setTransaction_id(String transaction_id) {
        this.transaction_id = transaction_id;
    }

    public String getOut_trade_no() {
        return out_trade_no;
    }

    public void setOut_trade_no(String out_trade_no) {
        this.out_trade_no = out_trade_no;
    }

    public String getTotal_fee() {
        return total_fee;
    }

    public void setTotal_fee(String total_fee) {
        this.total_fee = total_fee;
    }

    public String getFee_type() {
        return fee_type;
    }

    public void setFee_type(String fee_type) {
        this.fee_type = fee_type;
    }

    public String getCash_fee() {
        return cash_fee;
    }

    public void setCash_fee(String cash_fee) {
        this.cash_fee = cash_fee;
    }

    public String getCash_fee_type() {
        return cash_fee_type;
    }

    public void setCash_fee_type(String cash_fee_type) {
        this.cash_fee_type = cash_fee_type;
    }

    public String getSettlement_total_fee() {
        return settlement_total_fee;
    }

    public void setSettlement_total_fee(String settlement_total_fee) {
        this.settlement_total_fee = settlement_total_fee;
    }

    public String getRefund_count() {
        return refund_count;
    }

    public void setRefund_count(String refund_count) {
        this.refund_count = refund_count;
    }
}