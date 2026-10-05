package com.apollographql.apollo.exception;

import java.io.IOException;

/* loaded from: /home/user/work/p/classes.dex */
public final class OfflineException extends IOException {

    /* renamed from: r, reason: collision with root package name */
    public static final OfflineException f4268r = new OfflineException();

    private OfflineException() {
        super("The device is offline");
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof OfflineException);
    }

    public final int hashCode() {
        return -155984151;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "OfflineException";
    }
}
