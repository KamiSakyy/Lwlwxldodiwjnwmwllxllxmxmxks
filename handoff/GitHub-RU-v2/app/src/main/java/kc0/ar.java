package kc0;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ar {
    public final String a;
    public final String b;
    public final String c;
    public final vq d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final ZonedDateTime h;
    public final ZonedDateTime i;
    public final String j;
    public final String k;

    public ar(String str, String str2, String str3, vq vqVar, boolean z, boolean z2, boolean z3, ZonedDateTime zonedDateTime, ZonedDateTime zonedDateTime2, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = vqVar;
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
        if (!(obj instanceof ar)) {
            return false;
        }
        ar arVar = (ar) obj;
        return k71.k.b(this.a, arVar.a) && k71.k.b(this.b, arVar.b) && k71.k.b(this.c, arVar.c) && k71.k.b(this.d, arVar.d) && this.e == arVar.e && this.f == arVar.f && this.g == arVar.g && k71.k.b(this.h, arVar.h) && k71.k.b(this.i, arVar.i) && k71.k.b(this.j, arVar.j) && k71.k.b(this.k, arVar.k);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int i = com.github.rudroid.copilot.h1.i((hashCode + (str == null ? 0 : str.hashCode())) * 31, this.c, 31);
        vq vqVar = this.d;
        int a = com.github.rudroid.m0.a(this.h, x.i.e(x.i.e(x.i.e((i + (vqVar == null ? 0 : vqVar.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.g), 31);
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
        jo.f4.B(", createdAt=", ", publishedAt=", o, this.h, this.g);
        jo.f4.A(", url=", this.j, ", __typename=", o, this.i);
        return com.github.rudroid.copilot.h1.p(o, this.k, ")");
    }
}
