package wc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k {
    public String a;
    public String b;
    public s1 c;

    public k(String str, String str2, s1 s1Var) {
        this.a = str;
        this.b = str2;
        this.c = s1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return k71.k.b(this.a, kVar.a) && k71.k.b(this.b, kVar.b) && k71.k.b(this.c, kVar.c);
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
