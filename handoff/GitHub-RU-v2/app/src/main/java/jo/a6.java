package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a6 {
    public String a;
    public vx.a b;
    public er.b0 c;

    public a6(String str, vx.a aVar, er.b0 b0Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = aVar;
        this.c = b0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a6)) {
            return false;
        }
        a6 a6Var = (a6) obj;
        return k71.k.b(this.a, a6Var.a) && k71.k.b(this.b, a6Var.b) && k71.k.b(this.c, a6Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        vx.a aVar = this.b;
        int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        er.b0 b0Var = this.c;
        return hashCode2 + (b0Var != null ? b0Var.hashCode() : 0);
    }

    public final String toString() {
        return "GitObject(__typename=" + this.a + ", nodeIdFragment=" + this.b + ", commitDetailFields=" + this.c + ")";
    }
}
