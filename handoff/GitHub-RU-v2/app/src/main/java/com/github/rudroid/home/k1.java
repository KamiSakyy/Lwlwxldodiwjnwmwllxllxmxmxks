package com.github.rudroid.home;

/* loaded from: /home/user/work/p/classes.dex */
public final class k1<T> implements y71.j {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ y71.j f14987r;

    public k1(y71.j jVar) {
        this.f14987r = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        j1 j1Var;
        int i;
        if (cVar instanceof j1) {
            j1Var = (j1) cVar;
            int i10 = j1Var.f14985v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                j1Var.f14985v = i10 - Integer.MIN_VALUE;
                Object obj2 = j1Var.f14984u;
                b71.a aVar = b71.a.r;
                i = j1Var.f14985v;
                if (i != 0) {
                    sy.y.j(obj2);
                    fl.f.Companion.getClass();
                    fl.f c10 = fl.e.c((wk.a) obj);
                    j1Var.f14985v = 1;
                    if (this.f14987r.c(c10, j1Var) == aVar) {
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
        j1Var = new j1(this, cVar);
        Object obj22 = j1Var.f14984u;
        b71.a aVar2 = b71.a.r;
        i = j1Var.f14985v;
        if (i != 0) {
        }
        return w61.a0.a;
    }
}
