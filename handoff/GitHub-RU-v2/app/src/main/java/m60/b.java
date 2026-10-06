package m60;

import a0.s0;
import aa.h0;
import com.github.rudroid.copilot.h1;
import hc0.jd;
import java.time.ZonedDateTime;
import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b implements h0 {
    public String a;
    public String b;
    public a c;
    public jd d;
    public ZonedDateTime e;

    public b(String str, String str2, a aVar, jd jdVar, ZonedDateTime zonedDateTime) {
        this.a = str;
        this.b = str2;
        this.c = aVar;
        this.d = jdVar;
        this.e = zonedDateTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return k.b(this.a, bVar.a) && k.b(this.b, bVar.b) && k.b(this.c, bVar.c) && this.d == bVar.d && k.b(this.e, bVar.e);
    }

    public final int hashCode() {
        int i = h1.i(this.a.hashCode() * 31, this.b, 31);
        a aVar = this.c;
        int hashCode = (i + (aVar == null ? 0 : aVar.hashCode())) * 31;
        jd jdVar = this.d;
        return this.e.hashCode() + ((hashCode + (jdVar != null ? jdVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("LockedEventFields(__typename=", this.a, ", id=", this.b, ", actor=");
        o.append(this.c);
        o.append(", lockReason=");
        o.append(this.d);
        o.append(", createdAt=");
        return h1.q(o, this.e, ")");
    }
    public Object b(Object p1, Object p2, Object p3) { return null; }
}
