package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d40 {
    public String a;
    public e40 b;
    public f40 c;
    public vx.a d;

    public d40(String str, e40 e40Var, f40 f40Var, vx.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = e40Var;
        this.c = f40Var;
        this.d = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d40)) {
            return false;
        }
        d40 d40Var = (d40) obj;
        return k71.k.b(this.a, d40Var.a) && k71.k.b(this.b, d40Var.b) && k71.k.b(this.c, d40Var.c) && k71.k.b(this.d, d40Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        e40 e40Var = this.b;
        int hashCode2 = (hashCode + (e40Var == null ? 0 : e40Var.hashCode())) * 31;
        f40 f40Var = this.c;
        int hashCode3 = (hashCode2 + (f40Var == null ? 0 : f40Var.hashCode())) * 31;
        vx.a aVar = this.d;
        return hashCode3 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        return "Node(__typename=" + this.a + ", onIssue=" + this.b + ", onPullRequest=" + this.c + ", nodeIdFragment=" + this.d + ")";
    }
    public d40(String p1, Object p2, Object p3, Object p4) {
    }
}
