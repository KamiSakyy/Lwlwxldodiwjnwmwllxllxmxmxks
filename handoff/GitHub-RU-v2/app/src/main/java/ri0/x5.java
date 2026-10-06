package ri0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class x5 {
    public w5 a;
    public String b;
    public String c;

    public x5(w5 w5Var, String str, String str2) {
        this.a = w5Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x5)) {
            return false;
        }
        x5 x5Var = (x5) obj;
        return k71.k.b(this.a, x5Var.a) && k71.k.b(this.b, x5Var.b) && k71.k.b(this.c, x5Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WorkflowRun(workflow=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
