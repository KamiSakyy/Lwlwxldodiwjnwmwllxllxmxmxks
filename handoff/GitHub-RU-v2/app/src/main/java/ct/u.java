package ct;

import com.github.rudroid.copilot.h1;
import dw.z6;
import java.time.ZonedDateTime;
import m10.wi;
import m10.ya0;
import m10.yi;

/* loaded from: /home/user/work/p/classes3.dex */
public final class u implements aa.h0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final ZonedDateTime f;
    public final Boolean g;
    public final o h;
    public final wi i;
    public final t j;
    public final ya0 k;
    public final String l;
    public final m m;
    public final n n;
    public final yi o;
    public final p p;
    public final s q;
    public final lt.j r;
    public final z6 s;
    public final c t;

    public u(String str, String str2, String str3, String str4, int i, ZonedDateTime zonedDateTime, Boolean bool, o oVar, wi wiVar, t tVar, ya0 ya0Var, String str5, m mVar, n nVar, yi yiVar, p pVar, s sVar, lt.j jVar, z6 z6Var, c cVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.f = zonedDateTime;
        this.g = bool;
        this.h = oVar;
        this.i = wiVar;
        this.j = tVar;
        this.k = ya0Var;
        this.l = str5;
        this.m = mVar;
        this.n = nVar;
        this.o = yiVar;
        this.p = pVar;
        this.q = sVar;
        this.r = jVar;
        this.s = z6Var;
        this.t = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return k71.k.b(this.a, uVar.a) && k71.k.b(this.b, uVar.b) && k71.k.b(this.c, uVar.c) && k71.k.b(this.d, uVar.d) && this.e == uVar.e && k71.k.b(this.f, uVar.f) && k71.k.b(this.g, uVar.g) && k71.k.b(this.h, uVar.h) && this.i == uVar.i && k71.k.b(this.j, uVar.j) && this.k == uVar.k && k71.k.b(this.l, uVar.l) && k71.k.b(this.m, uVar.m) && k71.k.b(this.n, uVar.n) && this.o == uVar.o && k71.k.b(this.p, uVar.p) && k71.k.b(this.q, uVar.q) && k71.k.b(this.r, uVar.r) && k71.k.b(this.s, uVar.s) && k71.k.b(this.t, uVar.t);
    }

    public final int hashCode() {
        int a = com.github.rudroid.m0.a(this.f, a0.s0.b(this.e, h1.i(h1.i(h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), this.d, 31), 31), 31);
        Boolean bool = this.g;
        int hashCode = (this.j.hashCode() + ((this.i.hashCode() + a0.s0.b(this.h.a, (a + (bool == null ? 0 : bool.hashCode())) * 31, 31)) * 31)) * 31;
        ya0 ya0Var = this.k;
        int hashCode2 = (this.m.hashCode() + h1.i((hashCode + (ya0Var == null ? 0 : ya0Var.hashCode())) * 31, this.l, 31)) * 31;
        n nVar = this.n;
        int hashCode3 = (hashCode2 + (nVar == null ? 0 : Integer.hashCode(nVar.a))) * 31;
        yi yiVar = this.o;
        int hashCode4 = (hashCode3 + (yiVar == null ? 0 : yiVar.hashCode())) * 31;
        p pVar = this.p;
        int hashCode5 = (hashCode4 + (pVar == null ? 0 : pVar.hashCode())) * 31;
        s sVar = this.q;
        return this.t.hashCode() + ((this.s.hashCode() + ((this.r.hashCode() + ((hashCode5 + (sVar != null ? sVar.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("IssueListItemFragment(__typename=", this.a, ", id=", this.b, ", title=");
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
        o.append(", assignedActors=");
        o.append(this.m);
        o.append(", closedByPullRequestsReferences=");
        o.append(this.n);
        o.append(", stateReason=");
        o.append(this.o);
        o.append(", issueType=");
        o.append(this.p);
        o.append(", parent=");
        o.append(this.q);
        o.append(", labelsFragment=");
        o.append(this.r);
        o.append(", subIssueProgressFragment=");
        o.append(this.s);
        o.append(", duplicateOfFragment=");
        o.append(this.t);
        o.append(")");
        return o.toString();
    }
}
