package z70;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k5 {
    public j5 a;
    public String b;
    public String c;

    public k5(j5 j5Var, String str, String str2) {
        this.a = j5Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k5)) {
            return false;
        }
        k5 k5Var = (k5) obj;
        return k71.k.b(this.a, k5Var.a) && k71.k.b(this.b, k5Var.b) && k71.k.b(this.c, k5Var.c);
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
