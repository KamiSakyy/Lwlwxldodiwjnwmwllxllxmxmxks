package qo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l0 {
    public final String a;
    public final n0 b;
    public final h0 c;
    public final vo.v d;

    public l0(String str, n0 n0Var, h0 h0Var, vo.v vVar) {
        this.a = str;
        this.b = n0Var;
        this.c = h0Var;
        this.d = vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return k71.k.b(this.a, l0Var.a) && k71.k.b(this.b, l0Var.b) && k71.k.b(this.c, l0Var.c) && k71.k.b(this.d, l0Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        n0 n0Var = this.b;
        int hashCode2 = (hashCode + (n0Var == null ? 0 : n0Var.hashCode())) * 31;
        h0 h0Var = this.c;
        return this.d.hashCode() + ((hashCode2 + (h0Var != null ? h0Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "OnCheckSuite(__typename=" + this.a + ", workflowRun=" + this.b + ", app=" + this.c + ", checkSuiteFragment=" + this.d + ")";
    }
    public Object e(Object p1) { return null; }
}
