package org.jbakery.httpclient;

import org.apache.http.client.entity.EntityBuilder;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.entity.ContentType;
import org.jbakery.arguments.Argument;

public final class HttpRequestExecutor
{
	private final org.apache.http.client.HttpClient httpClient;

	public HttpRequestExecutor(final org.apache.http.client.HttpClient httpClient)
	{
		this.httpClient = Argument.notNull(httpClient, "httpClient");
	}

	public HttpResponse execute(final HttpRequest request)
	{
		final var builder = RequestBuilder.create(request.getMethod().getName());

		builder.setUri(request.getUrl());

		if (!request.getContent().isEmpty())
		{

		}
			builder.setEntity(EntityBuilder.create().setContentType(ContentType.APPLICATION_JSON).

		final var apacheHttpRequest =
			RequestBuilder
				.create(request.getMethod().getName())
				.setUri(request.getUrl())
				.build();

		//apacheHttpRequest.

		for (final var header : request.getHeaders().toMap().values())
			apacheHttpRequest.addHeader(header.getName(), header.getValue());

		if (!request.getContent().isEmpty())
			apacheHttpRequest.set
	}
}
