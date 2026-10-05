package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n5 implements aa.m0 {
    public final l5 a;

    public n5(l5 l5Var) {
        this.a = l5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n5) && k71.k.b(this.a, ((n5) obj).a);
    }

    public final int hashCode() {
        l5 l5Var = this.a;
        if (l5Var == null) {
            return 0;
        }
        return l5Var.hashCode();
    }

    public final String toString() {
        return "Data(closePullRequest=" + this.a + ")";
    }
}
