package rc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c0 {
    public String a;
    public xShadow b;
    public d0 c;
    public wc0.s1 d;

    public c0(String str, xShadow xVar, d0 d0Var, wc0.s1 s1Var) {
        this.a = str;
        this.b = xVar;
        this.c = d0Var;
        this.d = s1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return k71.k.b(this.a, c0Var.a) && k71.k.b(this.b, c0Var.b) && k71.k.b(this.c, c0Var.c) && k71.k.b(this.d, c0Var.d);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        d0 d0Var = this.c;
        return this.d.hashCode() + ((hashCode + (d0Var == null ? 0 : d0Var.hashCode())) * 31);
    }

    public final String toString() {
        return "OnCheckRun(__typename=" + this.a + ", checkSuite=" + this.b + ", steps=" + this.c + ", workFlowCheckRunFragment=" + this.d + ")";
    }
}
