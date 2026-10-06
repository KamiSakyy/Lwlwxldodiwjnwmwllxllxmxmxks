package oj0;

import gn0.xc;
import gn0.zc;
import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g3 implements aa.h0 {
    public yd0.i A;
    public sg0.j B;
    public yg0.o C;
    public sk0.a D;
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public ZonedDateTime f;
    public boolean g;
    public boolean h;
    public a3 i;
    public Boolean j;
    public String k;
    public String l;
    public int m;
    public xc n;
    public c3 o;
    public f3 p;
    public int q;
    public int r;
    public boolean s;
    public zc t;
    public boolean u;
    public boolean v;
    public Boolean w;
    public se0.c x;
    public aj0.c y;
    public yh0.a z;

    public g3(String str, String str2, String str3, String str4, String str5, ZonedDateTime zonedDateTime, boolean z, boolean z2, a3 a3Var, Boolean bool, String str6, String str7, int i, xc xcVar, c3 c3Var, f3 f3Var, int i2, int i3, boolean z3, zc zcVar, boolean z4, boolean z5, Boolean bool2, se0.c cVar, aj0.c cVar2, yh0.a aVar, yd0.i iVar, sg0.j jVar, yg0.o oVar, sk0.a aVar2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = zonedDateTime;
        this.g = z;
        this.h = z2;
        this.i = a3Var;
        this.j = bool;
        this.k = str6;
        this.l = str7;
        this.m = i;
        this.n = xcVar;
        this.o = c3Var;
        this.p = f3Var;
        this.q = i2;
        this.r = i3;
        this.s = z3;
        this.t = zcVar;
        this.u = z4;
        this.v = z5;
        this.w = bool2;
        this.x = cVar;
        this.y = cVar2;
        this.z = aVar;
        this.A = iVar;
        this.B = jVar;
        this.C = oVar;
        this.D = aVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g3)) {
            return false;
        }
        g3 g3Var = (g3) obj;
        return k71.k.b(this.a, g3Var.a) && k71.k.b(this.b, g3Var.b) && k71.k.b(this.c, g3Var.c) && k71.k.b(this.d, g3Var.d) && k71.k.b(this.e, g3Var.e) && k71.k.b(this.f, g3Var.f) && this.g == g3Var.g && this.h == g3Var.h && k71.k.b(this.i, g3Var.i) && k71.k.b(this.j, g3Var.j) && k71.k.b(this.k, g3Var.k) && k71.k.b(this.l, g3Var.l) && this.m == g3Var.m && this.n == g3Var.n && k71.k.b(this.o, g3Var.o) && k71.k.b(this.p, g3Var.p) && this.q == g3Var.q && this.r == g3Var.r && this.s == g3Var.s && this.t == g3Var.t && this.u == g3Var.u && this.v == g3Var.v && k71.k.b(this.w, g3Var.w) && k71.k.b(this.x, g3Var.x) && k71.k.b(this.y, g3Var.y) && k71.k.b(this.z, g3Var.z) && k71.k.b(this.A, g3Var.A) && k71.k.b(this.B, g3Var.B) && k71.k.b(this.C, g3Var.C) && k71.k.b(this.D, g3Var.D);
    }

    public final int hashCode() {
        int e = x.i.e(x.i.e(com.github.rudroid.m0.a(this.f, com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), this.d, 31), this.e, 31), 31), 31, this.g), 31, this.h);
        a3 a3Var = this.i;
        int hashCode = (e + (a3Var == null ? 0 : a3Var.hashCode())) * 31;
        Boolean bool = this.j;
        int hashCode2 = (this.n.hashCode() + a0.s0.b(this.m, com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i((hashCode + (bool == null ? 0 : bool.hashCode())) * 31, this.k, 31), this.l, 31), 31)) * 31;
        c3 c3Var = this.o;
        int e2 = x.i.e(a0.s0.b(this.r, a0.s0.b(this.q, (this.p.hashCode() + ((hashCode2 + (c3Var == null ? 0 : c3Var.hashCode())) * 31)) * 31, 31), 31), 31, this.s);
        zc zcVar = this.t;
        int e3 = x.i.e(x.i.e((e2 + (zcVar == null ? 0 : zcVar.hashCode())) * 31, 31, this.u), 31, this.v);
        Boolean bool2 = this.w;
        return this.D.hashCode() + ((this.C.hashCode() + ((this.B.hashCode() + ((this.A.hashCode() + ((this.z.hashCode() + ((this.y.hashCode() + ((this.x.hashCode() + ((e3 + (bool2 != null ? bool2.hashCode() : 0)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
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
        o.append(", projectCards=");
        o.append(this.p);
        o.append(", completeTaskListItemCount=");
        a0.s0.z(o, this.q, ", incompleteTaskListItemCount=", this.r, ", viewerCanReopen=");
        o.append(this.s);
        o.append(", stateReason=");
        o.append(this.t);
        o.append(", viewerCanAssign=");
        com.github.rudroid.m0.A(o, this.u, ", viewerCanLabel=", this.v, ", isPinned=");
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
        o.append(")");
        return o.toString();
    }
}
