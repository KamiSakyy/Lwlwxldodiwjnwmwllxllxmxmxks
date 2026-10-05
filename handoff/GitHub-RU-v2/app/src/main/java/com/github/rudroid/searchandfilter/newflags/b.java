package com.github.rudroid.searchandfilter.newflags;

import sy.y;
import w61.a0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b<T> implements y71.j {
    public final /* synthetic */ y71.j r;

    public b(y71.j jVar) {
        this.r = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        a aVar;
        int i;
        if (cVar instanceof a) {
            aVar = (a) cVar;
            int i2 = aVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.v = i2 - Integer.MIN_VALUE;
                Object obj2 = aVar.u;
                b71.a aVar2 = b71.a.r;
                i = aVar.v;
                if (i != 0) {
                    y.j(obj2);
                    Boolean valueOf = Boolean.valueOf(((gi.e) obj).l != null);
                    aVar.v = 1;
                    if (this.r.c(valueOf, aVar) == aVar2) {
                        return aVar2;
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
        aVar = new a(this, cVar);
        Object obj22 = aVar.u;
        b71.a aVar22 = b71.a.r;
        i = aVar.v;
        if (i != 0) {
        }
        return a0.a;
    }
}
