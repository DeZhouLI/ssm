package com.lidezhou.controller;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GetValue {
	@RequestMapping(value = "/value")
	public String getValueAndDemonstrate(String username, int age, HttpServletRequest request,
			HttpServletResponse response) throws UnsupportedEncodingException {

		System.out.println(request.getCharacterEncoding());

		System.out.println(response.getCharacterEncoding());

		request.setAttribute("username", username);
		request.setAttribute("age", age);

		return "show";
	}

}