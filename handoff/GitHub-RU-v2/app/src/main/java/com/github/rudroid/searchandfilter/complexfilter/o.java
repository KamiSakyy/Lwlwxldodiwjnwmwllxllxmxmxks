package com.github.rudroid.searchandfilter.complexfilter;

import java.util.Collection;
import java.util.List;
import y71.y1;

/* loaded from: /home/user/work/p/classes3.dex */
final class o<T> implements y71.j {
    public final /* synthetic */ k r;

    public o(k kVar) {
        this.r = kVar;
    }

    public final Object c(Object obj, a71.c cVar) {
        w61.k kVar = (w61.k) obj;
        x01.i iVar = (x01.i) kVar.s;
        k71.k.g(iVar, "<set-?>");
        k kVar2 = this.r;
        kVar2.z = iVar;
        kVar2.A.addAll((Collection) kVar.r);
        y1 y1Var = kVar2.x;
        fl.e eVar = fl.f.Companion;
        List R = kVar2.R();
        eVar.getClass();
        fl.f c = fl.e.c(R);
        y1Var.getClass();
        y1Var.k((Object) null, c);
        return w61.a0.a;
    }
}
