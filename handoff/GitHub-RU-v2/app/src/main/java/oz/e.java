package oz;

import com.github.rudroid.copilot.h1;
import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e {
    public final f a;
    public final String b;
    public final String c;

    public e(f fVar, String str, String str2) {
        this.a = fVar;
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
        return k.b(this.a, eVar.a) && k.b(this.b, eVar.b) && k.b(this.c, eVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Status(user=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return h1.p(sb, this.c, ")");
    }
    public Object a(Object p1, Object p2, Object p3) { return null; }
    public Object k(Object p1, Object p2, Object p3) { return null; }
    public Object w(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
}
