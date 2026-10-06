package zx;

import gv.l4;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w1 {
    public String a;
    public String b;
    public l4 c;

    public w1(String str, String str2, l4 l4Var) {
        this.a = str;
        this.b = str2;
        this.c = l4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w1)) {
            return false;
        }
        w1 w1Var = (w1) obj;
        return k71.k.b(this.a, w1Var.a) && k71.k.b(this.b, w1Var.b) && k71.k.b(this.c, w1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("OnPullRequest(__typename=", this.a, ", id=", this.b, ", pullRequestTimelineFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
