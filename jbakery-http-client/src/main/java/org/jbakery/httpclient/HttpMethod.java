package org.jbakery.httpclient;

import org.jbakery.arguments.Argument;

public final class HttpMethod
{
	private final String name;

	public HttpMethod(final String name)
	{
		this.name = Argument.notNullOrEmpty(name, "name");
	}

	@Override
	public boolean equals(final Object instance)
	{
		// Idiomatic Java considers null to be a valid argument to an equals() method.

		if (instance == null)
			return false;

		if (instance.getClass() != getClass())
			return false;

		final var other = (HttpMethod)instance;

		// HTTP method names are case-sensitive.

		return name.equals(other.name);
	}

	public String getName()
	{
		return name;
	}

	@Override
	public String toString()
	{
		return name;
	}

	@Override
	public int hashCode()
	{
		return name.hashCode();
	}
}
