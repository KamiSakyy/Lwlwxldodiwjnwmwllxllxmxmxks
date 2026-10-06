package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r2 implements aaShadow.m0 {
    public p2 a;

    public r2(p2 p2Var) {
        this.a = p2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r2) && k71.k.b(this.a, ((r2) obj).a);
    }

    public final int hashCode() {
        p2 p2Var = this.a;
        if (p2Var == null) {
            return 0;
        }
        return p2Var.hashCode();
    }

    public final String toString() {
        return "Data(approveDeployments=" + this.a + ")";
    }
}
