package com.github.rudroid.searchandfilter.complexfilter.project;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g<T> implements y71.j {
    public final /* synthetic */ y71.j r;

    public g(y71.j jVar) {
        this.r = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        f fVar;
        int i;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i2 = fVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fVar.v = i2 - Integer.MIN_VALUE;
                Object obj2 = fVar.u;
                b71.a aVar = b71.a.r;
                i = fVar.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    List v0 = x61.m.v0((List) obj, new e());
                    fVar.v = 1;
                    if (this.r.c(v0, fVar) == aVar) {
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
        fVar = new f(this, cVar);
        Object obj22 = fVar.u;
        b71.a aVar2 = b71.a.r;
        i = fVar.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }
}
