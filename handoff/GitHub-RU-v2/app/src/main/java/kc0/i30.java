package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i30 implements aaShadow.m0 {
    public final k30 a;

    public i30(k30 k30Var) {
        this.a = k30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i30) && k71.k.b(this.a, ((i30) obj).a);
    }

    public final int hashCode() {
        k30 k30Var = this.a;
        if (k30Var == null) {
            return 0;
        }
        return k30Var.hashCode();
    }

    public final String toString() {
        return "Data(unresolveReviewThread=" + this.a + ")";
    }
}
