package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class nf0 implements aaShadow.m0 {
    public pf0 a;

    public nf0(pf0 pf0Var) {
        this.a = pf0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nf0) && k71.k.b(this.a, ((nf0) obj).a);
    }

    public final int hashCode() {
        pf0 pf0Var = this.a;
        if (pf0Var == null) {
            return 0;
        }
        return pf0Var.hashCode();
    }

    public final String toString() {
        return "Data(updatePullRequest=" + this.a + ")";
    }
}
