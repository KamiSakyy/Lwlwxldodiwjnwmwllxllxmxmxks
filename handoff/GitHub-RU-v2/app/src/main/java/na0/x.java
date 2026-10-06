package na0;

import com.github.rudroid.copilot.h1;
import hc0.uu;

/* loaded from: /home/user/work/p/classes3.dex */
public final class xShadow {
    public String a;
    public String b;
    public uu c;
    public String d;
    public String e;

    public x(String str, String str2, uu uuVar, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = uuVar;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xShadow)) {
            return false;
        }
        xShadow xVar = (xShadow) obj;
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
