package dw;

import java.time.ZonedDateTime;
import m10.wi;
import m10.yi;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t4 implements aa.h0 {
    public final pv.c A;
    public final pu.a B;
    public final gq.i C;
    public final lt.j D;
    public final rt.o E;
    public final mx.a F;
    public final s0 G;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final ZonedDateTime f;
    public final boolean g;
    public final boolean h;
    public final m4 i;
    public final Boolean j;
    public final String k;
    public final String l;
    public final int m;
    public final wi n;
    public final p4 o;
    public final int p;
    public final int q;
    public final boolean r;
    public final yi s;
    public final boolean t;
    public final boolean u;
    public final Boolean v;
    public final o4 w;
    public final n4 x;
    public final s4 y;
    public final ar.c z;

    public t4(String str, String str2, String str3, String str4, String str5, ZonedDateTime zonedDateTime, boolean z, boolean z2, m4 m4Var, Boolean bool, String str6, String str7, int i, wi wiVar, p4 p4Var, int i2, int i3, boolean z3, yi yiVar, boolean z4, boolean z5, Boolean bool2, o4 o4Var, n4 n4Var, s4 s4Var, ar.c cVar, pv.c cVar2, pu.a aVar, gq.i iVar, lt.j jVar, rt.o oVar, mx.a aVar2, s0 s0Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = zonedDateTime;
        this.g = z;
        this.h = z2;
        this.i = m4Var;
        this.j = bool;
        this.k = str6;
        this.l = str7;
        this.m = i;
        this.n = wiVar;
        this.o = p4Var;
        this.p = i2;
        this.q = i3;
        this.r = z3;
        this.s = yiVar;
        this.t = z4;
        this.u = z5;
        this.v = bool2;
        this.w = o4Var;
        this.x = n4Var;
        this.y = s4Var;
        this.z = cVar;
        this.A = cVar2;
        this.B = aVar;
        this.C = iVar;
        this.D = jVar;
        this.E = oVar;
        this.F = aVar2;
        this.G = s0Var;
    }

    public static t4 a(t4 t4Var, wi wiVar, yi yiVar) {
        return new t4(t4Var.a, t4Var.b, t4Var.c, t4Var.d, t4Var.e, t4Var.f, t4Var.g, t4Var.h, t4Var.i, t4Var.j, t4Var.k, t4Var.l, t4Var.m, wiVar, t4Var.o, t4Var.p, t4Var.q, true, yiVar, t4Var.t, t4Var.u, t4Var.v, t4Var.w, t4Var.x, t4Var.y, t4Var.z, t4Var.A, t4Var.B, t4Var.C, t4Var.D, t4Var.E, t4Var.F, t4Var.G);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t4)) {
            return false;
        }
        t4 t4Var = (t4) obj;
        return k71.k.b(this.a, t4Var.a) && k71.k.b(this.b, t4Var.b) && k71.k.b(this.c, t4Var.c) && k71.k.b(this.d, t4Var.d) && k71.k.b(this.e, t4Var.e) && k71.k.b(this.f, t4Var.f) && this.g == t4Var.g && this.h == t4Var.h && k71.k.b(this.i, t4Var.i) && k71.k.b(this.j, t4Var.j) && k71.k.b(this.k, t4Var.k) && k71.k.b(this.l, t4Var.l) && this.m == t4Var.m && this.n == t4Var.n && k71.k.b(this.o, t4Var.o) && this.p == t4Var.p && this.q == t4Var.q && this.r == t4Var.r && this.s == t4Var.s && this.t == t4Var.t && this.u == t4Var.u && k71.k.b(this.v, t4Var.v) && k71.k.b(this.w, t4Var.w) && k71.k.b(this.x, t4Var.x) && k71.k.b(this.y, t4Var.y) && k71.k.b(this.z, t4Var.z) && k71.k.b(this.A, t4Var.A) && k71.k.b(this.B, t4Var.B) && k71.k.b(this.C, t4Var.C) && k71.k.b(this.D, t4Var.D) && k71.k.b(this.E, t4Var.E) && k71.k.b(this.F, t4Var.F) && k71.k.b(this.G, t4Var.G);
    }

    public final int hashCode() {
        int e = x.i.e(x.i.e(com.github.rudroid.m0.a(this.f, com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), this.d, 31), this.e, 31), 31), 31, this.g), 31, this.h);
        m4 m4Var = this.i;
        int hashCode = (e + (m4Var == null ? 0 : m4Var.hashCode())) * 31;
        Boolean bool = this.j;
        int hashCode2 = (this.n.hashCode() + a0.s0.b(this.m, com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i((hashCode + (bool == null ? 0 : bool.hashCode())) * 31, this.k, 31), this.l, 31), 31)) * 31;
        p4 p4Var = this.o;
        int e2 = x.i.e(a0.s0.b(this.q, a0.s0.b(this.p, (hashCode2 + (p4Var == null ? 0 : p4Var.hashCode())) * 31, 31), 31), 31, this.r);
        yi yiVar = this.s;
        int e3 = x.i.e(x.i.e((e2 + (yiVar == null ? 0 : yiVar.hashCode())) * 31, 31, this.t), 31, this.u);
        Boolean bool2 = this.v;
        int hashCode3 = (e3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        o4 o4Var = this.w;
        int hashCode4 = (hashCode3 + (o4Var == null ? 0 : o4Var.hashCode())) * 31;
        n4 n4Var = this.x;
        return this.G.hashCode() + ((this.F.hashCode() + ((this.E.hashCode() + ((this.D.hashCode() + ((this.C.hashCode() + ((this.B.hashCode() + ((this.A.hashCode() + ((this.z.hashCode() + ((this.y.hashCode() + ((hashCode4 + (n4Var != null ? n4Var.hashCode() : 0)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
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
        o.append(", duplicateOf=");
        o.append(this.x);
        o.append(", suggestedActors=");
        o.append(this.y);
        o.append(", commentFragment=");
        o.append(this.z);
        o.append(", reactionFragment=");
        o.append(this.A);
        o.append(", orgBlockableFragment=");
        o.append(this.B);
        o.append(", assigneeFragment=");
        o.append(this.C);
        o.append(", labelsFragment=");
        o.append(this.D);
        o.append(", linkedPullRequests=");
        o.append(this.E);
        o.append(", updatableFields=");
        o.append(this.F);
        o.append(", parentIssueFragment=");
        o.append(this.G);
        o.append(")");
        return o.toString();
    }
}
