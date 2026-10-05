package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t90 implements aa.m0 {
    public final u90 a;

    public t90(u90 u90Var) {
        this.a = u90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t90) && k71.k.b(this.a, ((t90) obj).a);
    }

    public final int hashCode() {
        u90 u90Var = this.a;
        if (u90Var == null) {
            return 0;
        }
        return u90Var.hashCode();
    }

    public final String toString() {
        return "Data(unblockUserFromOrganization=" + this.a + ")";
    }
}
