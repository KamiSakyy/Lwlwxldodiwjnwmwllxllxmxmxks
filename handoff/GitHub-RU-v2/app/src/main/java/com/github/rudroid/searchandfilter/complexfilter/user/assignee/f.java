package com.github.rudroid.searchandfilter.complexfilter.user.assignee;

import androidx.lifecycle.a1;
import com.github.domain.searchandfilter.filters.data.assignee.NoAssignee;
import com.github.rudroid.searchandfilter.complexfilter.notificationfilter.k0;
import com.github.rudroid.searchandfilter.complexfilter.u;
import com.github.rudroid.viewmodels.x3;
import v71.v;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f extends com.github.rudroid.searchandfilter.complexfilter.user.o implements x3 {
    public static final /* synthetic */ int J = 0;
    public v I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(lm.f fVar, lm.b bVar, com.github.rudroid.activities.util.c cVar, a1 a1Var, v vVar) {
        super(fVar, bVar, cVar, a1Var, new u(new k0(6), NoAssignee.y));
        k71.k.g(fVar, "fetchRepositoryAssignableUsersUseCase");
        k71.k.g(bVar, "fetchAssigneeUseCase");
        k71.k.g(cVar, "accountHolder");
        k71.k.g(a1Var, "savedStateHandle");
        k71.k.g(vVar, "defaultDispatcher");
        NoAssignee.Companion.getClass();
        this.I = vVar;
    }

    @Override // com.github.rudroid.searchandfilter.complexfilter.d0
    public final void i(Object obj) {
        com.github.rudroid.searchandfilter.complexfilter.user.j jVar = (com.github.rudroid.searchandfilter.complexfilter.user.j) obj;
        k71.k.g(jVar, "item");
        T(jVar.a, jVar.b);
    }
}
