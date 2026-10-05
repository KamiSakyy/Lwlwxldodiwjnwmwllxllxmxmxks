package com.github.rudroid.copilot.inapppurchase.usecases;

import com.github.rudroid.copilot.inapppurchase.billingclient.i;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: /home/user/work/p/classes.dex */
public final class l0<T> implements y71.j {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ y71.j f9784r;

    public l0(y71.j jVar) {
        this.f9784r = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        k0 k0Var;
        int i;
        x9.n nVar;
        if (cVar instanceof k0) {
            k0Var = (k0) cVar;
            int i10 = k0Var.f9780v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                k0Var.f9780v = i10 - Integer.MIN_VALUE;
                Object obj2 = k0Var.f9779u;
                b71.a aVar = b71.a.r;
                i = k0Var.f9780v;
                if (i != 0) {
                    sy.y.j(obj2);
                    com.github.rudroid.copilot.inapppurchase.billingclient.i iVar = (com.github.rudroid.copilot.inapppurchase.billingclient.i) obj;
                    if (iVar instanceof i.a) {
                        nVar = (x9.n) ((i.a) iVar).f9666a;
                    } else {
                        if (!(iVar instanceof i.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        nVar = null;
                    }
                    if (nVar != null) {
                        k0Var.f9780v = 1;
                        if (this.f9784r.c(nVar, k0Var) == aVar) {
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
        k0Var = new k0(this, cVar);
        Object obj22 = k0Var.f9779u;
        b71.a aVar2 = b71.a.r;
        i = k0Var.f9780v;
        if (i != 0) {
        }
        return w61.a0.a;
    }
}
