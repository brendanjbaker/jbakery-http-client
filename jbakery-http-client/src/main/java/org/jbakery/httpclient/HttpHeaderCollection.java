package org.jbakery.httpclient;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.stream.Collectors;
import org.jbakery.arguments.Argument;

public final class HttpHeaderCollection
{
	private final SortedMap<String, HttpHeader> httpHeaders;

	private HttpHeaderCollection(final SortedMap<String, HttpHeader> httpHeaders)
	{
		this.httpHeaders = Argument.notNull(httpHeaders, "httpHeaders");
	}

	public static HttpHeaderCollection create()
	{
		return create(new HttpHeader[0]);
	}

	public static HttpHeaderCollection create(final HttpHeader... httpHeaders)
	{
		Argument.notNull(httpHeaders, "httpHeaders");

		final var dictionary = new TreeMap<String, HttpHeader>(String.CASE_INSENSITIVE_ORDER);

		for (final var httpHeader : httpHeaders)
		{
			if (dictionary.containsKey(httpHeader.getName()))
				throw new HttpHeaderDuplicateException(httpHeader.getName());
		}

		return new HttpHeaderCollection(dictionary);
	}

	public boolean contains(final String httpHeaderName)
	{
		return tryGet(httpHeaderName) != null;
	}

	public HttpHeader get(final String httpHeaderName)
	{
		final var httpHeader = tryGet(httpHeaderName);

		if (httpHeader == null)
			throw new HttpHeaderNotFoundException(httpHeaderName);

		return httpHeader;
	}

	public int size()
	{
		return httpHeaders.size();
	}

	public SortedMap<String, HttpHeader> toMap()
	{
		return new TreeMap<>(httpHeaders);
	}

	public HttpHeader tryGet(final String httpHeaderName)
	{
		return httpHeaders.get(httpHeaderName);
	}

	@Override
	public String toString()
	{
		final var httpHeaderStrings =
			httpHeaders
				.values()
				.stream()
				.map(httpHeader -> httpHeader.toString())
				.collect(Collectors.toList());

		return String.join(System.lineSeparator(), httpHeaderStrings);
	}
}
