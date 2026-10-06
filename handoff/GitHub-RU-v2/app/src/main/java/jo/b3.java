package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b3 {
    public String a;
    public e3 b;
    public f3 c;
    public g3 d;
    public qx.c1 e;

    public b3(String str, e3 e3Var, f3 f3Var, g3 g3Var, qx.c1 c1Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = e3Var;
        this.c = f3Var;
        this.d = g3Var;
        this.e = c1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b3)) {
            return false;
        }
        b3 b3Var = (b3) obj;
        return k71.k.b(this.a, b3Var.a) && k71.k.b(this.b, b3Var.b) && k71.k.b(this.c, b3Var.c) && k71.k.b(this.d, b3Var.d) && k71.k.b(this.e, b3Var.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        e3 e3Var = this.b;
        int hashCode2 = (hashCode + (e3Var == null ? 0 : e3Var.hashCode())) * 31;
        f3 f3Var = this.c;
        int hashCode3 = (hashCode2 + (f3Var == null ? 0 : f3Var.a.hashCode())) * 31;
        g3 g3Var = this.d;
        int hashCode4 = (hashCode3 + (g3Var == null ? 0 : g3Var.a.hashCode())) * 31;
        qx.c1 c1Var = this.e;
        return hashCode4 + (c1Var != null ? c1Var.hashCode() : 0);
    }

    public final String toString() {
        return "Node1(__typename=" + this.a + ", onBot=" + this.b + ", onMannequin=" + this.c + ", onOrganization=" + this.d + ", userListItemFragment=" + this.e + ")";
    }
}
