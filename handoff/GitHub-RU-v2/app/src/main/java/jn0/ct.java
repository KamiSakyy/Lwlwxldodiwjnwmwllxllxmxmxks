package jn0;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ct {
    public String a;
    public String b;
    public String c;
    public xs d;
    public boolean e;
    public boolean f;
    public boolean g;
    public ZonedDateTime h;
    public ZonedDateTime i;
    public String j;
    public String k;

    public ct(String str, String str2, String str3, xs xsVar, boolean z, boolean z2, boolean z3, ZonedDateTime zonedDateTime, ZonedDateTime zonedDateTime2, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = xsVar;
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
        if (!(obj instanceof ct)) {
            return false;
        }
        ct ctVar = (ct) obj;
        return k71.k.b(this.a, ctVar.a) && k71.k.b(this.b, ctVar.b) && k71.k.b(this.c, ctVar.c) && k71.k.b(this.d, ctVar.d) && this.e == ctVar.e && this.f == ctVar.f && this.g == ctVar.g && k71.k.b(this.h, ctVar.h) && k71.k.b(this.i, ctVar.i) && k71.k.b(this.j, ctVar.j) && k71.k.b(this.k, ctVar.k);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int i = com.github.rudroid.copilot.h1.i((hashCode + (str == null ? 0 : str.hashCode())) * 31, this.c, 31);
        xs xsVar = this.d;
        int a = com.github.rudroid.m0.a(this.h, x.i.e(x.i.e(x.i.e((i + (xsVar == null ? 0 : xsVar.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.g), 31);
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
