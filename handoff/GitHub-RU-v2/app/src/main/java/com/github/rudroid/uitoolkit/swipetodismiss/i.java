package com.github.rudroid.uitoolkit.swipetodismiss;

import v71.d1;

/* loaded from: /home/user/work/p/classes3.dex */
final class i<T> implements y71.j {
    public final /* synthetic */ k71.w r;
    public final /* synthetic */ v71.z s;
    public final /* synthetic */ j71.e t;

    public i(k71.w wVar, v71.z zVar, j71.e eVar) {
        this.r = wVar;
        this.s = zVar;
        this.t = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        h hVar;
        int i;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i2 = hVar.x;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hVar.x = i2 - Integer.MIN_VALUE;
                Object obj2 = hVar.v;
                b71.a aVar = b71.a.r;
                i = hVar.x;
                k71.w wVar = this.r;
                if (i != 0) {
                    sy.y.j(obj2);
                    d1 d1Var = (d1) wVar.r;
                    if (d1Var != null) {
                        d1Var.m(new AnchoredDragFinishedSignal());
                        hVar.u = obj;
                        hVar.x = 1;
                        if (d1Var.O(hVar) == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj = hVar.u;
                    sy.y.j(obj2);
                }
                v71.a0Shadow a0Var = v71.a0Shadow.u;
                j71.e eVar = this.t;
                v71.z zVar = this.s;
                wVar.r = v71.b0.z(zVar, (a71.h) null, a0Var, new g(eVar, obj, zVar, null), 1);
                return w61.a0.a;
            }
        }
        hVar = new h(this, cVar);
        Object obj22 = hVar.v;
        b71.a aVar2 = b71.a.r;
        i = hVar.x;
        k71.w wVar2 = this.r;
        if (i != 0) {
        }
        v71.a0Shadow a0Var2 = v71.a0Shadow.u;
        j71.e eVar2 = this.t;
        v71.z zVar2 = this.s;
        wVar2.r = v71.b0.z(zVar2, (a71.h) null, a0Var2, new g(eVar2, obj, zVar2, null), 1);
        return w61.a0.a;
    }
}
