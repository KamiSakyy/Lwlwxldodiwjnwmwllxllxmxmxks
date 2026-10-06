package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class hc0 implements aaShadow.m0 {
    public kc0 a;

    public hc0(kc0 kc0Var) {
        this.a = kc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hc0) && k71.k.b(this.a, ((hc0) obj).a);
    }

    public final int hashCode() {
        kc0 kc0Var = this.a;
        if (kc0Var == null) {
            return 0;
        }
        return kc0Var.hashCode();
    }

    public final String toString() {
        return "Data(updatePullRequest=" + this.a + ")";
    }
}
