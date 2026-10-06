package wx0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class t {
    public final String a;
    public final o1 b;
    public final kw0.a c;

    public t(String str, o1 o1Var, kw0.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = o1Var;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return k71.k.b(this.a, tVar.a) && k71.k.b(this.b, tVar.b) && k71.k.b(this.c, tVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        o1 o1Var = this.b;
        int hashCode2 = (hashCode + (o1Var == null ? 0 : o1Var.hashCode())) * 31;
        kw0.a aVar = this.c;
        return hashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Field3(__typename=");
        sb.append(this.a);
        sb.append(", onProjectV2IterationField=");
        sb.append(this.b);
        sb.append(", nodeIdFragment=");
        return f1.e.n(sb, this.c, ")");
    }
}
