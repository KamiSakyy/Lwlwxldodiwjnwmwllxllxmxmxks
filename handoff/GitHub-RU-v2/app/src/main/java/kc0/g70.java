package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g70 {
    public String a;
    public String b;
    public wk0.j c;

    public g70(String str, String str2, wk0.j jVar) {
        this.a = str;
        this.b = str2;
        this.c = jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g70)) {
            return false;
        }
        g70 g70Var = (g70) obj;
        return k71.k.b(this.a, g70Var.a) && k71.k.b(this.b, g70Var.b) && k71.k.b(this.c, g70Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("User(__typename=", this.a, ", id=", this.b, ", homePinnedItems=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
