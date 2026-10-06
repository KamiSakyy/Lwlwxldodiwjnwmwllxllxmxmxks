package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p4 {
    public o4 a;
    public String b;
    public String c;

    public p4(o4 o4Var, String str, String str2) {
        this.a = o4Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p4)) {
            return false;
        }
        p4 p4Var = (p4) obj;
        return k71.k.b(this.a, p4Var.a) && k71.k.b(this.b, p4Var.b) && k71.k.b(this.c, p4Var.c);
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
