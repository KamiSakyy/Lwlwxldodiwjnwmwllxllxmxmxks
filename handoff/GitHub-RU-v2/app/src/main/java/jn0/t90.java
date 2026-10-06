package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class t90 {
    public String a;
    public String b;
    public ar0.a0 c;

    public t90(String str, String str2, ar0.a0 a0Var) {
        this.a = str;
        this.b = str2;
        this.c = a0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t90)) {
            return false;
        }
        t90 t90Var = (t90) obj;
        return k71.k.b(this.a, t90Var.a) && k71.k.b(this.b, t90Var.b) && k71.k.b(this.c, t90Var.c);
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
