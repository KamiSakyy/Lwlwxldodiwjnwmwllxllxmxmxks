package i60;

import a0.s0;
import com.github.rudroid.copilot.h1;
import w50.e0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b {
    public final String a;
    public final String b;
    public final e0 c;

    public b(String str, String str2, e0 e0Var) {
        this.a = str;
        this.b = str2;
        this.c = e0Var;
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
