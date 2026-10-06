package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j9 {
    public String a;
    public String b;
    public int c;
    public i9 d;
    public g9 e;
    public String f;

    public j9(String str, String str2, int i, i9 i9Var, g9 g9Var, String str3) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i9Var;
        this.e = g9Var;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j9)) {
            return false;
        }
        j9 j9Var = (j9) obj;
        return k71.k.b(this.a, j9Var.a) && k71.k.b(this.b, j9Var.b) && this.c == j9Var.c && k71.k.b(this.d, j9Var.d) && k71.k.b(this.e, j9Var.e) && k71.k.b(this.f, j9Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + a0.s0.b(this.c, com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("WorkflowRun(id=", this.a, ", url=", this.b, ", runNumber=");
        o.append(this.c);
        o.append(", workflow=");
        o.append(this.d);
        o.append(", pendingDeploymentRequests=");
        o.append(this.e);
        o.append(", __typename=");
        o.append(this.f);
        o.append(")");
        return o.toString();
    }
}
