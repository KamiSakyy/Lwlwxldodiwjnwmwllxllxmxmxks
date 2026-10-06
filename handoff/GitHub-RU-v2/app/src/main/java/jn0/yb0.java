package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class yb0 {
    public String a;
    public kw0.a b;
    public au0.d c;

    public yb0(String str, kw0.a aVar, au0.d dVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = aVar;
        this.c = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yb0)) {
            return false;
        }
        yb0 yb0Var = (yb0) obj;
        return k71.k.b(this.a, yb0Var.a) && k71.k.b(this.b, yb0Var.b) && k71.k.b(this.c, yb0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        kw0.a aVar = this.b;
        int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        au0.d dVar = this.c;
        return hashCode2 + (dVar != null ? dVar.hashCode() : 0);
    }

    public final String toString() {
        return "Node(__typename=" + this.a + ", nodeIdFragment=" + this.b + ", pullRequestCommitFields=" + this.c + ")";
    }
}
