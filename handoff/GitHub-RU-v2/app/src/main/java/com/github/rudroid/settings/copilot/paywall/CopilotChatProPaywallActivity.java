package com.github.rudroid.settings.copilot.paywall;

import android.os.Bundle;
import androidx.lifecycle.d1;
import androidx.lifecycle.l1;
import com.github.commonandroid.featureflag.RuntimeFeatureFlag;
import com.github.rudroid.common.e;
import com.github.rudroid.copilot.inapppurchase.i0;
import com.github.rudroid.copilot.inapppurchase.j0;
import com.github.rudroid.copilot.inapppurchase.k0;
import com.github.rudroid.copilot.inapppurchase.l0;
import com.github.rudroid.copilot.inapppurchase.m0;
import com.github.rudroid.copilot.inapppurchase.usecases.x0;
import com.github.rudroid.issueorpullrequest.mergebox.ui.e0;
import com.github.service.models.response.type.MobileAppAction;
import com.github.service.models.response.type.MobileAppElement;
import com.github.service.models.response.type.MobileEventContext;
import com.github.service.models.response.type.MobileSubjectType;
import java.util.ArrayList;
import k71.x;
import v71.a0;
import v71.b0;
import w3.u;
import xn.e1;
import y71.y1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class CopilotChatProPaywallActivity extends o {
    public static final a Companion;
    public static final /* synthetic */ r71.e[] w0;
    public x0 t0;
    public final l1 u0;
    public final com.github.rudroid.activities.util.g v0;

    public static final class a {
    }

    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[k0.values().length];
            try {
                k0 k0Var = k0.r;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                k0 k0Var2 = k0.r;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public static final class c implements j71.a {
        public c() {
        }

        public final Object a() {
            return CopilotChatProPaywallActivity.this.f0();
        }
    }

    public static final class d implements j71.a {
        public d() {
        }

        public final Object a() {
            return CopilotChatProPaywallActivity.this.K0();
        }
    }

    public static final class e implements j71.a {
        public e() {
        }

        public final Object a() {
            return CopilotChatProPaywallActivity.this.g0();
        }
    }

    static {
        r71.e mVar = new k71.m(CopilotChatProPaywallActivity.class, "telemetryContext", "getTelemetryContext()Lcom/github/service/models/response/type/MobileEventContext;", 0);
        x.a.getClass();
        w0 = new r71.e[]{mVar};
        Companion = new a();
    }

    public CopilotChatProPaywallActivity() {
        this.s0 = false;
        C(new n(this));
        this.u0 = new l1(x.a(com.github.rudroid.copilot.inapppurchase.b.class), new d(), new c(), new e());
        this.v0 = new com.github.rudroid.activities.util.g("TELEMETRY_CONTEXT_KEY", new com.github.rudroid.searchandfilter.complexfilter.user.assignee.l(4));
    }

    public static void O0(CopilotChatProPaywallActivity copilotChatProPaywallActivity, MobileAppElement mobileAppElement, MobileEventContext mobileEventContext) {
        MobileAppAction mobileAppAction = MobileAppAction.PRESS;
        MobileSubjectType mobileSubjectType = MobileSubjectType.COPILOT_PAYWALL;
        copilotChatProPaywallActivity.getClass();
        b0.z(d1.i(copilotChatProPaywallActivity), (a71.h) null, (a0) null, new i(copilotChatProPaywallActivity, mobileAppElement, mobileAppAction, mobileSubjectType, mobileEventContext, null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final MobileEventContext J0() {
        return (MobileEventContext) this.v0.c(this, w0[0]);
    }

    public final com.github.rudroid.copilot.inapppurchase.b L0() {
        return (com.github.rudroid.copilot.inapppurchase.b) this.u0.getValue();
    }

    public final void M0(m0 m0Var) {
        x9.l lVar;
        Object value;
        i0 i0Var;
        x9.k kVar;
        O0(this, MobileAppElement.COPILOT_BUY, J0());
        if (m0Var == null || (lVar = m0Var.b) == null) {
            return;
        }
        ArrayList arrayList = lVar.h;
        String str = (arrayList == null || (kVar = (x9.k) x61.m.W(arrayList)) == null) ? null : kVar.a;
        RuntimeFeatureFlag runtimeFeatureFlag = RuntimeFeatureFlag.a;
        ei.c cVar = ei.c.N;
        runtimeFeatureFlag.getClass();
        e1 e1Var = RuntimeFeatureFlag.a(cVar) ? m0Var.e : L0().B;
        if (str != null) {
            b0.z(d1.i(this), (a71.h) null, (a0) null, new f(this, e1Var, lVar, str, null), 3);
            return;
        }
        com.github.rudroid.common.e a0 = a0();
        Exception exc = new Exception("Offer token not found");
        e.a aVar = com.github.rudroid.common.e.Companion;
        a0.b("CopilotChatProPaywallActivity", exc, true);
        y1 y1Var = L0().F;
        do {
            value = y1Var.getValue();
            i0Var = i0.u;
            ((l0) value).getClass();
        } while (!y1Var.i(value, new l0((k0) null, (j0) null, i0Var)));
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        k21.f.c(m(), (u) null, new com.github.rudroid.settings.copilot.paywall.b(this, 3), 3);
        e.c.a(this, new r1.d(new e0(7, this), true, 1047057390));
    }

    public final void onPause() {
        super/*com.github.rudroid.activities.m0*/.onPause();
        di.c.b(this, 2130772016, 2130772038);
    }

    public final void onResume() {
        super/*com.github.rudroid.activities.m0*/.onResume();
        di.c.c(this, 2130772037, 2130772016);
    }




    public static Object f0(Object... a) {
        return null;
    }

    public static Object K0(Object... a) {
        return null;
    }

    public static Object g0(Object... a) {
        return null;
    }

    public static Object C(Object... a) {
        return null;
    }

    public static Object a0(Object... a) {
        return null;
    }

    public static Object m(Object... a) {
        return null;
    }

    public static Object w0(Object... a) {
        return null;
    }

    public static Object y0(Object... a) {
        return null;
    }
    public Object w0() { return null; }
    public Object y0() { return null; }
}
