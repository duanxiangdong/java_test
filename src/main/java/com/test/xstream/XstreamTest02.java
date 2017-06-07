package com.test.xstream;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.CompactWriter;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class XstreamTest02 {
	public static void main(String[] args) {
		XStream xstream = new XStream();
		xstream.processAnnotations(Alipay.class);
		Alipay alipay = new Alipay();
		alipay.setError("11");
		alipay.setIsSuccess("111");

		String xml = xstream.toXML(alipay);
//		System.out.println("生成文件:"+xml);
//		System.out.println(xml);

//		String test = "6";
//		String testXml = xstream.toXML(test);
//		System.out.println(testXml.replaceAll("\tr",""));

		Pattern p = Pattern.compile("\\s{2,}|\t|\r|\n");

		Matcher m = p.matcher(xml);
		xml = m.replaceAll("");
		System.out.println(xml);
	}
}
