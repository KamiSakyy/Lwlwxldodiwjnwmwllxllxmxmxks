package l01;

import com.github.rudroid.copilot.h1;
import com.github.service.models.response.PullRequestState;
import java.time.ZonedDateTime;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class u0 implements x {
    public String a;
    public String b;
    public String c;
    public int d;
    public ZonedDateTime e;
    public int f;
    public int g;
    public int h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public Object o;
    public PullRequestState p;
    public boolean q;
    public boolean r;
    public String s;
    public String t;

    public u0(String str, String str2, String str3, int i, ZonedDateTime zonedDateTime, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, List list, PullRequestState pullRequestState, boolean z7, boolean z8, String str4, String str5) {
        k71.k.g(pullRequestState, "state");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = zonedDateTime;
        this.f = i2;
        this.g = i3;
        this.h = i4;
        this.i = z;
        this.j = z2;
        this.k = z3;
        this.l = z4;
        this.m = z5;
        this.n = z6;
        this.o = list;
        this.p = pullRequestState;
        this.q = z7;
        this.r = z8;
        this.s = str4;
        this.t = str5;
    }

    @Override // l01.x
    public final boolean a() {
        return this.l;
    }

    @Override // l01.x
    public final int b() {
        return this.d;
    }

    @Override // l01.u
    public final ZonedDateTime c() {
        return this.e;
    }

    @Override // l01.x
    public final boolean d() {
        return this.m;
    }

    @Override // l01.x
    public final boolean e() {
        return this.n;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return this.a.equals(u0Var.a) && this.b.equals(u0Var.b) && this.c.equals(u0Var.c) && this.d == u0Var.d && this.e.equals(u0Var.e) && this.f == u0Var.f && this.g == u0Var.g && this.h == u0Var.h && this.i == u0Var.i && this.j == u0Var.j && this.k == u0Var.k && this.l == u0Var.l && this.m == u0Var.m && this.n == u0Var.n && this.o.equals(u0Var.o) && this.p == u0Var.p && this.q == u0Var.q && this.r == u0Var.r && this.s.equals(u0Var.s) && this.t.equals(u0Var.t);
    }

    @Override // l01.x
    public final boolean f() {
        return this.j;
    }

    @Override // l01.u
    public final String getId() {
        return this.a;
    }

    @Override // l01.u
    public final String getTitle() {
        return this.b;
    }

    public final int hashCode() {
        return this.t.hashCode() + h1.i(x.i.e(x.i.e((this.p.hashCode() + h1.h(x.i.e(x.i.e(x.i.e(x.i.e(x.i.e(x.i.e(a0.s0.b(this.h, a0.s0.b(this.g, a0.s0.b(this.f, com.github.rudroid.m0.a(this.e, a0.s0.b(this.d, h1.i(h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), 31), 31), 31), 31), 31), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), this.o, 31)) * 31, 31, this.q), 31, this.r), this.s, 31);
    }

    @Override // l01.x
    public final boolean m() {
        return this.k;
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("PullRequestProjectContent(id=", this.a, ", title=", this.b, ", url=");
        a0.s0.w(this.d, this.c, ", number=", ", lastUpdatedAt=", o);
        o.append(this.e);
        o.append(", commentCount=");
        o.append(this.f);
        o.append(", completedNumberOfTasks=");
        a0.s0.z(o, this.g, ", totalNumberOfTasks=", this.h, ", isLocked=");
        com.github.rudroid.m0.A(o, this.i, ", viewerCanReopen=", this.j, ", viewerCanUpdate=");
        com.github.rudroid.m0.A(o, this.k, ", viewerDidAuthor=", this.l, ", viewerCanAssign=");
        com.github.rudroid.m0.A(o, this.m, ", viewerCanLabel=", this.n, ", linkedItems=");
        o.append(this.o);
        o.append(", state=");
        o.append(this.p);
        o.append(", isDraft=");
        com.github.rudroid.m0.A(o, this.q, ", isInMergeQueue=", this.r, ", baseRefName=");
        return x.i.k(o, this.s, ", headRefName=", this.t, ")");
    }

    public Object i;
}
