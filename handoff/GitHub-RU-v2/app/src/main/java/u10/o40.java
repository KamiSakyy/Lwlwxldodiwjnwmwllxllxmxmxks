package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o40 implements aaShadow.m0 {
    public u40 a;

    public o40(u40 u40Var) {
        this.a = u40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o40) && k71.k.b(this.a, ((o40) obj).a);
    }

    public final int hashCode() {
        u40 u40Var = this.a;
        if (u40Var == null) {
            return 0;
        }
        return u40Var.hashCode();
    }

    public final String toString() {
        return "Data(updateIssue=" + this.a + ")";
    }
}
