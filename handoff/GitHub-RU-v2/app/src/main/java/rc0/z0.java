package rc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class z0 {
    public final String a;
    public final String b;
    public final wc0.s1 c;

    public z0(String str, String str2, wc0.s1 s1Var) {
        this.a = str;
        this.b = str2;
        this.c = s1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj;
        return k71.k.b(this.a, z0Var.a) && k71.k.b(this.b, z0Var.b) && k71.k.b(this.c, z0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node1(__typename=", this.a, ", id=", this.b, ", workFlowCheckRunFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
