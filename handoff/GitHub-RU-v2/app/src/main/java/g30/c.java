package g30;

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
    public b e;
    public ZonedDateTime f;

    public c(String str, String str2, a aVar, String str3, b bVar, ZonedDateTime zonedDateTime) {
        this.a = str;
        this.b = str2;
        this.c = aVar;
        this.d = str3;
        this.e = bVar;
        this.f = zonedDateTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return k.b(this.a, cVar.a) && k.b(this.b, cVar.b) && k.b(this.c, cVar.c) && k.b(this.d, cVar.d) && k.b(this.e, cVar.e) && k.b(this.f, cVar.f);
    }

    public final int hashCode() {
        int i = h1.i(this.a.hashCode() * 31, this.b, 31);
        a aVar = this.c;
        int i2 = h1.i((i + (aVar == null ? 0 : aVar.hashCode())) * 31, this.d, 31);
        b bVar = this.e;
        return this.f.hashCode() + ((i2 + (bVar != null ? bVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("AddedToProjectEventFields(__typename=", this.a, ", id=", this.b, ", actor=");
        o.append(this.c);
        o.append(", projectColumnName=");
        o.append(this.d);
        o.append(", project=");
        o.append(this.e);
        o.append(", createdAt=");
        o.append(this.f);
        o.append(")");
        return o.toString();
    }
    public Object c(Object p1, Object p2) { return null; }
    public static final Object a = null;
}
