package org.jbakery.httpclient;

import org.jbakery.arguments.Argument;

public final class HttpContent
{
	private final byte[] data;

	public HttpContent(final byte[] data)
	{
		this.data = Argument.notNull(data, "data");
	}

	public byte[] getData()
	{
		return data;
	}

	public boolean isEmpty()
	{
		return size() == 0;
	}

	public int size()
	{
		return data.length;
	}

	@Override
	public String toString()
	{
		return String.format("(%d bytes)", data.length);
	}
}
