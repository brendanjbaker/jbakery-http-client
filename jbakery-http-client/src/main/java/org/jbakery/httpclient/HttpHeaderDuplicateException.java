package org.jbakery.httpclient;

public class HttpHeaderDuplicateException
	extends RuntimeException
{
	public HttpHeaderDuplicateException(String httpHeaderName)
	{
		super(String.format("Header name \"%s\" is a duplicate.", httpHeaderName));
	}
}
