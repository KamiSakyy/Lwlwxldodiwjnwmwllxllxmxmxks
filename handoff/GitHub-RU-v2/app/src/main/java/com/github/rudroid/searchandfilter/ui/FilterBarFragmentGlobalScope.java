package com.github.rudroid.searchandfilter.ui;

import android.content.Context;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class FilterBarFragmentGlobalScope extends Hilt_FilterBarFragmentGlobalScope {
    @Override // com.github.rudroid.searchandfilter.ui.FilterBarFragmentBase
    public com.github.rudroid.searchandfilter.filterbar.f I4(com.github.domain.searchandfilter.filters.data.d dVar, bm.l lVar) {
        k71.k.g(dVar, "filter");
        Context i4 = i4();
        com.github.rudroid.activities.util.c cVar = this.B0;
        if (cVar != null) {
            return e0.t(dVar, i4, cVar.d(), A3(), H4(), true, lVar);
        }
        k71.k.m("accountHolder");
        throw null;
    }

    public <T0> T0 A3(Object... a) {
        return null;
    }
}
