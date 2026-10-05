package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ua0 {
    public final String a;
    public final String b;
    public final w80.q3 c;

    public ua0(String str, String str2, w80.q3 q3Var) {
        this.a = str;
        this.b = str2;
        this.c = q3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ua0)) {
            return false;
        }
        ua0 ua0Var = (ua0) obj;
        return k71.k.b(this.a, ua0Var.a) && k71.k.b(this.b, ua0Var.b) && k71.k.b(this.c, ua0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", simpleRepositoryFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
