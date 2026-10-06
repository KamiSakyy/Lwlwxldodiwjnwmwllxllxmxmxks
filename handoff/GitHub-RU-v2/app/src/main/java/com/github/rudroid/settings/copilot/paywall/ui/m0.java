package com.github.rudroid.settings.copilot.paywall.ui;

import java.util.List;
import jo.f4Shadow;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m0 {
    public int a;
    public List b;

    public m0(int i, List list) {
        this.a = i;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return this.a == m0Var.a && this.b.equals(m0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return f4Shadow.i(this.a, "CopilotLicenseFeatureSet(title=", ", features=", ")", this.b);
    }
    public static Object C(Object p1, Object p2, Object p3, Object p4) { return null; }
    public static Object y(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
}
