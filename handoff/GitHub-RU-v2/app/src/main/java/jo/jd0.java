package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class jd0 {
    public String a;
    public String b;
    public fu.a c;

    public jd0(String str, String str2, fu.a aVar) {
        this.a = str;
        this.b = str2;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jd0)) {
            return false;
        }
        jd0 jd0Var = (jd0) obj;
        return k71.k.b(this.a, jd0Var.a) && k71.k.b(this.b, jd0Var.b) && k71.k.b(this.c, jd0Var.c);
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
    public jd0(String p1, String p2, Object p3) {
    }
}
