package com.github.rudroid.agents.sessionevents;

import java.util.Map;

/* loaded from: /home/user/work/p/classes.dex */
final class n4 {

    /* renamed from: a, reason: collision with root package name */
    public final com.github.rudroid.utilities.ui.g1 f7739a;

    /* renamed from: b, reason: collision with root package name */
    public final j4 f7740b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f7741c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f7742d;

    public n4(com.github.rudroid.utilities.ui.g1 g1Var, j4 j4Var, Map map, boolean z10) {
        k71.k.g(g1Var, "steeringState");
        k71.k.g(map, "optimistic");
        this.f7739a = g1Var;
        this.f7740b = j4Var;
        this.f7741c = map;
        this.f7742d = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n4)) {
            return false;
        }
        n4 n4Var = (n4) obj;
        return k71.k.b(this.f7739a, n4Var.f7739a) && k71.k.b(this.f7740b, n4Var.f7740b) && k71.k.b(this.f7741c, n4Var.f7741c) && this.f7742d == n4Var.f7742d;
    }

    public final int hashCode() {
        int hashCode = this.f7739a.hashCode() * 31;
        j4 j4Var = this.f7740b;
        return Boolean.hashCode(this.f7742d) + ((this.f7741c.hashCode() + ((hashCode + (j4Var == null ? 0 : j4Var.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        return "SessionStateInputs(steeringState=" + this.f7739a + ", filesChanged=" + this.f7740b + ", optimistic=" + this.f7741c + ", vsCodeBannerDismissed=" + this.f7742d + ")";
    }
}
