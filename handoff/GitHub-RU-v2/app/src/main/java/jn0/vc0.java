package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class vc0 {
    public final mc0 a;
    public final tc0 b;

    public vc0(mc0 mc0Var, tc0 tc0Var) {
        this.a = mc0Var;
        this.b = tc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vc0)) {
            return false;
        }
        vc0 vc0Var = (vc0) obj;
        return k71.k.b(this.a, vc0Var.a) && k71.k.b(this.b, vc0Var.b);
    }

    public final int hashCode() {
        mc0 mc0Var = this.a;
        int hashCode = (mc0Var == null ? 0 : mc0Var.hashCode()) * 31;
        tc0 tc0Var = this.b;
        return hashCode + (tc0Var != null ? tc0Var.hashCode() : 0);
    }

    public final String toString() {
        return "RequestReviews(actor=" + this.a + ", pullRequest=" + this.b + ")";
    }
}
