package com.github.rudroid.searchandfilter.complexfilter.user.assignee;

import java.util.List;
import sy.t;
import sy.y;
import w61.a0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d<T> implements y71.j {
    public final /* synthetic */ y71.j r;
    public final /* synthetic */ f s;

    public d(y71.j jVar, f fVar) {
        this.r = jVar;
        this.s = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        c cVar2;
        int i;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i2 = cVar2.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar2.v = i2 - Integer.MIN_VALUE;
                Object obj2 = cVar2.u;
                b71.a aVar = b71.a.r;
                i = cVar2.v;
                if (i != 0) {
                    y.j(obj2);
                    List v0 = x61.m.v0((List) obj, t.f(new a(this.s), b.r));
                    cVar2.v = 1;
                    if (this.r.c(v0, cVar2) == aVar) {
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
        cVar2 = new c(this, cVar);
        Object obj22 = cVar2.u;
        b71.a aVar2 = b71.a.r;
        i = cVar2.v;
        if (i != 0) {
        }
        return a0.a;
    }
}
