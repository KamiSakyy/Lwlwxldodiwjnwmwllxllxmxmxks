package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t50 {
    public String a;
    public u50 b;
    public vx.a c;

    public t50(String str, u50 u50Var, vx.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = u50Var;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t50)) {
            return false;
        }
        t50 t50Var = (t50) obj;
        return k71.k.b(this.a, t50Var.a) && k71.k.b(this.b, t50Var.b) && k71.k.b(this.c, t50Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        u50 u50Var = this.b;
        int hashCode2 = (hashCode + (u50Var == null ? 0 : u50Var.hashCode())) * 31;
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
}
