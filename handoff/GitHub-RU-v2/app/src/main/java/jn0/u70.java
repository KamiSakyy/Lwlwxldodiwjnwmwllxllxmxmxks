package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class u70 {
    public final String a;
    public final String b;
    public final ap0.y0 c;

    public u70(String str, String str2, ap0.y0 y0Var) {
        k71.k.g(str2, "id");
        this.a = str;
        this.b = str2;
        this.c = y0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u70)) {
            return false;
        }
        u70 u70Var = (u70) obj;
        return k71.k.b(this.a, u70Var.a) && k71.k.b(this.b, u70Var.b) && k71.k.b(this.c, u70Var.c);
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
}
