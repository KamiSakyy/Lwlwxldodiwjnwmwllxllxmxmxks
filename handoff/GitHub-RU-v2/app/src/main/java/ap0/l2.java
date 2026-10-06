package ap0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l2 {
    public String a;
    public String b;
    public g3 c;

    public l2(String str, String str2, g3 g3Var) {
        this.a = str;
        this.b = str2;
        this.c = g3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l2)) {
            return false;
        }
        l2 l2Var = (l2) obj;
        return k71.k.b(this.a, l2Var.a) && k71.k.b(this.b, l2Var.b) && k71.k.b(this.c, l2Var.c);
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
