package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class jc {
    public final String a;
    public final kw0.a b;
    public final ar0.p0 c;

    public jc(String str, kw0.a aVar, ar0.p0 p0Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = aVar;
        this.c = p0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jc)) {
            return false;
        }
        jc jcVar = (jc) obj;
        return k71.k.b(this.a, jcVar.a) && k71.k.b(this.b, jcVar.b) && k71.k.b(this.c, jcVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        kw0.a aVar = this.b;
        int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        ar0.p0 p0Var = this.c;
        return hashCode2 + (p0Var != null ? p0Var.hashCode() : 0);
    }

    public final String toString() {
        return "Node(__typename=" + this.a + ", nodeIdFragment=" + this.b + ", discussionFragment=" + this.c + ")";
    }
}
