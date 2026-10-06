package com.github.rudroid.settings.copilot.paywall;

import androidx.compose.foundation.layout.d2;
import androidx.compose.foundation.layout.p2;
import androidx.compose.runtime.f1;
import androidx.compose.runtime.s;
import com.github.commonandroid.featureflag.RuntimeFeatureFlag;
import com.github.rudroid.activities.WebViewActivity;
import com.github.rudroid.copilot.inapppurchase.i0;
import com.github.rudroid.copilot.inapppurchase.j0;
import com.github.rudroid.copilot.inapppurchase.l0;
import com.github.rudroid.copilot.inapppurchase.m0;
import com.github.rudroid.settings.copilot.paywall.CopilotChatProPaywallActivity;
import com.github.rudroid.settings.copilot.paywall.ui.p0;
import com.github.rudroid.settings.copilot.paywall.ui.w;
import com.github.rudroid.utilities.ui.g1;
import com.github.service.models.response.type.MobileAppElement;
import com.google.android.gms.internal.measurement.i4;
import w61.a0;
import x61.rShadow;
import xn.e1;
import y71.y1;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class e implements j71.f {
    public final /* synthetic */ f1 r;
    public final /* synthetic */ l0 s;
    public final /* synthetic */ CopilotChatProPaywallActivity t;

    public /* synthetic */ e(f1 f1Var, l0 l0Var, CopilotChatProPaywallActivity copilotChatProPaywallActivity) {
        this.r = f1Var;
        this.s = l0Var;
        this.t = copilotChatProPaywallActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object f(Object obj, Object obj2, Object obj3) {
        m0 m0Var;
        m0 m0Var2;
        x9.l lVar;
        e1 e1Var;
        Object obj4;
        Object gVar;
        e1 e1Var2;
        g1 c;
        final int i;
        m0 m0Var3;
        m0 m0Var4;
        m0 m0Var5;
        m0 m0Var6;
        m0 m0Var7;
        x9.l lVar2;
        m0 m0Var8;
        d2 d2Var = (d2) obj;
        s sVar = (s) obj2;
        int intValue = ((Integer) obj3).intValue();
        CopilotChatProPaywallActivity.a aVar = CopilotChatProPaywallActivity.Companion;
        k71.k.g(d2Var, "paddingValues");
        if ((intValue & 6) == 0) {
            intValue |= sVar.f(d2Var) ? 4 : 2;
        }
        if (sVar.S(intValue & 1, (intValue & 19) != 18)) {
            RuntimeFeatureFlag runtimeFeatureFlag = RuntimeFeatureFlag.a;
            ei.c cVar = ei.c.N;
            runtimeFeatureFlag.getClass();
            boolean a = RuntimeFeatureFlag.a(cVar);
            w1.o oVar = w1.o.a;
            final f1 f1Var = this.r;
            l0 l0Var = this.s;
            final CopilotChatProPaywallActivity copilotChatProPaywallActivity = this.t;
            rShadow rVar = null;
            Object obj5 = androidx.compose.runtime.n.a;
            if (a) {
                sVar.c0(1457220802);
                final String p0 = i4.p0(2131953438, sVar);
                final String p02 = i4.p0(2131951986, sVar);
                w1.rShadow w = androidx.compose.foundation.layout.b.w(p2.d(oVar, 1.0f), d2Var);
                g1 g1Var = (g1) f1Var.getValue();
                if (g1Var == null || (m0Var8 = (m0) g1Var.getData()) == null || (e1Var = m0Var8.e) == null) {
                    e1Var = e1.s;
                }
                g1 g1Var2 = (g1) f1Var.getValue();
                String a2 = (g1Var2 == null || (m0Var7 = (m0) g1Var2.getData()) == null || (lVar2 = m0Var7.b) == null) ? null : com.github.rudroid.copilot.inapppurchase.billingclient.n.a(lVar2);
                String str = a2 != null ? a2 : "";
                g1 g1Var3 = (g1) f1Var.getValue();
                String str2 = (g1Var3 == null || (m0Var6 = (m0) g1Var3.getData()) == null) ? null : m0Var6.a;
                j0 j0Var = l0Var != null ? l0Var.b : null;
                boolean h = sVar.h(copilotChatProPaywallActivity);
                Object N = sVar.N();
                if (h || N == obj5) {
                    obj4 = obj5;
                    gVar = new g(0, copilotChatProPaywallActivity, CopilotChatProPaywallActivity.class, "onRestorePurchaseClick", "onRestorePurchaseClick()V", 0, 0);
                    sVar.n0(gVar);
                } else {
                    gVar = N;
                    obj4 = obj5;
                }
                j71.a aVar2 = (k71.i) gVar;
                g1 g1Var4 = (g1) f1Var.getValue();
                if (g1Var4 == null || (m0Var5 = (m0) g1Var4.getData()) == null || (e1Var2 = m0Var5.d) == null) {
                    e1Var2 = e1.s;
                }
                g1 g1Var5 = (g1) f1Var.getValue();
                if (g1Var5 != null && (m0Var4 = (m0) g1Var5.getData()) != null) {
                    rVar = m0Var4.f;
                }
                if (rVar == null) {
                    rVar = rShadow.r;
                }
                g1 g1Var6 = (g1) f1Var.getValue();
                if (g1Var6 == null || (m0Var3 = (m0) g1Var6.getData()) == null || (c = m0Var3.g) == null) {
                    c = g1.a.c(g1.Companion);
                }
                g1 g1Var7 = c;
                boolean h2 = sVar.h(copilotChatProPaywallActivity);
                Object N2 = sVar.N();
                if (h2 || N2 == obj4) {
                    final int i2 = 4;
                    N2 = new j71.a() { // from class: com.github.rudroid.settings.copilot.paywall.c
                        public final Object a() {
                            Object value;
                            l0 l0Var2;
                            int i3 = i2;
                            a0 a0Var = a0.a;
                            CopilotChatProPaywallActivity copilotChatProPaywallActivity2 = copilotChatProPaywallActivity;
                            switch (i3) {
                                case 0:
                                    CopilotChatProPaywallActivity.a aVar3 = CopilotChatProPaywallActivity.Companion;
                                    copilotChatProPaywallActivity2.L0().R();
                                    break;
                                case 1:
                                    CopilotChatProPaywallActivity.a aVar4 = CopilotChatProPaywallActivity.Companion;
                                    copilotChatProPaywallActivity2.m().c();
                                    break;
                                case 2:
                                    CopilotChatProPaywallActivity.a aVar5 = CopilotChatProPaywallActivity.Companion;
                                    y1 y1Var = copilotChatProPaywallActivity2.L0().F;
                                    do {
                                        value = y1Var.getValue();
                                        l0Var2 = (l0) value;
                                    } while (!y1Var.i(value, new l0(l0Var2.a, l0Var2.b, (i0) null)));
                                case 3:
                                    CopilotChatProPaywallActivity.a aVar6 = CopilotChatProPaywallActivity.Companion;
                                    copilotChatProPaywallActivity2.L0().S();
                                    break;
                                default:
                                    CopilotChatProPaywallActivity.a aVar7 = CopilotChatProPaywallActivity.Companion;
                                    copilotChatProPaywallActivity2.m().c();
                                    break;
                            }
                            return a0Var;
                        }
                    };
                    sVar.n0(N2);
                }
                j71.a aVar3 = (j71.a) N2;
                boolean h3 = sVar.h(copilotChatProPaywallActivity) | sVar.f(f1Var);
                Object N3 = sVar.N();
                if (h3 || N3 == obj4) {
                    final int i3 = 1;
                    N3 = new j71.a() { // from class: com.github.rudroid.settings.copilot.paywall.d
                        public final Object a() {
                            int i4 = i3;
                            a0 a0Var = a0.a;
                            f1 f1Var2 = f1Var;
                            CopilotChatProPaywallActivity copilotChatProPaywallActivity2 = copilotChatProPaywallActivity;
                            switch (i4) {
                                case 0:
                                    CopilotChatProPaywallActivity.a aVar4 = CopilotChatProPaywallActivity.Companion;
                                    g1 g1Var8 = (g1) f1Var2.getValue();
                                    copilotChatProPaywallActivity2.M0(g1Var8 != null ? (m0) g1Var8.getData() : null);
                                    break;
                                default:
                                    CopilotChatProPaywallActivity.a aVar5 = CopilotChatProPaywallActivity.Companion;
                                    g1 g1Var9 = (g1) f1Var2.getValue();
                                    copilotChatProPaywallActivity2.M0(g1Var9 != null ? (m0) g1Var9.getData() : null);
                                    break;
                            }
                            return a0Var;
                        }
                    };
                    sVar.n0(N3);
                }
                j71.a aVar4 = (j71.a) N3;
                j71.a aVar5 = aVar2;
                boolean h4 = sVar.h(copilotChatProPaywallActivity) | sVar.f(p0);
                Object N4 = sVar.N();
                if (h4 || N4 == obj4) {
                    final int i4 = 0;
                    N4 = new j71.a() { // from class: com.github.rudroid.settings.copilot.paywall.a
                        public final Object a() {
                            int i5 = i4;
                            a0 a0Var = a0.a;
                            String str3 = p0;
                            k.i iVar = copilotChatProPaywallActivity;
                            switch (i5) {
                                case 0:
                                    CopilotChatProPaywallActivity.a aVar6 = CopilotChatProPaywallActivity.Companion;
                                    CopilotChatProPaywallActivity.O0(iVar, MobileAppElement.COPILOT_PRIVACY_POLICY, iVar.J0());
                                    WebViewActivity.a aVar7 = WebViewActivity.Companion;
                                    String string = iVar.getResources().getString(2131954548);
                                    aVar7.getClass();
                                    iVar.u0(WebViewActivity.a.a(iVar, str3, string), iVar.s0());
                                    break;
                                default:
                                    CopilotChatProPaywallActivity.a aVar8 = CopilotChatProPaywallActivity.Companion;
                                    CopilotChatProPaywallActivity.O0(iVar, MobileAppElement.COPILOT_AGREEMENT, iVar.J0());
                                    WebViewActivity.a aVar9 = WebViewActivity.Companion;
                                    String string2 = iVar.getResources().getString(2131954493);
                                    aVar9.getClass();
                                    iVar.u0(WebViewActivity.a.a(iVar, str3, string2), iVar.s0());
                                    break;
                            }
                            return a0Var;
                        }
                    };
                    sVar.n0(N4);
                }
                j71.a aVar6 = (j71.a) N4;
                boolean h5 = sVar.h(copilotChatProPaywallActivity) | sVar.f(p02);
                Object N5 = sVar.N();
                if (h5 || N5 == obj4) {
                    final int i5 = 1;
                    N5 = new j71.a() { // from class: com.github.rudroid.settings.copilot.paywall.a
                        public final Object a() {
                            int i52 = i5;
                            a0 a0Var = a0.a;
                            String str3 = p02;
                            k.i iVar = copilotChatProPaywallActivity;
                            switch (i52) {
                                case 0:
                                    CopilotChatProPaywallActivity.a aVar62 = CopilotChatProPaywallActivity.Companion;
                                    CopilotChatProPaywallActivity.O0(iVar, MobileAppElement.COPILOT_PRIVACY_POLICY, iVar.J0());
                                    WebViewActivity.a aVar7 = WebViewActivity.Companion;
                                    String string = iVar.getResources().getString(2131954548);
                                    aVar7.getClass();
                                    iVar.u0(WebViewActivity.a.a(iVar, str3, string), iVar.s0());
                                    break;
                                default:
                                    CopilotChatProPaywallActivity.a aVar8 = CopilotChatProPaywallActivity.Companion;
                                    CopilotChatProPaywallActivity.O0(iVar, MobileAppElement.COPILOT_AGREEMENT, iVar.J0());
                                    WebViewActivity.a aVar9 = WebViewActivity.Companion;
                                    String string2 = iVar.getResources().getString(2131954493);
                                    aVar9.getClass();
                                    iVar.u0(WebViewActivity.a.a(iVar, str3, string2), iVar.s0());
                                    break;
                            }
                            return a0Var;
                        }
                    };
                    sVar.n0(N5);
                }
                j71.a aVar7 = (j71.a) N5;
                boolean h6 = sVar.h(copilotChatProPaywallActivity);
                Object N6 = sVar.N();
                if (h6 || N6 == obj4) {
                    N6 = new b(copilotChatProPaywallActivity, 0);
                    sVar.n0(N6);
                }
                j71.c cVar2 = (j71.c) N6;
                boolean h7 = sVar.h(copilotChatProPaywallActivity);
                Object N7 = sVar.N();
                if (h7 || N7 == obj4) {
                    i = 0;
                    N7 = new j71.a() { // from class: com.github.rudroid.settings.copilot.paywall.c
                        public final Object a() {
                            Object value;
                            l0 l0Var2;
                            int i32 = i;
                            a0 a0Var = a0.a;
                            CopilotChatProPaywallActivity copilotChatProPaywallActivity2 = copilotChatProPaywallActivity;
                            switch (i32) {
                                case 0:
                                    CopilotChatProPaywallActivity.a aVar32 = CopilotChatProPaywallActivity.Companion;
                                    copilotChatProPaywallActivity2.L0().R();
                                    break;
                                case 1:
                                    CopilotChatProPaywallActivity.a aVar42 = CopilotChatProPaywallActivity.Companion;
                                    copilotChatProPaywallActivity2.m().c();
                                    break;
                                case 2:
                                    CopilotChatProPaywallActivity.a aVar52 = CopilotChatProPaywallActivity.Companion;
                                    y1 y1Var = copilotChatProPaywallActivity2.L0().F;
                                    do {
                                        value = y1Var.getValue();
                                        l0Var2 = (l0) value;
                                    } while (!y1Var.i(value, new l0(l0Var2.a, l0Var2.b, (i0) null)));
                                case 3:
                                    CopilotChatProPaywallActivity.a aVar62 = CopilotChatProPaywallActivity.Companion;
                                    copilotChatProPaywallActivity2.L0().S();
                                    break;
                                default:
                                    CopilotChatProPaywallActivity.a aVar72 = CopilotChatProPaywallActivity.Companion;
                                    copilotChatProPaywallActivity2.m().c();
                                    break;
                            }
                            return a0Var;
                        }
                    };
                    sVar.n0(N7);
                } else {
                    i = 0;
                }
                p0.a(w, aVar3, aVar4, aVar5, aVar6, aVar7, cVar2, (j71.a) N7, e1Var2, e1Var, rVar, str, str2, j0Var, g1Var7, sVar, 0, 0);
                sVar.q(i);
            } else {
                final int i6 = 0;
                sVar.c0(1459571656);
                w1.rShadow w2 = androidx.compose.foundation.layout.b.w(p2.d(oVar, 1.0f), d2Var);
                g1 g1Var8 = (g1) f1Var.getValue();
                String a3 = (g1Var8 == null || (m0Var2 = (m0) g1Var8.getData()) == null || (lVar = m0Var2.b) == null) ? null : com.github.rudroid.copilot.inapppurchase.billingclient.n.a(lVar);
                String str3 = a3 == null ? "" : a3;
                e1 e1Var3 = copilotChatProPaywallActivity.L0().B;
                g1 g1Var9 = (g1) f1Var.getValue();
                String str4 = (g1Var9 == null || (m0Var = (m0) g1Var9.getData()) == null) ? null : m0Var.a;
                j0 j0Var2 = l0Var != null ? l0Var.b : null;
                boolean h8 = sVar.h(copilotChatProPaywallActivity);
                Object N8 = sVar.N();
                if (h8 || N8 == obj5) {
                    h hVar = new h(0, copilotChatProPaywallActivity, CopilotChatProPaywallActivity.class, "onRestorePurchaseClick", "onRestorePurchaseClick()V", 0, 0);
                    sVar.n0(hVar);
                    N8 = hVar;
                }
                j71.a aVar8 = (k71.i) N8;
                boolean h9 = sVar.h(copilotChatProPaywallActivity);
                Object N9 = sVar.N();
                if (h9 || N9 == obj5) {
                    final int i7 = 1;
                    N9 = new j71.a() { // from class: com.github.rudroid.settings.copilot.paywall.c
                        public final Object a() {
                            Object value;
                            l0 l0Var2;
                            int i32 = i7;
                            a0 a0Var = a0.a;
                            CopilotChatProPaywallActivity copilotChatProPaywallActivity2 = copilotChatProPaywallActivity;
                            switch (i32) {
                                case 0:
                                    CopilotChatProPaywallActivity.a aVar32 = CopilotChatProPaywallActivity.Companion;
                                    copilotChatProPaywallActivity2.L0().R();
                                    break;
                                case 1:
                                    CopilotChatProPaywallActivity.a aVar42 = CopilotChatProPaywallActivity.Companion;
                                    copilotChatProPaywallActivity2.m().c();
                                    break;
                                case 2:
                                    CopilotChatProPaywallActivity.a aVar52 = CopilotChatProPaywallActivity.Companion;
                                    y1 y1Var = copilotChatProPaywallActivity2.L0().F;
                                    do {
                                        value = y1Var.getValue();
                                        l0Var2 = (l0) value;
                                    } while (!y1Var.i(value, new l0(l0Var2.a, l0Var2.b, (i0) null)));
                                case 3:
                                    CopilotChatProPaywallActivity.a aVar62 = CopilotChatProPaywallActivity.Companion;
                                    copilotChatProPaywallActivity2.L0().S();
                                    break;
                                default:
                                    CopilotChatProPaywallActivity.a aVar72 = CopilotChatProPaywallActivity.Companion;
                                    copilotChatProPaywallActivity2.m().c();
                                    break;
                            }
                            return a0Var;
                        }
                    };
                    sVar.n0(N9);
                }
                j71.a aVar9 = (j71.a) N9;
                boolean h11 = sVar.h(copilotChatProPaywallActivity) | sVar.f(f1Var);
                Object N10 = sVar.N();
                if (h11 || N10 == obj5) {
                    N10 = new j71.a() { // from class: com.github.rudroid.settings.copilot.paywall.d
                        public final Object a() {
                            int i42 = i6;
                            a0 a0Var = a0.a;
                            f1 f1Var2 = f1Var;
                            CopilotChatProPaywallActivity copilotChatProPaywallActivity2 = copilotChatProPaywallActivity;
                            switch (i42) {
                                case 0:
                                    CopilotChatProPaywallActivity.a aVar42 = CopilotChatProPaywallActivity.Companion;
                                    g1 g1Var82 = (g1) f1Var2.getValue();
                                    copilotChatProPaywallActivity2.M0(g1Var82 != null ? (m0) g1Var82.getData() : null);
                                    break;
                                default:
                                    CopilotChatProPaywallActivity.a aVar52 = CopilotChatProPaywallActivity.Companion;
                                    g1 g1Var92 = (g1) f1Var2.getValue();
                                    copilotChatProPaywallActivity2.M0(g1Var92 != null ? (m0) g1Var92.getData() : null);
                                    break;
                            }
                            return a0Var;
                        }
                    };
                    sVar.n0(N10);
                }
                j71.a aVar10 = (j71.a) N10;
                j71.a aVar11 = aVar8;
                boolean h12 = sVar.h(copilotChatProPaywallActivity);
                Object N11 = sVar.N();
                if (h12 || N11 == obj5) {
                    N11 = new b(copilotChatProPaywallActivity, 1);
                    sVar.n0(N11);
                }
                j71.c cVar3 = (j71.c) N11;
                boolean h13 = sVar.h(copilotChatProPaywallActivity);
                Object N12 = sVar.N();
                if (h13 || N12 == obj5) {
                    N12 = new b(copilotChatProPaywallActivity, 2);
                    sVar.n0(N12);
                }
                w.a(w2, str3, str4, e1Var3, aVar9, aVar10, aVar11, cVar3, (j71.c) N12, j0Var2, sVar, 0);
                sVar.q(false);
            }
        } else {
            sVar.V();
        }
        return a0.a;
    }
}
