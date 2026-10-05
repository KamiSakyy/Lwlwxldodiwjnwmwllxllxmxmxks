package wx0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j1 {
    public final u1 a;
    public final y b;

    public j1(u1 u1Var, y yVar) {
        this.a = u1Var;
        this.b = yVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1)) {
            return false;
        }
        j1 j1Var = (j1) obj;
        return k71.k.b(this.a, j1Var.a) && k71.k.b(this.b, j1Var.b);
    }

    public final int hashCode() {
        u1 u1Var = this.a;
        return this.b.hashCode() + ((u1Var == null ? 0 : u1Var.hashCode()) * 31);
    }

    public final String toString() {
        return "OnProjectV2ItemFieldRepositoryValue(repository=" + this.a + ", field=" + this.b + ")";
    }
}
