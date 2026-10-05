package rz;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e1 {
    public final String a;
    public final String b;
    public final f00.g1 c;

    public e1(String str, String str2, f00.g1 g1Var) {
        this.a = str;
        this.b = str2;
        this.c = g1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj;
        return k71.k.b(this.a, e1Var.a) && k71.k.b(this.b, e1Var.b) && k71.k.b(this.c, e1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("ProjectV2Item(__typename=", this.a, ", id=", this.b, ", projectV2ViewItemFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
