package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class gd {
    public final String a;
    public final vx.a b;
    public final is.p0 c;

    public gd(String str, vx.a aVar, is.p0 p0Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = aVar;
        this.c = p0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gd)) {
            return false;
        }
        gd gdVar = (gd) obj;
        return k71.k.b(this.a, gdVar.a) && k71.k.b(this.b, gdVar.b) && k71.k.b(this.c, gdVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        vx.a aVar = this.b;
        int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        is.p0 p0Var = this.c;
        return hashCode2 + (p0Var != null ? p0Var.hashCode() : 0);
    }

    public final String toString() {
        return "Node(__typename=" + this.a + ", nodeIdFragment=" + this.b + ", discussionFragment=" + this.c + ")";
    }
}
