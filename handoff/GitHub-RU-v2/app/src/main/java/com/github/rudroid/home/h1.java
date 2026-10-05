package com.github.rudroid.home;

/* loaded from: /home/user/work/p/classes.dex */
public final class h1<T> implements y71.j {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ y71.j f14953r;

    public h1(y71.j jVar) {
        this.f14953r = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        g1 g1Var;
        int i;
        if (cVar instanceof g1) {
            g1Var = (g1) cVar;
            int i10 = g1Var.f14940v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                g1Var.f14940v = i10 - Integer.MIN_VALUE;
                Object obj2 = g1Var.f14939u;
                b71.a aVar = b71.a.r;
                i = g1Var.f14940v;
                if (i != 0) {
                    sy.y.j(obj2);
                    fl.f.Companion.getClass();
                    fl.f c10 = fl.e.c((g01.a) obj);
                    g1Var.f14940v = 1;
                    if (this.f14953r.c(c10, g1Var) == aVar) {
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
        g1Var = new g1(this, cVar);
        Object obj22 = g1Var.f14939u;
        b71.a aVar2 = b71.a.r;
        i = g1Var.f14940v;
        if (i != 0) {
        }
        return w61.a0.a;
    }
}
