package com.github.rudroid.searchandfilter.complexfilter.milestone;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.github.domain.searchandfilter.filters.data.milestone.NoMilestone;
import com.github.rudroid.searchandfilter.complexfilter.e0;
import ic.gf;
import ic.nf;
import java.util.ArrayList;
import l7.n1;
import yz0.v2;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b extends e0<com.github.rudroid.searchandfilter.complexfilter.milestone.a> {
    public static final a Companion = new a();
    public final SelectableMilestoneFragment f;

    public static final class a {
    }

    public b(SelectableMilestoneFragment selectableMilestoneFragment) {
        this.f = selectableMilestoneFragment;
    }

    @Override // com.github.rudroid.searchandfilter.complexfilter.e0
    public final String F(Object obj) {
        com.github.rudroid.searchandfilter.complexfilter.milestone.a aVar = (com.github.rudroid.searchandfilter.complexfilter.milestone.a) obj;
        k71.k.g(aVar, "item");
        v2 v2Var = aVar.a;
        k71.k.g(v2Var, "<this>");
        return v2Var.getName();
    }

    public final int m(int i) {
        return !(((com.github.rudroid.searchandfilter.complexfilter.milestone.a) this.d.get(i)).a instanceof NoMilestone) ? 1 : 0;
    }

    public final void v(n1 n1Var, int i) {
        boolean z = n1Var instanceof r;
        ArrayList arrayList = this.d;
        if (z) {
            com.github.rudroid.searchandfilter.complexfilter.milestone.a aVar = (com.github.rudroid.searchandfilter.complexfilter.milestone.a) arrayList.get(i);
            k71.k.g(aVar, "item");
            ((r) n1Var).u.Q0(aVar);
        } else if (n1Var instanceof q) {
            com.github.rudroid.searchandfilter.complexfilter.milestone.a aVar2 = (com.github.rudroid.searchandfilter.complexfilter.milestone.a) arrayList.get(i);
            k71.k.g(aVar2, "item");
            ((q) n1Var).u.Q0(aVar2);
        }
    }

    public final n1 w(ViewGroup viewGroup, int i) {
        SelectableMilestoneFragment selectableMilestoneFragment = this.f;
        if (i == 0) {
            nf b = k5.b.b(LayoutInflater.from(viewGroup.getContext()), 2131559266, viewGroup, false, k5.b.b);
            k71.k.f(b, "inflate(...)");
            return new r(b, selectableMilestoneFragment);
        }
        gf b2 = k5.b.b(LayoutInflater.from(viewGroup.getContext()), 2131559263, viewGroup, false, k5.b.b);
        k71.k.f(b2, "inflate(...)");
        return new q(b2, selectableMilestoneFragment);
    }
}
