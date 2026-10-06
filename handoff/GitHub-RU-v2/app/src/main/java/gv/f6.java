package gv;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f6 {
    public e6 a;
    public String b;
    public String c;

    public f6(e6 e6Var, String str, String str2) {
        this.a = e6Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f6)) {
            return false;
        }
        f6 f6Var = (f6) obj;
        return k71.k.b(this.a, f6Var.a) && k71.k.b(this.b, f6Var.b) && k71.k.b(this.c, f6Var.c);
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
