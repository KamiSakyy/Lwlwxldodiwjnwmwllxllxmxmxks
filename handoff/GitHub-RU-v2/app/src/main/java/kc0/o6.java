package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o6 {
    public final String a;
    public final String b;
    public final uf0.p0 c;

    public o6(String str, String str2, uf0.p0 p0Var) {
        this.a = str;
        this.b = str2;
        this.c = p0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o6)) {
            return false;
        }
        o6 o6Var = (o6) obj;
        return k71.k.b(this.a, o6Var.a) && k71.k.b(this.b, o6Var.b) && k71.k.b(this.c, o6Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Discussion(__typename=", this.a, ", id=", this.b, ", discussionFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
