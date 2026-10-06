package ku0;

import com.github.rudroid.copilot.h1;
import pz0.n30;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e {
    public final String a;
    public final n30 b;
    public final String c;

    public e(String str, String str2, n30 n30Var) {
        this.a = str;
        this.b = n30Var;
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
        return k71.k.b(this.a, eVar.a) && this.b == eVar.b && k71.k.b(this.c, eVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Status(__typename=");
        sb.append(this.a);
        sb.append(", state=");
        sb.append(this.b);
        sb.append(", id=");
        return h1.p(sb, this.c, ")");
    }
    public Object i(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
}
