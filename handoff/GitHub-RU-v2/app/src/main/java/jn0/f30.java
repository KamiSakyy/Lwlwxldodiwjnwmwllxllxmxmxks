package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f30 {
    public final String a;
    public final g30 b;
    public final kw0.a c;

    public f30(String str, g30 g30Var, kw0.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = g30Var;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f30)) {
            return false;
        }
        f30 f30Var = (f30) obj;
        return k71.k.b(this.a, f30Var.a) && k71.k.b(this.b, f30Var.b) && k71.k.b(this.c, f30Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        g30 g30Var = this.b;
        int hashCode2 = (hashCode + (g30Var == null ? 0 : g30Var.hashCode())) * 31;
        kw0.a aVar = this.c;
        return hashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Node(__typename=");
        sb.append(this.a);
        sb.append(", onUser=");
        sb.append(this.b);
        sb.append(", nodeIdFragment=");
        return f1.e.n(sb, this.c, ")");
    }
}
