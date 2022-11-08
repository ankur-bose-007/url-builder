package com.bosea.urlbuilder.builder;

public class UrlBuilder {
	private final String protocol;
	private final String hostName;
	private final int portNumber;
	private final String path;
	
	public static class Builder {
		private String protocol;
		private String hostName;
		private int portNumber;
		private String path;
		
		public Builder setProtocol(String protocol) {
			this.protocol = protocol;
			return this;
		}
		
		public Builder setHostName(String hostName) {
			this.hostName = hostName;
			return this;
		}
		
		public Builder setPortNumber(int portNumber) {
			this.portNumber = portNumber;
			return this;
		}
		
		public Builder setPath(String path) {
			this.path = path;
			return this;
		}
		
		public UrlBuilder build() {
			return new UrlBuilder(this);
		}
	}
	
	private UrlBuilder(Builder builder){
		this.protocol = builder.protocol;
		this.hostName = builder.hostName;
		this.portNumber = builder.portNumber;
		this.path = builder.path;
	}
	
	public String getUrl() {
		return this.protocol + "://" + this.hostName + ":" + this.portNumber + "/" + this.path;
	}
}
