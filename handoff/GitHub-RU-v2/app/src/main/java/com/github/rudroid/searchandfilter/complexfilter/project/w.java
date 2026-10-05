package com.github.rudroid.searchandfilter.complexfilter.project;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w<T> implements y71.j {
    public final /* synthetic */ y71.j r;

    public w(y71.j jVar) {
        this.r = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        v vVar;
        int i;
        if (cVar instanceof v) {
            vVar = (v) cVar;
            int i2 = vVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vVar.v = i2 - Integer.MIN_VALUE;
                Object obj2 = vVar.u;
                b71.a aVar = b71.a.r;
                i = vVar.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    List v0 = x61.m.v0((List) obj, new u());
                    vVar.v = 1;
                    if (this.r.c(v0, vVar) == aVar) {
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
        vVar = new v(this, cVar);
        Object obj22 = vVar.u;
        b71.a aVar2 = b71.a.r;
        i = vVar.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }
}
