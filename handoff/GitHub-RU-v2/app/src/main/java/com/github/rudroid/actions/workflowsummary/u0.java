package com.github.rudroid.actions.workflowsummary;

/* loaded from: /home/user/work/p/classes.dex */
public final class u0<T> implements y71.j {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ y71.j f5625r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f5626s;

    public u0(y71.j jVar, String str) {
        this.f5625r = jVar;
        this.f5626s = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        t0 t0Var;
        int i;
        if (cVar instanceof t0) {
            t0Var = (t0) cVar;
            int i10 = t0Var.f5621v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                t0Var.f5621v = i10 - Integer.MIN_VALUE;
                Object obj2 = t0Var.f5620u;
                b71.a aVar = b71.a.r;
                i = t0Var.f5621v;
                if (i != 0) {
                    sy.y.j(obj2);
                    t0Var.f5621v = 1;
                    if (this.f5625r.c(this.f5626s, t0Var) == aVar) {
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
        t0Var = new t0(this, cVar);
        Object obj22 = t0Var.f5620u;
        b71.a aVar2 = b71.a.r;
        i = t0Var.f5621v;
        if (i != 0) {
        }
        return w61.a0.a;
    }
}
