package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f50 {
    public String a;
    public g50 b;
    public vx.a c;

    public f50(String str, g50 g50Var, vx.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = g50Var;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f50)) {
            return false;
        }
        f50 f50Var = (f50) obj;
        return k71.k.b(this.a, f50Var.a) && k71.k.b(this.b, f50Var.b) && k71.k.b(this.c, f50Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        g50 g50Var = this.b;
        int hashCode2 = (hashCode + (g50Var == null ? 0 : g50Var.hashCode())) * 31;
        vx.a aVar = this.c;
        return hashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Node(__typename=");
        sb.append(this.a);
        sb.append(", onUser=");
        sb.append(this.b);
        sb.append(", nodeIdFragment=");
        return f4.r(sb, this.c, ")");
    }
    public f50(String p1, Object p2, Object p3) {
    }
}
