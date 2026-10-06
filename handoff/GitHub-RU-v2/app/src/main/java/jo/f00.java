package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f00 {
    public final String a;
    public final String b;
    public final qx.c1 c;

    public f00(String str, String str2, qx.c1 c1Var) {
        this.a = str;
        this.b = str2;
        this.c = c1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f00)) {
            return false;
        }
        f00 f00Var = (f00) obj;
        return k71.k.b(this.a, f00Var.a) && k71.k.b(this.b, f00Var.b) && k71.k.b(this.c, f00Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", userListItemFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
