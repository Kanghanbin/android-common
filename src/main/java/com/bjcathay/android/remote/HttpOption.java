package com.bjcathay.android.remote;

public enum HttpOption {
    CONNECT_TIMEOUT, READ_TIMEOUT,
    USER_AGENT, ACCEPT_ENCODING,
    MIME, CHARSET,
    REQUEST_CONTENT_TYPE, BASE_URL, PARAMS,
    CALLBACK_EXECUTOR,
    CACHE, FALLBACK_TO_CACHE, AHEAD_READ_IN_CACHE,
    START_CALLBACK, PROGRESS_CALLBACK, DONE_CALLBACK,
    FAIL_CALLBACK, ALWAYS_CALLBACK, COMPLETE_CALLBACK
}
