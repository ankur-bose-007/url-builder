package com.bosea.urlbuilder;

import com.bosea.urlbuilder.builder.UrlBuilder;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UrlBuilder.Builder builder = new UrlBuilder.Builder();
		
		builder.setProtocol("https").setHostName("facebook.com").setPortNumber(8080).setPath("profiles");
		
		UrlBuilder urlBuilder = builder.build();
		
		System.out.print(urlBuilder.getUrl());
	}

}
