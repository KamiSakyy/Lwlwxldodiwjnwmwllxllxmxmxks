package oj0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c3 {
    public String a;
    public String b;
    public mh0.a c;

    public c3(String str, String str2, mh0.a aVar) {
        this.a = str;
        this.b = str2;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c3)) {
            return false;
        }
        c3 c3Var = (c3) obj;
        return k71.k.b(this.a, c3Var.a) && k71.k.b(this.b, c3Var.b) && k71.k.b(this.c, c3Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Milestone(__typename=", this.a, ", id=", this.b, ", milestoneFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
