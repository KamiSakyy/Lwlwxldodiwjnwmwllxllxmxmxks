package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r5 {
    public String a;
    public String b;
    public we0.l1 c;

    public r5(String str, String str2, we0.l1 l1Var) {
        this.a = str;
        this.b = str2;
        this.c = l1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r5)) {
            return false;
        }
        r5 r5Var = (r5) obj;
        return k71.k.b(this.a, r5Var.a) && k71.k.b(this.b, r5Var.b) && k71.k.b(this.c, r5Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Commit(__typename=", this.a, ", id=", this.b, ", commitFields=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
