package org.jbakery.httpclient;

import org.jbakery.arguments.Argument;

public final class HttpStatus
{
	private final int code;
	private final String reasonPhrase;

	public HttpStatus(final int code)
	{
		this.code = Argument.notNegative(code, "code");
		this.reasonPhrase = null;
	}

	public HttpStatus(final int code, final String reasonPhrase)
	{
		this.code = Argument.notNegative(code, "code");
		this.reasonPhrase = Argument.notNullOrEmpty(reasonPhrase, "reasonPhrase");
	}

	@Override
	public boolean equals(final Object instance)
	{
		if (instance == null)
			return false;

		if (instance.getClass() != getClass())
			return false;

		final var other = (HttpStatus)instance;

		return code == other.code;
	}

	public int getCode()
	{
		return code;
	}

	public String getReasonPhrase()
	{
		return reasonPhrase;
	}

	@Override
	public int hashCode()
	{
		return Integer.hashCode(code);
	}

	public boolean isSuccess()
	{
		return
			code >= 200 &&
			code <= 299;
	}

	@Override
	public String toString()
	{
		return
			reasonPhrase == null
				? String.format("%d", code)
				: String.format("%d %s", code, reasonPhrase);
	}
}
