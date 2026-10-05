package com.google.android.gms.common.api;

import z11.d;

/* loaded from: /home/user/work/p/classes4.dex */
public final class UnsupportedApiCallException extends UnsupportedOperationException {
    public final d r;

    public UnsupportedApiCallException(d dVar) {
        this.r = dVar;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Missing ".concat(String.valueOf(this.r));
    }
}
