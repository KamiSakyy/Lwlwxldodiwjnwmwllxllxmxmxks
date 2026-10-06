package ox0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class u0 {
    public final String a;
    public final x0 b;
    public final kw0.a c;

    public u0(String str, x0 x0Var, kw0.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = x0Var;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return k71.k.b(this.a, u0Var.a) && k71.k.b(this.b, u0Var.b) && k71.k.b(this.c, u0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        x0 x0Var = this.b;
        int hashCode2 = (hashCode + (x0Var == null ? 0 : x0Var.hashCode())) * 31;
        kw0.a aVar = this.c;
        return hashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("List(__typename=");
        sb.append(this.a);
        sb.append(", onRepository=");
        sb.append(this.b);
        sb.append(", nodeIdFragment=");
        return f1.e.n(sb, this.c, ")");
    }
}
