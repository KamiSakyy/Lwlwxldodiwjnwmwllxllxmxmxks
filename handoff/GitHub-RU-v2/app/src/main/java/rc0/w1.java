package rc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class w1 implements aa.v0 {
    public x1 a;

    public w1(x1 x1Var) {
        this.a = x1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w1) && k71.k.b(this.a, ((w1) obj).a);
    }

    public final int hashCode() {
        x1 x1Var = this.a;
        if (x1Var == null) {
            return 0;
        }
        return x1Var.hashCode();
    }

    public final String toString() {
        return "Data(node=" + this.a + ")";
    }
}
