package dw;

/* loaded from: /home/user/work/p/classes3.dex */
public final class y0 {
    public final String a;
    public final String b;
    public final tz.u4 c;

    public y0(String str, String str2, tz.u4 u4Var) {
        this.a = str;
        this.b = str2;
        this.c = u4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return k71.k.b(this.a, y0Var.a) && k71.k.b(this.b, y0Var.b) && k71.k.b(this.c, y0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Project(__typename=", this.a, ", id=", this.b, ", projectWithFieldsFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
