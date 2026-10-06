package zx;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e1 {
    public String a;
    public f1 b;
    public h1 c;
    public i1 d;
    public g1 e;
    public qx.c1 f;

    public e1(String str, f1 f1Var, h1 h1Var, i1 i1Var, g1 g1Var, qx.c1 c1Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = f1Var;
        this.c = h1Var;
        this.d = i1Var;
        this.e = g1Var;
        this.f = c1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj;
        return k71.k.b(this.a, e1Var.a) && k71.k.b(this.b, e1Var.b) && k71.k.b(this.c, e1Var.c) && k71.k.b(this.d, e1Var.d) && k71.k.b(this.e, e1Var.e) && k71.k.b(this.f, e1Var.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        f1 f1Var = this.b;
        int hashCode2 = (hashCode + (f1Var == null ? 0 : f1Var.hashCode())) * 31;
        h1 h1Var = this.c;
        int hashCode3 = (hashCode2 + (h1Var == null ? 0 : h1Var.a.hashCode())) * 31;
        i1 i1Var = this.d;
        int hashCode4 = (hashCode3 + (i1Var == null ? 0 : i1Var.a.hashCode())) * 31;
        g1 g1Var = this.e;
        int hashCode5 = (hashCode4 + (g1Var == null ? 0 : g1Var.a.hashCode())) * 31;
        qx.c1 c1Var = this.f;
        return hashCode5 + (c1Var != null ? c1Var.hashCode() : 0);
    }

    public final String toString() {
        return "Node(__typename=" + this.a + ", onBot=" + this.b + ", onMannequin=" + this.c + ", onOrganization=" + this.d + ", onEnterpriseUserAccount=" + this.e + ", userListItemFragment=" + this.f + ")";
    }
}
