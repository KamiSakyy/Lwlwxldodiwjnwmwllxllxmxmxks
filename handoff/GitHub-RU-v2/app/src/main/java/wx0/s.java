package wx0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class s {
    public String a;
    public v0 b;
    public kw0.a c;

    public s(String str, v0 v0Var, kw0.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = v0Var;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return k71.k.b(this.a, sVar.a) && k71.k.b(this.b, sVar.b) && k71.k.b(this.c, sVar.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        kw0.a aVar = this.c;
        return hashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Field2(__typename=");
        sb.append(this.a);
        sb.append(", onProjectV2FieldConfiguration=");
        sb.append(this.b);
        sb.append(", nodeIdFragment=");
        return f1.e.n(sb, this.c, ")");
    }
}
