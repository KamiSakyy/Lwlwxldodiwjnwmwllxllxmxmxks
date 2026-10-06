package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class uh0 {
    public String a;
    public String b;
    public qx.z0 c;

    public uh0(String str, String str2, qx.z0 z0Var) {
        this.a = str;
        this.b = str2;
        this.c = z0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uh0)) {
            return false;
        }
        uh0 uh0Var = (uh0) obj;
        return k71.k.b(this.a, uh0Var.a) && k71.k.b(this.b, uh0Var.b) && k71.k.b(this.c, uh0Var.c);
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
