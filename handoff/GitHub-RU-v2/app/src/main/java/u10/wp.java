package u10;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes3.dex */
public final class wp {
    public String a;
    public String b;
    public String c;
    public rp d;
    public boolean e;
    public boolean f;
    public boolean g;
    public ZonedDateTime h;
    public ZonedDateTime i;
    public String j;
    public String k;

    public wp(String str, String str2, String str3, rp rpVar, boolean z, boolean z2, boolean z3, ZonedDateTime zonedDateTime, ZonedDateTime zonedDateTime2, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = rpVar;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = zonedDateTime;
        this.i = zonedDateTime2;
        this.j = str4;
        this.k = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wp)) {
            return false;
        }
        wp wpVar = (wp) obj;
        return k71.k.b(this.a, wpVar.a) && k71.k.b(this.b, wpVar.b) && k71.k.b(this.c, wpVar.c) && k71.k.b(this.d, wpVar.d) && this.e == wpVar.e && this.f == wpVar.f && this.g == wpVar.g && k71.k.b(this.h, wpVar.h) && k71.k.b(this.i, wpVar.i) && k71.k.b(this.j, wpVar.j) && k71.k.b(this.k, wpVar.k);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int i = com.github.rudroid.copilot.h1.i((hashCode + (str == null ? 0 : str.hashCode())) * 31, this.c, 31);
        rp rpVar = this.d;
        int a = com.github.rudroid.m0.a(this.h, x.i.e(x.i.e(x.i.e((i + (rpVar == null ? 0 : rpVar.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.g), 31);
        ZonedDateTime zonedDateTime = this.i;
        return this.k.hashCode() + com.github.rudroid.copilot.h1.i((a + (zonedDateTime != null ? zonedDateTime.hashCode() : 0)) * 31, this.j, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(id=", this.a, ", name=", this.b, ", tagName=");
        o.append(this.c);
        o.append(", author=");
        o.append(this.d);
        o.append(", isPrerelease=");
        com.github.rudroid.m0.A(o, this.e, ", isDraft=", this.f, ", isLatest=");
        jo.f4Shadow.B(", createdAt=", ", publishedAt=", o, this.h, this.g);
        jo.f4Shadow.A(", url=", this.j, ", __typename=", o, this.i);
        return com.github.rudroid.copilot.h1.p(o, this.k, ")");
    }
}
