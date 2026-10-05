package com.github.rudroid.searchandfilter.complexfilter.notificationfilter;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class v<T> implements y71.j {
    public final /* synthetic */ y71.j r;

    public v(y71.j jVar) {
        this.r = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        u uVar;
        int i;
        if (cVar instanceof u) {
            uVar = (u) cVar;
            int i2 = uVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                uVar.v = i2 - Integer.MIN_VALUE;
                Object obj2 = uVar.u;
                b71.a aVar = b71.a.r;
                i = uVar.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    w61.k kVar = new w61.k((List) obj, new x01.i((String) null, false, true));
                    uVar.v = 1;
                    if (this.r.c(kVar, uVar) == aVar) {
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
        uVar = new u(this, cVar);
        Object obj22 = uVar.u;
        b71.a aVar2 = b71.a.r;
        i = uVar.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }
}
