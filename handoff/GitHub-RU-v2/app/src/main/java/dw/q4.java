package dw;

/* loaded from: /home/user/work/p/classes3.dex */
public final class q4 {
    public String a;
    public r4 b;
    public vx.a c;

    public q4(String str, r4 r4Var, vx.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = r4Var;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q4)) {
            return false;
        }
        q4 q4Var = (q4) obj;
        return k71.k.b(this.a, q4Var.a) && k71.k.b(this.b, q4Var.b) && k71.k.b(this.c, q4Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        r4 r4Var = this.b;
        int hashCode2 = (hashCode + (r4Var == null ? 0 : r4Var.hashCode())) * 31;
        vx.a aVar = this.c;
        return hashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Node(__typename=");
        sb.append(this.a);
        sb.append(", onBot=");
        sb.append(this.b);
        sb.append(", nodeIdFragment=");
        return jo.f4Shadow.r(sb, this.c, ")");
    }
}
