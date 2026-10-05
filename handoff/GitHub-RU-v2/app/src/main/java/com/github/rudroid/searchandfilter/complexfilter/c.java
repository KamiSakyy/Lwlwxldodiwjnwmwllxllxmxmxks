package com.github.rudroid.searchandfilter.complexfilter;

import androidx.lifecycle.p0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
final class c<T> implements y71.j {
    public final /* synthetic */ b r;

    public c(b bVar) {
        this.r = bVar;
    }

    public final Object c(Object obj, a71.c cVar) {
        w61.k kVar = (w61.k) obj;
        x01.i iVar = (x01.i) kVar.s;
        k71.k.g(iVar, "<set-?>");
        b bVar = this.r;
        bVar.w = iVar;
        ArrayList arrayList = bVar.x;
        arrayList.clear();
        arrayList.addAll((Collection) kVar.r);
        p0 p0Var = bVar.v;
        fl.e eVar = fl.f.Companion;
        List U = bVar.U();
        eVar.getClass();
        p0Var.j(fl.e.c(U));
        return w61.a0.a;
    }
}
