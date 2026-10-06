package ct;

import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j0 implements aa.h0 {
    public final String a;
    public final String b;
    public final i0 c;

    public j0(String str, String str2, i0 i0Var) {
        this.a = str;
        this.b = str2;
        this.c = i0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return k71.k.b(this.a, j0Var.a) && k71.k.b(this.b, j0Var.b) && k71.k.b(this.c, j0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("IssueTimelineFragment(__typename=", this.a, ", id=", this.b, ", timelineItems=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
