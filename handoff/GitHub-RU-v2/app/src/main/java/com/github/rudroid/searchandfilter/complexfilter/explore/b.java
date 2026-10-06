package com.github.rudroid.searchandfilter.complexfilter.explore;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import ic.ef;
import l7.n1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b extends com.github.rudroid.searchandfilter.complexfilter.e0<a> {
    public SelectableLanguageFragment f;

    public b(SelectableLanguageFragment selectableLanguageFragment) {
        this.f = selectableLanguageFragment;
    }

    @Override // com.github.rudroid.searchandfilter.complexfilter.e0
    public final String F(Object obj) {
        a aVar = (a) obj;
        k71.k.g(aVar, "item");
        return aVar.a.r;
    }

    public final void v(n1 n1Var, int i) {
        a aVar = (a) this.d.get(i);
        k71.k.g(aVar, "item");
        ef efVar = ((t) n1Var).u;
        efVar.Q0(aVar);
        String str = aVar.a.s;
        efVar.N.setColorFilter(str != null ? Color.parseColor(str) : -16777216);
    }

    public final n1 w(ViewGroup viewGroup, int i) {
        ef b = k5.b.b(LayoutInflater.from(viewGroup.getContext()), 2131559262, viewGroup, false, k5.b.b);
        k71.k.f(b, "inflate(...)");
        return new t(b, this.f);
    }
}
