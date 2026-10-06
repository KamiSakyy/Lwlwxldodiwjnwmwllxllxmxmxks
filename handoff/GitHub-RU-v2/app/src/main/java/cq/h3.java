package cq;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h3 {
    public String a;
    public String b;
    public c4 c;

    public h3(String str, String str2, c4 c4Var) {
        this.a = str;
        this.b = str2;
        this.c = c4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h3)) {
            return false;
        }
        h3 h3Var = (h3) obj;
        return k71.k.b(this.a, h3Var.a) && k71.k.b(this.b, h3Var.b) && k71.k.b(this.c, h3Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Release(__typename=", this.a, ", id=", this.b, ", releaseFeedFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
