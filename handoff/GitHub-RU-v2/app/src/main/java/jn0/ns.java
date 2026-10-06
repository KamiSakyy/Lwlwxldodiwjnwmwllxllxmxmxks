package jn0;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ns {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public rs f;
    public zr g;
    public String h;
    public boolean i;
    public boolean j;
    public boolean k;
    public ZonedDateTime l;
    public ZonedDateTime m;
    public os n;
    public ds o;
    public es p;
    public gu0.c q;

    public ns(String str, String str2, String str3, String str4, String str5, rs rsVar, zr zrVar, String str6, boolean z, boolean z2, boolean z3, ZonedDateTime zonedDateTime, ZonedDateTime zonedDateTime2, os osVar, ds dsVar, es esVar, gu0.c cVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = rsVar;
        this.g = zrVar;
        this.h = str6;
        this.i = z;
        this.j = z2;
        this.k = z3;
        this.l = zonedDateTime;
        this.m = zonedDateTime2;
        this.n = osVar;
        this.o = dsVar;
        this.p = esVar;
        this.q = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ns)) {
            return false;
        }
        ns nsVar = (ns) obj;
        return k71.k.b(this.a, nsVar.a) && k71.k.b(this.b, nsVar.b) && k71.k.b(this.c, nsVar.c) && k71.k.b(this.d, nsVar.d) && k71.k.b(this.e, nsVar.e) && k71.k.b(this.f, nsVar.f) && k71.k.b(this.g, nsVar.g) && k71.k.b(this.h, nsVar.h) && this.i == nsVar.i && this.j == nsVar.j && this.k == nsVar.k && k71.k.b(this.l, nsVar.l) && k71.k.b(this.m, nsVar.m) && k71.k.b(this.n, nsVar.n) && k71.k.b(this.o, nsVar.o) && k71.k.b(this.p, nsVar.p) && k71.k.b(this.q, nsVar.q);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31);
        String str = this.d;
        int i2 = com.github.rudroid.copilot.h1.i((i + (str == null ? 0 : str.hashCode())) * 31, this.e, 31);
        rs rsVar = this.f;
        int hashCode = (i2 + (rsVar == null ? 0 : rsVar.hashCode())) * 31;
        zr zrVar = this.g;
        int hashCode2 = (hashCode + (zrVar == null ? 0 : zrVar.hashCode())) * 31;
        String str2 = this.h;
        int a = com.github.rudroid.m0.a(this.l, x.i.e(x.i.e(x.i.e((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.i), 31, this.j), 31, this.k), 31);
        ZonedDateTime zonedDateTime = this.m;
        int hashCode3 = (this.n.hashCode() + ((a + (zonedDateTime == null ? 0 : zonedDateTime.hashCode())) * 31)) * 31;
        ds dsVar = this.o;
        int hashCode4 = (hashCode3 + (dsVar == null ? 0 : dsVar.hashCode())) * 31;
        es esVar = this.p;
        return this.q.hashCode() + ((hashCode4 + (esVar != null ? esVar.hashCode() : 0)) * 31);
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
        jo.f4Shadow.B(", createdAt=", ", publishedAt=", o, this.l, this.k);
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
