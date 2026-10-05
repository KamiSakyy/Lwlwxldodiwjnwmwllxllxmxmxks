package com.github.rudroid.searchandfilter.complexfilter.label;

import androidx.lifecycle.a1;
import androidx.lifecycle.d1;
import androidx.lifecycle.o0;
import com.github.domain.searchandfilter.filters.data.label.NoLabel;
import com.github.rudroid.repository.branches.y;
import com.github.rudroid.searchandfilter.complexfilter.d0;
import com.github.rudroid.searchandfilter.complexfilter.explore.a0;
import com.github.rudroid.searchandfilter.complexfilter.u;
import v71.v;
import yz0.k2;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g extends com.github.rudroid.searchandfilter.complexfilter.k<k2> implements d0<com.github.rudroid.searchandfilter.complexfilter.label.a> {
    public static final a Companion = new a();
    public final hm.b E;
    public final v F;
    public final String G;
    public final String H;

    public static final class a {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(hm.b bVar, com.github.rudroid.activities.util.c cVar, a1 a1Var, v vVar) {
        super(cVar, a1Var, new u(new com.github.rudroid.profile.ui.h(26, (byte) 0), NoLabel.v), new y(27));
        k71.k.g(bVar, "searchUseCase");
        k71.k.g(cVar, "accountHolder");
        k71.k.g(a1Var, "savedStateHandle");
        k71.k.g(vVar, "defaultDispatcher");
        NoLabel.Companion.getClass();
        this.E = bVar;
        this.F = vVar;
        String str = (String) a1Var.a("SelectableLabelSearchViewModel key_owner");
        if (str == null) {
            throw new IllegalStateException("owner must be set");
        }
        this.G = str;
        String str2 = (String) a1Var.a("SelectableLabelSearchViewModel key_repository");
        if (str2 == null) {
            throw new IllegalStateException("repository must be set");
        }
        this.H = str2;
    }

    @Override // com.github.rudroid.searchandfilter.complexfilter.k
    public final Object Q(oa.j jVar, String str, String str2, j71.c cVar, a71.c cVar2) {
        return this.E.a(jVar, this.G, this.H, str, str2, cVar, (c71.c) cVar2);
    }

    @Override // com.github.rudroid.searchandfilter.complexfilter.d0
    public final o0 getData() {
        return d1.l(this.y, new a0(1));
    }

    @Override // com.github.rudroid.searchandfilter.complexfilter.d0
    public final void i(Object obj) {
        com.github.rudroid.searchandfilter.complexfilter.label.a aVar = (com.github.rudroid.searchandfilter.complexfilter.label.a) obj;
        k71.k.g(aVar, "item");
        T(aVar.a, aVar.b);
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class o0<T1,T2,T3,T4> {
        public o0() {
        }
    }
}
