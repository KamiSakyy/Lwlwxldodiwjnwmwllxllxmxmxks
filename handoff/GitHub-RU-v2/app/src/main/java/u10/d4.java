package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d4 {
    public g4 a;
    public u3 b;

    public d4(g4 g4Var, u3 u3Var) {
        this.a = g4Var;
        this.b = u3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d4)) {
            return false;
        }
        d4 d4Var = (d4) obj;
        return k71.k.b(this.a, d4Var.a) && k71.k.b(this.b, d4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OnPullRequest(requiredStatusChecks=" + this.a + ", commits=" + this.b + ")";
    }
}
