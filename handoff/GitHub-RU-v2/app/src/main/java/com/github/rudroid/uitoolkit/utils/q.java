package com.github.rudroid.uitoolkit.utils;

import java.util.LinkedHashMap;

/* loaded from: /home/user/work/p/classes3.dex */
public final class q<T> implements y71.j {
    public final /* synthetic */ y71.j r;
    public final /* synthetic */ s s;

    public q(y71.j jVar, s sVar) {
        this.r = jVar;
        this.s = sVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        p pVar;
        int i;
        s sVar = this.s;
        LinkedHashMap linkedHashMap = sVar.b;
        if (cVar instanceof p) {
            pVar = (p) cVar;
            int i2 = pVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pVar.v = i2 - Integer.MIN_VALUE;
                Object obj2 = pVar.u;
                b71.a aVar = b71.a.r;
                i = pVar.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    j0.h hVar = (j0.h) obj;
                    if (hVar instanceof j0.l) {
                        j0.h lVar = new j0.l(c2.b.e(((j0.l) hVar).a, sVar.a));
                        linkedHashMap.put(hVar, lVar);
                        hVar = lVar;
                    } else if (hVar instanceof j0.k) {
                        hVar = (j0.k) hVar;
                        j0.l lVar2 = (j0.l) linkedHashMap.remove(((j0.k) hVar).a);
                        if (lVar2 != null) {
                            hVar = new j0.k(lVar2);
                        }
                    } else if (hVar instanceof j0.m) {
                        hVar = (j0.m) hVar;
                        j0.l lVar3 = (j0.l) linkedHashMap.remove(((j0.m) hVar).a);
                        if (lVar3 != null) {
                            hVar = new j0.m(lVar3);
                        }
                    }
                    pVar.v = 1;
                    if (this.r.c(hVar, pVar) == aVar) {
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
        pVar = new p(this, cVar);
        Object obj22 = pVar.u;
        b71.a aVar2 = b71.a.r;
        i = pVar.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }
}
