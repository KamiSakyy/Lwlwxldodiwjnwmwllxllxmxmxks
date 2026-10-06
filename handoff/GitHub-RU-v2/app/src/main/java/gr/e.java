package gr;

import a0.s0;
import aa.h0;
import com.github.rudroid.copilot.h1;
import java.time.ZonedDateTime;
import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e implements h0 {
    public String a;
    public String b;
    public a c;
    public d d;
    public ZonedDateTime e;

    public e(String str, String str2, a aVar, d dVar, ZonedDateTime zonedDateTime) {
        this.a = str;
        this.b = str2;
        this.c = aVar;
        this.d = dVar;
        this.e = zonedDateTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return k.b(this.a, eVar.a) && k.b(this.b, eVar.b) && k.b(this.c, eVar.c) && k.b(this.d, eVar.d) && k.b(this.e, eVar.e);
    }

    public final int hashCode() {
        int i = h1.i(this.a.hashCode() * 31, this.b, 31);
        a aVar = this.c;
        return this.e.hashCode() + ((this.d.hashCode() + ((i + (aVar == null ? 0 : aVar.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("ConnectedEventFields(__typename=", this.a, ", id=", this.b, ", actor=");
        o.append(this.c);
        o.append(", subject=");
        o.append(this.d);
        o.append(", createdAt=");
        return h1.q(o, this.e, ")");
    }
    public static Object x(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
}
