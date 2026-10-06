package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b6 {
    public final String a;
    public final g6 b;
    public final kw0.a c;

    public b6(String str, g6 g6Var, kw0.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = g6Var;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b6)) {
            return false;
        }
        b6 b6Var = (b6) obj;
        return k71.k.b(this.a, b6Var.a) && k71.k.b(this.b, b6Var.b) && k71.k.b(this.c, b6Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        g6 g6Var = this.b;
        int hashCode2 = (hashCode + (g6Var == null ? 0 : g6Var.hashCode())) * 31;
        kw0.a aVar = this.c;
        return hashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GitObject(__typename=");
        sb.append(this.a);
        sb.append(", onCommit=");
        sb.append(this.b);
        sb.append(", nodeIdFragment=");
        return f1.e.n(sb, this.c, ")");
    }
}
