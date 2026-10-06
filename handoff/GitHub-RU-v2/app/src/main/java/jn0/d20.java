package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d20 {
    public String a;
    public e20 b;
    public f20 c;
    public kw0.a d;

    public d20(String str, e20 e20Var, f20 f20Var, kw0.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = e20Var;
        this.c = f20Var;
        this.d = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d20)) {
            return false;
        }
        d20 d20Var = (d20) obj;
        return k71.k.b(this.a, d20Var.a) && k71.k.b(this.b, d20Var.b) && k71.k.b(this.c, d20Var.c) && k71.k.b(this.d, d20Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        e20 e20Var = this.b;
        int hashCode2 = (hashCode + (e20Var == null ? 0 : e20Var.hashCode())) * 31;
        f20 f20Var = this.c;
        int hashCode3 = (hashCode2 + (f20Var == null ? 0 : f20Var.hashCode())) * 31;
        kw0.a aVar = this.d;
        return hashCode3 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        return "Node(__typename=" + this.a + ", onIssue=" + this.b + ", onPullRequest=" + this.c + ", nodeIdFragment=" + this.d + ")";
    }
}
