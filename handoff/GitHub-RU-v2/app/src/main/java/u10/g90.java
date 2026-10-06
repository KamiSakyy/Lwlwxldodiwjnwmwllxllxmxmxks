package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g90 {
    public String a;
    public String b;
    public ea0.z0 c;

    public g90(String str, String str2, ea0.z0 z0Var) {
        this.a = str;
        this.b = str2;
        this.c = z0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g90)) {
            return false;
        }
        g90 g90Var = (g90) obj;
        return k71.k.b(this.a, g90Var.a) && k71.k.b(this.b, g90Var.b) && k71.k.b(this.c, g90Var.c);
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
    public g90(String p1, String p2, Object p3) {
    }
}
