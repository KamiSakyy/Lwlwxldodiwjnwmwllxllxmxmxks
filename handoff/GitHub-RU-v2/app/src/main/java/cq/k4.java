package cq;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k4 {
    public String a;
    public m4 b;
    public vx.a c;

    public k4(String str, m4 m4Var, vx.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = m4Var;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k4)) {
            return false;
        }
        k4 k4Var = (k4) obj;
        return k71.k.b(this.a, k4Var.a) && k71.k.b(this.b, k4Var.b) && k71.k.b(this.c, k4Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        m4 m4Var = this.b;
        int hashCode2 = (hashCode + (m4Var == null ? 0 : m4Var.hashCode())) * 31;
        vx.a aVar = this.c;
        return hashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GitObject(__typename=");
        sb.append(this.a);
        sb.append(", onCommit=");
        sb.append(this.b);
        sb.append(", nodeIdFragment=");
        return jo.f4.r(sb, this.c, ")");
    }
}
