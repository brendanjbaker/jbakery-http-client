package org.jbakery.httpclient;

import org.jbakery.arguments.Argument;

public final class HttpHeader
{
	private final String name;
	private final String value;

	public HttpHeader(final String name, final String value)
	{
		this.name = Argument.notNullOrEmpty(name, "name");
		this.value = Argument.notNullOrEmpty(value, "value");
	}

	public String getName()
	{
		return name;
	}

	public String getValue()
	{
		return value;
	}

	@Override
	public String toString()
	{
		return String.format("%s: %s", name, value);
	}
}
