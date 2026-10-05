package com.github.rudroid.searchandfilter.complexfilter.repository;

import java.util.List;
import sy.y;
import w61.a0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k<T> implements y71.j {
    public final /* synthetic */ y71.j r;

    public k(y71.j jVar) {
        this.r = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        j jVar;
        int i;
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i2 = jVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.v = i2 - Integer.MIN_VALUE;
                Object obj2 = jVar.u;
                b71.a aVar = b71.a.r;
                i = jVar.v;
                if (i != 0) {
                    y.j(obj2);
                    List v0 = x61.m.v0((List) obj, new b());
                    jVar.v = 1;
                    if (this.r.c(v0, jVar) == aVar) {
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
        jVar = new j(this, cVar);
        Object obj22 = jVar.u;
        b71.a aVar2 = b71.a.r;
        i = jVar.v;
        if (i != 0) {
        }
        return a0.a;
    }
}
