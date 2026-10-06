package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ha0 {
    public String a;
    public String b;
    public cq.g1 c;

    public ha0(String str, String str2, cq.g1 g1Var) {
        k71.k.g(str2, "id");
        this.a = str;
        this.b = str2;
        this.c = g1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ha0)) {
            return false;
        }
        ha0 ha0Var = (ha0) obj;
        return k71.k.b(this.a, ha0Var.a) && k71.k.b(this.b, ha0Var.b) && k71.k.b(this.c, ha0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("User(__typename=", this.a, ", id=", this.b, ", followUserFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
    public ha0(String p1, String p2, Object p3) {
    }
}
