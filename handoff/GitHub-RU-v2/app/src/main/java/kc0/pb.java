package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class pb {
    public final String a;
    public final bl0.a b;
    public final uf0.p0 c;

    public pb(String str, bl0.a aVar, uf0.p0 p0Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = aVar;
        this.c = p0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pb)) {
            return false;
        }
        pb pbVar = (pb) obj;
        return k71.k.b(this.a, pbVar.a) && k71.k.b(this.b, pbVar.b) && k71.k.b(this.c, pbVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        bl0.a aVar = this.b;
        int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        uf0.p0 p0Var = this.c;
        return hashCode2 + (p0Var != null ? p0Var.hashCode() : 0);
    }

    public final String toString() {
        return "Node(__typename=" + this.a + ", nodeIdFragment=" + this.b + ", discussionFragment=" + this.c + ")";
    }
}
