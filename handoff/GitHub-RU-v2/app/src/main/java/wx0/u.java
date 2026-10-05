package wx0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class u {
    public final String a;
    public final p1 b;
    public final kw0.a c;

    public u(String str, p1 p1Var, kw0.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = p1Var;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return k71.k.b(this.a, uVar.a) && k71.k.b(this.b, uVar.b) && k71.k.b(this.c, uVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        p1 p1Var = this.b;
        int hashCode2 = (hashCode + (p1Var == null ? 0 : p1Var.hashCode())) * 31;
        kw0.a aVar = this.c;
        return hashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Field4(__typename=");
        sb.append(this.a);
        sb.append(", onProjectV2SingleSelectField=");
        sb.append(this.b);
        sb.append(", nodeIdFragment=");
        return f1.e.n(sb, this.c, ")");
    }
}
