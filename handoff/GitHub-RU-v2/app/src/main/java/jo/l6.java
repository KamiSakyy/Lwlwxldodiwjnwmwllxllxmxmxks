package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l6 {
    public String a;
    public q6 b;
    public vx.a c;

    public l6(String str, q6 q6Var, vx.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = q6Var;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l6)) {
            return false;
        }
        l6 l6Var = (l6) obj;
        return k71.k.b(this.a, l6Var.a) && k71.k.b(this.b, l6Var.b) && k71.k.b(this.c, l6Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        q6 q6Var = this.b;
        int hashCode2 = (hashCode + (q6Var == null ? 0 : q6Var.hashCode())) * 31;
        vx.a aVar = this.c;
        return hashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GitObject(__typename=");
        sb.append(this.a);
        sb.append(", onCommit=");
        sb.append(this.b);
        sb.append(", nodeIdFragment=");
        return f4.r(sb, this.c, ")");
    }
}
