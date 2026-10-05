package com.github.rudroid.viewmodels;

import java.util.Map;

/* loaded from: /home/user/work/p/classes3.dex */
final class k4<T> implements y71.j {
    public final /* synthetic */ c5 r;

    public k4(c5 c5Var) {
        this.r = c5Var;
    }

    public final Object c(Object obj, a71.c cVar) {
        z01.e0 e0Var = (z01.c0) obj;
        boolean z = e0Var instanceof z01.e0;
        c5 c5Var = this.r;
        if (z) {
            y71.y1 y1Var = c5Var.G;
            z01.e0 e0Var2 = e0Var;
            y1Var.k((Object) null, x61.x.y((Map) y1Var.getValue(), new w61.k(e0Var2.b, Boolean.FALSE)));
            c5Var.U(e0Var2.c);
        } else {
            c5Var.U(((z01.c0) e0Var).a);
        }
        return w61.a0.a;
    }
}
