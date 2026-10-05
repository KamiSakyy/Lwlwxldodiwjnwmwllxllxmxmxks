package b20;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k1 implements aa.v0 {
    public final l1 a;

    public k1(l1 l1Var) {
        this.a = l1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k1) && k71.k.b(this.a, ((k1) obj).a);
    }

    public final int hashCode() {
        l1 l1Var = this.a;
        if (l1Var == null) {
            return 0;
        }
        return l1Var.hashCode();
    }

    public final String toString() {
        return "Data(node=" + this.a + ")";
    }
}
