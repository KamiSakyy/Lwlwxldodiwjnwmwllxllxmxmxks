package com.github.rudroid.searchandfilter.complexfilter.category;

import sy.y;
import w61.a0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l<T> implements y71.j {
    public final /* synthetic */ y71.j r;

    public l(y71.j jVar) {
        this.r = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        k kVar;
        int i;
        if (cVar instanceof k) {
            kVar = (k) cVar;
            int i2 = kVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kVar.v = i2 - Integer.MIN_VALUE;
                Object obj2 = kVar.u;
                b71.a aVar = b71.a.r;
                i = kVar.v;
                if (i != 0) {
                    y.j(obj2);
                    jk.c cVar2 = (jk.c) obj;
                    w61.k kVar2 = new w61.k(cVar2.a, cVar2.b);
                    kVar.v = 1;
                    if (this.r.c(kVar2, kVar) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj2);
                }
                return a0.a;
            }
        }
        kVar = new k(this, cVar);
        Object obj22 = kVar.u;
        b71.a aVar2 = b71.a.r;
        i = kVar.v;
        if (i != 0) {
        }
        return a0.a;
    }
}
