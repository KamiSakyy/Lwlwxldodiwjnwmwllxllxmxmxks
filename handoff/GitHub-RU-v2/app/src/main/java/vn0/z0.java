package vn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class z0 {
    public String a;
    public y0 b;
    public String c;

    public z0(String str, y0 y0Var, String str2) {
        this.a = str;
        this.b = y0Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj;
        return k71.k.b(this.a, z0Var.a) && k71.k.b(this.b, z0Var.b) && k71.k.b(this.c, z0Var.c);
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
