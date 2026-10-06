package com.github.rudroid.searchandfilter.complexfilter.organization;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.github.rudroid.searchandfilter.complexfilter.e0;
import ic.tf;
import l7.n1;

/* loaded from: /home/user/work/p/classes3.dex */
public class b extends e0<a> {
    public SelectableOrganizationFragment f;

    public b(SelectableOrganizationFragment selectableOrganizationFragment) {
        this.f = selectableOrganizationFragment;
    }

    @Override // com.github.rudroid.searchandfilter.complexfilter.e0
    public final String F(Object obj) {
        a aVar = (a) obj;
        k71.k.g(aVar, "item");
        return aVar.a.t;
    }

    public final void v(n1 n1Var, int i) {
        a aVar = (a) this.d.get(i);
        k71.k.g(aVar, "item");
        ((f) n1Var).u.P0(aVar);
    }

    public final n1 w(ViewGroup viewGroup, int i) {
        tf b = k5.b.b(LayoutInflater.from(viewGroup.getContext()), 2131559269, viewGroup, false, k5.b.b);
        k71.k.f(b, "inflate(...)");
        return new f(b, this.f);
    }

}
