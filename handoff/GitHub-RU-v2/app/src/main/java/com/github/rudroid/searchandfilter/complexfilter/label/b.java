package com.github.rudroid.searchandfilter.complexfilter.label;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import com.github.domain.searchandfilter.filters.data.label.NoLabel;
import com.github.rudroid.searchandfilter.complexfilter.e0;
import com.github.rudroid.utilities.i0;
import com.github.rudroid.utilities.s2;
import ic.cf;
import ic.lf;
import java.util.ArrayList;
import l7.n1;
import yz0.k2;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b extends e0<com.github.rudroid.searchandfilter.complexfilter.label.a> {
    public static final a Companion = new a();
    public final SelectableLabelFragment f;

    public static final class a {
    }

    public b(SelectableLabelFragment selectableLabelFragment) {
        this.f = selectableLabelFragment;
    }

    @Override // com.github.rudroid.searchandfilter.complexfilter.e0
    public final String F(Object obj) {
        com.github.rudroid.searchandfilter.complexfilter.label.a aVar = (com.github.rudroid.searchandfilter.complexfilter.label.a) obj;
        k71.k.g(aVar, "item");
        k2 k2Var = aVar.a;
        k71.k.g(k2Var, "<this>");
        return k2Var.getName();
    }

    public final int m(int i) {
        return !(((com.github.rudroid.searchandfilter.complexfilter.label.a) this.d.get(i)).a instanceof NoLabel) ? 1 : 0;
    }

    public final void v(n1 n1Var, int i) {
        boolean z = n1Var instanceof r;
        ArrayList arrayList = this.d;
        if (z) {
            com.github.rudroid.searchandfilter.complexfilter.label.a aVar = (com.github.rudroid.searchandfilter.complexfilter.label.a) arrayList.get(i);
            k71.k.g(aVar, "item");
            ((r) n1Var).u.Q0(aVar);
            return;
        }
        if (n1Var instanceof q) {
            com.github.rudroid.searchandfilter.complexfilter.label.a aVar2 = (com.github.rudroid.searchandfilter.complexfilter.label.a) arrayList.get(i);
            k71.k.g(aVar2, "item");
            k2 k2Var = aVar2.a;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(k2Var.getName());
            cf cfVar = ((q) n1Var).u;
            View view = ((k5.f) cfVar).A;
            AppCompatTextView appCompatTextView = cfVar.O;
            Context context = view.getContext();
            k71.k.f(context, "getContext(...)");
            s2.c(spannableStringBuilder, context, k2Var.getName(), k2Var.f(), 2132017459);
            k71.k.f(appCompatTextView, "label");
            i0.a(spannableStringBuilder, appCompatTextView);
            appCompatTextView.setText(spannableStringBuilder);
            cfVar.Q0(aVar2);
        }
    }

    public final n1 w(ViewGroup viewGroup, int i) {
        SelectableLabelFragment selectableLabelFragment = this.f;
        if (i == 0) {
            lf b = k5.b.b(LayoutInflater.from(viewGroup.getContext()), 2131559265, viewGroup, false, k5.b.b);
            k71.k.f(b, "inflate(...)");
            return new r(b, selectableLabelFragment);
        }
        cf b2 = k5.b.b(LayoutInflater.from(viewGroup.getContext()), 2131559261, viewGroup, false, k5.b.b);
        k71.k.f(b2, "inflate(...)");
        return new q(b2, selectableLabelFragment);
    }
}
