package com.github.rudroid.searchandfilter.complexfilter;

import java.util.Collection;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h<T> implements y71.j {
    public final /* synthetic */ y71.j r;
    public final /* synthetic */ w61.k s;

    public h(y71.j jVar, w61.k kVar) {
        this.r = jVar;
        this.s = kVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        g gVar;
        int i;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i2 = gVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gVar.v = i2 - Integer.MIN_VALUE;
                Object obj2 = gVar.u;
                b71.a aVar = b71.a.r;
                i = gVar.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    w61.k kVar = (w61.k) obj;
                    w61.k kVar2 = new w61.k(x61.m.l0((Collection) this.s.r, (Iterable) kVar.r), kVar.s);
                    gVar.v = 1;
                    if (this.r.c(kVar2, gVar) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj2);
                }
                return w61.a0.a;
            }
        }
        gVar = new g(this, cVar);
        Object obj22 = gVar.u;
        b71.a aVar2 = b71.a.r;
        i = gVar.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }
    public Object d() { return null; }
}
