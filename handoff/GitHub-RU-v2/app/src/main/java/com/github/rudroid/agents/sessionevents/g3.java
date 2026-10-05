package com.github.rudroid.agents.sessionevents;

/* loaded from: /home/user/work/p/classes.dex */
public final class g3<T> implements y71.j {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ y71.j f7632r;

    public g3(y71.j jVar) {
        this.f7632r = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        f3 f3Var;
        int i;
        if (cVar instanceof f3) {
            f3Var = (f3) cVar;
            int i10 = f3Var.f7622v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                f3Var.f7622v = i10 - Integer.MIN_VALUE;
                Object obj2 = f3Var.f7621u;
                b71.a aVar = b71.a.r;
                i = f3Var.f7622v;
                if (i != 0) {
                    sy.y.j(obj2);
                    xn.y0 y0Var = (xn.y0) ((com.github.rudroid.utilities.ui.g1) obj).getData();
                    xn.x0 x0Var = y0Var != null ? y0Var.a : null;
                    if (x0Var != null) {
                        f3Var.f7622v = 1;
                        if (this.f7632r.c(x0Var, f3Var) == aVar) {
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
        f3Var = new f3(this, cVar);
        Object obj22 = f3Var.f7621u;
        b71.a aVar2 = b71.a.r;
        i = f3Var.f7622v;
        if (i != 0) {
        }
        return w61.a0.a;
    }
}
