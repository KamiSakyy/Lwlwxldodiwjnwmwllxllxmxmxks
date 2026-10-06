package com.github.rudroid.searchandfilter.complexfilter.explore;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import ic.zf;
import l7.n1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class v extends com.github.rudroid.searchandfilter.complexfilter.e0<u> {
    public SelectableSpokenLanguageFragment f;

    public v(SelectableSpokenLanguageFragment selectableSpokenLanguageFragment) {
        this.f = selectableSpokenLanguageFragment;
    }

    @Override // com.github.rudroid.searchandfilter.complexfilter.e0
    public final String F(Object obj) {
        u uVar = (u) obj;
        k71.k.g(uVar, "item");
        return uVar.a.s;
    }

    public final void v(n1 n1Var, int i) {
        u uVar = (u) this.d.get(i);
        k71.k.g(uVar, "item");
        ((o0) n1Var).u.Q0(uVar);
    }

    public final n1 w(ViewGroup viewGroup, int i) {
        zf b = k5.b.b(LayoutInflater.from(viewGroup.getContext()), 2131559272, viewGroup, false, k5.b.b);
        k71.k.f(b, "inflate(...)");
        return new o0(b, this.f);
    }
}
