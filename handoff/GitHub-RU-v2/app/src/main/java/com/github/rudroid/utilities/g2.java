package com.github.rudroid.utilities;

import java.util.LinkedHashMap;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g2<T> {
    public final androidx.lifecycle.a1 a;
    public final String b;
    public final j71.c c;
    public final j71.a d;

    public g2(androidx.lifecycle.a1 a1Var, String str, j71.c cVar, j71.a aVar) {
        k71.k.g(a1Var, "savedStateHandle");
        this.a = a1Var;
        this.b = str;
        this.c = cVar;
        this.d = aVar;
    }

    public final Object a(Object obj, r71.e eVar) {
        k71.k.g(eVar, "property");
        androidx.lifecycle.a1 a1Var = this.a;
        a1Var.getClass();
        androidx.lifecycle.l1 l1Var = a1Var.b;
        l1Var.getClass();
        LinkedHashMap linkedHashMap = (LinkedHashMap) l1Var.r;
        String str = this.b;
        return linkedHashMap.containsKey(str) ? a1Var.a(str) : this.d.a();
    }

    public final void b(Object obj, r71.e eVar) {
        k71.k.g(eVar, "property");
        this.a.c(obj, this.b);
        this.c.k(obj);
    }
}
