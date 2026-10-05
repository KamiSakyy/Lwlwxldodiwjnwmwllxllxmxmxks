package com.github.rudroid.viewmodels;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: /home/user/work/p/classes3.dex */
final class v4<T> implements y71.j {
    public final /* synthetic */ c5 r;

    public v4(c5 c5Var) {
        this.r = c5Var;
    }

    public final Object c(Object obj, a71.c cVar) {
        y71.y1 y1Var = this.r.G;
        LinkedHashMap C = x61.x.C((Map) y1Var.getValue());
        C.remove(((yz0.g4) obj).c);
        y1Var.k((Object) null, C);
        return w61.a0.a;
    }
}
