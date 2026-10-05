package com.github.rudroid.utilities;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n2 {
    public static final t71.n a = new t71.n("<!--.*?-->", sy.f0.r(t71.o.u));

    public static final String a(String str, String str2) {
        k71.k.g(str, "<this>");
        k71.k.g(str2, "href");
        return x.i.k(new StringBuilder("!["), str, "](", str2, ")");
    }

    public static final String b(String str) {
        return f1.e.z("_", str, "_");
    }

    public static final String c(String str) {
        k71.k.g(str, "<this>");
        return x61.m.c0(t71.p.X(str), "\n> ", "> ", "\n\n", 0, (j71.c) null, 56);
    }

    public static final String d(String str, String str2) {
        return x.i.g("<a href='", str2, "'>", str, "</a>");
    }
}
