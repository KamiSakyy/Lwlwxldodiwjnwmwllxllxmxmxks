package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l50 {
    public final String a;
    public final j50 b;
    public final kw0.a c;

    public l50(String str, j50 j50Var, kw0.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = j50Var;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l50)) {
            return false;
        }
        l50 l50Var = (l50) obj;
        return k71.k.b(this.a, l50Var.a) && k71.k.b(this.b, l50Var.b) && k71.k.b(this.c, l50Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        j50 j50Var = this.b;
        int hashCode2 = (hashCode + (j50Var == null ? 0 : j50Var.hashCode())) * 31;
        kw0.a aVar = this.c;
        return hashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RepositoryOwner(__typename=");
        sb.append(this.a);
        sb.append(", onUser=");
        sb.append(this.b);
        sb.append(", nodeIdFragment=");
        return f1.e.n(sb, this.c, ")");
    }
}
