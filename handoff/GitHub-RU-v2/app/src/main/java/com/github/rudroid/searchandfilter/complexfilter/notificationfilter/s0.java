package com.github.rudroid.searchandfilter.complexfilter.notificationfilter;

import androidx.lifecycle.a1;
import androidx.lifecycle.d1;
import com.github.domain.searchandfilter.filters.data.notification.RepositoryNotificationFilter;

/* loaded from: /home/user/work/p/classes3.dex */
public final class s0 extends com.github.rudroid.searchandfilter.complexfilter.b<com.github.domain.searchandfilter.filters.data.notification.a> implements com.github.rudroid.searchandfilter.complexfilter.d0<k> {
    public static final /* synthetic */ int F = 0;
    public final jm.b C;
    public final v71.v D;
    public boolean E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(jm.b bVar, com.github.rudroid.activities.util.c cVar, a1 a1Var, v71.v vVar) {
        super(cVar, a1Var, new com.github.rudroid.searchandfilter.complexfilter.t(new k0(0)));
        k71.k.g(bVar, "fetchRepositoryNotificationFiltersUseCase");
        k71.k.g(cVar, "accountHolder");
        k71.k.g(a1Var, "savedStateHandle");
        k71.k.g(vVar, "defaultDispatcher");
        this.C = bVar;
        this.D = vVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.github.rudroid.searchandfilter.complexfilter.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object R(oa.j jVar, String str, j71.c cVar, a71.c cVar2) {
        r0 r0Var;
        int i;
        if (cVar2 instanceof r0) {
            r0Var = (r0) cVar2;
            int i2 = r0Var.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                r0Var.w = i2 - Integer.MIN_VALUE;
                Object obj = r0Var.u;
                b71.a aVar = b71.a.r;
                i = r0Var.w;
                if (i != 0) {
                    sy.y.j(obj);
                    r0Var.w = 1;
                    obj = b31.b.J(((a11.a) this.C.a.a(jVar)).k(), jVar, cVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                return new q0(new n0((y71.i) obj, this));
            }
        }
        r0Var = new r0(this, (c71.c) cVar2);
        Object obj2 = r0Var.u;
        b71.a aVar2 = b71.a.r;
        i = r0Var.w;
        if (i != 0) {
        }
        return new q0(new n0((y71.i) obj2, this));
    }

    @Override // com.github.rudroid.searchandfilter.complexfilter.b
    public final boolean T(Object obj, String str) {
        com.github.domain.searchandfilter.filters.data.notification.a aVar = (com.github.domain.searchandfilter.filters.data.notification.a) obj;
        k71.k.g(aVar, "value");
        k71.k.g(str, "query");
        if (aVar instanceof RepositoryNotificationFilter) {
            return t71.p.I(((RepositoryNotificationFilter) aVar).t, str, true);
        }
        return false;
    }

    @Override // com.github.rudroid.searchandfilter.complexfilter.d0
    public final androidx.lifecycle.o0 getData() {
        return d1.l(this.v, new com.github.rudroid.searchandfilter.complexfilter.explore.a0(6));
    }

    @Override // com.github.rudroid.searchandfilter.complexfilter.d0
    public final void i(Object obj) {
        k kVar = (k) obj;
        k71.k.g(kVar, "item");
        W(kVar.a, kVar.b);
    }
}
