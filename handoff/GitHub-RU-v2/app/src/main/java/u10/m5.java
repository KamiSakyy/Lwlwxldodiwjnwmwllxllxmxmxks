package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m5 implements aaShadow.v0 {
    public r5 a;

    public m5(r5 r5Var) {
        this.a = r5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m5) && k71.k.b(this.a, ((m5) obj).a);
    }

    public final int hashCode() {
        r5 r5Var = this.a;
        if (r5Var == null) {
            return 0;
        }
        return r5Var.hashCode();
    }

    public final String toString() {
        return "Data(node=" + this.a + ")";
    }
}
