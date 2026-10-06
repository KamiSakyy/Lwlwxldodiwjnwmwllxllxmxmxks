package ap0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o3 {
    public String a;
    public q3 b;
    public kw0.a c;

    public o3(String str, q3 q3Var, kw0.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = q3Var;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o3)) {
            return false;
        }
        o3 o3Var = (o3) obj;
        return k71.k.b(this.a, o3Var.a) && k71.k.b(this.b, o3Var.b) && k71.k.b(this.c, o3Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        q3 q3Var = this.b;
        int hashCode2 = (hashCode + (q3Var == null ? 0 : q3Var.hashCode())) * 31;
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
