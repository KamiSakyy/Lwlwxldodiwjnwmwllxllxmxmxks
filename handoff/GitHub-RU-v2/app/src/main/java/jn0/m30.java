package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m30 {
    public String a;
    public n30 b;
    public kw0.a c;

    public m30(String str, n30 n30Var, kw0.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = n30Var;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m30)) {
            return false;
        }
        m30 m30Var = (m30) obj;
        return k71.k.b(this.a, m30Var.a) && k71.k.b(this.b, m30Var.b) && k71.k.b(this.c, m30Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        n30 n30Var = this.b;
        int hashCode2 = (hashCode + (n30Var == null ? 0 : n30Var.hashCode())) * 31;
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
