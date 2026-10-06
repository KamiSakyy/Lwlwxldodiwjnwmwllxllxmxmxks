package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class x2 {
    public String a;
    public String b;
    public wk0.c1 c;

    public x2(String str, String str2, wk0.c1 c1Var) {
        this.a = str;
        this.b = str2;
        this.c = c1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x2)) {
            return false;
        }
        x2 x2Var = (x2) obj;
        return k71.k.b(this.a, x2Var.a) && k71.k.b(this.b, x2Var.b) && k71.k.b(this.c, x2Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Viewer(__typename=", this.a, ", id=", this.b, ", userListItemFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
