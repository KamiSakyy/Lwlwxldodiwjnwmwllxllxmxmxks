package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class w10 {
    public final String a;
    public final u10 b;
    public final bl0.a c;

    public w10(String str, u10 u10Var, bl0.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = u10Var;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w10)) {
            return false;
        }
        w10 w10Var = (w10) obj;
        return k71.k.b(this.a, w10Var.a) && k71.k.b(this.b, w10Var.b) && k71.k.b(this.c, w10Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        u10 u10Var = this.b;
        int hashCode2 = (hashCode + (u10Var == null ? 0 : u10Var.hashCode())) * 31;
        bl0.a aVar = this.c;
        return hashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RepositoryOwner(__typename=");
        sb.append(this.a);
        sb.append(", onUser=");
        sb.append(this.b);
        sb.append(", nodeIdFragment=");
        return jo.f4.q(sb, this.c, ")");
    }
}
