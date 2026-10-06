package mu0;

import a0.s0;
import aa.h0;
import com.github.rudroid.copilot.h1;
import java.time.ZonedDateTime;
import k71.k;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b implements h0 {
    public String a;
    public String b;
    public a c;
    public String d;
    public String e;
    public ZonedDateTime f;

    public b(String str, String str2, a aVar, String str3, String str4, ZonedDateTime zonedDateTime) {
        this.a = str;
        this.b = str2;
        this.c = aVar;
        this.d = str3;
        this.e = str4;
        this.f = zonedDateTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return k.b(this.a, bVar.a) && k.b(this.b, bVar.b) && k.b(this.c, bVar.c) && k.b(this.d, bVar.d) && k.b(this.e, bVar.e) && k.b(this.f, bVar.f);
    }

    public final int hashCode() {
        int i = h1.i(this.a.hashCode() * 31, this.b, 31);
        a aVar = this.c;
        return this.f.hashCode() + h1.i(h1.i((i + (aVar == null ? 0 : aVar.hashCode())) * 31, this.d, 31), this.e, 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("RenamedTitleFields(__typename=", this.a, ", id=", this.b, ", actor=");
        o.append(this.c);
        o.append(", previousTitle=");
        o.append(this.d);
        o.append(", currentTitle=");
        o.append(this.e);
        o.append(", createdAt=");
        o.append(this.f);
        o.append(")");
        return o.toString();
    }
    public Object b(Object p1, Object p2, Object p3) { return null; }
}
