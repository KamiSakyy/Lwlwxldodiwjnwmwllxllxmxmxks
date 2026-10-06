package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class t30 {
    public String a;
    public u30 b;
    public kw0.a c;

    public t30(String str, u30 u30Var, kw0.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = u30Var;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t30)) {
            return false;
        }
        t30 t30Var = (t30) obj;
        return k71.k.b(this.a, t30Var.a) && k71.k.b(this.b, t30Var.b) && k71.k.b(this.c, t30Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        u30 u30Var = this.b;
        int hashCode2 = (hashCode + (u30Var == null ? 0 : u30Var.hashCode())) * 31;
        kw0.a aVar = this.c;
        return hashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Node(__typename=");
        sb.append(this.a);
        sb.append(", onRepository=");
        sb.append(this.b);
        sb.append(", nodeIdFragment=");
        return f1.e.n(sb, this.c, ")");
    }
}
