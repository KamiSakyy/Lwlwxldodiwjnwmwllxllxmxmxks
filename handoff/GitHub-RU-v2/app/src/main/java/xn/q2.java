package xn;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class q2 {
    public final String a;
    public final List b;

    public q2(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q2)) {
            return false;
        }
        q2 q2Var = (q2) obj;
        return k71.k.b(this.a, q2Var.a) && k71.k.b(this.b, q2Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return jo.f4.o("MobileCopilotFeatureSection(title=", this.a, ", features=", ")", this.b);
    }
}
