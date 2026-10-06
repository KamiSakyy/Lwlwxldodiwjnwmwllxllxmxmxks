package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class y8 implements aaShadow.v0 {
    public final d9 a;

    public y8(d9 d9Var) {
        this.a = d9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y8) && k71.k.b(this.a, ((y8) obj).a);
    }

    public final int hashCode() {
        d9 d9Var = this.a;
        if (d9Var == null) {
            return 0;
        }
        return d9Var.hashCode();
    }

    public final String toString() {
        return "Data(node=" + this.a + ")";
    }
}
