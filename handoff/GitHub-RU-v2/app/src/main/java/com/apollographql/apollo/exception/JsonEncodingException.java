package com.apollographql.apollo.exception;

import k71.k;

/* loaded from: /home/user/work/p/classes.dex */
public final class JsonEncodingException extends ApolloException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonEncodingException(String str) {
        super(str, null);
        k.g(str, "message");
    }
}
