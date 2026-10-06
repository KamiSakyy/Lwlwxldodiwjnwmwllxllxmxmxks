package a90;

import a0.s0;
import aa.h0;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;
import java.time.ZonedDateTime;
import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d implements h0 {
    public String a;
    public String b;
    public a c;
    public String d;
    public c e;
    public ZonedDateTime f;
    public String g;

    public d(String str, String str2, a aVar, String str3, c cVar, ZonedDateTime zonedDateTime, String str4) {
        this.a = str;
        this.b = str2;
        this.c = aVar;
        this.d = str3;
        this.e = cVar;
        this.f = zonedDateTime;
        this.g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return k.b(this.a, dVar.a) && k.b(this.b, dVar.b) && k.b(this.c, dVar.c) && k.b(this.d, dVar.d) && k.b(this.e, dVar.e) && k.b(this.f, dVar.f) && k.b(this.g, dVar.g);
    }

    public final int hashCode() {
        int i = h1.i(this.a.hashCode() * 31, this.b, 31);
        a aVar = this.c;
        int hashCode = (i + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str = this.d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        c cVar = this.e;
        return this.g.hashCode() + m0.a(this.f, (hashCode2 + (cVar != null ? cVar.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("ReviewDismissedEventFields(__typename=", this.a, ", id=", this.b, ", actor=");
        o.append(this.c);
        o.append(", dismissalMessageHTML=");
        o.append(this.d);
        o.append(", review=");
        o.append(this.e);
        o.append(", createdAt=");
        o.append(this.f);
        o.append(", url=");
        return h1.p(o, this.g, ")");
    }
}
