package com.github.rudroid.settings.copilot.debug;

import androidx.compose.foundation.layout.d2;
import androidx.compose.foundation.layout.p2;
import androidx.compose.runtime.f1;
import androidx.compose.runtime.i3;
import com.github.rudroid.settings.copilot.debug.CopilotPermissionsOverrideActivity;
import d1.f2;
import d1.g2;
import d2.p0;
import f1.gb;
import f1.jb;
import f1.nb;
import f1.v4;
import f1.y4;
import f1.z1;
import g3.q0;
import l3.e0;
import s0.l0;
import s0.m0;
import xn.e1;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class d implements j71.f {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ i3 t;
    public final /* synthetic */ Object u;

    public /* synthetic */ d(Object obj, i3 i3Var, Object obj2, int i) {
        this.r = i;
        this.s = obj;
        this.t = i3Var;
        this.u = obj2;
    }

    public final Object f(Object obj, Object obj2, Object obj3) {
        int i = this.r;
        w61.a0 a0Var = w61.a0.a;
        Object obj4 = androidx.compose.runtime.n.a;
        w1.o oVar = w1.o.a;
        Object obj5 = this.u;
        f1 f1Var = this.t;
        Object obj6 = this.s;
        switch (i) {
            case 0:
                i3 i3Var = (i3) obj6;
                CopilotPermissionsOverrideActivity copilotPermissionsOverrideActivity = (CopilotPermissionsOverrideActivity) obj5;
                d2 d2Var = (d2) obj;
                androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj2;
                int intValue = ((Integer) obj3).intValue();
                CopilotPermissionsOverrideActivity.a aVar = CopilotPermissionsOverrideActivity.Companion;
                k71.k.g(d2Var, "paddingValues");
                if ((intValue & 6) == 0) {
                    intValue |= sVar.f(d2Var) ? 4 : 2;
                }
                if (!sVar.S(intValue & 1, (intValue & 19) != 18)) {
                    sVar.V();
                    break;
                } else {
                    w1.r w = androidx.compose.foundation.layout.b.w(oVar, d2Var);
                    boolean booleanValue = ((Boolean) i3Var.getValue()).booleanValue();
                    nj.d dVar = (nj.d) f1Var.getValue();
                    v J0 = copilotPermissionsOverrideActivity.J0();
                    boolean h = sVar.h(J0);
                    Object N = sVar.N();
                    if (h || N == obj4) {
                        e eVar = new e(1, J0, v.class, "setEnabled", "setEnabled(Z)V", 0, 0);
                        sVar.n0(eVar);
                        N = eVar;
                    }
                    j71.c cVar = (k71.i) N;
                    v J02 = copilotPermissionsOverrideActivity.J0();
                    boolean h2 = sVar.h(J02);
                    Object N2 = sVar.N();
                    if (h2 || N2 == obj4) {
                        h hVar = new h(0, J02, v.class, "resetAll", "resetAll()V", 0, 0);
                        sVar.n0(hVar);
                        N2 = hVar;
                    }
                    j71.a aVar2 = (k71.i) N2;
                    v J03 = copilotPermissionsOverrideActivity.J0();
                    boolean h3 = sVar.h(J03);
                    Object N3 = sVar.N();
                    if (h3 || N3 == obj4) {
                        i iVar = new i(1, J03, v.class, "setLicenseType", "setLicenseType(Lcom/github/service/copilot/CopilotChatLicenseType;)V", 0, 0);
                        sVar.n0(iVar);
                        N3 = iVar;
                    }
                    j71.c cVar2 = (k71.i) N3;
                    v J04 = copilotPermissionsOverrideActivity.J0();
                    boolean h4 = sVar.h(J04);
                    Object N4 = sVar.N();
                    if (h4 || N4 == obj4) {
                        j jVar = new j(1, J04, v.class, "setMobileChatEnabled", "setMobileChatEnabled(Z)V", 0, 0);
                        sVar.n0(jVar);
                        N4 = jVar;
                    }
                    j71.c cVar3 = (k71.i) N4;
                    v J05 = copilotPermissionsOverrideActivity.J0();
                    boolean h5 = sVar.h(J05);
                    Object N5 = sVar.N();
                    if (h5 || N5 == obj4) {
                        k kVar = new k(1, J05, v.class, "setCodingAgentEnabled", "setCodingAgentEnabled(Z)V", 0, 0);
                        sVar.n0(kVar);
                        N5 = kVar;
                    }
                    j71.c cVar4 = (k71.i) N5;
                    v J06 = copilotPermissionsOverrideActivity.J0();
                    boolean h6 = sVar.h(J06);
                    Object N6 = sVar.N();
                    if (h6 || N6 == obj4) {
                        l lVar = new l(1, J06, v.class, "setCanSubscribeLimited", "setCanSubscribeLimited(Z)V", 0, 0);
                        sVar.n0(lVar);
                        N6 = lVar;
                    }
                    j71.c cVar5 = (k71.i) N6;
                    v J07 = copilotPermissionsOverrideActivity.J0();
                    boolean h7 = sVar.h(J07);
                    Object N7 = sVar.N();
                    if (h7 || N7 == obj4) {
                        N7 = new m(1, J07, v.class, "setUserLimitsEnabled", "setUserLimitsEnabled(Z)V", 0, 0);
                        sVar.n0(N7);
                    }
                    j71.c cVar6 = (k71.i) N7;
                    v J08 = copilotPermissionsOverrideActivity.J0();
                    boolean h8 = sVar.h(J08);
                    Object N8 = sVar.N();
                    if (h8 || N8 == obj4) {
                        N8 = new n(1, J08, v.class, "updateLimitsHasRemainingQuota", "updateLimitsHasRemainingQuota(Z)V", 0, 0);
                        sVar.n0(N8);
                    }
                    j71.c cVar7 = (k71.i) N8;
                    v J09 = copilotPermissionsOverrideActivity.J0();
                    boolean h9 = sVar.h(J09);
                    Object N9 = sVar.N();
                    if (h9 || N9 == obj4) {
                        N9 = new o(1, J09, v.class, "updateLimitsQuotaPercentage", "updateLimitsQuotaPercentage(D)V", 0, 0);
                        sVar.n0(N9);
                    }
                    j71.c cVar8 = (k71.i) N9;
                    v J010 = copilotPermissionsOverrideActivity.J0();
                    boolean h11 = sVar.h(J010);
                    Object N10 = sVar.N();
                    if (h11 || N10 == obj4) {
                        N10 = new f(1, J010, v.class, "updateLimitsOverageChargeEnabled", "updateLimitsOverageChargeEnabled(Z)V", 0, 0);
                        sVar.n0(N10);
                    }
                    j71.c cVar9 = (k71.i) N10;
                    v J011 = copilotPermissionsOverrideActivity.J0();
                    boolean h12 = sVar.h(J011);
                    Object N11 = sVar.N();
                    if (h12 || N11 == obj4) {
                        N11 = new g(1, J011, v.class, "updateLimitsCurrentOverageCount", "updateLimitsCurrentOverageCount(D)V", 0, 0);
                        sVar.n0(N11);
                    }
                    t.a(booleanValue, dVar, cVar, aVar2, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, (k71.i) N11, w, sVar, 0, 0, 0);
                    break;
                }
            default:
                e1 e1Var = (e1) obj6;
                f1 f1Var2 = f1Var;
                j71.c cVar10 = (j71.c) obj5;
                y4 y4Var = (y4) obj;
                androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                k71.k.g(y4Var, "$this$ExposedDropdownMenuBox");
                if ((intValue2 & 6) == 0) {
                    intValue2 |= (intValue2 & 8) == 0 ? sVar2.f(y4Var) : sVar2.h(y4Var) ? 4 : 2;
                }
                int i2 = intValue2;
                if (!sVar2.S(i2 & 1, (i2 & 19) != 18)) {
                    sVar2.V();
                    break;
                } else {
                    w1.r e = p2.e(y4Var.b(oVar, "PrimaryNotEditable", true), 1.0f);
                    String str = e1Var != null ? e1Var.r : "Not overridden";
                    v4 v4Var = v4.a;
                    long d = z1.d(j1.x.v, sVar2);
                    long d2 = z1.d(j1.x.z, sVar2);
                    long b = d2.t.b(j1.x.g, z1.d(j1.x.f, sVar2));
                    long d3 = z1.d(j1.x.q, sVar2);
                    j1.l lVar2 = j1.x.c;
                    long d4 = z1.d(lVar2, sVar2);
                    long d5 = z1.d(lVar2, sVar2);
                    long d6 = z1.d(lVar2, sVar2);
                    long d7 = z1.d(lVar2, sVar2);
                    long d8 = z1.d(j1.x.b, sVar2);
                    long d9 = z1.d(j1.x.p, sVar2);
                    f2 f2Var = (f2) sVar2.j(g2.a);
                    long d11 = z1.d(j1.x.u, sVar2);
                    long d12 = z1.d(j1.x.a, sVar2);
                    long b2 = d2.t.b(j1.x.e, z1.d(j1.x.d, sVar2));
                    long d13 = z1.d(j1.x.o, sVar2);
                    long d14 = z1.d(j1.x.x, sVar2);
                    long d15 = z1.d(j1.x.B, sVar2);
                    long b3 = d2.t.b(j1.x.j, z1.d(j1.x.i, sVar2));
                    long d16 = z1.d(j1.x.s, sVar2);
                    long d17 = z1.d(j1.x.y, sVar2);
                    long d18 = z1.d(j1.x.D, sVar2);
                    long b4 = d2.t.b(j1.x.n, z1.d(j1.x.m, sVar2));
                    long d19 = z1.d(j1.x.t, sVar2);
                    long d21 = z1.d(j1.x.w, sVar2);
                    long d22 = z1.d(j1.x.A, sVar2);
                    long d23 = z1.d(j1.x.h, sVar2);
                    long d24 = z1.d(j1.x.r, sVar2);
                    j1.l lVar3 = j1.x.C;
                    long d25 = z1.d(lVar3, sVar2);
                    long d26 = z1.d(lVar3, sVar2);
                    j1.l lVar4 = j1.x.k;
                    long d27 = z1.d(lVar4, sVar2);
                    float f = j1.x.l;
                    long b5 = d2.t.b(f, d27);
                    long d28 = z1.d(lVar3, sVar2);
                    long d29 = z1.d(lVar3, sVar2);
                    long d31 = z1.d(lVar3, sVar2);
                    long b6 = d2.t.b(f, z1.d(lVar4, sVar2));
                    long d32 = z1.d(lVar3, sVar2);
                    long d33 = z1.d(lVar3, sVar2);
                    long d34 = z1.d(lVar3, sVar2);
                    long b7 = d2.t.b(f, z1.d(lVar4, sVar2));
                    long d35 = z1.d(lVar3, sVar2);
                    jb jbVar = jb.a;
                    gb c = jb.c(d, d2, b, d3, d4, d5, d6, d7, d8, d9, f2Var, d11, d12, b2, d13, d14, d15, b3, d16, d17, d18, b4, d19, d21, d22, d23, d24, d25, d26, b5, d28, d29, d31, b6, d32, d33, d34, b7, d35, sVar2, 0, 15);
                    Object N12 = sVar2.N();
                    if (N12 == obj4) {
                        N12 = new com.github.rudroid.searchandfilter.complexfilter.explore.a0(22);
                        sVar2.n0(N12);
                    }
                    nb.a(str, (j71.c) N12, e, false, true, (q0) null, a.a, r1.i.d(-292736892, new com.github.rudroid.actions.workflowruns.ui.g(f1Var2, 4), sVar2), (j71.e) null, (e0) null, (m0) null, (l0) null, false, 0, 0, (p0) null, c, sVar2, 806903856, 0, 4193704);
                    boolean booleanValue2 = ((Boolean) f1Var2.getValue()).booleanValue();
                    Object N13 = sVar2.N();
                    if (N13 == obj4) {
                        N13 = new com.github.rudroid.fragments.onboarding.notifications.ui.p(f1Var2, 12);
                        sVar2.n0(N13);
                    }
                    y4Var.a(booleanValue2, (j71.a) N13, (w1.r) null, (f0.z1) null, false, (p0) null, 0L, 0.0f, 0.0f, (f0.v) null, r1.i.d(-2053655969, new com.github.rudroid.repository.branches.r(cVar10, f1Var2), sVar2), sVar2, 48, 6 | ((i2 << 3) & 112), 1020);
                    break;
                }
        }
        return a0Var;
    }



}
