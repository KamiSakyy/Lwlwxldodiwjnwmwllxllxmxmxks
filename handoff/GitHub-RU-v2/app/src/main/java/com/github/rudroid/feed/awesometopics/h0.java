package com.github.rudroid.feed.awesometopics;

/* loaded from: /home/user/work/p/classes.dex */
public final class h0<T> implements y71.j {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ y71.j f12499r;

    public h0(y71.j jVar) {
        this.f12499r = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        g0 g0Var;
        int i;
        if (cVar instanceof g0) {
            g0Var = (g0) cVar;
            int i10 = g0Var.f12497v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                g0Var.f12497v = i10 - Integer.MIN_VALUE;
                Object obj2 = g0Var.f12496u;
                b71.a aVar = b71.a.r;
                i = g0Var.f12497v;
                if (i != 0) {
                    sy.y.j(obj2);
                    if (((oa.j) obj).f(com.github.rudroid.common.a.f9240t)) {
                        g0Var.f12497v = 1;
                        if (this.f12499r.c(obj, g0Var) == aVar) {
                            return aVar;
                        }
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
        g0Var = new g0(this, cVar);
        Object obj22 = g0Var.f12496u;
        b71.a aVar2 = b71.a.r;
        i = g0Var.f12497v;
        if (i != 0) {
        }
        return w61.a0.a;
    }
}
