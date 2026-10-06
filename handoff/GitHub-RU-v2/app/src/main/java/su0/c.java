package su0;

import a0.s0;
import com.github.rudroid.copilot.h1;
import k71.k;
import uu0.z4;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c {
    public String a;
    public String b;
    public z4 c;

    public c(String str, String str2, z4 z4Var) {
        this.a = str;
        this.b = str2;
        this.c = z4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return k.b(this.a, cVar.a) && k.b(this.b, cVar.b) && k.b(this.c, cVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("Node(__typename=", this.a, ", id=", this.b, ", simpleRepositoryFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
    public Object c(Object p1, Object p2) { return null; }
    public static final Object a = null;
    public static final Object i = null;
}
