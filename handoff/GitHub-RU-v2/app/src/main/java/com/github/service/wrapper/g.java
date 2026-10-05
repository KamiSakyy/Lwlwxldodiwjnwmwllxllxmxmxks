package com.github.service.wrapper;

import aa.h0;
import aa.m0;
import sy.y;
import w61.a0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g implements y71.j {
    public final /* synthetic */ int r;
    public final /* synthetic */ y71.j s;
    public final /* synthetic */ j71.c t;

    public /* synthetic */ g(y71.j jVar, j71.c cVar, int i) {
        this.r = i;
        this.s = jVar;
        this.t = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        f fVar;
        int i;
        di.d dVar;
        int i2;
        switch (this.r) {
            case 0:
                if (cVar instanceof f) {
                    fVar = (f) cVar;
                    int i3 = fVar.v;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        fVar.v = i3 - Integer.MIN_VALUE;
                        Object obj2 = fVar.u;
                        b71.a aVar = b71.a.r;
                        i = fVar.v;
                        if (i != 0) {
                            y.j(obj2);
                            h0 h0Var = (h0) obj;
                            m0 m0Var = h0Var != null ? (m0) this.t.k(h0Var) : null;
                            fVar.v = 1;
                            if (this.s.c(m0Var, fVar) == aVar) {
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
                fVar = new f(this, cVar);
                Object obj22 = fVar.u;
                b71.a aVar2 = b71.a.r;
                i = fVar.v;
                if (i != 0) {
                }
                return a0.a;
            default:
                if (cVar instanceof di.d) {
                    dVar = (di.d) cVar;
                    int i4 = dVar.v;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        dVar.v = i4 - Integer.MIN_VALUE;
                        Object obj3 = dVar.u;
                        b71.a aVar3 = b71.a.r;
                        i2 = dVar.v;
                        if (i2 != 0) {
                            y.j(obj3);
                            Object k = this.t.k((s5.b) obj);
                            dVar.v = 1;
                            if (this.s.c(k, dVar) == aVar3) {
                                return aVar3;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj3);
                        }
                        return a0.a;
                    }
                }
                dVar = new di.d(this, cVar);
                Object obj32 = dVar.u;
                b71.a aVar32 = b71.a.r;
                i2 = dVar.v;
                if (i2 != 0) {
                }
                return a0.a;
        }
    }
}
