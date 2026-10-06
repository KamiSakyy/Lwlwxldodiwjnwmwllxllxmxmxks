package qn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class s1 {
    public String a;
    public String b;
    public vn0.a1 c;

    public s1(String str, String str2, vn0.a1 a1Var) {
        this.a = str;
        this.b = str2;
        this.c = a1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s1)) {
            return false;
        }
        s1 s1Var = (s1) obj;
        return k71.k.b(this.a, s1Var.a) && k71.k.b(this.b, s1Var.b) && k71.k.b(this.c, s1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("OnCommit(__typename=", this.a, ", id=", this.b, ", commitCheckSuitesFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
