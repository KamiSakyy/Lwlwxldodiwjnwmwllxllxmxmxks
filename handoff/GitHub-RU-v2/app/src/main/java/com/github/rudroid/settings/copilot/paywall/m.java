package com.github.rudroid.settings.copilot.paywall;

import com.github.service.models.response.type.MobileEventContext;
import xn.e1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m {
    public final e1 a;
    public final MobileEventContext b;

    public m(e1 e1Var) {
        this.a = e1Var;
        this.b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.a == mVar.a && this.b == mVar.b;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        MobileEventContext mobileEventContext = this.b;
        return hashCode + (mobileEventContext == null ? 0 : mobileEventContext.hashCode());
    }

    public final String toString() {
        return "CopilotProPaywallActivityInput(licenseToBuy=" + this.a + ", telemetryContext=" + this.b + ")";
    }

    public m(e1 e1Var, MobileEventContext mobileEventContext) {
        this.a = e1Var;
        this.b = mobileEventContext;
    }
}
