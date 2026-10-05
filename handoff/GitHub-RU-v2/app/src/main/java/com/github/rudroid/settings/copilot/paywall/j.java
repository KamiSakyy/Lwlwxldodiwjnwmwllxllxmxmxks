package com.github.rudroid.settings.copilot.paywall;

import android.content.Context;
import android.content.Intent;
import com.github.rudroid.copilot.inapppurchase.b;
import com.github.rudroid.m0;
import com.github.rudroid.settings.copilot.paywall.CopilotChatProPaywallActivity;
import java.io.Serializable;
import xn.e1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j extends com.github.rudroid.activities.util.e<m, b> {
    public static final a Companion = new a();

    public static final class a {
    }

    public static final class b {
        public final boolean a;

        public b(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return m0.i("CopilotChatProPaywallActivityResult(refreshPermissions=", ")", this.a);
        }
    }

    public final Intent R(Context context, Object obj) {
        m mVar = (m) obj;
        k71.k.g(mVar, "input");
        CopilotChatProPaywallActivity.a aVar = CopilotChatProPaywallActivity.Companion;
        e1 e1Var = mVar.a;
        Serializable serializable = mVar.b;
        aVar.getClass();
        k71.k.g(e1Var, "licenseToBuy");
        b.a aVar2 = com.github.rudroid.copilot.inapppurchase.b.Companion;
        Intent intent = new Intent(context, (Class<?>) CopilotChatProPaywallActivity.class);
        intent.putExtra("TELEMETRY_CONTEXT_KEY", serializable);
        aVar2.getClass();
        Intent putExtra = intent.putExtra("EXTRA_LICENSE_TO_BUY", e1Var);
        k71.k.f(putExtra, "putExtra(...)");
        return putExtra;
    }

    public final Object y(Intent intent, int i) {
        return (intent == null || i != -1) ? new b(false) : new b(intent.getBooleanExtra("EXTRA_REFRESH_PERMISSIONS", false));
    }
}
