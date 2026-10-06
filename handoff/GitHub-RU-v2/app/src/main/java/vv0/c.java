package vv0;

import a0.s0;
import aa.h0;
import com.github.rudroid.copilot.h1;
import java.time.ZonedDateTime;
import k71.k;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c implements h0 {
    public final String a;
    public final String b;
    public final a c;
    public final b d;
    public final ZonedDateTime e;

    public c(String str, String str2, a aVar, b bVar, ZonedDateTime zonedDateTime) {
        this.a = str;
        this.b = str2;
        this.c = aVar;
        this.d = bVar;
        this.e = zonedDateTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return k.b(this.a, cVar.a) && k.b(this.b, cVar.b) && k.b(this.c, cVar.c) && k.b(this.d, cVar.d) && k.b(this.e, cVar.e);
    }

    public final int hashCode() {
        int i = h1.i(this.a.hashCode() * 31, this.b, 31);
        a aVar = this.c;
        return this.e.hashCode() + ((this.d.hashCode() + ((i + (aVar == null ? 0 : aVar.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("UnlabeledEventFields(__typename=", this.a, ", id=", this.b, ", actor=");
        o.append(this.c);
        o.append(", label=");
        o.append(this.d);
        o.append(", createdAt=");
        return h1.q(o, this.e, ")");
    }
    public Object c(Object p1, Object p2) { return null; }
    public static final Object a = null;
}
