package com.github.rudroid.starredreposandlists;

import androidx.compose.runtime.v1;
import com.google.android.gms.internal.measurement.i4;
import f1.ub;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class q0 implements j71.e {
    public final /* synthetic */ StarredRepositoriesAndListsFragment r;
    public final /* synthetic */ androidx.compose.runtime.f1 s;
    public final /* synthetic */ androidx.compose.runtime.f1 t;

    public /* synthetic */ q0(StarredRepositoriesAndListsFragment starredRepositoriesAndListsFragment, androidx.compose.runtime.f1 f1Var, androidx.compose.runtime.f1 f1Var2) {
        this.r = starredRepositoriesAndListsFragment;
        this.s = f1Var;
        this.t = f1Var2;
    }

    public final Object s(Object obj, Object obj2) {
        androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj;
        int intValue = ((Integer) obj2).intValue();
        if (sVar.S(intValue & 1, (intValue & 3) != 2)) {
            final StarredRepositoriesAndListsFragment starredRepositoriesAndListsFragment = this.r;
            com.github.rudroid.activities.util.c cVar = starredRepositoriesAndListsFragment.D0;
            if (cVar == null) {
                k71.k.m("accountHolder");
                throw null;
            }
            boolean f = cVar.d().f(com.github.rudroid.common.a.I);
            Object obj3 = androidx.compose.runtime.n.a;
            if (f) {
                sVar.c0(1824739278);
                boolean Q = starredRepositoriesAndListsFragment.C4().Q();
                androidx.compose.runtime.f1 f1Var = this.t;
                boolean booleanValue = ((Boolean) f1Var.getValue()).booleanValue();
                final androidx.compose.runtime.f1 f1Var2 = this.s;
                String str = (String) f1Var2.getValue();
                String p0 = i4.p0(2131954339, sVar);
                boolean f2 = sVar.f(f1Var2) | sVar.h(starredRepositoriesAndListsFragment);
                Object N = sVar.N();
                if (f2 || N == obj3) {
                    N = new j71.c() { // from class: com.github.rudroid.starredreposandlists.r0
                        public final Object k(Object obj4) {
                            String str2 = (String) obj4;
                            k71.k.g(str2, "it");
                            f1Var2.setValue(str2);
                            starredRepositoriesAndListsFragment.C4().T(str2);
                            return w61.a0.a;
                        }
                    };
                    sVar.n0(N);
                }
                j71.c cVar2 = (j71.c) N;
                boolean f3 = sVar.f(f1Var);
                Object N2 = sVar.N();
                if (f3 || N2 == obj3) {
                    N2 = new com.github.rudroid.fragments.onboarding.notifications.ui.p(f1Var, 14);
                    sVar.n0(N2);
                }
                j71.a aVar = (j71.a) N2;
                boolean f4 = sVar.f(f1Var2) | sVar.h(starredRepositoriesAndListsFragment);
                Object N3 = sVar.N();
                if (f4 || N3 == obj3) {
                    final int i = 0;
                    N3 = new j71.a() { // from class: com.github.rudroid.starredreposandlists.s0
                        public final Object a() {
                            switch (i) {
                                case 0:
                                    f1Var2.setValue("");
                                    starredRepositoriesAndListsFragment.C4().P();
                                    break;
                                default:
                                    starredRepositoriesAndListsFragment.C4().R((String) f1Var2.getValue());
                                    break;
                            }
                            return w61.a0.a;
                        }
                    };
                    sVar.n0(N3);
                }
                j71.a aVar2 = (j71.a) N3;
                boolean h = sVar.h(starredRepositoriesAndListsFragment) | sVar.f(f1Var2);
                Object N4 = sVar.N();
                if (h || N4 == obj3) {
                    final int i2 = 1;
                    N4 = new j71.a() { // from class: com.github.rudroid.starredreposandlists.s0
                        public final Object a() {
                            switch (i2) {
                                case 0:
                                    f1Var2.setValue("");
                                    starredRepositoriesAndListsFragment.C4().P();
                                    break;
                                default:
                                    starredRepositoriesAndListsFragment.C4().R((String) f1Var2.getValue());
                                    break;
                            }
                            return w61.a0.a;
                        }
                    };
                    sVar.n0(N4);
                }
                fh.k.a(null, Q, 2131954339, false, 0L, booleanValue, p0, str, cVar2, aVar, aVar2, (j71.a) N4, null, false, r1.i.d(255824999, new androidx.compose.runtime.b1(25, starredRepositoriesAndListsFragment), sVar), sVar, 0, 24625);
                sVar.q(false);
            } else {
                sVar.c0(1827208521);
                Object N5 = sVar.N();
                if (N5 == obj3) {
                    N5 = new com.github.rudroid.searchandfilter.complexfilter.explore.a0(29);
                    sVar.n0(N5);
                }
                w1.r b = d3.q.b(w1.o.a, true, (j71.c) N5);
                androidx.compose.foundation.layout.e0 a = androidx.compose.foundation.layout.c0.a(androidx.compose.foundation.layout.l.c, w1.c.D, sVar, 0);
                int hashCode = Long.hashCode(sVar.T);
                v1 l = sVar.l();
                w1.r c = w1.a.c(sVar, b);
                v2.h.o.getClass();
                v2.f fVar = v2.g.b;
                sVar.g0();
                if (sVar.S) {
                    sVar.k(fVar);
                } else {
                    sVar.q0();
                }
                androidx.compose.runtime.t.I(sVar, v2.g.f, a);
                androidx.compose.runtime.t.I(sVar, v2.g.e, l);
                androidx.compose.runtime.t.w(sVar, Integer.valueOf(hashCode), v2.g.g);
                androidx.compose.runtime.t.E(sVar, v2.g.h);
                androidx.compose.runtime.t.I(sVar, v2.g.d, c);
                ub.b(starredRepositoriesAndListsFragment.D4().w.a, (w1.r) null, 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 2, false, 1, 0, (j71.c) null, ih.d.f(sVar).x, sVar, 0, 24960, 110590);
                ub.b(i4.p0(2131953520, sVar), (w1.r) null, 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, (g3.q0) null, sVar, 0, 0, 262142);
                sVar.q(true);
                sVar.q(false);
            }
        } else {
            sVar.V();
        }
        return w61.a0.a;
    }
}
