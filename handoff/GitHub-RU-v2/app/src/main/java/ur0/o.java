package ur0;

import a0.s0;
import com.github.rudroid.copilot.h1;
import java.time.ZonedDateTime;
import pz0.bf;
import pz0.df;
import pz0.f40;
import uu0.d6;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o implements aa.h0 {
    public String a;
    public String b;
    public String c;
    public String d;
    public int e;
    public ZonedDateTime f;
    public Boolean g;
    public i h;
    public bf i;
    public n j;
    public f40 k;
    public String l;
    public g m;
    public h n;
    public df o;
    public j p;
    public m q;
    public cs0.j r;
    public d6 s;

    public o(String str, String str2, String str3, String str4, int i, ZonedDateTime zonedDateTime, Boolean bool, i iVar, bf bfVar, n nVar, f40 f40Var, String str5, g gVar, h hVar, df dfVar, j jVar, m mVar, cs0.j jVar2, d6 d6Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.f = zonedDateTime;
        this.g = bool;
        this.h = iVar;
        this.i = bfVar;
        this.j = nVar;
        this.k = f40Var;
        this.l = str5;
        this.m = gVar;
        this.n = hVar;
        this.o = dfVar;
        this.p = jVar;
        this.q = mVar;
        this.r = jVar2;
        this.s = d6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return k71.k.b(this.a, oVar.a) && k71.k.b(this.b, oVar.b) && k71.k.b(this.c, oVar.c) && k71.k.b(this.d, oVar.d) && this.e == oVar.e && k71.k.b(this.f, oVar.f) && k71.k.b(this.g, oVar.g) && k71.k.b(this.h, oVar.h) && this.i == oVar.i && k71.k.b(this.j, oVar.j) && this.k == oVar.k && k71.k.b(this.l, oVar.l) && k71.k.b(this.m, oVar.m) && k71.k.b(this.n, oVar.n) && this.o == oVar.o && k71.k.b(this.p, oVar.p) && k71.k.b(this.q, oVar.q) && k71.k.b(this.r, oVar.r) && k71.k.b(this.s, oVar.s);
    }

    public final int hashCode() {
        int a = com.github.rudroid.m0.a(this.f, s0.b(this.e, h1.i(h1.i(h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), this.d, 31), 31), 31);
        Boolean bool = this.g;
        int hashCode = (this.j.hashCode() + ((this.i.hashCode() + s0.b(this.h.a, (a + (bool == null ? 0 : bool.hashCode())) * 31, 31)) * 31)) * 31;
        f40 f40Var = this.k;
        int hashCode2 = (this.m.hashCode() + h1.i((hashCode + (f40Var == null ? 0 : f40Var.hashCode())) * 31, this.l, 31)) * 31;
        h hVar = this.n;
        int hashCode3 = (hashCode2 + (hVar == null ? 0 : Integer.hashCode(hVar.a))) * 31;
        df dfVar = this.o;
        int hashCode4 = (hashCode3 + (dfVar == null ? 0 : dfVar.hashCode())) * 31;
        j jVar = this.p;
        int hashCode5 = (hashCode4 + (jVar == null ? 0 : jVar.hashCode())) * 31;
        m mVar = this.q;
        int hashCode6 = mVar != null ? mVar.hashCode() : 0;
        return this.s.hashCode() + ((this.r.hashCode() + ((hashCode5 + hashCode6) * 31)) * 31);
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
        o.append(", issueType=");
        o.append(this.p);
        o.append(", parent=");
        o.append(this.q);
        o.append(", labelsFragment=");
        o.append(this.r);
        o.append(", subIssueProgressFragment=");
        o.append(this.s);
        o.append(")");
        return o.toString();
    }
}
