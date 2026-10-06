package rc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m1 {
    public String a;
    public String b;
    public j1 c;
    public n1 d;
    public h1 e;
    public wc0.v f;

    public m1(String str, String str2, j1 j1Var, n1 n1Var, h1 h1Var, wc0.v vVar) {
        this.a = str;
        this.b = str2;
        this.c = j1Var;
        this.d = n1Var;
        this.e = h1Var;
        this.f = vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1)) {
            return false;
        }
        m1 m1Var = (m1) obj;
        return k71.k.b(this.a, m1Var.a) && k71.k.b(this.b, m1Var.b) && k71.k.b(this.c, m1Var.c) && k71.k.b(this.d, m1Var.d) && k71.k.b(this.e, m1Var.e) && k71.k.b(this.f, m1Var.f);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        j1 j1Var = this.c;
        int hashCode = (i + (j1Var == null ? 0 : j1Var.hashCode())) * 31;
        n1 n1Var = this.d;
        int hashCode2 = (hashCode + (n1Var == null ? 0 : n1Var.hashCode())) * 31;
        h1 h1Var = this.e;
        return this.f.hashCode() + ((hashCode2 + (h1Var != null ? h1Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("OnCheckSuite(__typename=", this.a, ", id=", this.b, ", creator=");
        o.append(this.c);
        o.append(", workflowRun=");
        o.append(this.d);
        o.append(", app=");
        o.append(this.e);
        o.append(", checkSuiteFragment=");
        o.append(this.f);
        o.append(")");
        return o.toString();
    }
}
