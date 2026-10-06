package wx0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h0 {
    public final String a;
    public final r1 b;
    public final q1 c;
    public final k0 d;
    public final j0 e;

    public h0(String str, r1 r1Var, q1 q1Var, k0 k0Var, j0 j0Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = r1Var;
        this.c = q1Var;
        this.d = k0Var;
        this.e = j0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return k71.k.b(this.a, h0Var.a) && k71.k.b(this.b, h0Var.b) && k71.k.b(this.c, h0Var.c) && k71.k.b(this.d, h0Var.d) && k71.k.b(this.e, h0Var.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        r1 r1Var = this.b;
        int hashCode2 = (hashCode + (r1Var == null ? 0 : r1Var.hashCode())) * 31;
        q1 q1Var = this.c;
        int hashCode3 = (hashCode2 + (q1Var == null ? 0 : q1Var.hashCode())) * 31;
        k0 k0Var = this.d;
        int hashCode4 = (hashCode3 + (k0Var == null ? 0 : k0Var.hashCode())) * 31;
        j0 j0Var = this.e;
        return hashCode4 + (j0Var != null ? j0Var.hashCode() : 0);
    }

    public final String toString() {
        return "Node4(__typename=" + this.a + ", onUser=" + this.b + ", onTeam=" + this.c + ", onMannequin=" + this.d + ", onBot=" + this.e + ")";
    }
}
