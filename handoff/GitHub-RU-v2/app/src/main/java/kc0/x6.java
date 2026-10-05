package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class x6 implements aa.m0 {
    public final w6 a;

    public x6(w6 w6Var) {
        this.a = w6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x6) && k71.k.b(this.a, ((x6) obj).a);
    }

    public final int hashCode() {
        w6 w6Var = this.a;
        if (w6Var == null) {
            return 0;
        }
        return w6Var.hashCode();
    }

    public final String toString() {
        return "Data(createPullRequest=" + this.a + ")";
    }
}
