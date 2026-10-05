package com.apollographql.apollo.exception;

/* loaded from: /home/user/work/p/classes.dex */
public final class ApolloWebSocketForceCloseException extends ApolloException {
    static {
        new ApolloWebSocketForceCloseException();
    }

    private ApolloWebSocketForceCloseException() {
        super("closeConnection() was called", null);
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ApolloWebSocketForceCloseException);
    }

    public final int hashCode() {
        return 1630789127;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "ApolloWebSocketForceCloseException";
    }
}
