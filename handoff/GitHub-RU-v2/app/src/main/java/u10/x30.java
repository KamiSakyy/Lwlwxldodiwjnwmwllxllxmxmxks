package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class x30 implements aaShadow.m0 {
    public z30 a;

    public x30(z30 z30Var) {
        this.a = z30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x30) && k71.k.b(this.a, ((x30) obj).a);
    }

    public final int hashCode() {
        z30 z30Var = this.a;
        if (z30Var == null) {
            return 0;
        }
        return z30Var.hashCode();
    }

    public final String toString() {
        return "Data(updateDiscussion=" + this.a + ")";
    }
}
