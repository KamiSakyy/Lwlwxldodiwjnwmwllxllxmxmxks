package com.apollographql.apollo.exception;

import java.util.ArrayList;
import k71.k;

/* loaded from: /home/user/work/p/classes.dex */
public final class ApolloHttpException extends ApolloException {

    /* renamed from: r, reason: collision with root package name */
    public int f4266r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApolloHttpException(int i, String str, ArrayList arrayList) {
        super(str, null);
        k.g(str, "message");
        this.f4266r = i;
    }
}
