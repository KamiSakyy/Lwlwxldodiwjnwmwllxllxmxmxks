package com.github.rudroid.utilities;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h2 {
    public static final Object a(androidx.lifecycle.a1 a1Var, String str) {
        k71.k.g(a1Var, "<this>");
        Object a = a1Var.a(str);
        if (a != null) {
            return a;
        }
        throw new IllegalStateException(str.concat(" must be set").toString());
    }

    public static final g2 b(androidx.lifecycle.a1 a1Var, String str, j71.c cVar, j71.a aVar) {
        k71.k.g(a1Var, "<this>");
        return new g2(a1Var, str, cVar, aVar);
    }
}
