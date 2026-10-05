package com.apollographql.apollo.exception;

import k71.k;

/* loaded from: /home/user/work/p/classes.dex */
public final class JsonDataException extends ApolloException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonDataException(String str) {
        super(str, null);
        k.g(str, "message");
    }
}
