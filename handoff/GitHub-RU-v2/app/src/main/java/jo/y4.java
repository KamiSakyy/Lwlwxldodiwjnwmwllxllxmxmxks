package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class y4 {
    public x4 a;
    public String b;
    public String c;

    public y4(x4 x4Var, String str, String str2) {
        this.a = x4Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y4)) {
            return false;
        }
        y4 y4Var = (y4) obj;
        return k71.k.b(this.a, y4Var.a) && k71.k.b(this.b, y4Var.b) && k71.k.b(this.c, y4Var.c);
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
