package z70;

import hc0.z9;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n0 {
    public final z9 a;
    public final String b;

    public n0(z9 z9Var, String str) {
        this.a = z9Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return this.a == n0Var.a && k71.k.b(this.b, n0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Node2(viewerViewedState=" + this.a + ", path=" + this.b + ")";
    }
}
