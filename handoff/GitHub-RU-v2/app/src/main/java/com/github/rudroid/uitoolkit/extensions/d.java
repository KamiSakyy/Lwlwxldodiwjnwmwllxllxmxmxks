package com.github.rudroid.uitoolkit.extensions;

import com.github.rudroid.discussions.replythread.w;
import d3.q;
import f1.g8;
import j0.j;
import k71.k;
import w1.o;
import w1.r;
import w2.s1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d {
    public static final r a(r rVar, boolean z, j71.c cVar) {
        k.g(rVar, "<this>");
        k.g(cVar, "then");
        return z ? (r) cVar.k(rVar) : rVar;
    }

    public static final r b(r rVar, Object obj, j71.e eVar) {
        k.g(rVar, "<this>");
        k.g(eVar, "then");
        return obj == null ? rVar : (r) eVar.s(rVar, obj);
    }

    public static final r c(r rVar, j71.c cVar) {
        k.g(rVar, "<this>");
        k.g(cVar, "handleShortcut");
        return rVar.f(o2.c.d(o.a, new b(cVar)));
    }

    public static final r d(r rVar, boolean z, j jVar, g8 g8Var, boolean z2, d3.k kVar, j71.a aVar, j71.a aVar2, String str) {
        k.g(rVar, "$this$selectableCombined");
        k.g(jVar, "interactionSource");
        k.g(aVar, "onClick");
        r b = q.b(f0.o.n(o.a, jVar, g8Var, z2, (String) null, kVar, str, aVar2, aVar, 392), false, new w(z, 4));
        s1 s1Var = new s1();
        return rVar.f(s1Var).f(b).f(s1Var.b);
    }


    public static Object a;
    public Object W(Object p1) { return null; }
    public Object a() { return null; }
    public Object c0() { return null; }
    public Object W(float) { return null; }
}
