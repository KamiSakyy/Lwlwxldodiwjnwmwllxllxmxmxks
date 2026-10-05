package com.github.rudroid.searchandfilter.complexfilter.milestone;

import java.util.List;
import sy.y;
import w61.a0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j<T> implements y71.j {
    public final /* synthetic */ y71.j r;

    public j(y71.j jVar) {
        this.r = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        i iVar;
        int i;
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i2 = iVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iVar.v = i2 - Integer.MIN_VALUE;
                Object obj2 = iVar.u;
                b71.a aVar = b71.a.r;
                i = iVar.v;
                if (i != 0) {
                    y.j(obj2);
                    List v0 = x61.m.v0((List) obj, new h());
                    iVar.v = 1;
                    if (this.r.c(v0, iVar) == aVar) {
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
        iVar = new i(this, cVar);
        Object obj22 = iVar.u;
        b71.a aVar2 = b71.a.r;
        i = iVar.v;
        if (i != 0) {
        }
        return a0.a;
    }
}
