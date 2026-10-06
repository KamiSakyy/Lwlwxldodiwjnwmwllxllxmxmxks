package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w2 implements aaShadow.m0 {
    public u2 a;

    public w2(u2 u2Var) {
        this.a = u2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w2) && k71.k.b(this.a, ((w2) obj).a);
    }

    public final int hashCode() {
        u2 u2Var = this.a;
        if (u2Var == null) {
            return 0;
        }
        return u2Var.hashCode();
    }

    public final String toString() {
        return "Data(approveDeployments=" + this.a + ")";
    }
}
