package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n40 {
    public String a;
    public p40 b;
    public q40 c;
    public vx.a d;

    public n40(String str, p40 p40Var, q40 q40Var, vx.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = p40Var;
        this.c = q40Var;
        this.d = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n40)) {
            return false;
        }
        n40 n40Var = (n40) obj;
        return k71.k.b(this.a, n40Var.a) && k71.k.b(this.b, n40Var.b) && k71.k.b(this.c, n40Var.c) && k71.k.b(this.d, n40Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        p40 p40Var = this.b;
        int hashCode2 = (hashCode + (p40Var == null ? 0 : p40Var.hashCode())) * 31;
        q40 q40Var = this.c;
        int hashCode3 = (hashCode2 + (q40Var == null ? 0 : q40Var.hashCode())) * 31;
        vx.a aVar = this.d;
        return hashCode3 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        return "Node1(__typename=" + this.a + ", onIssue=" + this.b + ", onPullRequest=" + this.c + ", nodeIdFragment=" + this.d + ")";
    }
}
