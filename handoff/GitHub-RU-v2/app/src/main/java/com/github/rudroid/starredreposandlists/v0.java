package com.github.rudroid.starredreposandlists;

import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.l1;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class v0 implements j71.e {
    public final /* synthetic */ int r;
    public final /* synthetic */ StarredRepositoriesAndListsFragment s;
    public final /* synthetic */ ComposeView t;

    public /* synthetic */ v0(StarredRepositoriesAndListsFragment starredRepositoriesAndListsFragment, ComposeView composeView, int i) {
        this.r = i;
        this.s = starredRepositoriesAndListsFragment;
        this.t = composeView;
    }

    public final Object s(Object obj, Object obj2) {
        List list;
        switch (this.r) {
            case 0:
                androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj;
                int intValue = ((Integer) obj2).intValue();
                boolean S = sVar.S(intValue & 1, (intValue & 3) != 2);
                w61.a0 a0Var = w61.a0.a;
                if (!S) {
                    sVar.V();
                    return a0Var;
                }
                final StarredRepositoriesAndListsFragment starredRepositoriesAndListsFragment = this.s;
                androidx.compose.runtime.f1 l = k41.b.l(starredRepositoriesAndListsFragment.C4().u, (l1) null, sVar, 7);
                androidx.compose.runtime.f1 l2 = k41.b.l(starredRepositoriesAndListsFragment.D4().B, (l1) null, sVar, 7);
                m0.s a = m0.u.a(0, 3, sVar);
                Object[] objArr = new Object[0];
                Object N = sVar.N();
                Object obj3 = androidx.compose.runtime.n.a;
                if (N == obj3) {
                    N = new com.github.rudroid.searchandfilter.complexfilter.user.assignee.l(6);
                    sVar.n0(N);
                }
                final androidx.compose.runtime.f1 f1Var = (androidx.compose.runtime.f1) u1.j.c(objArr, (j71.a) N, sVar, 48);
                Object[] objArr2 = {l.getValue()};
                boolean f = sVar.f(l);
                Object N2 = sVar.N();
                if (f || N2 == obj3) {
                    N2 = new com.github.rudroid.fragments.onboarding.notifications.ui.p(l, 15);
                    sVar.n0(N2);
                }
                final androidx.compose.runtime.f1 f1Var2 = (androidx.compose.runtime.f1) u1.j.c(objArr2, (j71.a) N2, sVar, 0);
                Object N3 = sVar.N();
                if (N3 == obj3) {
                    N3 = no.a.f(sVar);
                }
                b2.a0 a0Var2 = (b2.a0) N3;
                h0 D4 = starredRepositoriesAndListsFragment.D4();
                String str = (String) f1Var2.getValue();
                k71.k.g(str, "<set-?>");
                D4.y.y(str, h0.C[0]);
                if (starredRepositoriesAndListsFragment.C4().Q() && com.github.rudroid.utilities.ui.h1.g((com.github.rudroid.utilities.ui.g1) l2.getValue()) && (list = (List) ((com.github.rudroid.utilities.ui.g1) l2.getValue()).getData()) != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj4 : list) {
                        if (obj4 instanceof com.github.rudroid.repositories.k) {
                            arrayList.add(obj4);
                        }
                    }
                    int size = arrayList.size();
                    ((com.github.rudroid.utilities.b) starredRepositoriesAndListsFragment.L0.getValue()).b(this.t.getResources().getQuantityString(2131820631, size, Integer.valueOf(size)));
                }
                boolean booleanValue = ((Boolean) f1Var.getValue()).booleanValue();
                boolean f2 = sVar.f(f1Var) | sVar.f(f1Var2) | sVar.h(starredRepositoriesAndListsFragment);
                Object N4 = sVar.N();
                if (f2 || N4 == obj3) {
                    N4 = new j71.a() { // from class: com.github.rudroid.starredreposandlists.w0
                        public final Object a() {
                            f1Var.setValue(Boolean.FALSE);
                            f1Var2.setValue("");
                            StarredRepositoriesAndListsFragment.this.C4().P();
                            return w61.a0.a;
                        }
                    };
                    sVar.n0(N4);
                }
                i21.a.a(0, 0, sVar, (j71.a) N4, booleanValue);
                Object N5 = sVar.N();
                if (N5 == obj3) {
                    N5 = new y0(a0Var2, null);
                    sVar.n0(N5);
                }
                androidx.compose.runtime.t.f(sVar, (j71.e) N5, a0Var2);
                if (((Boolean) starredRepositoriesAndListsFragment.I0.getValue()).booleanValue()) {
                    sVar.c0(166369838);
                    boolean f3 = sVar.f(a) | sVar.h(starredRepositoriesAndListsFragment);
                    Object N6 = sVar.N();
                    if (f3 || N6 == obj3) {
                        N6 = new z0(a, starredRepositoriesAndListsFragment, null);
                        sVar.n0(N6);
                    }
                    androidx.compose.runtime.t.f(sVar, (j71.e) N6, a0Var);
                } else {
                    sVar.c0(157015743);
                }
                sVar.q(false);
                h0 D42 = starredRepositoriesAndListsFragment.D4();
                boolean h = sVar.h(D42);
                Object N7 = sVar.N();
                if (h || N7 == obj3) {
                    N7 = new a1(0, D42, h0.class, "canLoadNextPage", "canLoadNextPage()Z", 0, 0);
                    sVar.n0(N7);
                }
                j71.a aVar = (k71.i) N7;
                h0 D43 = starredRepositoriesAndListsFragment.D4();
                boolean h2 = sVar.h(D43);
                Object N8 = sVar.N();
                if (h2 || N8 == obj3) {
                    N8 = new b1(0, D43, h0.class, "loadNextPage", "loadNextPage()V", 0, 0);
                    sVar.n0(N8);
                }
                com.github.rudroid.uitoolkit.utils.lists.t.a(a, 0, aVar, (k71.i) N8, sVar, 0);
                com.github.rudroid.uitoolkit.utils.z.a(b2.d.k(f0.o.p(w1.o.a), a0Var2), r1.i.d(1979695023, new bd.d(starredRepositoriesAndListsFragment, l2, f1Var, f1Var2, 25), sVar), null, null, r1.i.d(-1620266740, new x0(l2, starredRepositoriesAndListsFragment), sVar), 0, 0L, 0L, r1.i.d(-1193876955, new p0(l2, a, starredRepositoriesAndListsFragment), sVar), sVar, 100687920, 236);
                return a0Var;
            default:
                androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (sVar2.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                    ih.e.a(false, null, null, null, null, null, null, null, null, r1.i.d(39219747, new v0(this.s, this.t, 0), sVar2), sVar2, 805306368, 511);
                } else {
                    sVar2.V();
                }
                return w61.a0.a;
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class ComposeView<T1,T2,T3,T4> {
        public ComposeView() {
        }
    }
}
