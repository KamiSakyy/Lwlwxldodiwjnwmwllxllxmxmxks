package hv0;

import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public class e {
    public List a;
    public String b;
    public String c;

    public e(String str, String str2, List list) {
        this.a = list;
        this.b = str;
        this.c = str2;
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
        List list = this.a;
        return this.c.hashCode() + h1.i((list == null ? 0 : list.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        return h1.p(m0.n("Thread(diffLines=", ", id=", this.b, ", __typename=", this.a), this.c, ")");
    }
    public static Object x(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
}
