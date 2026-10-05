package com.apollographql.apollo.exception;

/* loaded from: /home/user/work/p/classes.dex */
public final class DefaultApolloException extends ApolloException {
    public DefaultApolloException() {
        this(null, 3);
    }

    public DefaultApolloException(String str, int i) {
        super((i & 1) != 0 ? null : str, null);
    }
}
