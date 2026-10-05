package com.github.rudroid.discussions;

import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes.dex */
final class ra<T> implements y71.j {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ta f11653r;

    public ra(ta taVar) {
        this.f11653r = taVar;
    }

    public final Object c(Object obj, a71.c cVar) {
        jk.h hVar = (jk.h) obj;
        x01.i iVar = hVar.d;
        ta taVar = this.f11653r;
        y71.y1 y1Var = taVar.f11834x;
        taVar.f11835y = iVar;
        ArrayList a10 = x7.a(hVar.b);
        if (a10.isEmpty()) {
            com.github.rudroid.utilities.w0.k(y1Var);
        } else {
            com.github.rudroid.utilities.w0.p(y1Var, a10);
        }
        return w61.a0.a;
    }
}
