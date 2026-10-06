package ej0;

import a0.s0;
import aa.h0;
import com.github.rudroid.copilot.h1;
import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f implements h0 {
    public final String a;
    public final String b;
    public final boolean c;
    public final a d;
    public final c e;
    public final b f;
    public final ZonedDateTime g;

    public f(String str, String str2, boolean z, a aVar, c cVar, b bVar, ZonedDateTime zonedDateTime) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = aVar;
        this.e = cVar;
        this.f = bVar;
        this.g = zonedDateTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return k71.k.b(this.a, fVar.a) && k71.k.b(this.b, fVar.b) && this.c == fVar.c && k71.k.b(this.d, fVar.d) && k71.k.b(this.e, fVar.e) && k71.k.b(this.f, fVar.f) && k71.k.b(this.g, fVar.g);
    }

    public final int hashCode() {
        int e = x.i.e(h1.i(this.a.hashCode() * 31, this.b, 31), 31, this.c);
        a aVar = this.d;
        int hashCode = (this.e.hashCode() + ((e + (aVar == null ? 0 : aVar.hashCode())) * 31)) * 31;
        b bVar = this.f;
        return this.g.hashCode() + ((hashCode + (bVar != null ? bVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("ReferencedEventFields(__typename=", this.a, ", id=", this.b, ", isCrossRepository=");
        o.append(this.c);
        o.append(", actor=");
        o.append(this.d);
        o.append(", commitRepository=");
        o.append(this.e);
        o.append(", commit=");
        o.append(this.f);
        o.append(", createdAt=");
        return h1.q(o, this.g, ")");
    }
}
