package yq;

import a0.s0;
import aa.h0;
import com.github.rudroid.copilot.h1;
import java.time.ZonedDateTime;
import m10.yi;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n implements h0 {
    public String a;
    public String b;
    public yi c;
    public a d;
    public c e;
    public d f;
    public e g;
    public ZonedDateTime h;

    public n(String str, String str2, yi yiVar, a aVar, c cVar, d dVar, e eVar, ZonedDateTime zonedDateTime) {
        this.a = str;
        this.b = str2;
        this.c = yiVar;
        this.d = aVar;
        this.e = cVar;
        this.f = dVar;
        this.g = eVar;
        this.h = zonedDateTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return k71.k.b(this.a, nVar.a) && k71.k.b(this.b, nVar.b) && this.c == nVar.c && k71.k.b(this.d, nVar.d) && k71.k.b(this.e, nVar.e) && k71.k.b(this.f, nVar.f) && k71.k.b(this.g, nVar.g) && k71.k.b(this.h, nVar.h);
    }

    public final int hashCode() {
        int i = h1.i(this.a.hashCode() * 31, this.b, 31);
        yi yiVar = this.c;
        int hashCode = (i + (yiVar == null ? 0 : yiVar.hashCode())) * 31;
        a aVar = this.d;
        int hashCode2 = (this.e.hashCode() + ((hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31)) * 31;
        d dVar = this.f;
        int hashCode3 = (hashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        e eVar = this.g;
        return this.h.hashCode() + ((hashCode3 + (eVar != null ? eVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("ClosedEventFields(__typename=", this.a, ", id=", this.b, ", stateReason=");
        o.append(this.c);
        o.append(", actor=");
        o.append(this.d);
        o.append(", closable=");
        o.append(this.e);
        o.append(", closer=");
        o.append(this.f);
        o.append(", duplicateOf=");
        o.append(this.g);
        o.append(", createdAt=");
        o.append(this.h);
        o.append(")");
        return o.toString();
    }
}
