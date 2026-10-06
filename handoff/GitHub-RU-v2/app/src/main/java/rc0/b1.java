package rc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b1 {
    public String a;
    public gn0.r2 b;
    public gn0.l2 c;
    public int d;
    public boolean e;
    public u0 f;
    public f1Shadow g;
    public x0 h;
    public c1 i;
    public d1 j;
    public y0 k;
    public e1 l;

    public b1(String str, gn0.r2 r2Var, gn0.l2 l2Var, int i, boolean z, u0 u0Var, f1Shadow f1Var, x0 x0Var, c1 c1Var, d1 d1Var, y0 y0Var, e1 e1Var) {
        this.a = str;
        this.b = r2Var;
        this.c = l2Var;
        this.d = i;
        this.e = z;
        this.f = u0Var;
        this.g = f1Var;
        this.h = x0Var;
        this.i = c1Var;
        this.j = d1Var;
        this.k = y0Var;
        this.l = e1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj;
        return k71.k.b(this.a, b1Var.a) && this.b == b1Var.b && this.c == b1Var.c && this.d == b1Var.d && this.e == b1Var.e && k71.k.b(this.f, b1Var.f) && k71.k.b(this.g, b1Var.g) && k71.k.b(this.h, b1Var.h) && k71.k.b(this.i, b1Var.i) && k71.k.b(this.j, b1Var.j) && k71.k.b(this.k, b1Var.k) && k71.k.b(this.l, b1Var.l);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        gn0.l2 l2Var = this.c;
        int e = x.i.e(a0.s0.b(this.d, (hashCode + (l2Var == null ? 0 : l2Var.hashCode())) * 31, 31), 31, this.e);
        u0 u0Var = this.f;
        int hashCode2 = (e + (u0Var == null ? 0 : Integer.hashCode(u0Var.a))) * 31;
        f1Shadow f1Var = this.g;
        int hashCode3 = (hashCode2 + (f1Var == null ? 0 : f1Var.hashCode())) * 31;
        x0 x0Var = this.h;
        int hashCode4 = (hashCode3 + (x0Var == null ? 0 : x0Var.hashCode())) * 31;
        c1 c1Var = this.i;
        int hashCode5 = (hashCode4 + (c1Var == null ? 0 : Integer.hashCode(c1Var.a))) * 31;
        d1 d1Var = this.j;
        int hashCode6 = (hashCode5 + (d1Var == null ? 0 : Integer.hashCode(d1Var.a))) * 31;
        y0 y0Var = this.k;
        int hashCode7 = (hashCode6 + (y0Var == null ? 0 : Integer.hashCode(y0Var.a))) * 31;
        e1 e1Var = this.l;
        return hashCode7 + (e1Var != null ? Integer.hashCode(e1Var.a) : 0);
    }

    public final String toString() {
        return "OnCheckSuite(id=" + this.a + ", status=" + this.b + ", conclusion=" + this.c + ", duration=" + this.d + ", rerunnable=" + this.e + ", artifacts=" + this.f + ", workflowRun=" + this.g + ", failedCheckRuns=" + this.h + ", runningCheckRuns=" + this.i + ", skippedCheckRuns=" + this.j + ", neutralCheckRuns=" + this.k + ", successfulCheckRuns=" + this.l + ")";
    }
}
