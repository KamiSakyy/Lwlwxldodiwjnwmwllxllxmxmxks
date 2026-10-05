package com.github.rudroid.starredreposandlists.listdetails;

import androidx.compose.runtime.f1;
import f1.e8;
import f1.o5;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class j implements j71.e {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;

    public /* synthetic */ j(int i, Object obj) {
        this.r = i;
        this.s = obj;
    }

    public final Object s(Object obj, Object obj2) {
        final k71.i iVar;
        switch (this.r) {
            case 0:
                final ListDetailFragment listDetailFragment = (ListDetailFragment) this.s;
                androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj;
                int intValue = ((Integer) obj2).intValue();
                if (sVar.S(intValue & 1, (intValue & 3) != 2)) {
                    s0 C4 = listDetailFragment.C4();
                    if (k71.k.b(C4.w.a, C4.u.d().c)) {
                        sVar.c0(-1580242233);
                        boolean h = sVar.h(listDetailFragment);
                        Object N = sVar.N();
                        if (h || N == androidx.compose.runtime.n.a) {
                            N = new q(1, listDetailFragment, ListDetailFragment.class, "onMenuItemSelectAction", "onMenuItemSelectAction(Ljava/lang/String;)V", 0, 0);
                            sVar.n0(N);
                        }
                        iVar = (k71.i) N;
                        sVar.q(false);
                    } else {
                        sVar.c0(-1580213094);
                        sVar.q(false);
                        iVar = null;
                    }
                    ih.e.a(false, null, null, null, null, null, null, null, null, r1.i.d(-148625135, new j71.e() { // from class: com.github.rudroid.starredreposandlists.listdetails.k
                        public final Object s(Object obj3, Object obj4) {
                            androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj3;
                            int intValue2 = ((Integer) obj4).intValue();
                            if (sVar2.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                                m0.s a = m0.u.a(0, 3, sVar2);
                                ListDetailFragment listDetailFragment2 = ListDetailFragment.this;
                                com.github.rudroid.html.b bVar = listDetailFragment2.E0;
                                if (bVar == null) {
                                    k71.k.m("htmlStyler");
                                    throw null;
                                }
                                boolean h2 = sVar2.h(listDetailFragment2);
                                Object N2 = sVar2.N();
                                Object obj5 = androidx.compose.runtime.n.a;
                                if (h2 || N2 == obj5) {
                                    N2 = new l(listDetailFragment2, 0);
                                    sVar2.n0(N2);
                                }
                                j71.a aVar = (j71.a) N2;
                                boolean h3 = sVar2.h(listDetailFragment2);
                                Object N3 = sVar2.N();
                                if (h3 || N3 == obj5) {
                                    N3 = new l(listDetailFragment2, 2);
                                    sVar2.n0(N3);
                                }
                                x.a(a, null, aVar, (j71.a) N3, listDetailFragment2, iVar, bVar, sVar2, 0);
                                s0 C42 = listDetailFragment2.C4();
                                boolean h4 = sVar2.h(C42);
                                Object N4 = sVar2.N();
                                if (h4 || N4 == obj5) {
                                    o oVar = new o(0, C42, s0.class, "canLoadNextPage", "canLoadNextPage()Z", 0, 0);
                                    sVar2.n0(oVar);
                                    N4 = oVar;
                                }
                                j71.a aVar2 = (k71.i) N4;
                                s0 C43 = listDetailFragment2.C4();
                                boolean h5 = sVar2.h(C43);
                                Object N5 = sVar2.N();
                                if (h5 || N5 == obj5) {
                                    p pVar = new p(0, C43, s0.class, "loadNextPage", "loadNextPage()V", 0, 0);
                                    sVar2.n0(pVar);
                                    N5 = pVar;
                                }
                                com.github.rudroid.uitoolkit.utils.lists.t.a(a, 0, aVar2, (k71.i) N5, sVar2, 0);
                            } else {
                                sVar2.V();
                            }
                            return w61.a0.a;
                        }
                    }, sVar), sVar, 805306368, 511);
                } else {
                    sVar.V();
                }
                break;
            default:
                f1 f1Var = (f1) this.s;
                androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (sVar2.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Object N2 = sVar2.N();
                    if (N2 == androidx.compose.runtime.n.a) {
                        N2 = new g0(f1Var, 1);
                        sVar2.n0(N2);
                    }
                    e8.h((j71.a) N2, (w1.r) null, false, (o5) null, (d2.p0) null, c.a, sVar2, 1572870, 62);
                } else {
                    sVar2.V();
                }
                break;
        }
        return w61.a0.a;
    }
}
