package com.dascom.yunwebsite.utils;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;


/** * @author  作者 E-mail: 
* @date 创建时间：2018年8月25日 下午11:05:49 
* @version 1.0 
* @parameter  
* @since  
* @return  */
public class FileManager {
	public static void main(String[] args) {
		String url = "https://aisino.yun80.cn/aisinowifitool/android/AisinoWiFiTool.apk";
		String xml = "https://aisino.yun80.cn/aisinowifitool/android/version.xml";
		String ipa = "https://aisino.yun80.cn/aisinowifitool/ios/manifest.plist";
		FileManager manager = new FileManager();
		String length = manager.getFileLength(url);
		System.out.println(length);
		Map<String,String> map = manager.getXml(xml);
		for(String key:map.keySet()) {
			System.out.println(key+"------"+map.get(key));
		}
	}
	
	/**
	 * 通过url获取APP的大小
	 * @param url
	 * @return
	 */
	public String getFileLength(String url) {
		String resultSize = "";
		int MB = 1024*1024;//定义MB的计算常量
		int KB = 1024;//定义KB的计算常量
		int length = 0;
		URL url1;
		try {
			url1 = new URL(url);
			HttpURLConnection urlConnection = (HttpURLConnection) url1.openConnection();
			length = urlConnection.getContentLength();
			DecimalFormat df = new DecimalFormat("0.00");//格式化小数
			if(length/MB >= 1) {
				resultSize = df.format(length/(float)MB)+"MB";
			}else if(length/KB>=1) {
				resultSize = df.format(length/(float)KB)+KB;
			}else {
				resultSize = length+"B";
			}
			urlConnection.disconnect();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return resultSize;
	}
	
	
	
	public Map<String,String> getXml(String url) {
		Map<String,String> resultMap = new HashMap<String,String>();
		SAXReader saxReader = new SAXReader();
		
			try {
				Document document = saxReader.read(url);
				Element root = document.getRootElement();
				String verName = root.element("name").getText();
				String verInfo = root.elementText("Info");
				resultMap.put("versionName", verName);
				resultMap.put("versionInfo", verInfo);
			} catch (DocumentException e) {
				e.printStackTrace();
			}
			
		return resultMap;
		
	}
	

}
