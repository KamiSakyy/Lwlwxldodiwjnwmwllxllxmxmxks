package com.github.rudroid.searchandfilter.complexfilter.notificationfilter;

import androidx.lifecycle.a1;
import androidx.lifecycle.d1;
import com.github.domain.searchandfilter.filters.data.notification.CustomNotificationFilter;
import com.github.domain.searchandfilter.filters.data.notification.RepositoryNotificationFilter;
import com.github.domain.searchandfilter.filters.data.notification.SpacerNotificationFilter;
import com.github.domain.searchandfilter.filters.data.notification.StatusNotificationFilter;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a0 extends com.github.rudroid.searchandfilter.complexfilter.b<com.github.domain.searchandfilter.filters.data.notification.a> implements com.github.rudroid.searchandfilter.complexfilter.d0<k> {
    public static final /* synthetic */ int D = 0;
    public jm.a C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(jm.a aVar, com.github.rudroid.activities.util.c cVar, a1 a1Var) {
        super(cVar, a1Var, new com.github.rudroid.searchandfilter.complexfilter.j0(new com.github.rudroid.profile.ui.hShadow(29, (byte) 0)));
        k71.k.g(aVar, "fetchNotificationFiltersUseCase");
        k71.k.g(cVar, "accountHolder");
        k71.k.g(a1Var, "savedStateHandle");
        this.C = aVar;
        S();
    }

    @Override // com.github.rudroid.searchandfilter.complexfilter.b
    public final Object R(oa.j jVar, String str, j71.c cVar, a71.c cVar2) {
        jm.a aVar = this.C;
        aVar.getClass();
        k71.k.g(jVar, "user");
        k71.k.g(cVar, "onError");
        return new w(new t(b31.b.J(((a11.a) aVar.a.a(jVar)).o(), jVar, cVar), this));
    }

    @Override // com.github.rudroid.searchandfilter.complexfilter.b
    public final boolean T(Object obj, String str) {
        com.github.domain.searchandfilter.filters.data.notification.a aVar = (com.github.domain.searchandfilter.filters.data.notification.a) obj;
        k71.k.g(aVar, "value");
        k71.k.g(str, "query");
        if (aVar instanceof CustomNotificationFilter) {
            return t71.p.I(((CustomNotificationFilter) aVar).t, str, true);
        }
        if (aVar instanceof StatusNotificationFilter) {
            return t71.p.I(((StatusNotificationFilter) aVar).t, str, true);
        }
        if (aVar instanceof SpacerNotificationFilter) {
            return true;
        }
        if (aVar instanceof RepositoryNotificationFilter) {
            return t71.p.I(((RepositoryNotificationFilter) aVar).t, str, true);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.github.rudroid.searchandfilter.complexfilter.d0
    public final androidx.lifecycle.o0 getData() {
        return d1.l(this.v, new com.github.rudroid.searchandfilter.complexfilter.explore.a0(5));
    }

    @Override // com.github.rudroid.searchandfilter.complexfilter.d0
    public final void i(Object obj) {
        k kVar = (k) obj;
        k71.k.g(kVar, "item");
        W(kVar.a, kVar.b);
    }
}
