package w50;

import a0.s0;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;
import hc0.ev;
import hc0.jc;
import hc0.lc;
import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l implements aa.h0 {
    public String a;
    public String b;
    public String c;
    public String d;
    public int e;
    public ZonedDateTime f;
    public Boolean g;
    public h h;
    public jc i;
    public k j;
    public ev k;
    public String l;
    public f m;
    public g n;
    public lc o;
    public c60.j p;

    public l(String str, String str2, String str3, String str4, int i, ZonedDateTime zonedDateTime, Boolean bool, h hVar, jc jcVar, k kVar, ev evVar, String str5, f fVar, g gVar, lc lcVar, c60.j jVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.f = zonedDateTime;
        this.g = bool;
        this.h = hVar;
        this.i = jcVar;
        this.j = kVar;
        this.k = evVar;
        this.l = str5;
        this.m = fVar;
        this.n = gVar;
        this.o = lcVar;
        this.p = jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return k71.k.b(this.a, lVar.a) && k71.k.b(this.b, lVar.b) && k71.k.b(this.c, lVar.c) && k71.k.b(this.d, lVar.d) && this.e == lVar.e && k71.k.b(this.f, lVar.f) && k71.k.b(this.g, lVar.g) && k71.k.b(this.h, lVar.h) && this.i == lVar.i && k71.k.b(this.j, lVar.j) && this.k == lVar.k && k71.k.b(this.l, lVar.l) && k71.k.b(this.m, lVar.m) && k71.k.b(this.n, lVar.n) && this.o == lVar.o && k71.k.b(this.p, lVar.p);
    }

    public final int hashCode() {
        int a = m0.a(this.f, s0.b(this.e, h1.i(h1.i(h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), this.d, 31), 31), 31);
        Boolean bool = this.g;
        int hashCode = (this.j.hashCode() + ((this.i.hashCode() + s0.b(this.h.a, (a + (bool == null ? 0 : bool.hashCode())) * 31, 31)) * 31)) * 31;
        ev evVar = this.k;
        int hashCode2 = (this.m.hashCode() + h1.i((hashCode + (evVar == null ? 0 : evVar.hashCode())) * 31, this.l, 31)) * 31;
        g gVar = this.n;
        int hashCode3 = (hashCode2 + (gVar == null ? 0 : Integer.hashCode(gVar.a))) * 31;
        lc lcVar = this.o;
        return this.p.hashCode() + ((hashCode3 + (lcVar != null ? lcVar.hashCode() : 0)) * 31);
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
