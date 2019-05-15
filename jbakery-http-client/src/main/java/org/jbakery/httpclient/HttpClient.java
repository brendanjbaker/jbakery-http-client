package org.jbakery.httpclient;

import org.jbakery.arguments.Argument;

public final class HttpClient
{
	private final HttpRequestExecutor httpRequestExecutor;

	public HttpClient(final HttpRequestExecutor httpRequestExecutor)
	{
		this.httpRequestExecutor = Argument.notNull(httpRequestExecutor, "httpRequestExecutor");
	}

	public HttpResponse delete(final String url)
	{
		return request(HttpMethods.Delete, url);
	}

	public HttpResponse delete(final String url, final HttpContent content)
	{
		return request(HttpMethods.Delete, url, content);
	}

	public HttpResponse delete(final String url, final HttpContent content, final HttpHeader... headers)
	{
		return request(HttpMethods.Delete, url, content, headers);
	}

	public HttpResponse delete(final String url, final HttpContent content, final HttpHeaderCollection headers)
	{
		return request(HttpMethods.Delete, url, content, headers);
	}

	public HttpResponse delete(final String url, final HttpHeaderCollection headers)
	{
		return request(HttpMethods.Delete, url, headers);
	}

	public HttpResponse get(final String url)
	{
		return request(HttpMethods.Get, url);
	}

	public HttpResponse get(final String url, final HttpContent content)
	{
		return request(HttpMethods.Get, url, content);
	}

	public HttpResponse get(final String url, final HttpContent content, final HttpHeader... headers)
	{
		return request(HttpMethods.Get, url, content, headers);
	}

	public HttpResponse get(final String url, final HttpContent content, final HttpHeaderCollection headers)
	{
		return request(HttpMethods.Get, url, content, headers);
	}

	public HttpResponse get(final String url, final HttpHeaderCollection headers)
	{
		return request(HttpMethods.Get, url, headers);
	}

	public HttpResponse head(final String url)
	{
		return request(HttpMethods.Head, url);
	}

	public HttpResponse head(final String url, final HttpContent content)
	{
		return request(HttpMethods.Head, url, content);
	}

	public HttpResponse head(final String url, final HttpContent content, final HttpHeader... headers)
	{
		return request(HttpMethods.Head, url, content, headers);
	}

	public HttpResponse head(final String url, final HttpContent content, final HttpHeaderCollection headers)
	{
		return request(HttpMethods.Head, url, content, headers);
	}

	public HttpResponse head(final String url, final HttpHeaderCollection headers)
	{
		return request(HttpMethods.Head, url, headers);
	}

	public HttpResponse patch(final String url)
	{
		return request(HttpMethods.Patch, url);
	}

	public HttpResponse patch(final String url, final HttpContent content)
	{
		return request(HttpMethods.Patch, url, content);
	}

	public HttpResponse patch(final String url, final HttpContent content, final HttpHeader... headers)
	{
		return request(HttpMethods.Patch, url, content, headers);
	}

	public HttpResponse patch(final String url, final HttpContent content, final HttpHeaderCollection headers)
	{
		return request(HttpMethods.Patch, url, content, headers);
	}

	public HttpResponse patch(final String url, final HttpHeaderCollection headers)
	{
		return request(HttpMethods.Patch, url, headers);
	}

	public HttpResponse post(final String url)
	{
		return request(HttpMethods.Post, url);
	}

	public HttpResponse post(final String url, final HttpContent content)
	{
		return request(HttpMethods.Post, url, content);
	}

	public HttpResponse post(final String url, final HttpContent content, final HttpHeader... headers)
	{
		return request(HttpMethods.Post, url, content, headers);
	}

	public HttpResponse post(final String url, final HttpContent content, final HttpHeaderCollection headers)
	{
		return request(HttpMethods.Post, url, content, headers);
	}

	public HttpResponse post(final String url, final HttpHeaderCollection headers)
	{
		return request(HttpMethods.Post, url, headers);
	}

	public HttpResponse put(final String url)
	{
		return request(HttpMethods.Put, url);
	}

	public HttpResponse put(final String url, final HttpContent content)
	{
		return request(HttpMethods.Put, url, content);
	}

	public HttpResponse put(final String url, final HttpContent content, final HttpHeader... headers)
	{
		return request(HttpMethods.Put, url, content, headers);
	}

	public HttpResponse put(final String url, final HttpContent content, final HttpHeaderCollection headers)
	{
		return request(HttpMethods.Put, url, content, headers);
	}

	public HttpResponse put(final String url, final HttpHeaderCollection headers)
	{
		return request(HttpMethods.Put, url, headers);
	}

	public HttpResponse request(final HttpRequest request)
	{
		return httpRequestExecutor.execute(request);
	}

	private HttpResponse request(final HttpMethod method, final String url)
	{
		return request(new HttpRequest(method, url));
	}

	private HttpResponse request(final HttpMethod method, final String url, HttpContent content)
	{
		return request(new HttpRequest(method, url, content));
	}

	private HttpResponse request(final HttpMethod method, final String url, HttpContent content, HttpHeader... headers)
	{
		return request(new HttpRequest(method, url, HttpHeaderCollection.create(headers), content));
	}

	private HttpResponse request(final HttpMethod method, final String url, HttpContent content, HttpHeaderCollection headers)
	{
		return request(new HttpRequest(method, url, headers, content));
	}

	private HttpResponse request(final HttpMethod method, final String url, HttpHeaderCollection headers)
	{
		return request(new HttpRequest(method, url, headers));
	}
}
