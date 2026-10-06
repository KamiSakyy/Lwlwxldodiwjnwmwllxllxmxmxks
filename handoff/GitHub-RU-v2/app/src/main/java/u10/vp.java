package u10;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes3.dex */
public final class vp {
    public String a;
    public String b;
    public String c;
    public String d;
    public sp e;
    public ZonedDateTime f;
    public ZonedDateTime g;
    public String h;

    public vp(String str, String str2, String str3, String str4, sp spVar, ZonedDateTime zonedDateTime, ZonedDateTime zonedDateTime2, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = spVar;
        this.f = zonedDateTime;
        this.g = zonedDateTime2;
        this.h = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vp)) {
            return false;
        }
        vp vpVar = (vp) obj;
        return k71.k.b(this.a, vpVar.a) && k71.k.b(this.b, vpVar.b) && k71.k.b(this.c, vpVar.c) && k71.k.b(this.d, vpVar.d) && k71.k.b(this.e, vpVar.e) && k71.k.b(this.f, vpVar.f) && k71.k.b(this.g, vpVar.g) && k71.k.b(this.h, vpVar.h);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int i = com.github.rudroid.copilot.h1.i((hashCode + (str == null ? 0 : str.hashCode())) * 31, this.c, 31);
        String str2 = this.d;
        int hashCode2 = (i + (str2 == null ? 0 : str2.hashCode())) * 31;
        sp spVar = this.e;
        int a = com.github.rudroid.m0.a(this.f, (hashCode2 + (spVar == null ? 0 : spVar.hashCode())) * 31, 31);
        ZonedDateTime zonedDateTime = this.g;
        return this.h.hashCode() + ((a + (zonedDateTime != null ? zonedDateTime.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("LatestRelease(id=", this.a, ", name=", this.b, ", tagName=");
        f1.e.x(o, this.c, ", descriptionHTML=", this.d, ", author=");
        o.append(this.e);
        o.append(", createdAt=");
        o.append(this.f);
        o.append(", publishedAt=");
        return x.i.h(", __typename=", this.h, ")", o, this.g);
    }
}
