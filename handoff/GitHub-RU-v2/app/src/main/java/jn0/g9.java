package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g9 implements aa.m0 {
    public final h9 a;

    public g9(h9 h9Var) {
        this.a = h9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g9) && k71.k.b(this.a, ((g9) obj).a);
    }

    public final int hashCode() {
        h9 h9Var = this.a;
        if (h9Var == null) {
            return 0;
        }
        return h9Var.hashCode();
    }

    public final String toString() {
        return "Data(deleteRef=" + this.a + ")";
    }
}
