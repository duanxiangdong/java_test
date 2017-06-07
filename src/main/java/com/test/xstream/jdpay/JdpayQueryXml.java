package com.test.xstream.jdpay;

import com.test.xstream2.PersonBean;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Created by xiangdong.duan on 2017/6/6.
 */
@XStreamAlias("jdpay")
public class JdpayQueryXml {
    @XStreamAlias("version")
    private String version;
    @XStreamAlias("merchant")
    private String merchant;
    @XStreamAlias("tradeNum")
    private String tradeNum;
    @XStreamAlias("oTradeNum")
    private String oTradeNum;
    @XStreamAlias("sign")
    private String sign;

    public static void main(String[] args) {
        String xmlHead = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n";
        JdpayQueryXml jdpayQueryXml = new JdpayQueryXml();
        XStream xstream = new XStream();
        StringBuilder sb = new StringBuilder(xmlHead);
        sb.append(xstream.toXML(jdpayQueryXml));
        xstream.processAnnotations(PersonBean.class);
        System.out.println(sb.toString());
    }
}
