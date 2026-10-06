package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class y40 {
    public String a;
    public z40 b;
    public vx.a c;

    public y40(String str, z40 z40Var, vx.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = z40Var;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y40)) {
            return false;
        }
        y40 y40Var = (y40) obj;
        return k71.k.b(this.a, y40Var.a) && k71.k.b(this.b, y40Var.b) && k71.k.b(this.c, y40Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        z40 z40Var = this.b;
        int hashCode2 = (hashCode + (z40Var == null ? 0 : z40Var.hashCode())) * 31;
        vx.a aVar = this.c;
        return hashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Node(__typename=");
        sb.append(this.a);
        sb.append(", onOrganization=");
        sb.append(this.b);
        sb.append(", nodeIdFragment=");
        return f4.r(sb, this.c, ")");
    }
}
