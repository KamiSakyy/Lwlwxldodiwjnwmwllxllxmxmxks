package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class u5 implements aaShadow.v0 {
    public z5 a;

    public u5(z5 z5Var) {
        this.a = z5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u5) && k71.k.b(this.a, ((u5) obj).a);
    }

    public final int hashCode() {
        z5 z5Var = this.a;
        if (z5Var == null) {
            return 0;
        }
        return z5Var.hashCode();
    }

    public final String toString() {
        return "Data(node=" + this.a + ")";
    }
}
