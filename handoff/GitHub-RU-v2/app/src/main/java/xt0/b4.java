package xt0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b4 implements aa.h0 {
    public final String a;
    public final String b;
    public final a4 c;

    public b4(String str, String str2, a4 a4Var) {
        this.a = str;
        this.b = str2;
        this.c = a4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b4)) {
            return false;
        }
        b4 b4Var = (b4) obj;
        return k71.k.b(this.a, b4Var.a) && k71.k.b(this.b, b4Var.b) && k71.k.b(this.c, b4Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("PullRequestTimelineFragment(__typename=", this.a, ", id=", this.b, ", timelineItems=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
