package u10;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes3.dex */
public final class hp {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public lp f;
    public to g;
    public String h;
    public boolean i;
    public boolean j;
    public boolean k;
    public ZonedDateTime l;
    public ZonedDateTime m;
    public ip n;
    public xo o;
    public yo p;
    public i80.c q;

    public hp(String str, String str2, String str3, String str4, String str5, lp lpVar, to toVar, String str6, boolean z, boolean z2, boolean z3, ZonedDateTime zonedDateTime, ZonedDateTime zonedDateTime2, ip ipVar, xo xoVar, yo yoVar, i80.c cVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = lpVar;
        this.g = toVar;
        this.h = str6;
        this.i = z;
        this.j = z2;
        this.k = z3;
        this.l = zonedDateTime;
        this.m = zonedDateTime2;
        this.n = ipVar;
        this.o = xoVar;
        this.p = yoVar;
        this.q = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hp)) {
            return false;
        }
        hp hpVar = (hp) obj;
        return k71.k.b(this.a, hpVar.a) && k71.k.b(this.b, hpVar.b) && k71.k.b(this.c, hpVar.c) && k71.k.b(this.d, hpVar.d) && k71.k.b(this.e, hpVar.e) && k71.k.b(this.f, hpVar.f) && k71.k.b(this.g, hpVar.g) && k71.k.b(this.h, hpVar.h) && this.i == hpVar.i && this.j == hpVar.j && this.k == hpVar.k && k71.k.b(this.l, hpVar.l) && k71.k.b(this.m, hpVar.m) && k71.k.b(this.n, hpVar.n) && k71.k.b(this.o, hpVar.o) && k71.k.b(this.p, hpVar.p) && k71.k.b(this.q, hpVar.q);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31);
        String str = this.d;
        int i2 = com.github.rudroid.copilot.h1.i((i + (str == null ? 0 : str.hashCode())) * 31, this.e, 31);
        lp lpVar = this.f;
        int hashCode = (i2 + (lpVar == null ? 0 : lpVar.hashCode())) * 31;
        to toVar = this.g;
        int hashCode2 = (hashCode + (toVar == null ? 0 : toVar.hashCode())) * 31;
        String str2 = this.h;
        int a = com.github.rudroid.m0.a(this.l, x.i.e(x.i.e(x.i.e((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.i), 31, this.j), 31, this.k), 31);
        ZonedDateTime zonedDateTime = this.m;
        int hashCode3 = (this.n.hashCode() + ((a + (zonedDateTime == null ? 0 : zonedDateTime.hashCode())) * 31)) * 31;
        xo xoVar = this.o;
        int hashCode4 = (hashCode3 + (xoVar == null ? 0 : xoVar.hashCode())) * 31;
        yo yoVar = this.p;
        return this.q.hashCode() + ((hashCode4 + (yoVar != null ? yoVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Release(__typename=", this.a, ", id=", this.b, ", url=");
        f1.e.x(o, this.c, ", name=", this.d, ", tagName=");
        o.append(this.e);
        o.append(", tagCommit=");
        o.append(this.f);
        o.append(", author=");
        o.append(this.g);
        o.append(", descriptionHTML=");
        o.append(this.h);
        o.append(", isPrerelease=");
        com.github.rudroid.m0.A(o, this.i, ", isDraft=", this.j, ", isLatest=");
        jo.f4.B(", createdAt=", ", publishedAt=", o, this.l, this.k);
        o.append(this.m);
        o.append(", releaseAssets=");
        o.append(this.n);
        o.append(", discussion=");
        o.append(this.o);
        o.append(", mentions=");
        o.append(this.p);
        o.append(", reactionFragment=");
        o.append(this.q);
        o.append(")");
        return o.toString();
    }

    public Object i;
}
