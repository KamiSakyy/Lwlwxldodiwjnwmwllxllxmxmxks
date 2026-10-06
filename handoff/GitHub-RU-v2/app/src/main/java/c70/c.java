package c70;

import a0.s0;
import aa.h0;
import com.github.rudroid.copilot.h1;
import java.time.ZonedDateTime;
import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c implements h0 {
    public String a;
    public String b;
    public a c;
    public String d;
    public String e;
    public b f;
    public ZonedDateTime g;

    public c(String str, String str2, a aVar, String str3, String str4, b bVar, ZonedDateTime zonedDateTime) {
        this.a = str;
        this.b = str2;
        this.c = aVar;
        this.d = str3;
        this.e = str4;
        this.f = bVar;
        this.g = zonedDateTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return k.b(this.a, cVar.a) && k.b(this.b, cVar.b) && k.b(this.c, cVar.c) && k.b(this.d, cVar.d) && k.b(this.e, cVar.e) && k.b(this.f, cVar.f) && k.b(this.g, cVar.g);
    }

    public final int hashCode() {
        int i = h1.i(this.a.hashCode() * 31, this.b, 31);
        a aVar = this.c;
        int i2 = h1.i(h1.i((i + (aVar == null ? 0 : aVar.hashCode())) * 31, this.d, 31), this.e, 31);
        b bVar = this.f;
        return this.g.hashCode() + ((i2 + (bVar != null ? bVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("MovedColumnsInProjectEventFields(__typename=", this.a, ", id=", this.b, ", actor=");
        o.append(this.c);
        o.append(", projectColumnName=");
        o.append(this.d);
        o.append(", previousProjectColumnName=");
        o.append(this.e);
        o.append(", project=");
        o.append(this.f);
        o.append(", createdAt=");
        return h1.q(o, this.g, ")");
    }
    public Object c(Object p1, Object p2) { return null; }
    public static final Object a = null;
}
