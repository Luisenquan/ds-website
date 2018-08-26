package com.dascom.yunwebsite.utils;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.dd.plist.XMLPropertyListParser;

/** * @author  作者 E-mail: 
* @date 创建时间：2018年8月26日 下午11:28:03 
* @version 1.0 
* @parameter  
* @since  
* @return  */
public class ReadIpa {
	
	public static void main(String[] args) throws Exception {
		String url = "https://aisino.yun80.cn/aisinowifitool/ios/manifest.plist";
		ReadIpa ipa = new ReadIpa();
		String str = ipa.getIpaUrl(url);
		System.out.println(str);
	}
	
	public String getIpaUrl(String url) throws Exception {
		URL getUrl = new URL(url);
		HttpURLConnection conn = (HttpURLConnection) getUrl.openConnection();
		conn.connect();
		InputStream stream = conn.getInputStream();
		
		return stream.toString();
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
