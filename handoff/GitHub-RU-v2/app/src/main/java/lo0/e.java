package lo0;

import a0.s0;
import com.github.rudroid.copilot.h1;
import iy0.e1;

/* loaded from: /home/user/work/p/classes4.dex */
public class e {
    public String a;
    public String b;
    public e1 c;

    public e(String str, String str2, e1 e1Var) {
        this.a = str;
        this.b = str2;
        this.c = e1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return k71.k.b(this.a, eVar.a) && k71.k.b(this.b, eVar.b) && k71.k.b(this.c, eVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("Node2(__typename=", this.a, ", id=", this.b, ", projectV2ViewItemFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
    public static Object i(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
    public static Object z(Object p1, Object p2, Object p3) { return null; }
}
