package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b9 {
    public final String a;
    public final String b;
    public final int c;
    public final a9 d;
    public final y8 e;
    public final String f;

    public b9(String str, String str2, int i, a9 a9Var, y8 y8Var, String str3) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = a9Var;
        this.e = y8Var;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b9)) {
            return false;
        }
        b9 b9Var = (b9) obj;
        return k71.k.b(this.a, b9Var.a) && k71.k.b(this.b, b9Var.b) && this.c == b9Var.c && k71.k.b(this.d, b9Var.d) && k71.k.b(this.e, b9Var.e) && k71.k.b(this.f, b9Var.f);
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
