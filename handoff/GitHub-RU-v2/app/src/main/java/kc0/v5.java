package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class v5 {
    public String a;
    public a6 b;
    public bl0.a c;

    public v5(String str, a6 a6Var, bl0.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = a6Var;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v5)) {
            return false;
        }
        v5 v5Var = (v5) obj;
        return k71.k.b(this.a, v5Var.a) && k71.k.b(this.b, v5Var.b) && k71.k.b(this.c, v5Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        a6 a6Var = this.b;
        int hashCode2 = (hashCode + (a6Var == null ? 0 : a6Var.hashCode())) * 31;
        bl0.a aVar = this.c;
        return hashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GitObject(__typename=");
        sb.append(this.a);
        sb.append(", onCommit=");
        sb.append(this.b);
        sb.append(", nodeIdFragment=");
        return jo.f4Shadow.q(sb, this.c, ")");
    }
}
