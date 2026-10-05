package com.github.rudroid.searchandfilter.complexfilter.organization;

import java.util.List;
import sy.y;
import w61.a0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m<T> implements y71.j {
    public final /* synthetic */ y71.j r;

    public m(y71.j jVar) {
        this.r = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        l lVar;
        int i;
        if (cVar instanceof l) {
            lVar = (l) cVar;
            int i2 = lVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lVar.v = i2 - Integer.MIN_VALUE;
                Object obj2 = lVar.u;
                b71.a aVar = b71.a.r;
                i = lVar.v;
                if (i != 0) {
                    y.j(obj2);
                    List v0 = x61.m.v0((List) obj, new g());
                    lVar.v = 1;
                    if (this.r.c(v0, lVar) == aVar) {
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
        lVar = new l(this, cVar);
        Object obj22 = lVar.u;
        b71.a aVar2 = b71.a.r;
        i = lVar.v;
        if (i != 0) {
        }
        return a0.a;
    }
}
