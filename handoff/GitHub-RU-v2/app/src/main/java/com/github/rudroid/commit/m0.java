package com.github.rudroid.commit;

/* loaded from: /home/user/work/p/classes.dex */
public final class m0<T> implements y71.j {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ y71.j f9117r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c0 f9118s;

    public m0(y71.j jVar, c0 c0Var) {
        this.f9117r = jVar;
        this.f9118s = c0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        l0 l0Var;
        int i;
        if (cVar instanceof l0) {
            l0Var = (l0) cVar;
            int i10 = l0Var.f9111v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                l0Var.f9111v = i10 - Integer.MIN_VALUE;
                Object obj2 = l0Var.f9110u;
                b71.a aVar = b71.a.r;
                i = l0Var.f9111v;
                if (i != 0) {
                    sy.y.j(obj2);
                    fl.f A = i21.a.A((fl.f) obj, new e0());
                    l0Var.f9111v = 1;
                    if (this.f9117r.c(A, l0Var) == aVar) {
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
        l0Var = new l0(this, cVar);
        Object obj22 = l0Var.f9110u;
        b71.a aVar2 = b71.a.r;
        i = l0Var.f9111v;
        if (i != 0) {
        }
        return w61.a0.a;
    }



}
