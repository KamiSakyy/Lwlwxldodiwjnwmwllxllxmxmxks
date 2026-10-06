package rt;

import a0.s0;
import com.github.rudroid.copilot.h1;
import gv.e2;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l {
    public String a;
    public String b;
    public e2 c;

    public l(String str, String str2, e2 e2Var) {
        this.a = str;
        this.b = str2;
        this.c = e2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return k71.k.b(this.a, lVar.a) && k71.k.b(this.b, lVar.b) && k71.k.b(this.c, lVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("Node1(__typename=", this.a, ", id=", this.b, ", linkedPullRequestFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
