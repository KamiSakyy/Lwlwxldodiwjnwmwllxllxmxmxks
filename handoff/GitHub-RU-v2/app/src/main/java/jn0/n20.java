package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class n20 {
    public final String a;
    public final p20 b;
    public final q20 c;
    public final kw0.a d;

    public n20(String str, p20 p20Var, q20 q20Var, kw0.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = p20Var;
        this.c = q20Var;
        this.d = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n20)) {
            return false;
        }
        n20 n20Var = (n20) obj;
        return k71.k.b(this.a, n20Var.a) && k71.k.b(this.b, n20Var.b) && k71.k.b(this.c, n20Var.c) && k71.k.b(this.d, n20Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        p20 p20Var = this.b;
        int hashCode2 = (hashCode + (p20Var == null ? 0 : p20Var.hashCode())) * 31;
        q20 q20Var = this.c;
        int hashCode3 = (hashCode2 + (q20Var == null ? 0 : q20Var.hashCode())) * 31;
        kw0.a aVar = this.d;
        return hashCode3 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        return "Node1(__typename=" + this.a + ", onIssue=" + this.b + ", onPullRequest=" + this.c + ", nodeIdFragment=" + this.d + ")";
    }
}
