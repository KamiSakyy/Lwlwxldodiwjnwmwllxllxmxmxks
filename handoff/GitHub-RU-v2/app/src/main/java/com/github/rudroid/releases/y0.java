package com.github.rudroid.releases;

import y71.y1;

/* loaded from: /home/user/work/p/classes.dex */
final class y0<T> implements y71.j {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ a1 f18953r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f18954s;

    public y0(a1 a1Var, String str) {
        this.f18953r = a1Var;
        this.f18954s = str;
    }

    public final Object c(Object obj, a71.c cVar) {
        fl.f c10;
        o01.f fVar = (o01.f) obj;
        x01.i iVar = fVar.c;
        a1 a1Var = this.f18953r;
        a1Var.f18839v = iVar;
        y1 y1Var = a1Var.f18838u;
        if (this.f18954s == null) {
            fl.f.Companion.getClass();
            c10 = fl.e.c(fVar);
        } else {
            o01.f fVar2 = (o01.f) ((fl.f) y1Var.getValue()).b;
            o01.f fVar3 = new o01.f(fVar.a, x61.m.l0(fVar2 != null ? fVar2.b : x61.rShadow.r, fVar.b), fVar.c);
            fl.f.Companion.getClass();
            c10 = fl.e.c(fVar3);
        }
        y1Var.getClass();
        y1Var.k((Object) null, c10);
        return w61.a0.a;
    }
}
