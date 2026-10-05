package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class hc0 {
    public final String a;
    public final String b;
    public final is.a0 c;

    public hc0(String str, String str2, is.a0 a0Var) {
        this.a = str;
        this.b = str2;
        this.c = a0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hc0)) {
            return false;
        }
        hc0 hc0Var = (hc0) obj;
        return k71.k.b(this.a, hc0Var.a) && k71.k.b(this.b, hc0Var.b) && k71.k.b(this.c, hc0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Discussion(__typename=", this.a, ", id=", this.b, ", discussionDetailsFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
