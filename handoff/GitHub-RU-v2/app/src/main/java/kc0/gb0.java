package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class gb0 {
    public String a;
    public String b;
    public wk0.z0 c;

    public gb0(String str, String str2, wk0.z0 z0Var) {
        this.a = str;
        this.b = str2;
        this.c = z0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gb0)) {
            return false;
        }
        gb0 gb0Var = (gb0) obj;
        return k71.k.b(this.a, gb0Var.a) && k71.k.b(this.b, gb0Var.b) && k71.k.b(this.c, gb0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", userListFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
