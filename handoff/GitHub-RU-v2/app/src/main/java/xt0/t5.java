package xt0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class t5 {
    public s5 a;
    public String b;
    public String c;

    public t5(s5 s5Var, String str, String str2) {
        this.a = s5Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t5)) {
            return false;
        }
        t5 t5Var = (t5) obj;
        return k71.k.b(this.a, t5Var.a) && k71.k.b(this.b, t5Var.b) && k71.k.b(this.c, t5Var.c);
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
