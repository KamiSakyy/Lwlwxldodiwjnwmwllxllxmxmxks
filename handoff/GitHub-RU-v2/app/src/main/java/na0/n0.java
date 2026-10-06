package na0;

import com.github.rudroid.copilot.h1;
import z70.r3;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n0 {
    public final String a;
    public final String b;
    public final r3 c;

    public n0(String str, String str2, r3 r3Var) {
        this.a = str;
        this.b = str2;
        this.c = r3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return k71.k.b(this.a, n0Var.a) && k71.k.b(this.b, n0Var.b) && k71.k.b(this.c, n0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("OnPullRequest(__typename=", this.a, ", id=", this.b, ", pullRequestTimelineFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
