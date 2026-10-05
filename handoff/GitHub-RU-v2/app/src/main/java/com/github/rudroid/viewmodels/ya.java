package com.github.rudroid.viewmodels;

import android.text.Html;
import android.text.Spanned;
import com.github.rudroid.viewmodels.za;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class ya implements j71.c {
    public final /* synthetic */ int r;
    public final /* synthetic */ za s;

    public /* synthetic */ ya(za zaVar, int i) {
        this.r = i;
        this.s = zaVar;
    }

    public final Object k(Object obj) {
        switch (this.r) {
            case 0:
                com.github.rudroid.utilities.ui.g1 g1Var = (com.github.rudroid.utilities.ui.g1) obj;
                k71.k.g(g1Var, "stateEvent");
                break;
            case 1:
                List<yz0.l4> list = (List) obj;
                k71.k.g(list, "it");
                this.s.getClass();
                ArrayList arrayList = new ArrayList(x61.n.F(list, 10));
                for (yz0.l4 l4Var : list) {
                    Spanned fromHtml = Html.fromHtml(l4Var.d, 0);
                    k71.k.f(fromHtml, "fromHtml(...)");
                    arrayList.add(new za.b(l4Var, t71.p.t0(fromHtml)));
                }
                break;
            case 2:
                com.github.rudroid.utilities.w0.m(this.s.v, (fl.b) obj);
                break;
            default:
                com.github.rudroid.utilities.w0.m(this.s.v, (fl.b) obj);
                break;
        }
        return w61.a0.a;
    }
}
