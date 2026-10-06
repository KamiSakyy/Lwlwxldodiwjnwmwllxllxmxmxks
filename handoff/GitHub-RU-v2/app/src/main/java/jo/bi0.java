package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class bi0 {
    public String a;
    public String b;
    public qx.t1 c;

    public bi0(String str, String str2, qx.t1 t1Var) {
        this.a = str;
        this.b = str2;
        this.c = t1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bi0)) {
            return false;
        }
        bi0 bi0Var = (bi0) obj;
        return k71.k.b(this.a, bi0Var.a) && k71.k.b(this.b, bi0Var.b) && k71.k.b(this.c, bi0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("User(__typename=", this.a, ", id=", this.b, ", userProfileFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
    public bi0(String p1, String p2, Object p3) {
    }
}
