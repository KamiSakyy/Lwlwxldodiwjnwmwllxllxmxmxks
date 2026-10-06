package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class q40 {
    public String a;
    public String b;
    public u60.a c;

    public q40(String str, String str2, u60.a aVar) {
        this.a = str;
        this.b = str2;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q40)) {
            return false;
        }
        q40 q40Var = (q40) obj;
        return k71.k.b(this.a, q40Var.a) && k71.k.b(this.b, q40Var.b) && k71.k.b(this.c, q40Var.c);
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
