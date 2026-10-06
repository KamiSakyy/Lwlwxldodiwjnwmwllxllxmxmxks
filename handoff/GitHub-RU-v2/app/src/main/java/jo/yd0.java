package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class yd0 {
    public final String a;
    public final String b;
    public final qx.j c;

    public yd0(String str, String str2, qx.j jVar) {
        this.a = str;
        this.b = str2;
        this.c = jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yd0)) {
            return false;
        }
        yd0 yd0Var = (yd0) obj;
        return k71.k.b(this.a, yd0Var.a) && k71.k.b(this.b, yd0Var.b) && k71.k.b(this.c, yd0Var.c);
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
