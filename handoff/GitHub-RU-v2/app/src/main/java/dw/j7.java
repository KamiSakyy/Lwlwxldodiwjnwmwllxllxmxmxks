package dw;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j7 {
    public final String a;
    public final String b;
    public final qx.z0 c;

    public j7(String str, String str2, qx.z0 z0Var) {
        this.a = str;
        this.b = str2;
        this.c = z0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j7)) {
            return false;
        }
        j7 j7Var = (j7) obj;
        return k71.k.b(this.a, j7Var.a) && k71.k.b(this.b, j7Var.b) && k71.k.b(this.c, j7Var.c);
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
