package com.github.rudroid.settings.copilot;

import android.os.Bundle;
import androidx.lifecycle.d1;
import androidx.lifecycle.l1;
import com.github.rudroid.activities.WebViewActivity;
import com.github.rudroid.settings.copilot.CopilotChatSettingsActivity;
import com.github.rudroid.settings.copilot.paywall.j;
import com.github.service.models.response.type.MobileAppAction;
import com.github.service.models.response.type.MobileAppElement;
import com.github.service.models.response.type.MobileSubjectType;

/* loaded from: /home/user/work/p/classes3.dex */
public final class CopilotChatSettingsActivity extends l0 {
    public static final a Companion = new a();
    public h.g t0;
    public final l1 u0;

    public static final class a {
    }

    public static final class b implements j71.a {
        public b() {
        }

        public final Object a() {
            return CopilotChatSettingsActivity.this.f0();
        }
    }

    public static final class c implements j71.a {
        public c() {
        }

        public final Object a() {
            return CopilotChatSettingsActivity.this.K0();
        }
    }

    public static final class d implements j71.a {
        public d() {
        }

        public final Object a() {
            return CopilotChatSettingsActivity.this.g0();
        }
    }

    public CopilotChatSettingsActivity() {
        this.s0 = false;
        C(new k0(this));
        this.u0 = new l1(k71.x.a(o.class), new c(), new b(), new d());
    }

    public static void L0(CopilotChatSettingsActivity copilotChatSettingsActivity, MobileAppElement mobileAppElement) {
        MobileAppAction mobileAppAction = MobileAppAction.PRESS;
        MobileSubjectType mobileSubjectType = MobileSubjectType.COPILOT_SETTINGS;
        copilotChatSettingsActivity.getClass();
        v71.b0.z(d1.i(copilotChatSettingsActivity), (a71.h) null, (v71.a0) null, new m(copilotChatSettingsActivity, mobileAppElement, mobileAppAction, mobileSubjectType, null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void J0(int i, int i2) {
        WebViewActivity.a aVar = WebViewActivity.Companion;
        String string = getResources().getString(i2);
        k71.k.f(string, "getString(...)");
        String string2 = getResources().getString(i);
        aVar.getClass();
        u0(WebViewActivity.a.a(this, string, string2), s0());
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.t0 = E(new h.b() { // from class: com.github.rudroid.settings.copilot.d
            public final void d(Object obj) {
                j.b bVar = (j.b) obj;
                CopilotChatSettingsActivity.a aVar = CopilotChatSettingsActivity.Companion;
                k71.k.g(bVar, "result");
                if (bVar.a) {
                    CopilotChatSettingsActivity copilotChatSettingsActivity = CopilotChatSettingsActivity.this;
                    v71.b0.z(d1.i(copilotChatSettingsActivity), (a71.h) null, (v71.a0) null, new l(copilotChatSettingsActivity, null), 3);
                }
            }
        }, new com.github.rudroid.settings.copilot.paywall.j(w0()));
        e.c.a(this, new r1.d(new e(1, this), true, 1969642282));
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

    public static Object getResources(Object... a) {
        return null;
    }

    public static Object s0(Object... a) {
        return null;
    }

    public static Object w0(Object... a) {
        return null;
    }

    public static Object y0(Object... a) {
        return null;
    }
    public Object y0() { return null; }
}
