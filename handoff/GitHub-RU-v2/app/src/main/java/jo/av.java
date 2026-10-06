package jo;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes3.dex */
public final class av {
    public final String a;
    public final String b;
    public final String c;
    public final vu d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final ZonedDateTime h;
    public final ZonedDateTime i;
    public final String j;
    public final String k;

    public av(String str, String str2, String str3, vu vuVar, boolean z, boolean z2, boolean z3, ZonedDateTime zonedDateTime, ZonedDateTime zonedDateTime2, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = vuVar;
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
        if (!(obj instanceof av)) {
            return false;
        }
        av avVar = (av) obj;
        return k71.k.b(this.a, avVar.a) && k71.k.b(this.b, avVar.b) && k71.k.b(this.c, avVar.c) && k71.k.b(this.d, avVar.d) && this.e == avVar.e && this.f == avVar.f && this.g == avVar.g && k71.k.b(this.h, avVar.h) && k71.k.b(this.i, avVar.i) && k71.k.b(this.j, avVar.j) && k71.k.b(this.k, avVar.k);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int i = com.github.rudroid.copilot.h1.i((hashCode + (str == null ? 0 : str.hashCode())) * 31, this.c, 31);
        vu vuVar = this.d;
        int a = com.github.rudroid.m0.a(this.h, x.i.e(x.i.e(x.i.e((i + (vuVar == null ? 0 : vuVar.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.g), 31);
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
        f4.B(", createdAt=", ", publishedAt=", o, this.h, this.g);
        f4.A(", url=", this.j, ", __typename=", o, this.i);
        return com.github.rudroid.copilot.h1.p(o, this.k, ")");
    }
}
