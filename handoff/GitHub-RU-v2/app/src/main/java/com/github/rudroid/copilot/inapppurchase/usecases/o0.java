package com.github.rudroid.copilot.inapppurchase.usecases;

import java.util.List;

/* loaded from: /home/user/work/p/classes.dex */
public final class o0<T> implements y71.j {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ y71.j f9793r;

    public o0(y71.j jVar) {
        this.f9793r = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        n0 n0Var;
        int i;
        if (cVar instanceof n0) {
            n0Var = (n0) cVar;
            int i10 = n0Var.f9788v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                n0Var.f9788v = i10 - Integer.MIN_VALUE;
                Object obj2 = n0Var.f9787u;
                b71.a aVar = b71.a.r;
                i = n0Var.f9788v;
                if (i != 0) {
                    sy.y.j(obj2);
                    List list = ((x9.n) obj).f34026b;
                    if (list != null) {
                        n0Var.f9788v = 1;
                        if (this.f9793r.c(list, n0Var) == aVar) {
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
        n0Var = new n0(this, cVar);
        Object obj22 = n0Var.f9787u;
        b71.a aVar2 = b71.a.r;
        i = n0Var.f9788v;
        if (i != 0) {
        }
        return w61.a0.a;
    }
}
