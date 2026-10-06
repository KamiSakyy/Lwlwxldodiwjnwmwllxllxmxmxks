package qn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class n0 {
    public String a;
    public m0 b;
    public String c;

    public n0(String str, m0 m0Var, String str2) {
        this.a = str;
        this.b = m0Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return k71.k.b(this.a, n0Var.a) && k71.k.b(this.b, n0Var.b) && k71.k.b(this.c, n0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WorkflowRun(id=");
        sb.append(this.a);
        sb.append(", workflow=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
