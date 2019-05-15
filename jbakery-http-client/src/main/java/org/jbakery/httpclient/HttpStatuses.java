package org.jbakery.httpclient;

public final class HttpStatuses
{
	public static final HttpStatus
		Continue = new HttpStatus(100, "Continue"),
		SwitchingProtocols = new HttpStatus(101, "Switching Protocols"),
		Processing = new HttpStatus(102, "Processing"),
		EarlyHints = new HttpStatus(103, "Early Hints");

	public static final HttpStatus
		Ok = new HttpStatus(200, "OK"),
		Created = new HttpStatus(201, "Created"),
		Accepted = new HttpStatus(202, "Accepted"),
		NonAuthoritativeInformation = new HttpStatus(203, "Non-Authoritative Information"),
		NoContent = new HttpStatus(204, "No Content"),
		ResetContent = new HttpStatus(205, "Reset Content"),
		PartialContent = new HttpStatus(206, "Partial Content"),
		MultiStatus = new HttpStatus(207, "Multi-Status"),
		AlreadyReported = new HttpStatus(208, "Already Reported"),
		InstanceManipulationsUsed = new HttpStatus(226, "IM Used");

	public static final HttpStatus
		MultipleChoices = new HttpStatus(300, "Multiple Choices"),
		MovedPermanently = new HttpStatus(301, "Moved Permanently"),
		Found = new HttpStatus(302, "Found"),
		SeeOther = new HttpStatus(303, "See Other"),
		NotModified = new HttpStatus(304, "Not Modified"),
		UseProxy = new HttpStatus(305, "Use Proxy"),
		SwitchProxy = new HttpStatus(306, "Switch Proxy"),
		TemporaryRedirect = new HttpStatus(307, "Temporary Redirect"),
		PermanentRedirect = new HttpStatus(308, "Permanent Redirect");

	public static final HttpStatus
		BadRequest = new HttpStatus(400, "Bad Request"),
		Unauthorized = new HttpStatus(401, "Unauthorized"),
		PaymentRequired = new HttpStatus(402, "Payment Required"),
		Forbidden = new HttpStatus(403, "Forbidden"),
		NotFound = new HttpStatus(404, "Not Found"),
		MethodNotAllowed = new HttpStatus(405, "Method Not Allowed"),
		NotAcceptable = new HttpStatus(406, "Not Acceptable"),
		ProxyAuthenticationRequired = new HttpStatus(407, "Proxy Authentication Required"),
		RequestTimeout = new HttpStatus(408, "Request Time-out"),
		Conflict = new HttpStatus(409, "Conflict"),
		Gone = new HttpStatus(410, "Gone"),
		LengthRequired = new HttpStatus(411, "Length Required"),
		PreconditionFailed = new HttpStatus(412, "Precondition Failed"),
		RequestEntityTooLarge = new HttpStatus(413, "Request Entity Too Large"),
		RequestUriTooLarge = new HttpStatus(414, "Request-URI Too Large"),
		UnsupportedMediaType = new HttpStatus(415, "Unsupported Media Type"),
		RequestedRangeNotSatisfiable = new HttpStatus(416, "Requested Range Not Satisfiable"),
		ExpectationFailed = new HttpStatus(417, "Expectation Failed"),
		Teapot = new HttpStatus(418, "I'm A Teapot"),
		MisdirectedRequest = new HttpStatus(421, "Misdirected Request"),
		UnprocessableEntity = new HttpStatus(422, "Unprocessable Entity"),
		Locked = new HttpStatus(423, "Locked"),
		FailedDependency = new HttpStatus(424, "Failed Dependency"),
		TooEarly = new HttpStatus(425, "Too Early"),
		UpgradeRequired = new HttpStatus(426, "Upgrade Required"),
		PreconditionRequired = new HttpStatus(428, "Precondition Required"),
		TooManyRequests = new HttpStatus(429, "Too Many Requests"),
		RequestHeaderFieldsTooLarge = new HttpStatus(431, "Request Header Fields Too Large"),
		UnavailableForLegalReasons = new HttpStatus(451, "Unavailable For Legal Reasons");

	public static final HttpStatus
		InternalServerError = new HttpStatus(500, "Internal Server Error"),
		NotImplemented = new HttpStatus(501, "Not Implemented"),
		BadGateway = new HttpStatus(502, "Bad Gateway"),
		ServiceUnavailable = new HttpStatus(503, "Service Unavailable"),
		GatewayTimeout = new HttpStatus(504, "Gateway Time-out"),
		HttpVersionNotSupported = new HttpStatus(505, "HTTP Version Not Supported"),
		VariantAlsoNegotiates = new HttpStatus(506, "Variant Also Negotiates"),
		InsufficientStorage = new HttpStatus(507, "Insufficient Storage"),
		LoopDetected = new HttpStatus(508, "Loop Detected"),
		NotExtended = new HttpStatus(510, "Not Extended"),
		NetworkAuthenticationRequired = new HttpStatus(511, "Network Authentication Required");

	private HttpStatuses() { }
}
