package com.wonsama.wsm.parse;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.wonsama.wsm.parse.vo.WsmUrlResultVo;

public class WsmUrlParser {

	//[REF] http://www.mkyong.com/java/how-to-send-http-request-getpost-in-java/
	
	private static final String USER_AGENT = "Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/32.0.1700.107 Safari/537.36";
	private static final String REFERER = "http://translate.google.com/?hl=ko";
	private static final String METHOD_GET = "GET";
	private static final String METHOD_POST = "POST";

	/**
	 * 
	 * @param url
	 * @throws Exception
	 */
	public static WsmUrlResultVo sendGet(String url) throws Exception {

		//SET DEFAULT
		WsmUrlResultVo res = new WsmUrlResultVo();
		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		con.setRequestMethod( METHOD_GET );
		
		//ADD REQUEST HEADER
		con.setRequestProperty("User-Agent", USER_AGENT);
		con.setRequestProperty("Referer", REFERER);
		
		//WRITE RESULT
		BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();
		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();
		
		//SET
		res.setCode( con.getResponseCode() );	//CODE
		res.setUrl( url );	//URL
		res.setMsg( response.toString() );	//MESSAGE
		
		return res;
	}
}
