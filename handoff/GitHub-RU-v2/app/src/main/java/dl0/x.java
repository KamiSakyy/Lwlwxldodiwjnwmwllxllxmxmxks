package dl0;

import com.github.rudroid.copilot.h1;
import gn0.yv;

/* loaded from: /home/user/work/p/classes4.dex */
public final class x {
    public final String a;
    public final String b;
    public final yv c;
    public final String d;
    public final String e;

    public x(String str, String str2, yv yvVar, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = yvVar;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return k71.k.b(this.a, xVar.a) && k71.k.b(this.b, xVar.b) && this.c == xVar.c && k71.k.b(this.d, xVar.d) && k71.k.b(this.e, xVar.e);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + h1.i(this.a.hashCode() * 31, this.b, 31)) * 31;
        String str = this.d;
        return this.e.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node1(id=", this.a, ", context=", this.b, ", state=");
        o.append(this.c);
        o.append(", description=");
        o.append(this.d);
        o.append(", __typename=");
        return h1.p(o, this.e, ")");
    }
}
