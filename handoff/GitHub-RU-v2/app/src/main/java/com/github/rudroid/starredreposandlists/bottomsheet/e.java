package com.github.rudroid.starredreposandlists.bottomsheet;

import android.content.Context;
import androidx.compose.foundation.layout.p2;
import androidx.compose.runtime.f1;
import androidx.compose.runtime.v1;
import androidx.compose.ui.layout.v0;
import com.github.rudroid.m0;
import com.github.rudroid.starredreposandlists.bottomsheet.ListSelectionBottomSheet;
import com.github.rudroid.utilities.b;
import com.github.rudroid.utilities.m1;
import f1.ub;
import g3.q0;
import java.util.List;
import y71.i1;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class e implements j71.e {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;

    public /* synthetic */ e(int i, Object obj) {
        this.r = i;
        this.s = obj;
    }

    public final Object s(Object obj, Object obj2) {
        int i = this.r;
        w61.a0 a0Var = w61.a0.a;
        w1.o oVar = w1.o.a;
        Object obj3 = this.s;
        int i2 = 1;
        switch (i) {
            case 0:
                final ListSelectionBottomSheet listSelectionBottomSheet = (ListSelectionBottomSheet) obj3;
                androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj;
                int intValue = ((Integer) obj2).intValue();
                ListSelectionBottomSheet.a aVar = ListSelectionBottomSheet.Companion;
                if (!sVar.S(intValue & 1, (intValue & 3) != 2)) {
                    sVar.V();
                    break;
                } else {
                    i1 i1Var = listSelectionBottomSheet.I4().z;
                    fl.f.Companion.getClass();
                    final f1 m = androidx.compose.runtime.t.m(i1Var, fl.e.b(null), (a71.h) null, sVar, 0, 2);
                    w1.r a = p2.f.a(oVar, w2.f0.A(sVar), (p2.d) null);
                    androidx.compose.foundation.layout.e0 a2 = androidx.compose.foundation.layout.c0.a(androidx.compose.foundation.layout.l.c, w1.c.D, sVar, 0);
                    int hashCode = Long.hashCode(sVar.T);
                    v1 l = sVar.l();
                    w1.r c = w1.a.c(sVar, a);
                    v2.h.o.getClass();
                    v2.f fVar = v2.g.b;
                    sVar.g0();
                    if (sVar.S) {
                        sVar.k(fVar);
                    } else {
                        sVar.q0();
                    }
                    androidx.compose.runtime.t.I(sVar, v2.g.f, a2);
                    androidx.compose.runtime.t.I(sVar, v2.g.e, l);
                    androidx.compose.runtime.t.w(sVar, Integer.valueOf(hashCode), v2.g.g);
                    androidx.compose.runtime.t.E(sVar, v2.g.h);
                    androidx.compose.runtime.t.I(sVar, v2.g.d, c);
                    b.a aVar2 = com.github.rudroid.utilities.b.Companion;
                    Context context = (Context) sVar.j(w2.j0.b);
                    aVar2.getClass();
                    boolean a3 = b.a.a(context);
                    boolean h = sVar.h(listSelectionBottomSheet);
                    Object N = sVar.N();
                    if (h || N == androidx.compose.runtime.n.a) {
                        N = new c(1, listSelectionBottomSheet);
                        sVar.n0(N);
                    }
                    rg.l.a(null, null, a3, (j71.a) N, 0L, true, sVar, 196608, 19);
                    List list = (List) ((fl.f) m.getValue()).b;
                    m1.b(null, m, list != null && (list.isEmpty() ^ true), r1.i.d(-338790415, new j71.e() { // from class: com.github.rudroid.starredreposandlists.bottomsheet.f
                        public final Object s(Object obj4, Object obj5) {
                            androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj4;
                            int intValue2 = ((Integer) obj5).intValue();
                            ListSelectionBottomSheet.a aVar3 = ListSelectionBottomSheet.Companion;
                            if (sVar2.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                                x61.r rVar = (List) ((fl.f) m.getValue()).b;
                                if (rVar == null) {
                                    rVar = x61.r.r;
                                }
                                ListSelectionBottomSheet listSelectionBottomSheet2 = listSelectionBottomSheet;
                                boolean h2 = sVar2.h(listSelectionBottomSheet2);
                                Object N2 = sVar2.N();
                                Object obj6 = androidx.compose.runtime.n.a;
                                if (h2 || N2 == obj6) {
                                    N2 = new g(0, listSelectionBottomSheet2);
                                    sVar2.n0(N2);
                                }
                                j71.c cVar = (j71.c) N2;
                                boolean h3 = sVar2.h(listSelectionBottomSheet2);
                                Object N3 = sVar2.N();
                                if (h3 || N3 == obj6) {
                                    h hVar = new h(0, listSelectionBottomSheet2, ListSelectionBottomSheet.class, "launchCreateNewList", "launchCreateNewList()V", 0, 0);
                                    sVar2.n0(hVar);
                                    N3 = hVar;
                                }
                                p.b(rVar, cVar, (k71.i) N3, sVar2, 0);
                            } else {
                                sVar2.V();
                            }
                            return w61.a0.a;
                        }
                    }, sVar), r1.i.d(-2144293710, new e(i2, m), sVar), a.a, sVar, 224256, 1);
                    sVar.q(true);
                    break;
                }
                break;
            default:
                f1 f1Var = (f1) obj3;
                androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj;
                int intValue2 = ((Integer) obj2).intValue();
                ListSelectionBottomSheet.a aVar3 = ListSelectionBottomSheet.Companion;
                if (!sVar2.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                    sVar2.V();
                    break;
                } else {
                    w1.j jVar = w1.c.v;
                    w1.r f = p2.f(p2.e(oVar, 1.0f), ih.a.I);
                    v0 d = androidx.compose.foundation.layout.t.d(jVar, false);
                    int hashCode2 = Long.hashCode(sVar2.T);
                    v1 l2 = sVar2.l();
                    w1.r c2 = w1.a.c(sVar2, f);
                    v2.h.o.getClass();
                    v2.f fVar2 = v2.g.b;
                    sVar2.g0();
                    if (sVar2.S) {
                        sVar2.k(fVar2);
                    } else {
                        sVar2.q0();
                    }
                    androidx.compose.runtime.t.I(sVar2, v2.g.f, d);
                    androidx.compose.runtime.t.I(sVar2, v2.g.e, l2);
                    androidx.compose.runtime.t.w(sVar2, Integer.valueOf(hashCode2), v2.g.g);
                    androidx.compose.runtime.t.E(sVar2, v2.g.h);
                    androidx.compose.runtime.t.I(sVar2, v2.g.d, c2);
                    q0 q0Var = ih.d.f(sVar2).v;
                    fl.b bVar = ((fl.f) f1Var.getValue()).c;
                    String str = bVar != null ? bVar.b : null;
                    if (str == null) {
                        str = m0.d(sVar2, -736567287, 2131952512, sVar2, false);
                    } else {
                        sVar2.c0(-736569488);
                        sVar2.q(false);
                    }
                    ub.b(str, (w1.r) null, 0L, 0L, (k3.s) null, 0L, new r3.k(3), 0L, 0, false, 0, 0, (j71.c) null, q0Var, sVar2, 0, 0, 130046);
                    sVar2.q(true);
                    break;
                }
        }
        return a0Var;
    }
}
