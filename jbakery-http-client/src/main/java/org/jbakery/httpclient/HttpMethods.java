package org.jbakery.httpclient;

public final class HttpMethods
{
	public static final HttpMethod
		Connect = new HttpMethod("CONNECT"),
		Delete = new HttpMethod("DELETE"),
		Get = new HttpMethod("GET"),
		Head = new HttpMethod("HEAD"),
		Options = new HttpMethod("OPTIONS"),
		Patch = new HttpMethod("PATCH"),
		Post = new HttpMethod("POST"),
		Put = new HttpMethod("PUT"),
		Trace = new HttpMethod("TRACE");

	private HttpMethods() { }
}
