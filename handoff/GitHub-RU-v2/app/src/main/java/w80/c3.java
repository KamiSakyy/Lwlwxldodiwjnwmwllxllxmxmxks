package w80;

import hc0.jc;
import hc0.lc;
import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c3 implements aa.h0 {
    public final i30.i A;
    public final c60.j B;
    public final i60.o C;
    public final aa0.a D;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final ZonedDateTime f;
    public final boolean g;
    public final boolean h;
    public final w2 i;
    public final Boolean j;
    public final String k;
    public final String l;
    public final int m;
    public final jc n;
    public final y2 o;
    public final b3 p;
    public final int q;
    public final int r;
    public final boolean s;
    public final lc t;
    public final boolean u;
    public final boolean v;
    public final Boolean w;
    public final c40.c x;
    public final i80.c y;
    public final g70.a z;

    public c3(String str, String str2, String str3, String str4, String str5, ZonedDateTime zonedDateTime, boolean z, boolean z2, w2 w2Var, Boolean bool, String str6, String str7, int i, jc jcVar, y2 y2Var, b3 b3Var, int i2, int i3, boolean z3, lc lcVar, boolean z4, boolean z5, Boolean bool2, c40.c cVar, i80.c cVar2, g70.a aVar, i30.i iVar, c60.j jVar, i60.o oVar, aa0.a aVar2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = zonedDateTime;
        this.g = z;
        this.h = z2;
        this.i = w2Var;
        this.j = bool;
        this.k = str6;
        this.l = str7;
        this.m = i;
        this.n = jcVar;
        this.o = y2Var;
        this.p = b3Var;
        this.q = i2;
        this.r = i3;
        this.s = z3;
        this.t = lcVar;
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
        if (!(obj instanceof c3)) {
            return false;
        }
        c3 c3Var = (c3) obj;
        return k71.k.b(this.a, c3Var.a) && k71.k.b(this.b, c3Var.b) && k71.k.b(this.c, c3Var.c) && k71.k.b(this.d, c3Var.d) && k71.k.b(this.e, c3Var.e) && k71.k.b(this.f, c3Var.f) && this.g == c3Var.g && this.h == c3Var.h && k71.k.b(this.i, c3Var.i) && k71.k.b(this.j, c3Var.j) && k71.k.b(this.k, c3Var.k) && k71.k.b(this.l, c3Var.l) && this.m == c3Var.m && this.n == c3Var.n && k71.k.b(this.o, c3Var.o) && k71.k.b(this.p, c3Var.p) && this.q == c3Var.q && this.r == c3Var.r && this.s == c3Var.s && this.t == c3Var.t && this.u == c3Var.u && this.v == c3Var.v && k71.k.b(this.w, c3Var.w) && k71.k.b(this.x, c3Var.x) && k71.k.b(this.y, c3Var.y) && k71.k.b(this.z, c3Var.z) && k71.k.b(this.A, c3Var.A) && k71.k.b(this.B, c3Var.B) && k71.k.b(this.C, c3Var.C) && k71.k.b(this.D, c3Var.D);
    }

    public final int hashCode() {
        int e = x.i.e(x.i.e(com.github.rudroid.m0.a(this.f, com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), this.d, 31), this.e, 31), 31), 31, this.g), 31, this.h);
        w2 w2Var = this.i;
        int hashCode = (e + (w2Var == null ? 0 : w2Var.hashCode())) * 31;
        Boolean bool = this.j;
        int hashCode2 = (this.n.hashCode() + a0.s0.b(this.m, com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i((hashCode + (bool == null ? 0 : bool.hashCode())) * 31, this.k, 31), this.l, 31), 31)) * 31;
        y2 y2Var = this.o;
        int e2 = x.i.e(a0.s0.b(this.r, a0.s0.b(this.q, (this.p.hashCode() + ((hashCode2 + (y2Var == null ? 0 : y2Var.hashCode())) * 31)) * 31, 31), 31), 31, this.s);
        lc lcVar = this.t;
        int e3 = x.i.e(x.i.e((e2 + (lcVar == null ? 0 : lcVar.hashCode())) * 31, 31, this.u), 31, this.v);
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
