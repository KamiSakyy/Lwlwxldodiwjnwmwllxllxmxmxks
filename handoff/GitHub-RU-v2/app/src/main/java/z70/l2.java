package z70;

import hc0.ev;
import hc0.fm;
import hc0.nl;
import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l2 implements aa.h0 {
    public String a;
    public String b;
    public boolean c;
    public String d;
    public String e;
    public int f;
    public ZonedDateTime g;
    public e2 h;
    public f2 i;
    public Boolean j;
    public Integer k;
    public fm l;
    public j2 m;
    public String n;
    public ev o;
    public nl p;
    public a2 q;
    public d2 r;
    public b2 s;
    public c60.j t;
    public s7 u;

    public l2(String str, String str2, boolean z, String str3, String str4, int i, ZonedDateTime zonedDateTime, e2 e2Var, f2 f2Var, Boolean bool, Integer num, fm fmVar, j2 j2Var, String str5, ev evVar, nl nlVar, a2 a2Var, d2 d2Var, b2 b2Var, c60.j jVar, s7 s7Var) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.e = str4;
        this.f = i;
        this.g = zonedDateTime;
        this.h = e2Var;
        this.i = f2Var;
        this.j = bool;
        this.k = num;
        this.l = fmVar;
        this.m = j2Var;
        this.n = str5;
        this.o = evVar;
        this.p = nlVar;
        this.q = a2Var;
        this.r = d2Var;
        this.s = b2Var;
        this.t = jVar;
        this.u = s7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l2)) {
            return false;
        }
        l2 l2Var = (l2) obj;
        return k71.k.b(this.a, l2Var.a) && k71.k.b(this.b, l2Var.b) && this.c == l2Var.c && k71.k.b(this.d, l2Var.d) && k71.k.b(this.e, l2Var.e) && this.f == l2Var.f && k71.k.b(this.g, l2Var.g) && k71.k.b(this.h, l2Var.h) && k71.k.b(this.i, l2Var.i) && k71.k.b(this.j, l2Var.j) && k71.k.b(this.k, l2Var.k) && this.l == l2Var.l && k71.k.b(this.m, l2Var.m) && k71.k.b(this.n, l2Var.n) && this.o == l2Var.o && this.p == l2Var.p && k71.k.b(this.q, l2Var.q) && k71.k.b(this.r, l2Var.r) && k71.k.b(this.s, l2Var.s) && k71.k.b(this.t, l2Var.t) && k71.k.b(this.u, l2Var.u);
    }

    public final int hashCode() {
        int a = com.github.rudroid.m0.a(this.g, a0.s0.b(this.f, com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(x.i.e(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), 31, this.c), this.d, 31), this.e, 31), 31), 31);
        e2 e2Var = this.h;
        int hashCode = (a + (e2Var == null ? 0 : e2Var.hashCode())) * 31;
        f2 f2Var = this.i;
        int hashCode2 = (hashCode + (f2Var == null ? 0 : f2Var.hashCode())) * 31;
        Boolean bool = this.j;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.k;
        int i = com.github.rudroid.copilot.h1.i((this.m.hashCode() + ((this.l.hashCode() + ((hashCode3 + (num == null ? 0 : num.hashCode())) * 31)) * 31)) * 31, this.n, 31);
        ev evVar = this.o;
        int hashCode4 = (i + (evVar == null ? 0 : evVar.hashCode())) * 31;
        nl nlVar = this.p;
        int hashCode5 = (this.r.hashCode() + ((this.q.hashCode() + ((hashCode4 + (nlVar == null ? 0 : nlVar.hashCode())) * 31)) * 31)) * 31;
        b2 b2Var = this.s;
        return this.u.hashCode() + ((this.t.hashCode() + ((hashCode5 + (b2Var != null ? Integer.hashCode(b2Var.a) : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("PullRequestItemFragment(__typename=", this.a, ", id=", this.b, ", isDraft=");
        com.github.rudroid.m0.z(o, this.c, ", title=", this.d, ", titleHTMLString=");
        a0.s0.w(this.f, this.e, ", number=", ", createdAt=", o);
        o.append(this.g);
        o.append(", headRepository=");
        o.append(this.h);
        o.append(", headRepositoryOwner=");
        o.append(this.i);
        o.append(", isReadByViewer=");
        o.append(this.j);
        o.append(", totalCommentsCount=");
        o.append(this.k);
        o.append(", pullRequestState=");
        o.append(this.l);
        o.append(", repository=");
        o.append(this.m);
        o.append(", url=");
        o.append(this.n);
        o.append(", viewerSubscription=");
        o.append(this.o);
        o.append(", reviewDecision=");
        o.append(this.p);
        o.append(", assignees=");
        o.append(this.q);
        o.append(", commits=");
        o.append(this.r);
        o.append(", closingIssuesReferences=");
        o.append(this.s);
        o.append(", labelsFragment=");
        o.append(this.t);
        o.append(", viewerLatestReviewRequestStateFragment=");
        o.append(this.u);
        o.append(")");
        return o.toString();
    }
}
