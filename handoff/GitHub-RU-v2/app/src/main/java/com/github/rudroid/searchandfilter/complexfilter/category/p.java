package com.github.rudroid.searchandfilter.complexfilter.category;

import java.util.List;
import sy.y;
import w61.a0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class p<T> implements y71.j {
    public final /* synthetic */ y71.j r;

    public p(y71.j jVar) {
        this.r = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        o oVar;
        int i;
        if (cVar instanceof o) {
            oVar = (o) cVar;
            int i2 = oVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oVar.v = i2 - Integer.MIN_VALUE;
                Object obj2 = oVar.u;
                b71.a aVar = b71.a.r;
                i = oVar.v;
                if (i != 0) {
                    y.j(obj2);
                    List v0 = x61.m.v0((List) obj, new j());
                    oVar.v = 1;
                    if (this.r.c(v0, oVar) == aVar) {
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
        oVar = new o(this, cVar);
        Object obj22 = oVar.u;
        b71.a aVar2 = b71.a.r;
        i = oVar.v;
        if (i != 0) {
        }
        return a0.a;
    }
}
