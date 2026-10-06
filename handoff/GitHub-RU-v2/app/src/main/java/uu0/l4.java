package uu0;

import java.time.ZonedDateTime;
import pz0.bf;
import pz0.df;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l4 implements aa.h0 {
    public ep0.i A;
    public cs0.j B;
    public is0.o C;
    public bw0.a D;
    public r0 E;
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public ZonedDateTime f;
    public boolean g;
    public boolean h;
    public i4 i;
    public Boolean j;
    public String k;
    public String l;
    public int m;
    public bf n;
    public k4 o;
    public int p;
    public int q;
    public boolean r;
    public df s;
    public boolean t;
    public boolean u;
    public Boolean v;
    public j4 w;
    public yp0.c x;
    public gu0.c y;
    public gt0.a z;

    public l4(String str, String str2, String str3, String str4, String str5, ZonedDateTime zonedDateTime, boolean z, boolean z2, i4 i4Var, Boolean bool, String str6, String str7, int i, bf bfVar, k4 k4Var, int i2, int i3, boolean z3, df dfVar, boolean z4, boolean z5, Boolean bool2, j4 j4Var, yp0.c cVar, gu0.c cVar2, gt0.a aVar, ep0.i iVar, cs0.j jVar, is0.o oVar, bw0.a aVar2, r0 r0Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = zonedDateTime;
        this.g = z;
        this.h = z2;
        this.i = i4Var;
        this.j = bool;
        this.k = str6;
        this.l = str7;
        this.m = i;
        this.n = bfVar;
        this.o = k4Var;
        this.p = i2;
        this.q = i3;
        this.r = z3;
        this.s = dfVar;
        this.t = z4;
        this.u = z5;
        this.v = bool2;
        this.w = j4Var;
        this.x = cVar;
        this.y = cVar2;
        this.z = aVar;
        this.A = iVar;
        this.B = jVar;
        this.C = oVar;
        this.D = aVar2;
        this.E = r0Var;
    }

    public static l4 a(l4 l4Var, bf bfVar, df dfVar) {
        return new l4(l4Var.a, l4Var.b, l4Var.c, l4Var.d, l4Var.e, l4Var.f, l4Var.g, l4Var.h, l4Var.i, l4Var.j, l4Var.k, l4Var.l, l4Var.m, bfVar, l4Var.o, l4Var.p, l4Var.q, true, dfVar, l4Var.t, l4Var.u, l4Var.v, l4Var.w, l4Var.x, l4Var.y, l4Var.z, l4Var.A, l4Var.B, l4Var.C, l4Var.D, l4Var.E);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l4)) {
            return false;
        }
        l4 l4Var = (l4) obj;
        return k71.k.b(this.a, l4Var.a) && k71.k.b(this.b, l4Var.b) && k71.k.b(this.c, l4Var.c) && k71.k.b(this.d, l4Var.d) && k71.k.b(this.e, l4Var.e) && k71.k.b(this.f, l4Var.f) && this.g == l4Var.g && this.h == l4Var.h && k71.k.b(this.i, l4Var.i) && k71.k.b(this.j, l4Var.j) && k71.k.b(this.k, l4Var.k) && k71.k.b(this.l, l4Var.l) && this.m == l4Var.m && this.n == l4Var.n && k71.k.b(this.o, l4Var.o) && this.p == l4Var.p && this.q == l4Var.q && this.r == l4Var.r && this.s == l4Var.s && this.t == l4Var.t && this.u == l4Var.u && k71.k.b(this.v, l4Var.v) && k71.k.b(this.w, l4Var.w) && k71.k.b(this.x, l4Var.x) && k71.k.b(this.y, l4Var.y) && k71.k.b(this.z, l4Var.z) && k71.k.b(this.A, l4Var.A) && k71.k.b(this.B, l4Var.B) && k71.k.b(this.C, l4Var.C) && k71.k.b(this.D, l4Var.D) && k71.k.b(this.E, l4Var.E);
    }

    public final int hashCode() {
        int e = x.i.e(x.i.e(com.github.rudroid.m0.a(this.f, com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), this.d, 31), this.e, 31), 31), 31, this.g), 31, this.h);
        i4 i4Var = this.i;
        int hashCode = (e + (i4Var == null ? 0 : i4Var.hashCode())) * 31;
        Boolean bool = this.j;
        int hashCode2 = (this.n.hashCode() + a0.s0.b(this.m, com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i((hashCode + (bool == null ? 0 : bool.hashCode())) * 31, this.k, 31), this.l, 31), 31)) * 31;
        k4 k4Var = this.o;
        int e2 = x.i.e(a0.s0.b(this.q, a0.s0.b(this.p, (hashCode2 + (k4Var == null ? 0 : k4Var.hashCode())) * 31, 31), 31), 31, this.r);
        df dfVar = this.s;
        int e3 = x.i.e(x.i.e((e2 + (dfVar == null ? 0 : dfVar.hashCode())) * 31, 31, this.t), 31, this.u);
        Boolean bool2 = this.v;
        int hashCode3 = (e3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        j4 j4Var = this.w;
        return this.E.hashCode() + ((this.D.hashCode() + ((this.C.hashCode() + ((this.B.hashCode() + ((this.A.hashCode() + ((this.z.hashCode() + ((this.y.hashCode() + ((this.x.hashCode() + ((hashCode3 + (j4Var != null ? j4Var.hashCode() : 0)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("RepositoryNodeFragmentIssue(__typename=", this.a, ", url=", this.b, ", id=");
        f1.e.x(o, this.c, ", title=", this.d, ", titleHTMLString=");
        com.github.rudroid.copilot.h1.A(this.e, ", createdAt=", ", viewerDidAuthor=", o, this.f);
        com.github.rudroid.m0.A(o, this.g, ", locked=", this.h, ", author=");
        o.append(this.i);
        o.append(", isReadByViewer=");
        o.append(this.j);
        o.append(", bodyHtml=");
        f1.e.x(o, this.k, ", bodyUrl=", this.l, ", number=");
        o.append(this.m);
        o.append(", issueState=");
        o.append(this.n);
        o.append(", milestone=");
        o.append(this.o);
        o.append(", completeTaskListItemCount=");
        o.append(this.p);
        o.append(", incompleteTaskListItemCount=");
        com.github.rudroid.m0.w(o, this.q, ", viewerCanReopen=", this.r, ", stateReason=");
        o.append(this.s);
        o.append(", viewerCanAssign=");
        o.append(this.t);
        o.append(", viewerCanLabel=");
        o.append(this.u);
        o.append(", isPinned=");
        o.append(this.v);
        o.append(", issueType=");
        o.append(this.w);
        o.append(", commentFragment=");
        o.append(this.x);
        o.append(", reactionFragment=");
        o.append(this.y);
        o.append(", orgBlockableFragment=");
        o.append(this.z);
        o.append(", assigneeFragment=");
        o.append(this.A);
        o.append(", labelsFragment=");
        o.append(this.B);
        o.append(", linkedPullRequests=");
        o.append(this.C);
        o.append(", updatableFields=");
        o.append(this.D);
        o.append(", parentIssueFragment=");
        o.append(this.E);
        o.append(")");
        return o.toString();
    }
}
