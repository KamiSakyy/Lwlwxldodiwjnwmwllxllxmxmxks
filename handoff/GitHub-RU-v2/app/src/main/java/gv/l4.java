package gv;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l4 implements aa.h0 {
    public String a;
    public String b;
    public k4 c;

    public l4(String str, String str2, k4 k4Var) {
        this.a = str;
        this.b = str2;
        this.c = k4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l4)) {
            return false;
        }
        l4 l4Var = (l4) obj;
        return k71.k.b(this.a, l4Var.a) && k71.k.b(this.b, l4Var.b) && k71.k.b(this.c, l4Var.c);
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
