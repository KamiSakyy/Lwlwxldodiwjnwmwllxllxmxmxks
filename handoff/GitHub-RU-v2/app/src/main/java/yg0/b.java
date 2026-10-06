package yg0;

import a0.s0;
import com.github.rudroid.copilot.h1;
import mg0.g0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b {
    public String a;
    public String b;
    public g0 c;

    public b(String str, String str2, g0 g0Var) {
        this.a = str;
        this.b = str2;
        this.c = g0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return k71.k.b(this.a, bVar.a) && k71.k.b(this.b, bVar.b) && k71.k.b(this.c, bVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("Node1(__typename=", this.a, ", id=", this.b, ", linkedIssueFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
