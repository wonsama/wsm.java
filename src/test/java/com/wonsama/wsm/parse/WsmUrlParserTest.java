package com.wonsama.wsm.parse;

import static org.junit.Assert.fail;

import org.junit.Test;

import com.wonsama.wsm.parse.vo.WsmUrlResultVo;

public class WsmUrlParserTest {

	@Test
	public void test() {
		
		String url = "http://www.naver.com";
		url = "http://translate.google.com/?hl=ko#en/ko/Changes%20the%20English%20to%20Hangul.";
		try{
			WsmUrlResultVo res = WsmUrlParser.sendGet( url );
			
			System.out.println( res.getMsg() );
			
		}catch(Exception e){
			e.printStackTrace();
		}
		fail("Not yet implemented");
	}

}
