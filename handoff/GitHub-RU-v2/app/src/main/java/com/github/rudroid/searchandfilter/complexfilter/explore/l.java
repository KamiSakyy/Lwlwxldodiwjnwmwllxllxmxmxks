package com.github.rudroid.searchandfilter.complexfilter.explore;

import java.util.List;

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
                    sy.y.j(obj2);
                    Object W = x61.m.W((List) obj);
                    kVar.v = 1;
                    if (this.r.c(W, kVar) == aVar) {
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
        kVar = new k(this, cVar);
        Object obj22 = kVar.u;
        b71.a aVar2 = b71.a.r;
        i = kVar.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }
}
