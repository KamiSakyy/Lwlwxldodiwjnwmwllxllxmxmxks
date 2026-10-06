package vo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k2 {
    public String a;
    public String b;
    public z2 c;

    public k2(String str, String str2, z2 z2Var) {
        this.a = str;
        this.b = str2;
        this.c = z2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k2)) {
            return false;
        }
        k2 k2Var = (k2) obj;
        return k71.k.b(this.a, k2Var.a) && k71.k.b(this.b, k2Var.b) && k71.k.b(this.c, k2Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", workflowRunFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
