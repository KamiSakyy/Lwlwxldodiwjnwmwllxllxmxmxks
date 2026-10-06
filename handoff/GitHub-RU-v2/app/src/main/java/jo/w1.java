package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w1 {
    public z1 a;

    public w1(z1 z1Var) {
        this.a = z1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w1) && k71.k.b(this.a, ((w1) obj).a);
    }

    public final int hashCode() {
        z1 z1Var = this.a;
        if (z1Var == null) {
            return 0;
        }
        return z1Var.hashCode();
    }

    public final String toString() {
        return "AddStar(starrable=" + this.a + ")";
    }
}
