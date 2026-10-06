package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class x3 implements aaShadow.v0 {
    public final b4 a;

    public x3(b4 b4Var) {
        this.a = b4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x3) && k71.k.b(this.a, ((x3) obj).a);
    }

    public final int hashCode() {
        b4 b4Var = this.a;
        if (b4Var == null) {
            return 0;
        }
        return b4Var.hashCode();
    }

    public final String toString() {
        return "Data(node=" + this.a + ")";
    }
}
