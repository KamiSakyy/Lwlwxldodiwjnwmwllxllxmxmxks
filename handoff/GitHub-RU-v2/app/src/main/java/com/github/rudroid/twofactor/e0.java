package com.github.rudroid.twofactor;

import java.util.concurrent.TimeUnit;

/* loaded from: /home/user/work/p/classes3.dex */
final class e0<T> implements y71.j {
    public final /* synthetic */ g0 r;

    public e0(g0 g0Var) {
        this.r = g0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(com.github.rudroid.twofactor.missed.m mVar, a71.c cVar) {
        d0 d0Var;
        int i;
        if (cVar instanceof d0) {
            d0Var = (d0) cVar;
            int i2 = d0Var.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                d0Var.w = i2 - Integer.MIN_VALUE;
                Object obj = d0Var.u;
                b71.a aVar = b71.a.r;
                i = d0Var.w;
                g0 g0Var = this.r;
                if (i != 0) {
                    sy.y.j(obj);
                    Long l = mVar.a;
                    if (!mVar.b && l != null && System.currentTimeMillis() - l.longValue() < TimeUnit.SECONDS.toMillis(30L)) {
                        com.github.rudroid.twofactor.missed.g gVar = g0Var.v;
                        d0Var.w = 1;
                        if (gVar.a(d0Var) == aVar) {
                            return aVar;
                        }
                    }
                    return w61.a0.a;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sy.y.j(obj);
                g0Var.P();
                return w61.a0.a;
            }
        }
        d0Var = new d0(this, cVar);
        Object obj2 = d0Var.u;
        b71.a aVar2 = b71.a.r;
        i = d0Var.w;
        g0 g0Var2 = this.r;
        if (i != 0) {
        }
        g0Var2.P();
        return w61.a0.a;
    }
}
