package zx;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n {
    public String a;
    public String b;
    public dw.e1 c;
    public dw.c d;

    public n(String str, String str2, dw.e1 e1Var, dw.c cVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = e1Var;
        this.d = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return k71.k.b(this.a, nVar.a) && k71.k.b(this.b, nVar.b) && k71.k.b(this.c, nVar.c) && k71.k.b(this.d, nVar.d);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        dw.e1 e1Var = this.c;
        int hashCode = (i + (e1Var == null ? 0 : e1Var.hashCode())) * 31;
        dw.c cVar = this.d;
        return hashCode + (cVar != null ? cVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", pullRequestV2ItemsFragment=");
        o.append(this.c);
        o.append(", issueProjectV2ItemsFragment=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
}
