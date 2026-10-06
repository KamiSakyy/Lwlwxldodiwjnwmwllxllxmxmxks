package yz0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a5 extends o.b {
    public String t;
    public String u;
    public String v;
    public int w;
    public String x;

    public a5(int i, String str, String str2, String str3, String str4) {
        super(str, true);
        this.t = str;
        this.u = str2;
        this.v = str3;
        this.w = i;
        this.x = str4;
    }

    public final String c() {
        return this.t;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a5)) {
            return false;
        }
        a5 a5Var = (a5) obj;
        return k71.k.b(this.t, a5Var.t) && k71.k.b(this.u, a5Var.u) && k71.k.b(this.v, a5Var.v) && this.w == a5Var.w && k71.k.b(this.x, a5Var.x);
    }

    public final int hashCode() {
        return this.x.hashCode() + a0.s0.b(this.w, com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.t.hashCode() * 31, this.u, 31), this.v, 31), 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("WorkflowRun(id=", this.t, ", url=", this.u, ", workflowName=");
        a0.s0.w(this.w, this.v, ", runNumber=", ", checkSuiteID=", o);
        return com.github.rudroid.copilot.h1.p(o, this.x, ")");
    }
}
