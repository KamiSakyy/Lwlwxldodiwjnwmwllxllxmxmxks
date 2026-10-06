package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class x40 implements aaShadow.m0 {
    public final z40 a;

    public x40(z40 z40Var) {
        this.a = z40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x40) && k71.k.b(this.a, ((x40) obj).a);
    }

    public final int hashCode() {
        z40 z40Var = this.a;
        if (z40Var == null) {
            return 0;
        }
        return z40Var.hashCode();
    }

    public final String toString() {
        return "Data(updateIssue=" + this.a + ")";
    }
}
