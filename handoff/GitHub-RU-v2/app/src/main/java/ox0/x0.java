package ox0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class x0 {
    public String a;
    public String b;
    public y0 c;

    public x0(String str, String str2, y0 y0Var) {
        this.a = str;
        this.b = str2;
        this.c = y0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        return k71.k.b(this.a, x0Var.a) && k71.k.b(this.b, x0Var.b) && k71.k.b(this.c, x0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("OnRepository(id=", this.a, ", nameWithOwner=", this.b, ", owner=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
