package er;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b0 implements aa.h0 {
    public final ZonedDateTime a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final String h;
    public final v i;
    public final d j;
    public final b k;
    public final c l;
    public final e m;
    public final w n;
    public final a o;
    public final s p;
    public final String q;
    public final String r;

    public b0(ZonedDateTime zonedDateTime, String str, String str2, String str3, String str4, boolean z, boolean z2, String str5, v vVar, d dVar, b bVar, c cVar, e eVar, w wVar, a aVar, s sVar, String str6, String str7) {
        this.a = zonedDateTime;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = z;
        this.g = z2;
        this.h = str5;
        this.i = vVar;
        this.j = dVar;
        this.k = bVar;
        this.l = cVar;
        this.m = eVar;
        this.n = wVar;
        this.o = aVar;
        this.p = sVar;
        this.q = str6;
        this.r = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return k71.k.b(this.a, b0Var.a) && k71.k.b(this.b, b0Var.b) && k71.k.b(this.c, b0Var.c) && k71.k.b(this.d, b0Var.d) && k71.k.b(this.e, b0Var.e) && this.f == b0Var.f && this.g == b0Var.g && k71.k.b(this.h, b0Var.h) && k71.k.b(this.i, b0Var.i) && k71.k.b(this.j, b0Var.j) && k71.k.b(this.k, b0Var.k) && k71.k.b(this.l, b0Var.l) && k71.k.b(this.m, b0Var.m) && k71.k.b(this.n, b0Var.n) && k71.k.b(this.o, b0Var.o) && k71.k.b(this.p, b0Var.p) && k71.k.b(this.q, b0Var.q) && k71.k.b(this.r, b0Var.r);
    }

    public final int hashCode() {
        int hashCode = (this.i.hashCode() + com.github.rudroid.copilot.h1.i(x.i.e(x.i.e(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), this.d, 31), this.e, 31), 31, this.f), 31, this.g), this.h, 31)) * 31;
        d dVar = this.j;
        int hashCode2 = (hashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        b bVar = this.k;
        int hashCode3 = (this.l.hashCode() + ((hashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31)) * 31;
        e eVar = this.m;
        int hashCode4 = (hashCode3 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        w wVar = this.n;
        int hashCode5 = (hashCode4 + (wVar == null ? 0 : wVar.hashCode())) * 31;
        a aVar = this.o;
        return this.r.hashCode() + com.github.rudroid.copilot.h1.i((this.p.hashCode() + ((hashCode5 + (aVar != null ? aVar.hashCode() : 0)) * 31)) * 31, this.q, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommitDetailFields(committedDate=");
        sb.append(this.a);
        sb.append(", messageBodyHTML=");
        sb.append(this.b);
        sb.append(", messageHeadlineHTML=");
        f1.e.x(sb, this.c, ", abbreviatedOid=", this.d, ", oid=");
        com.github.rudroid.m0.x(sb, this.e, ", committedViaWeb=", this.f, ", authoredByCommitter=");
        com.github.rudroid.m0.z(sb, this.g, ", url=", this.h, ", repository=");
        sb.append(this.i);
        sb.append(", committer=");
        sb.append(this.j);
        sb.append(", author=");
        sb.append(this.k);
        sb.append(", authors=");
        sb.append(this.l);
        sb.append(", diff=");
        sb.append(this.m);
        sb.append(", statusCheckRollup=");
        sb.append(this.n);
        sb.append(", associatedPullRequests=");
        sb.append(this.o);
        sb.append(", parents=");
        sb.append(this.p);
        sb.append(", id=");
        return x.i.k(sb, this.q, ", __typename=", this.r, ")");
    }
}
