package xt;

import a0.s0;
import aa.h0;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;
import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k implements h0 {
    public String a;
    public String b;
    public a c;
    public ZonedDateTime d;
    public boolean e;
    public b f;
    public c g;

    public k(String str, String str2, a aVar, ZonedDateTime zonedDateTime, boolean z, b bVar, c cVar) {
        this.a = str;
        this.b = str2;
        this.c = aVar;
        this.d = zonedDateTime;
        this.e = z;
        this.f = bVar;
        this.g = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return k71.k.b(this.a, kVar.a) && k71.k.b(this.b, kVar.b) && k71.k.b(this.c, kVar.c) && k71.k.b(this.d, kVar.d) && this.e == kVar.e && k71.k.b(this.f, kVar.f) && k71.k.b(this.g, kVar.g);
    }

    public final int hashCode() {
        int i = h1.i(this.a.hashCode() * 31, this.b, 31);
        a aVar = this.c;
        int e = x.i.e(m0.a(this.d, (i + (aVar == null ? 0 : aVar.hashCode())) * 31, 31), 31, this.e);
        b bVar = this.f;
        int hashCode = (e + (bVar == null ? 0 : bVar.hashCode())) * 31;
        c cVar = this.g;
        return hashCode + (cVar != null ? cVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder o = s0.o("MarkedAsDuplicateEventFields(__typename=", this.a, ", id=", this.b, ", actor=");
        o.append(this.c);
        o.append(", createdAt=");
        o.append(this.d);
        o.append(", isCrossRepository=");
        o.append(this.e);
        o.append(", canonical=");
        o.append(this.f);
        o.append(", duplicate=");
        o.append(this.g);
        o.append(")");
        return o.toString();
    }
}
