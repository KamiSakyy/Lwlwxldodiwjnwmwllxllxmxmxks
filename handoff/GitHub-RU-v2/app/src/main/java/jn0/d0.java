package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d0 implements aa.m0 {
    public final b0 a;

    public d0(b0 b0Var) {
        this.a = b0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d0) && k71.k.b(this.a, ((d0) obj).a);
    }

    public final int hashCode() {
        b0 b0Var = this.a;
        if (b0Var == null) {
            return 0;
        }
        return b0Var.hashCode();
    }

    public final String toString() {
        return "Data(addReaction=" + this.a + ")";
    }
}
