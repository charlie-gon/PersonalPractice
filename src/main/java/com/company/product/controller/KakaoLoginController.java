package com.company.product.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.company.common.KakaoAPI;

@Controller
public class KakaoLoginController {
	
	@Autowired KakaoAPI kakaoAPI;
	
	@RequestMapping("/callback")
	public String callback(@RequestParam Map<String,Object> map, HttpSession session) {
		String code = (String) map.get("code");
		String access_token	= kakaoAPI.getAccessToken(code);
		System.out.println("접근 코드 = " + access_token);
		
		Map<String, Object> userInfo = kakaoAPI.getUserInfo(access_token);
		System.out.println("유저 정보 = " + userInfo);
		
		session.setAttribute("access_token", access_token);
		session.setAttribute("nickName", userInfo.get("nickname"));
		
		return "/home";
	}
	
	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		kakaoAPI.kakaoLogout(session.getAttribute("access_token").toString());
		String nickName = (String) session.getAttribute("nickName");
		session.invalidate();
		System.out.println(nickName + "님 로그아웃");
		return "/home";
	}

}
