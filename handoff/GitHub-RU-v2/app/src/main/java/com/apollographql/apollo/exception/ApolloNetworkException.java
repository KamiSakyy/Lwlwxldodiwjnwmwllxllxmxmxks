package com.apollographql.apollo.exception;

/* loaded from: /home/user/work/p/classes.dex */
public final class ApolloNetworkException extends ApolloException {

    /* renamed from: r, reason: collision with root package name */
    public final Object f4267r;

    public ApolloNetworkException() {
        this((String) null, 3);
    }

    public /* synthetic */ ApolloNetworkException(String str, int i) {
        this((Object) null, (i & 1) != 0 ? null : str);
    }

    public ApolloNetworkException(Object obj, String str) {
        super(str, obj instanceof Throwable ? (Throwable) obj : null);
        this.f4267r = obj;
    }
}
