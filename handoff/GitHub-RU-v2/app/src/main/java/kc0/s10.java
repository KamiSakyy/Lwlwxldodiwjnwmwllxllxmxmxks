package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class s10 implements aa.v0 {
    public final w10 a;

    public s10(w10 w10Var) {
        this.a = w10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s10) && k71.k.b(this.a, ((s10) obj).a);
    }

    public final int hashCode() {
        w10 w10Var = this.a;
        if (w10Var == null) {
            return 0;
        }
        return w10Var.hashCode();
    }

    public final String toString() {
        return "Data(repositoryOwner=" + this.a + ")";
    }
}
