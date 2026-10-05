package com.github.rudroid.searchandfilter.complexfilter.organization;

import androidx.lifecycle.a1;
import androidx.lifecycle.d1;
import androidx.lifecycle.o0;
import com.github.rudroid.searchandfilter.complexfilter.d0;
import com.github.rudroid.searchandfilter.complexfilter.explore.a0;
import com.github.rudroid.searchandfilter.complexfilter.notificationfilter.k0;
import com.github.service.models.response.organizations.Organization;
import sy.y;
import v71.v;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o extends com.github.rudroid.searchandfilter.complexfilter.b<Organization> implements d0<a> {
    public static final /* synthetic */ int E = 0;
    public final lm.d C;
    public final v D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(lm.d dVar, com.github.rudroid.activities.util.c cVar, a1 a1Var, v vVar) {
        super(cVar, a1Var, new com.github.rudroid.searchandfilter.complexfilter.t(new k0(1)));
        k71.k.g(dVar, "fetchOrganizationsUseCase");
        k71.k.g(cVar, "accountHolder");
        k71.k.g(a1Var, "savedStateHandle");
        k71.k.g(vVar, "defaultDispatcher");
        this.C = dVar;
        this.D = vVar;
        S();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.github.rudroid.searchandfilter.complexfilter.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object R(oa.j jVar, String str, j71.c cVar, a71.c cVar2) {
        k kVar;
        int i;
        if (cVar2 instanceof k) {
            kVar = (k) cVar2;
            int i2 = kVar.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kVar.w = i2 - Integer.MIN_VALUE;
                Object obj = kVar.u;
                b71.a aVar = b71.a.r;
                i = kVar.w;
                if (i != 0) {
                    y.j(obj);
                    kVar.w = 1;
                    obj = this.C.a(jVar, str, cVar, kVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                }
                return new j((y71.i) obj);
            }
        }
        kVar = new k(this, (c71.c) cVar2);
        Object obj2 = kVar.u;
        b71.a aVar2 = b71.a.r;
        i = kVar.w;
        if (i != 0) {
        }
        return new j((y71.i) obj2);
    }

    @Override // com.github.rudroid.searchandfilter.complexfilter.b
    public final boolean T(Object obj, String str) {
        String str2;
        Organization organization = (Organization) obj;
        k71.k.g(organization, "value");
        k71.k.g(str, "query");
        String str3 = organization.s;
        return (str3 != null && t71.p.I(str3, str, true)) || ((str2 = organization.u) != null && t71.p.I(str2, str, true)) || t71.p.I(organization.t, str, true);
    }

    @Override // com.github.rudroid.searchandfilter.complexfilter.d0
    public final o0 getData() {
        return d1.l(this.v, new a0(7));
    }

    @Override // com.github.rudroid.searchandfilter.complexfilter.d0
    public final void i(Object obj) {
        a aVar = (a) obj;
        k71.k.g(aVar, "item");
        W(aVar.a, aVar.b);
    }

}
