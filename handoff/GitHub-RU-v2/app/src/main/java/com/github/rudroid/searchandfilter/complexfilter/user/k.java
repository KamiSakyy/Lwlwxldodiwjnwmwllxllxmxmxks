package com.github.rudroid.searchandfilter.complexfilter.user;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.github.domain.searchandfilter.filters.data.assignee.NoAssignee;
import com.github.rudroid.searchandfilter.complexfilter.SearchAndFilterBaseFragment;
import com.github.rudroid.searchandfilter.complexfilter.e0;
import ic.ce;
import ic.jf;
import java.util.ArrayList;
import l7.n1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k extends e0<j> {
    public static final a Companion = new a();
    public final SearchAndFilterBaseFragment f;

    public static final class a {
    }

    public k(SearchAndFilterBaseFragment searchAndFilterBaseFragment) {
        this.f = searchAndFilterBaseFragment;
    }

    @Override // com.github.rudroid.searchandfilter.complexfilter.e0
    public final String F(Object obj) {
        j jVar = (j) obj;
        k71.k.g(jVar, "item");
        return jVar.a.d();
    }

    public final int m(int i) {
        return !(((j) this.d.get(i)).a instanceof NoAssignee) ? 1 : 0;
    }

    public final void v(n1 n1Var, int i) {
        boolean z = n1Var instanceof t;
        ArrayList arrayList = this.d;
        if (z) {
            j jVar = (j) arrayList.get(i);
            k71.k.g(jVar, "item");
            ((t) n1Var).u.Q0(jVar);
        } else if (n1Var instanceof l) {
            j jVar2 = (j) arrayList.get(i);
            k71.k.g(jVar2, "item");
            ((l) n1Var).u.P0(jVar2);
        }
    }

    public final n1 w(ViewGroup viewGroup, int i) {
        SearchAndFilterBaseFragment searchAndFilterBaseFragment = this.f;
        if (i == 0) {
            jf b = k5.b.b(LayoutInflater.from(viewGroup.getContext()), 2131559264, viewGroup, false, k5.b.b);
            k71.k.f(b, "inflate(...)");
            return new t(b, searchAndFilterBaseFragment);
        }
        ce b2 = k5.b.b(LayoutInflater.from(viewGroup.getContext()), 2131559248, viewGroup, false, k5.b.b);
        k71.k.f(b2, "inflate(...)");
        return new l(b2, searchAndFilterBaseFragment);
    }
}
