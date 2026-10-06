package m10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m0 {
    public final aa1.b a;
    public final String b;
    public final aa1.b c;
    public final aa1.b d;
    public final aa1.b e;

    public m0(aa.u0 u0Var, aa1.b bVar, String str) {
        k71.k.g(str, "issueId");
        aa.t0 t0Var = aa.t0.d;
        this.a = t0Var;
        this.b = str;
        this.c = bVar;
        this.d = u0Var;
        this.e = t0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return k71.k.b(this.a, m0Var.a) && k71.k.b(this.b, m0Var.b) && k71.k.b(this.c, m0Var.c) && k71.k.b(this.d, m0Var.d) && k71.k.b(this.e, m0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + f1.e.a(this.d, f1.e.a(this.c, com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AddSubIssueInput(clientMutationId=");
        sb.append(this.a);
        sb.append(", issueId=");
        sb.append(this.b);
        sb.append(", replaceParent=");
        f1.e.w(sb, this.c, ", subIssueId=", this.d, ", subIssueUrl=");
        return f1.e.k(sb, this.e, ")");
    }

    public Object e;
    public Object c(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
}
