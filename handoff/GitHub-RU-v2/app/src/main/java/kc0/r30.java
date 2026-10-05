package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r30 implements aa.m0 {
    public final s30 a;

    public r30(s30 s30Var) {
        this.a = s30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r30) && k71.k.b(this.a, ((r30) obj).a);
    }

    public final int hashCode() {
        s30 s30Var = this.a;
        if (s30Var == null) {
            return 0;
        }
        return s30Var.hashCode();
    }

    public final String toString() {
        return "Data(unblockUser=" + this.a + ")";
    }
}
