package org.jbakery.httpclient;

public class HttpStatusNotSuccessException
	extends RuntimeException
{
	public HttpStatusNotSuccessException(final HttpStatus status)
	{
		super(String.format("Status \"%s\" does not indicate success.", status));
	}
}
