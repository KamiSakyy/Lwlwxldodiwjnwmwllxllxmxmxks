package com.github.rudroid.settings.copilot;

import androidx.compose.foundation.layout.d2;
import androidx.compose.foundation.layout.p2;
import androidx.compose.runtime.f1;
import androidx.lifecycle.l1;
import com.github.rudroid.settings.copilot.CopilotChatSettingsActivity;
import com.github.rudroid.uitoolkit.o0;
import com.github.rudroid.utilities.ui.g1;
import com.github.rudroid.utilities.ui.h1;
import com.github.rudroid.utilities.ui.t1;
import com.google.android.gms.internal.measurement.i4;
import f1.ca;
import y71.y1;

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
        androidx.compose.runtime.i iVar = androidx.compose.runtime.n.a;
        w61.a0 a0Var = w61.a0.a;
        Object obj3 = this.s;
        int i2 = 2;
        switch (i) {
            case 0:
                final CopilotChatSettingsActivity copilotChatSettingsActivity = (CopilotChatSettingsActivity) obj3;
                l1 l1Var = copilotChatSettingsActivity.u0;
                androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj;
                int intValue = ((Integer) obj2).intValue();
                CopilotChatSettingsActivity.a aVar = CopilotChatSettingsActivity.Companion;
                if (!sVar.S(1 & intValue, (intValue & 3) != 2)) {
                    sVar.V();
                    break;
                } else {
                    final f1 l = k41.b.l(((o) l1Var.getValue()).F, (androidx.fragment.app.l1) null, sVar, 7);
                    Object N = sVar.N();
                    Object obj4 = N;
                    if (N == iVar) {
                        v71.z p = androidx.compose.runtime.t.p(sVar);
                        sVar.n0(p);
                        obj4 = p;
                    }
                    Object N2 = sVar.N();
                    Object obj5 = N2;
                    if (N2 == iVar) {
                        ca caVar = new ca();
                        sVar.n0(caVar);
                        obj5 = caVar;
                    }
                    ca caVar2 = (ca) obj5;
                    if (h1.b(((eg.c) l.getValue()).a)) {
                        sVar.c0(-819833730);
                        String p0 = i4.p0(2131954494, sVar);
                        g1 g1Var = ((eg.c) l.getValue()).a;
                        boolean h = sVar.h(copilotChatSettingsActivity) | sVar.f(p0);
                        Object N3 = sVar.N();
                        Object obj6 = N3;
                        if (h || N3 == iVar) {
                            g gVar = new g(copilotChatSettingsActivity, p0, null);
                            sVar.n0(gVar);
                            obj6 = gVar;
                        }
                        androidx.compose.runtime.t.f(sVar, (j71.e) obj6, g1Var);
                        y1 y1Var = ((o) l1Var.getValue()).D;
                        g1.a aVar2 = g1.Companion;
                        Boolean bool = Boolean.FALSE;
                        aVar2.getClass();
                        t1 t1Var = new t1(bool);
                        y1Var.getClass();
                        y1Var.k((Object) null, t1Var);
                    } else {
                        sVar.c0(-823348758);
                    }
                    sVar.q(false);
                    com.github.rudroid.uitoolkit.utils.z.a(com.github.rudroid.utilities.c0.a(ih.d.b(sVar).b, w1.o.a), r1.i.d(-563629116, new e(i2, copilotChatSettingsActivity), sVar), null, r1.i.d(1795416322, new e(3, caVar2), sVar), null, 0, 0L, 0L, r1.i.d(-667383494, new j71.f() { // from class: com.github.rudroid.settings.copilot.f
                        public final Object f(Object obj7, Object obj8, Object obj9) {
                            androidx.compose.runtime.i iVar2;
                            d2 d2Var = (d2) obj7;
                            androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj8;
                            int intValue2 = ((Integer) obj9).intValue();
                            CopilotChatSettingsActivity.a aVar3 = CopilotChatSettingsActivity.Companion;
                            k71.k.g(d2Var, "paddingValues");
                            if ((intValue2 & 6) == 0) {
                                intValue2 |= sVar2.f(d2Var) ? 4 : 2;
                            }
                            if (sVar2.S(intValue2 & 1, (intValue2 & 19) != 18)) {
                                w1.r w = f0.o.w(androidx.compose.foundation.layout.b.w(p2.d(w1.o.a, 1.0f), d2Var), f0.o.v(sVar2), true);
                                f1 f1Var = l;
                                eg.c cVar = (eg.c) f1Var.getValue();
                                eg.a aVar4 = ((eg.c) f1Var.getValue()).i;
                                CopilotChatSettingsActivity copilotChatSettingsActivity2 = copilotChatSettingsActivity;
                                boolean h2 = sVar2.h(copilotChatSettingsActivity2);
                                Object N4 = sVar2.N();
                                androidx.compose.runtime.i iVar3 = androidx.compose.runtime.n.a;
                                if (h2 || N4 == iVar3) {
                                    iVar2 = iVar3;
                                    h hVar = new h(0, copilotChatSettingsActivity2, CopilotChatSettingsActivity.class, "onUpgradeToProLicense", "onUpgradeToProLicense()V", 0, 0);
                                    sVar2.n0(hVar);
                                    N4 = hVar;
                                } else {
                                    iVar2 = iVar3;
                                }
                                j71.a aVar5 = (k71.i) N4;
                                boolean h3 = sVar2.h(copilotChatSettingsActivity2);
                                Object N5 = sVar2.N();
                                if (h3 || N5 == iVar2) {
                                    i iVar4 = new i(0, copilotChatSettingsActivity2, CopilotChatSettingsActivity.class, "onUpgradeToFreeClick", "onUpgradeToFreeClick()V", 0, 0);
                                    sVar2.n0(iVar4);
                                    N5 = iVar4;
                                }
                                j71.a aVar6 = (k71.i) N5;
                                boolean h4 = sVar2.h(copilotChatSettingsActivity2);
                                Object N6 = sVar2.N();
                                if (h4 || N6 == iVar2) {
                                    j jVar = new j(0, copilotChatSettingsActivity2, CopilotChatSettingsActivity.class, "onUpgradeToProPlusLicense", "onUpgradeToProPlusLicense()V", 0, 0);
                                    sVar2.n0(jVar);
                                    N6 = jVar;
                                }
                                j71.a aVar7 = (k71.i) N6;
                                boolean h5 = sVar2.h(copilotChatSettingsActivity2);
                                Object N7 = sVar2.N();
                                if (h5 || N7 == iVar2) {
                                    k kVar = new k(0, copilotChatSettingsActivity2, CopilotChatSettingsActivity.class, "onUpgradeClick", "onUpgradeClick()V", 0, 0);
                                    sVar2.n0(kVar);
                                    N7 = kVar;
                                }
                                j71.a aVar8 = (k71.i) N7;
                                boolean d = h1.d(((eg.c) f1Var.getValue()).a);
                                boolean h6 = sVar2.h(copilotChatSettingsActivity2);
                                Object N8 = sVar2.N();
                                if (h6 || N8 == iVar2) {
                                    N8 = new y(2, copilotChatSettingsActivity2);
                                    sVar2.n0(N8);
                                }
                                j71.c cVar2 = (j71.c) N8;
                                boolean h7 = sVar2.h(copilotChatSettingsActivity2);
                                Object N9 = sVar2.N();
                                if (h7 || N9 == iVar2) {
                                    N9 = new c(copilotChatSettingsActivity2, 5);
                                    sVar2.n0(N9);
                                }
                                j71.a aVar9 = (j71.a) N9;
                                boolean h8 = sVar2.h(copilotChatSettingsActivity2);
                                Object N10 = sVar2.N();
                                if (h8 || N10 == iVar2) {
                                    N10 = new c(copilotChatSettingsActivity2, 6);
                                    sVar2.n0(N10);
                                }
                                j71.a aVar10 = (j71.a) N10;
                                boolean h9 = sVar2.h(copilotChatSettingsActivity2);
                                Object N11 = sVar2.N();
                                if (h9 || N11 == iVar2) {
                                    N11 = new c(copilotChatSettingsActivity2, 7);
                                    sVar2.n0(N11);
                                }
                                j71.a aVar11 = (j71.a) N11;
                                boolean h11 = sVar2.h(copilotChatSettingsActivity2);
                                Object N12 = sVar2.N();
                                if (h11 || N12 == iVar2) {
                                    N12 = new c(copilotChatSettingsActivity2, 0);
                                    sVar2.n0(N12);
                                }
                                j71.a aVar12 = (j71.a) N12;
                                boolean h12 = sVar2.h(copilotChatSettingsActivity2);
                                Object N13 = sVar2.N();
                                if (h12 || N13 == iVar2) {
                                    N13 = new c(copilotChatSettingsActivity2, 1);
                                    sVar2.n0(N13);
                                }
                                j71.a aVar13 = (j71.a) N13;
                                j71.a aVar14 = aVar5;
                                j71.a aVar15 = aVar7;
                                j71.a aVar16 = aVar6;
                                j71.a aVar17 = aVar8;
                                boolean h13 = sVar2.h(copilotChatSettingsActivity2);
                                Object N14 = sVar2.N();
                                if (h13 || N14 == iVar2) {
                                    N14 = new c(copilotChatSettingsActivity2, 2);
                                    sVar2.n0(N14);
                                }
                                j71.a aVar18 = (j71.a) N14;
                                boolean h14 = sVar2.h(copilotChatSettingsActivity2);
                                Object N15 = sVar2.N();
                                if (h14 || N15 == iVar2) {
                                    N15 = new c(copilotChatSettingsActivity2, 3);
                                    sVar2.n0(N15);
                                }
                                fg.j.a(w, cVar, cVar2, d, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15, aVar16, aVar17, aVar18, (j71.a) N15, aVar4, sVar2, 0, 0);
                            } else {
                                sVar2.V();
                            }
                            return w61.a0.a;
                        }
                    }, sVar), sVar, 100666416, 244);
                    break;
                }
            case 1:
                CopilotChatSettingsActivity copilotChatSettingsActivity2 = (CopilotChatSettingsActivity) obj3;
                androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj;
                int intValue2 = ((Integer) obj2).intValue();
                CopilotChatSettingsActivity.a aVar3 = CopilotChatSettingsActivity.Companion;
                if (!sVar2.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                    sVar2.V();
                    break;
                } else {
                    ih.e.a(false, null, null, null, null, null, null, null, null, r1.i.d(604909624, new e(r7 ? 1 : 0, copilotChatSettingsActivity2), sVar2), sVar2, 805306368, 511);
                    break;
                }
            case 2:
                CopilotChatSettingsActivity copilotChatSettingsActivity3 = (CopilotChatSettingsActivity) obj3;
                androidx.compose.runtime.s sVar3 = (androidx.compose.runtime.s) obj;
                int intValue3 = ((Integer) obj2).intValue();
                CopilotChatSettingsActivity.a aVar4 = CopilotChatSettingsActivity.Companion;
                if (!sVar3.S(intValue3 & 1, (intValue3 & 3) != 2)) {
                    sVar3.V();
                    break;
                } else {
                    String p02 = i4.p0(2131954551, sVar3);
                    boolean h2 = sVar3.h(copilotChatSettingsActivity3);
                    Object N4 = sVar3.N();
                    Object obj7 = N4;
                    if (h2 || N4 == iVar) {
                        c cVar = new c(copilotChatSettingsActivity3, 4);
                        sVar3.n0(cVar);
                        obj7 = cVar;
                    }
                    qg.p.c(null, p02, null, 0L, (j71.a) obj7, 0, 0.0f, 0.0f, 0, 0, null, sVar3, 0, 0, 2029);
                    break;
                }
            default:
                ca caVar3 = (ca) obj3;
                androidx.compose.runtime.s sVar4 = (androidx.compose.runtime.s) obj;
                int intValue4 = ((Integer) obj2).intValue();
                CopilotChatSettingsActivity.a aVar5 = CopilotChatSettingsActivity.Companion;
                if (!sVar4.S(intValue4 & 1, (intValue4 & 3) != 2)) {
                    sVar4.V();
                    break;
                } else {
                    o0.a(null, caVar3, sVar4, 48);
                    break;
                }
        }
        return a0Var;
    }
}
