package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class s4 {
    public v4 a;
    public j4 b;

    public s4(v4 v4Var, j4 j4Var) {
        this.a = v4Var;
        this.b = j4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s4)) {
            return false;
        }
        s4 s4Var = (s4) obj;
        return k71.k.b(this.a, s4Var.a) && k71.k.b(this.b, s4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OnPullRequest(requiredStatusChecks=" + this.a + ", commits=" + this.b + ")";
    }
}
