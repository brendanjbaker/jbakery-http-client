package org.jbakery.httpclient;

public class HttpHeaderNotFoundException
	extends RuntimeException
{
	public HttpHeaderNotFoundException(String httpHeaderName)
	{
		super(String.format("Header name \"%s\" not found.", httpHeaderName));
	}
}
