package uu0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k4 {
    public String a;
    public String b;
    public ws0.a c;

    public k4(String str, String str2, ws0.a aVar) {
        this.a = str;
        this.b = str2;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k4)) {
            return false;
        }
        k4 k4Var = (k4) obj;
        return k71.k.b(this.a, k4Var.a) && k71.k.b(this.b, k4Var.b) && k71.k.b(this.c, k4Var.c);
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
