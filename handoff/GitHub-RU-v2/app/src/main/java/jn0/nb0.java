package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class nb0 implements aa.m0 {
    public final pb0 a;

    public nb0(pb0 pb0Var) {
        this.a = pb0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nb0) && k71.k.b(this.a, ((nb0) obj).a);
    }

    public final int hashCode() {
        pb0 pb0Var = this.a;
        if (pb0Var == null) {
            return 0;
        }
        return pb0Var.hashCode();
    }

    public final String toString() {
        return "Data(updatePullRequest=" + this.a + ")";
    }
}
