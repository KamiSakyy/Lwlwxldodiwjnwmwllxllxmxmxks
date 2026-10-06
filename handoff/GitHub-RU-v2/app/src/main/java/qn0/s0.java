package qn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class s0 {
    public String a;
    public String b;
    public vn0.v c;

    public s0(String str, String str2, vn0.v vVar) {
        this.a = str;
        this.b = str2;
        this.c = vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return k71.k.b(this.a, s0Var.a) && k71.k.b(this.b, s0Var.b) && k71.k.b(this.c, s0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("OnCheckSuite(__typename=", this.a, ", id=", this.b, ", checkSuiteFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
