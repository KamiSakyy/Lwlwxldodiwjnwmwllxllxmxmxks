package ss0;

import a0.s0;
import com.github.rudroid.copilot.h1;
import xt0.p2;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f {
    public String a;
    public String b;
    public p2 c;

    public f(String str, String str2, p2 p2Var) {
        this.a = str;
        this.b = str2;
        this.c = p2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return k71.k.b(this.a, fVar.a) && k71.k.b(this.b, fVar.b) && k71.k.b(this.c, fVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("PullRequest(__typename=", this.a, ", id=", this.b, ", pullRequestItemFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
