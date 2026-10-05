package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class u70 {
    public final String a;
    public final s70 b;
    public final vx.a c;

    public u70(String str, s70 s70Var, vx.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = s70Var;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u70)) {
            return false;
        }
        u70 u70Var = (u70) obj;
        return k71.k.b(this.a, u70Var.a) && k71.k.b(this.b, u70Var.b) && k71.k.b(this.c, u70Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        s70 s70Var = this.b;
        int hashCode2 = (hashCode + (s70Var == null ? 0 : s70Var.hashCode())) * 31;
        vx.a aVar = this.c;
        return hashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RepositoryOwner(__typename=");
        sb.append(this.a);
        sb.append(", onUser=");
        sb.append(this.b);
        sb.append(", nodeIdFragment=");
        return f4.r(sb, this.c, ")");
    }
}
