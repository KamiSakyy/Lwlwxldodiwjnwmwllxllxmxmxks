package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class p10 implements aaShadow.m0 {
    public q10 a;

    public p10(q10 q10Var) {
        this.a = q10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p10) && k71.k.b(this.a, ((p10) obj).a);
    }

    public final int hashCode() {
        q10 q10Var = this.a;
        if (q10Var == null) {
            return 0;
        }
        return q10Var.hashCode();
    }

    public final String toString() {
        return "Data(unblockUserFromOrganization=" + this.a + ")";
    }
}
