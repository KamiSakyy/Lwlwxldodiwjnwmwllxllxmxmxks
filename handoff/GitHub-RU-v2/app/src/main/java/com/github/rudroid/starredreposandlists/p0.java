package com.github.rudroid.starredreposandlists;

import androidx.compose.foundation.layout.d2;
import androidx.compose.foundation.layout.m2;
import androidx.compose.runtime.i3;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class p0 implements j71.f {
    public final /* synthetic */ int r = 0;
    public final /* synthetic */ i3 s;
    public final /* synthetic */ StarredRepositoriesAndListsFragment t;
    public final /* synthetic */ Object u;

    public /* synthetic */ p0(androidx.compose.runtime.f1 f1Var, m0.s sVar, StarredRepositoriesAndListsFragment starredRepositoriesAndListsFragment) {
        this.s = f1Var;
        this.u = sVar;
        this.t = starredRepositoriesAndListsFragment;
    }

    public final Object f(Object obj, Object obj2, Object obj3) {
        switch (this.r) {
            case 0:
                m0.s sVar = (m0.s) this.u;
                d2 d2Var = (d2) obj;
                androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj2;
                int intValue = ((Integer) obj3).intValue();
                k71.k.g(d2Var, "paddingValues");
                if ((intValue & 6) == 0) {
                    intValue |= sVar2.f(d2Var) ? 4 : 2;
                }
                if (sVar2.S(intValue & 1, (intValue & 19) != 18)) {
                    w1.r w = androidx.compose.foundation.layout.b.w(w1.o.a, d2Var);
                    com.github.rudroid.utilities.ui.g1 g1Var = (com.github.rudroid.utilities.ui.g1) this.s.getValue();
                    StarredRepositoriesAndListsFragment starredRepositoriesAndListsFragment = this.t;
                    h0 D4 = starredRepositoriesAndListsFragment.D4();
                    boolean b = k71.k.b(D4.u.d().c, D4.w.a);
                    r1.d d = r1.i.d(1364934375, new com.github.rudroid.issueorpullrequest.mergebox.ui.e0(8, starredRepositoriesAndListsFragment), sVar2);
                    boolean h = sVar2.h(starredRepositoriesAndListsFragment);
                    Object N = sVar2.N();
                    Object obj4 = androidx.compose.runtime.n.a;
                    if (h || N == obj4) {
                        N = new o0(starredRepositoriesAndListsFragment, 2);
                        sVar2.n0(N);
                    }
                    j71.a aVar = (j71.a) N;
                    boolean h2 = sVar2.h(starredRepositoriesAndListsFragment);
                    Object N2 = sVar2.N();
                    if (h2 || N2 == obj4) {
                        d1 d1Var = new d1(2, starredRepositoriesAndListsFragment, StarredRepositoriesAndListsFragment.class, "onListSelected", "onListSelected(Ljava/lang/String;Ljava/lang/String;)V", 0, 0);
                        sVar2.n0(d1Var);
                        N2 = d1Var;
                    }
                    j71.e eVar = (k71.i) N2;
                    boolean h3 = sVar2.h(starredRepositoriesAndListsFragment);
                    Object N3 = sVar2.N();
                    if (h3 || N3 == obj4) {
                        e1 e1Var = new e1(0, starredRepositoriesAndListsFragment, StarredRepositoriesAndListsFragment.class, "onNewListClicked", "onNewListClicked()V", 0, 0);
                        sVar2.n0(e1Var);
                        N3 = e1Var;
                    }
                    j71.a aVar2 = (k71.i) N3;
                    boolean h4 = sVar2.h(starredRepositoriesAndListsFragment);
                    Object N4 = sVar2.N();
                    if (h4 || N4 == obj4) {
                        f1 f1Var = new f1(2, starredRepositoriesAndListsFragment, StarredRepositoriesAndListsFragment.class, "onRepositorySelected", "onRepositorySelected(Ljava/lang/String;Ljava/lang/String;)V", 0, 0);
                        sVar2.n0(f1Var);
                        N4 = f1Var;
                    }
                    j71.e eVar2 = (k71.i) N4;
                    boolean h5 = sVar2.h(starredRepositoriesAndListsFragment);
                    Object N5 = sVar2.N();
                    if (h5 || N5 == obj4) {
                        g1 g1Var2 = new g1(1, starredRepositoriesAndListsFragment, StarredRepositoriesAndListsFragment.class, "onEditListsClicked", "onEditListsClicked(Lcom/github/rudroid/repositories/ListItemRepository;)V", 0, 0);
                        sVar2.n0(g1Var2);
                        N5 = g1Var2;
                    }
                    j71.c cVar = (k71.i) N5;
                    com.github.rudroid.html.b bVar = starredRepositoriesAndListsFragment.K0;
                    if (bVar == null) {
                        k71.k.m("htmlStyler");
                        throw null;
                    }
                    com.github.rudroid.starredreposandlists.ui.h.a(w, g1Var, sVar, b, d, aVar, eVar, aVar2, eVar2, cVar, bVar, sVar2, 24576);
                } else {
                    sVar2.V();
                }
                return w61.a0.a;
            default:
                androidx.compose.runtime.f1 f1Var2 = (androidx.compose.runtime.f1) this.u;
                androidx.compose.runtime.s sVar3 = (androidx.compose.runtime.s) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                k71.k.g((m2) obj, "$this$PrimaryTopAppBar");
                if (sVar3.S(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (((Boolean) f1Var2.getValue()).booleanValue()) {
                        sVar3.c0(721868212);
                    } else {
                        sVar3.c0(736532979);
                        boolean z = !com.github.rudroid.utilities.ui.h1.c((com.github.rudroid.utilities.ui.g1) this.s.getValue());
                        List n = sy.d0.n(com.github.rudroid.uitoolkit.menu.m.b(sVar3));
                        StarredRepositoriesAndListsFragment starredRepositoriesAndListsFragment2 = this.t;
                        boolean h6 = sVar3.h(starredRepositoriesAndListsFragment2);
                        Object N6 = sVar3.N();
                        if (h6 || N6 == androidx.compose.runtime.n.a) {
                            N6 = new t0(starredRepositoriesAndListsFragment2, 1);
                            sVar3.n0(N6);
                        }
                        com.github.rudroid.uitoolkit.menu.m.a(null, (j71.c) N6, n, z, sVar3, 512);
                    }
                    sVar3.q(false);
                } else {
                    sVar3.V();
                }
                return w61.a0.a;
        }
    }

    public /* synthetic */ p0(i3 i3Var, StarredRepositoriesAndListsFragment starredRepositoriesAndListsFragment, androidx.compose.runtime.f1 f1Var) {
        this.s = i3Var;
        this.t = starredRepositoriesAndListsFragment;
        this.u = f1Var;
    }
}
