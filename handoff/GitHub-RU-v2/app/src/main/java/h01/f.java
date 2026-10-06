package h01;

import a0.s0;
import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f {
    public final String a;
    public final String b;
    public final int c;

    public f(String str, int i, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return k71.k.b(this.a, fVar.a) && k71.k.b(this.b, fVar.b) && this.c == fVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        return s0.l(s0.o("IssueOrPullRequestPathData(owner=", this.a, ", repository=", this.b, ", number="), this.c, ")");
    }
}
