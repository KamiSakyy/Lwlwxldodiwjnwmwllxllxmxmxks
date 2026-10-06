package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f60 {
    public String a;
    public String b;
    public u60.a c;

    public f60(String str, String str2, u60.a aVar) {
        this.a = str;
        this.b = str2;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f60)) {
            return false;
        }
        f60 f60Var = (f60) obj;
        return k71.k.b(this.a, f60Var.a) && k71.k.b(this.b, f60Var.b) && k71.k.b(this.c, f60Var.c);
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
    public f60(String p1, String p2, Object p3) {
    }
}
