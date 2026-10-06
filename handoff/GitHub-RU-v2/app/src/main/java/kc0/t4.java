package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class t4 {
    public String a;
    public String b;
    public mg0.k0 c;

    public t4(String str, String str2, mg0.k0 k0Var) {
        k71.k.g(str, "__typename");
        k71.k.g(str2, "id");
        this.a = str;
        this.b = str2;
        this.c = k0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t4)) {
            return false;
        }
        t4 t4Var = (t4) obj;
        return k71.k.b(this.a, t4Var.a) && k71.k.b(this.b, t4Var.b) && k71.k.b(this.c, t4Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Issue(__typename=", this.a, ", id=", this.b, ", updateIssueStateFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
