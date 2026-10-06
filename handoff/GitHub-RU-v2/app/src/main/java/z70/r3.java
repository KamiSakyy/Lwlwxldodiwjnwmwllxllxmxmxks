package z70;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r3 implements aa.h0 {
    public final String a;
    public final String b;
    public final q3 c;

    public r3(String str, String str2, q3 q3Var) {
        this.a = str;
        this.b = str2;
        this.c = q3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r3)) {
            return false;
        }
        r3 r3Var = (r3) obj;
        return k71.k.b(this.a, r3Var.a) && k71.k.b(this.b, r3Var.b) && k71.k.b(this.c, r3Var.c);
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
