package pz0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ec {
    public final aa.u0 a;
    public final aa.u0 b;

    public ec(aa.u0 u0Var, aa.u0 u0Var2) {
        this.a = u0Var;
        this.b = u0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ec)) {
            return false;
        }
        ec ecVar = (ec) obj;
        return this.a.equals(ecVar.a) && this.b.equals(ecVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FileChanges(additions=" + this.a + ", deletions=" + this.b + ")";
    }
}
