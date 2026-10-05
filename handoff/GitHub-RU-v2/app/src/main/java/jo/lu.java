package jo;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes3.dex */
public final class lu {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final pu f;
    public final xt g;
    public final String h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final ZonedDateTime l;
    public final ZonedDateTime m;
    public final mu n;
    public final bu o;
    public final cu p;
    public final pv.c q;

    public lu(String str, String str2, String str3, String str4, String str5, pu puVar, xt xtVar, String str6, boolean z, boolean z2, boolean z3, ZonedDateTime zonedDateTime, ZonedDateTime zonedDateTime2, mu muVar, bu buVar, cu cuVar, pv.c cVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = puVar;
        this.g = xtVar;
        this.h = str6;
        this.i = z;
        this.j = z2;
        this.k = z3;
        this.l = zonedDateTime;
        this.m = zonedDateTime2;
        this.n = muVar;
        this.o = buVar;
        this.p = cuVar;
        this.q = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lu)) {
            return false;
        }
        lu luVar = (lu) obj;
        return k71.k.b(this.a, luVar.a) && k71.k.b(this.b, luVar.b) && k71.k.b(this.c, luVar.c) && k71.k.b(this.d, luVar.d) && k71.k.b(this.e, luVar.e) && k71.k.b(this.f, luVar.f) && k71.k.b(this.g, luVar.g) && k71.k.b(this.h, luVar.h) && this.i == luVar.i && this.j == luVar.j && this.k == luVar.k && k71.k.b(this.l, luVar.l) && k71.k.b(this.m, luVar.m) && k71.k.b(this.n, luVar.n) && k71.k.b(this.o, luVar.o) && k71.k.b(this.p, luVar.p) && k71.k.b(this.q, luVar.q);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31);
        String str = this.d;
        int i2 = com.github.rudroid.copilot.h1.i((i + (str == null ? 0 : str.hashCode())) * 31, this.e, 31);
        pu puVar = this.f;
        int hashCode = (i2 + (puVar == null ? 0 : puVar.hashCode())) * 31;
        xt xtVar = this.g;
        int hashCode2 = (hashCode + (xtVar == null ? 0 : xtVar.hashCode())) * 31;
        String str2 = this.h;
        int a = com.github.rudroid.m0.a(this.l, x.i.e(x.i.e(x.i.e((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.i), 31, this.j), 31, this.k), 31);
        ZonedDateTime zonedDateTime = this.m;
        int hashCode3 = (this.n.hashCode() + ((a + (zonedDateTime == null ? 0 : zonedDateTime.hashCode())) * 31)) * 31;
        bu buVar = this.o;
        int hashCode4 = (hashCode3 + (buVar == null ? 0 : buVar.hashCode())) * 31;
        cu cuVar = this.p;
        return this.q.hashCode() + ((hashCode4 + (cuVar != null ? cuVar.hashCode() : 0)) * 31);
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
        f4.B(", createdAt=", ", publishedAt=", o, this.l, this.k);
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







}
