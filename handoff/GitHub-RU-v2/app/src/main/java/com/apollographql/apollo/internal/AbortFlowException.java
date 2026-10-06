package com.apollographql.apollo.internal;

import java.util.concurrent.CancellationException;

/* loaded from: /home/user/work/p/classes.dex */
final class AbortFlowException extends CancellationException {

    /* renamed from: r, reason: collision with root package name */
    public c f4286r;

    public AbortFlowException(c cVar) {
        super("Flow was aborted, no more elements needed");
        this.f4286r = cVar;
    }
}
