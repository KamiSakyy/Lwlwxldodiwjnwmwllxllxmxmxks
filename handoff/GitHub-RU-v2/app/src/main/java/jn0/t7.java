package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class t7 {
    public final v7 a;

    public t7(v7 v7Var) {
        this.a = v7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t7) && k71.k.b(this.a, ((t7) obj).a);
    }

    public final int hashCode() {
        v7 v7Var = this.a;
        if (v7Var == null) {
            return 0;
        }
        return v7Var.hashCode();
    }

    public final String toString() {
        return "CreateRef(ref=" + this.a + ")";
    }
}
