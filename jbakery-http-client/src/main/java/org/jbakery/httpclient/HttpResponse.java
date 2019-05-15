package org.jbakery.httpclient;

import org.jbakery.arguments.Argument;

public final class HttpResponse
{
	private final HttpContent content;
	private final HttpHeaderCollection headers;
	private final HttpStatus status;

	public HttpResponse(final HttpStatus status, final HttpHeaderCollection headers)
	{
		this(status, headers, HttpContents.Empty);
	}

	public HttpResponse(final HttpStatus status, final HttpHeaderCollection headers, final HttpContent content)
	{
		this.content = Argument.notNull(content, "content");
		this.headers = Argument.notNull(headers, "headers");
		this.status = Argument.notNull(status, "status");
	}

	public void assertSuccess()
	{
		if (!isSuccess())
			throw new HttpStatusNotSuccessException(status);
	}

	public HttpContent getContent()
	{
		return content;
	}

	public HttpHeaderCollection getHeaders()
	{
		return headers;
	}

	public boolean hasContent()
	{
		return !content.isEmpty();
	}

	public boolean isSuccess()
	{
		return status.isSuccess();
	}

	public HttpResponse orThrow()
	{
		assertSuccess();

		return this;
	}

	@Override
	public String toString()
	{
		return String.format("%s%n%s", status, headers);
	}
}
