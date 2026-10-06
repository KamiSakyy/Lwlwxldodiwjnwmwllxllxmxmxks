package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n5 {
    public String a;
    public s5 b;
    public ja0.a c;

    public n5(String str, s5 s5Var, ja0.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = s5Var;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n5)) {
            return false;
        }
        n5 n5Var = (n5) obj;
        return k71.k.b(this.a, n5Var.a) && k71.k.b(this.b, n5Var.b) && k71.k.b(this.c, n5Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        s5 s5Var = this.b;
        int hashCode2 = (hashCode + (s5Var == null ? 0 : s5Var.hashCode())) * 31;
        ja0.a aVar = this.c;
        return hashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GitObject(__typename=");
        sb.append(this.a);
        sb.append(", onCommit=");
        sb.append(this.b);
        sb.append(", nodeIdFragment=");
        return no.a.p(sb, this.c, ")");
    }
}
