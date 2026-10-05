package rc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i2 implements aa.v0 {
    public final j2 a;

    public i2(j2 j2Var) {
        this.a = j2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i2) && k71.k.b(this.a, ((i2) obj).a);
    }

    public final int hashCode() {
        j2 j2Var = this.a;
        if (j2Var == null) {
            return 0;
        }
        return j2Var.hashCode();
    }

    public final String toString() {
        return "Data(node=" + this.a + ")";
    }
}
