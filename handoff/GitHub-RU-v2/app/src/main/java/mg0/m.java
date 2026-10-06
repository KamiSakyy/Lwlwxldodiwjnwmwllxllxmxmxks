package mg0;

import a0.s0;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;
import gn0.kw;
import gn0.xc;
import gn0.zc;
import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m implements aa.h0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final ZonedDateTime f;
    public final Boolean g;
    public final i h;
    public final xc i;
    public final l j;
    public final kw k;
    public final String l;
    public final g m;
    public final h n;
    public final zc o;
    public final sg0.j p;

    public m(String str, String str2, String str3, String str4, int i, ZonedDateTime zonedDateTime, Boolean bool, i iVar, xc xcVar, l lVar, kw kwVar, String str5, g gVar, h hVar, zc zcVar, sg0.j jVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.f = zonedDateTime;
        this.g = bool;
        this.h = iVar;
        this.i = xcVar;
        this.j = lVar;
        this.k = kwVar;
        this.l = str5;
        this.m = gVar;
        this.n = hVar;
        this.o = zcVar;
        this.p = jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return k71.k.b(this.a, mVar.a) && k71.k.b(this.b, mVar.b) && k71.k.b(this.c, mVar.c) && k71.k.b(this.d, mVar.d) && this.e == mVar.e && k71.k.b(this.f, mVar.f) && k71.k.b(this.g, mVar.g) && k71.k.b(this.h, mVar.h) && this.i == mVar.i && k71.k.b(this.j, mVar.j) && this.k == mVar.k && k71.k.b(this.l, mVar.l) && k71.k.b(this.m, mVar.m) && k71.k.b(this.n, mVar.n) && this.o == mVar.o && k71.k.b(this.p, mVar.p);
    }

    public final int hashCode() {
        int a = m0.a(this.f, s0.b(this.e, h1.i(h1.i(h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), this.d, 31), 31), 31);
        Boolean bool = this.g;
        int hashCode = (this.j.hashCode() + ((this.i.hashCode() + s0.b(this.h.a, (a + (bool == null ? 0 : bool.hashCode())) * 31, 31)) * 31)) * 31;
        kw kwVar = this.k;
        int hashCode2 = (this.m.hashCode() + h1.i((hashCode + (kwVar == null ? 0 : kwVar.hashCode())) * 31, this.l, 31)) * 31;
        h hVar = this.n;
        int hashCode3 = (hashCode2 + (hVar == null ? 0 : Integer.hashCode(hVar.a))) * 31;
        zc zcVar = this.o;
        return this.p.hashCode() + ((hashCode3 + (zcVar != null ? zcVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("IssueListItemFragment(__typename=", this.a, ", id=", this.b, ", title=");
        f1.e.x(o, this.c, ", titleHTML=", this.d, ", number=");
        o.append(this.e);
        o.append(", createdAt=");
        o.append(this.f);
        o.append(", isReadByViewer=");
        o.append(this.g);
        o.append(", comments=");
        o.append(this.h);
        o.append(", issueState=");
        o.append(this.i);
        o.append(", repository=");
        o.append(this.j);
        o.append(", viewerSubscription=");
        o.append(this.k);
        o.append(", url=");
        o.append(this.l);
        o.append(", assignees=");
        o.append(this.m);
        o.append(", closedByPullRequestsReferences=");
        o.append(this.n);
        o.append(", stateReason=");
        o.append(this.o);
        o.append(", labelsFragment=");
        o.append(this.p);
        o.append(")");
        return o.toString();
    }
}
