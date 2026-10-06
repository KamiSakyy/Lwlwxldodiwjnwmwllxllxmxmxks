package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class y20 {
    public String a;
    public z20 b;
    public kw0.a c;

    public y20(String str, z20 z20Var, kw0.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = z20Var;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y20)) {
            return false;
        }
        y20 y20Var = (y20) obj;
        return k71.k.b(this.a, y20Var.a) && k71.k.b(this.b, y20Var.b) && k71.k.b(this.c, y20Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        z20 z20Var = this.b;
        int hashCode2 = (hashCode + (z20Var == null ? 0 : z20Var.hashCode())) * 31;
        kw0.a aVar = this.c;
        return hashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Node(__typename=");
        sb.append(this.a);
        sb.append(", onOrganization=");
        sb.append(this.b);
        sb.append(", nodeIdFragment=");
        return f1.e.n(sb, this.c, ")");
    }
}
