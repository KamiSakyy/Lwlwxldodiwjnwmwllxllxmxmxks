package com.github.rudroid.settings.copilot.managesubscription;

import android.os.Bundle;
import androidx.lifecycle.d1;
import androidx.lifecycle.l1;
import com.github.rudroid.copilot.inapppurchase.usecases.x0;
import com.github.rudroid.settings.copilot.managesubscription.CopilotManageSubscriptionActivity;
import com.github.rudroid.settings.copilot.paywall.j;

/* loaded from: /home/user/work/p/classes3.dex */
public final class CopilotManageSubscriptionActivity extends i0 {
    public static final a Companion = new a();
    public x0 t0;
    public h.g u0;
    public final l1 v0;

    public static final class a {
    }

    public static final class b implements j71.a {
        public b() {
        }

        public final Object a() {
            return CopilotManageSubscriptionActivity.this.f0();
        }
    }

    public static final class c implements j71.a {
        public c() {
        }

        public final Object a() {
            return CopilotManageSubscriptionActivity.this.K0();
        }
    }

    public static final class d implements j71.a {
        public d() {
        }

        public final Object a() {
            return CopilotManageSubscriptionActivity.this.g0();
        }
    }

    public CopilotManageSubscriptionActivity() {
        this.s0 = false;
        C(new h0(this));
        this.v0 = new l1(k71.x.a(b0.class), new c(), new b(), new d());
    }

    public final b0 J0() {
        return (b0) this.v0.getValue();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.u0 = E(new h.b() { // from class: com.github.rudroid.settings.copilot.managesubscription.d
            public final void d(Object obj) {
                j.b bVar = (j.b) obj;
                CopilotManageSubscriptionActivity.a aVar = CopilotManageSubscriptionActivity.Companion;
                k71.k.g(bVar, "result");
                if (bVar.a) {
                    CopilotManageSubscriptionActivity copilotManageSubscriptionActivity = CopilotManageSubscriptionActivity.this;
                    v71.b0.z(d1.i(copilotManageSubscriptionActivity), (a71.h) null, (v71.a0) null, new r(copilotManageSubscriptionActivity, null), 3);
                }
            }
        }, new com.github.rudroid.settings.copilot.paywall.j(w0()));
        e.c.a(this, new r1.d(new com.github.rudroid.settings.copilot.managesubscription.b(this, 0), true, 210718814));
    }


}
