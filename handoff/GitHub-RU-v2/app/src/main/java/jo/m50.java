package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m50 {
    public String a;
    public n50 b;
    public vx.a c;

    public m50(String str, n50 n50Var, vx.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = n50Var;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m50)) {
            return false;
        }
        m50 m50Var = (m50) obj;
        return k71.k.b(this.a, m50Var.a) && k71.k.b(this.b, m50Var.b) && k71.k.b(this.c, m50Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        n50 n50Var = this.b;
        int hashCode2 = (hashCode + (n50Var == null ? 0 : n50Var.hashCode())) * 31;
        vx.a aVar = this.c;
        return hashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Node(__typename=");
        sb.append(this.a);
        sb.append(", onRepository=");
        sb.append(this.b);
        sb.append(", nodeIdFragment=");
        return f4.r(sb, this.c, ")");
    }
    public m50(String p1, Object p2, Object p3) {
    }
}
