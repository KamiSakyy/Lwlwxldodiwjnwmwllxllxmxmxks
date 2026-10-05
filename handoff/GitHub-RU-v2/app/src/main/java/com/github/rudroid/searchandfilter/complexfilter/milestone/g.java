package com.github.rudroid.searchandfilter.complexfilter.milestone;

import androidx.lifecycle.a1;
import androidx.lifecycle.d1;
import androidx.lifecycle.o0;
import com.github.domain.searchandfilter.filters.data.milestone.NoMilestone;
import com.github.rudroid.repository.branches.y;
import com.github.rudroid.searchandfilter.complexfilter.d0;
import com.github.rudroid.searchandfilter.complexfilter.explore.a0;
import com.github.rudroid.searchandfilter.complexfilter.k0;
import v71.v;
import yz0.v2;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g extends com.github.rudroid.searchandfilter.complexfilter.k<v2> implements d0<com.github.rudroid.searchandfilter.complexfilter.milestone.a> {
    public static final a Companion = new a();
    public final im.g E;
    public final v F;
    public final String G;
    public final String H;

    public static final class a {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(im.g gVar, com.github.rudroid.activities.util.c cVar, a1 a1Var, v vVar) {
        super(cVar, a1Var, new k0(NoMilestone.w, new com.github.rudroid.profile.ui.h(27, (byte) 0)), new y(27));
        k71.k.g(gVar, "searchUseCase");
        k71.k.g(cVar, "accountHolder");
        k71.k.g(a1Var, "savedStateHandle");
        k71.k.g(vVar, "defaultDispatcher");
        NoMilestone.Companion.getClass();
        this.E = gVar;
        this.F = vVar;
        String str = (String) a1Var.a("SelectableMilestoneSearchViewModel key_owner");
        if (str == null) {
            throw new IllegalStateException("owner must be set");
        }
        this.G = str;
        String str2 = (String) a1Var.a("SelectableMilestoneSearchViewModel key_repository");
        if (str2 == null) {
            throw new IllegalStateException("repository must be set");
        }
        this.H = str2;
    }

    @Override // com.github.rudroid.searchandfilter.complexfilter.k
    public final Object Q(oa.j jVar, String str, String str2, j71.c cVar, a71.c cVar2) {
        return this.E.a(jVar, this.G, this.H, str, str2, cVar);
    }

    @Override // com.github.rudroid.searchandfilter.complexfilter.d0
    public final o0 getData() {
        return d1.l(this.y, new a0(2));
    }

    @Override // com.github.rudroid.searchandfilter.complexfilter.d0
    public final void i(Object obj) {
        com.github.rudroid.searchandfilter.complexfilter.milestone.a aVar = (com.github.rudroid.searchandfilter.complexfilter.milestone.a) obj;
        k71.k.g(aVar, "item");
        T(aVar.a, aVar.b);
    }
}
