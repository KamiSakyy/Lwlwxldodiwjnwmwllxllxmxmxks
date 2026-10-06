package ox0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b0 {
    public String a;
    public String b;
    public int c;
    public q0 d;
    public b e;

    public b0(String str, String str2, int i, q0 q0Var, b bVar) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = q0Var;
        this.e = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return k71.k.b(this.a, b0Var.a) && k71.k.b(this.b, b0Var.b) && this.c == b0Var.c && k71.k.b(this.d, b0Var.d) && k71.k.b(this.e, b0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + a0.s0.b(this.c, com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("OnWorkflowRun(id=", this.a, ", url=", this.b, ", runNumber=");
        o.append(this.c);
        o.append(", workflow=");
        o.append(this.d);
        o.append(", checkSuite=");
        o.append(this.e);
        o.append(")");
        return o.toString();
    }
}
