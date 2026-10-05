package com.github.rudroid.fragments.ui;

import androidx.compose.runtime.i3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: /home/user/work/p/classes.dex */
public final /* synthetic */ class a implements j71.a {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f14425r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ i3 f14426s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ j71.e f14427t;

    public /* synthetic */ a(androidx.compose.runtime.f1 f1Var, j71.e eVar, int i) {
        this.f14425r = i;
        this.f14426s = f1Var;
        this.f14427t = eVar;
    }

    public final Object a() {
        switch (this.f14425r) {
            case k5.f.J /* 0 */:
                com.github.rudroid.searchandfilter.d0 d0Var = (com.github.rudroid.searchandfilter.d0) this.f14426s.getValue();
                List list = d0Var.b;
                ArrayList arrayList = new ArrayList(x61.n.F(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add((com.github.rudroid.searchandfilter.filterbar.f) this.f14427t.s((com.github.domain.searchandfilter.filters.data.d) it.next(), d0Var.c));
                }
                return arrayList;
            case 1:
                com.github.rudroid.searchandfilter.d0 d0Var2 = (com.github.rudroid.searchandfilter.d0) this.f14426s.getValue();
                List list2 = d0Var2.b;
                ArrayList arrayList2 = new ArrayList(x61.n.F(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((com.github.rudroid.searchandfilter.filterbar.f) this.f14427t.s((com.github.domain.searchandfilter.filters.data.d) it2.next(), d0Var2.c));
                }
                return arrayList2;
            default:
                com.github.rudroid.searchandfilter.d0 d0Var3 = (com.github.rudroid.searchandfilter.d0) this.f14426s.getValue();
                List list3 = d0Var3.b;
                ArrayList arrayList3 = new ArrayList(x61.n.F(list3, 10));
                Iterator it3 = list3.iterator();
                while (it3.hasNext()) {
                    arrayList3.add((com.github.rudroid.searchandfilter.filterbar.f) this.f14427t.s((com.github.domain.searchandfilter.filters.data.d) it3.next(), d0Var3.c));
                }
                return arrayList3;
        }
    }
}
