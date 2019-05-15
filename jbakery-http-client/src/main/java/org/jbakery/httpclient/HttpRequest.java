package org.jbakery.httpclient;

import org.jbakery.arguments.Argument;

public final class HttpRequest
{
	private final HttpContent content;
	private final HttpHeaderCollection headers;
	private final HttpMethod method;
	private final String url;

	public HttpRequest(final HttpMethod method, final String url)
	{
		this(method, url, HttpHeaderCollections.Empty, HttpContents.Empty);
	}

	public HttpRequest(final HttpMethod method, final String url, final HttpContent content)
	{
		this(method, url, HttpHeaderCollections.Empty, content);
	}

	public HttpRequest(final HttpMethod method, final String url, final HttpHeaderCollection headers)
	{
		this(method, url, headers, HttpContents.Empty);
	}

	public HttpRequest(final HttpMethod method, final String url, final HttpHeaderCollection headers, final HttpContent content)
	{
		this.content = Argument.notNull(content, "content");
		this.headers = Argument.notNull(headers, "headers");
		this.method = Argument.notNull(method, "method");
		this.url = Argument.notNullOrEmpty(url, "url");
	}

	public HttpContent getContent()
	{
		return content;
	}

	public HttpHeaderCollection getHeaders()
	{
		return headers;
	}

	public HttpMethod getMethod()
	{
		return method;
	}

	public String getUrl()
	{
		return url;
	}

	@Override
	public String toString()
	{
		return String.format("%s %s%n%s", method, url, headers);
	}
}
