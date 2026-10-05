package com.github.rudroid.uitoolkit.utils;

import d2.o0;
import g3.h0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a {
    public static void a(g3.d dVar, String str, String str2, long j, String str3, k3.s sVar, int i) {
        String str4 = (i & 8) != 0 ? null : str3;
        k3.s sVar2 = (i & 16) != 0 ? k3.s.x : sVar;
        k71.k.g(str, "phrase");
        k71.k.g(str2, "word");
        k71.k.g(sVar2, "fontWeight");
        int R = t71.p.R(str, str2, 0, false, 6);
        if (R < 0) {
            return;
        }
        dVar.b(new h0(j, 0L, sVar2, (k3.o) null, (k3.p) null, (k3.i) null, (String) null, 0L, (r3.a) null, (r3.p) null, (n3.b) null, 0L, (r3.l) null, (o0) null, 65530), R, str2.length() + R);
        if (str4 != null) {
            dVar.a(R, str2.length() + R, str4, str4);
        }
    }

    public static void b(g3.d dVar, String str, String str2) {
        k71.k.g(str, "phrase");
        k71.k.g(str2, "word");
        int R = t71.p.R(str, str2, 0, false, 6);
        if (R < 0) {
            return;
        }
        dVar.b(new h0(0L, 0L, (k3.s) null, (k3.o) null, (k3.p) null, lh.d.a, (String) null, 0L, (r3.a) null, (r3.p) null, (n3.b) null, 0L, (r3.l) null, (o0) null, 65503), R, str2.length() + R);
    }
}
