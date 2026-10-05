package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m70 {
    public final String a;
    public final qx.c1 b;
    public final tu.s c;

    public m70(String str, qx.c1 c1Var, tu.s sVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = c1Var;
        this.c = sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m70)) {
            return false;
        }
        m70 m70Var = (m70) obj;
        return k71.k.b(this.a, m70Var.a) && k71.k.b(this.b, m70Var.b) && k71.k.b(this.c, m70Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        qx.c1 c1Var = this.b;
        int hashCode2 = (hashCode + (c1Var == null ? 0 : c1Var.hashCode())) * 31;
        tu.s sVar = this.c;
        return hashCode2 + (sVar != null ? sVar.hashCode() : 0);
    }

    public final String toString() {
        return "Sponsorable(__typename=" + this.a + ", userListItemFragment=" + this.b + ", organizationListItemFragment=" + this.c + ")";
    }
}
