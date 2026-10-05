package com.github.rudroid.searchandfilter.complexfilter.user;

import java.util.Collection;
import java.util.List;
import w61.a0;
import y71.y1;

/* loaded from: /home/user/work/p/classes3.dex */
final class m<T> implements y71.j {
    public final /* synthetic */ o r;

    public m(o oVar) {
        this.r = oVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Collection] */
    public final Object c(Object obj, a71.c cVar) {
        o oVar = this.r;
        oVar.v = x61.m.m0((Collection) oVar.v, (yz0.f) obj);
        y1 y1Var = oVar.x;
        fl.f fVar = (fl.f) y1Var.getValue();
        if ((fVar != null ? fVar.a : null) == fl.g.s) {
            fl.e eVar = fl.f.Companion;
            List R = oVar.R();
            eVar.getClass();
            y1Var.k((Object) null, fl.e.c(R));
        }
        return a0.a;
    }
}
