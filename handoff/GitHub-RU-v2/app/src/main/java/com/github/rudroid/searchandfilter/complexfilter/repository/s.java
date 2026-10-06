package com.github.rudroid.searchandfilter.complexfilter.repository;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.github.rudroid.searchandfilter.complexfilter.e0;
import ic.xf;
import l7.n1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class s extends e0<r> {
    public SelectableRepositoryFragment f;

    public s(SelectableRepositoryFragment selectableRepositoryFragment) {
        this.f = selectableRepositoryFragment;
    }

    @Override // com.github.rudroid.searchandfilter.complexfilter.e0
    public final String F(Object obj) {
        r rVar = (r) obj;
        k71.k.g(rVar, "item");
        return w.a(rVar.a);
    }

    public final void v(n1 n1Var, int i) {
        r rVar = (r) this.d.get(i);
        k71.k.g(rVar, "item");
        ((x) n1Var).u.Q0(rVar);
    }

    public final n1 w(ViewGroup viewGroup, int i) {
        xf b = k5.b.b(LayoutInflater.from(viewGroup.getContext()), 2131559271, viewGroup, false, k5.b.b);
        k71.k.f(b, "inflate(...)");
        return new x(b, this.f);
    }
}
