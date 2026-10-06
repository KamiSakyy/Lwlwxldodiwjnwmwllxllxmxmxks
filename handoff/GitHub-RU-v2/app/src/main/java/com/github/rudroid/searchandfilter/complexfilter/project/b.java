package com.github.rudroid.searchandfilter.complexfilter.project;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.github.rudroid.searchandfilter.complexfilter.SearchAndFilterBaseFragment;
import com.github.service.models.response.LegacyProjectWithNumber;
import ic.vf;
import l7.n1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b extends com.github.rudroid.searchandfilter.complexfilter.e0<o> {
    public SearchAndFilterBaseFragment f;

    public b(SearchAndFilterBaseFragment searchAndFilterBaseFragment) {
        this.f = searchAndFilterBaseFragment;
    }

    @Override // com.github.rudroid.searchandfilter.complexfilter.e0
    public final String F(Object obj) {
        o oVar = (o) obj;
        k71.k.g(oVar, "item");
        LegacyProjectWithNumber legacyProjectWithNumber = oVar.a;
        k71.k.g(legacyProjectWithNumber, "<this>");
        return i21.a.M(legacyProjectWithNumber);
    }

    public final void v(n1 n1Var, int i) {
        o oVar = (o) this.d.get(i);
        k71.k.g(oVar, "item");
        ((c) n1Var).u.Q0(oVar);
    }

    public final n1 w(ViewGroup viewGroup, int i) {
        vf b = k5.b.b(LayoutInflater.from(viewGroup.getContext()), 2131559270, viewGroup, false, k5.b.b);
        k71.k.f(b, "inflate(...)");
        return new c(b, this.f);
    }
}
