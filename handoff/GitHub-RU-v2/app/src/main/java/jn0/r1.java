package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r1 {
    public final u1 a;

    public r1(u1 u1Var) {
        this.a = u1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r1) && k71.k.b(this.a, ((r1) obj).a);
    }

    public final int hashCode() {
        u1 u1Var = this.a;
        if (u1Var == null) {
            return 0;
        }
        return u1Var.hashCode();
    }

    public final String toString() {
        return "AddStar(starrable=" + this.a + ")";
    }
}
