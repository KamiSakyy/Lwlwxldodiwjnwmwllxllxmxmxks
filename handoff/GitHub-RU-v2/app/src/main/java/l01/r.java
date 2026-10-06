package l01;

import com.github.rudroid.copilot.h1;
import com.github.service.models.response.issueorpullrequest.CloseReason;
import com.github.service.models.response.issueorpullrequest.IssueType;
import com.github.service.models.response.type.IssueState;
import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r implements x {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final ZonedDateTime e;
    public final int f;
    public final int g;
    public final int h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final IssueState o;
    public final CloseReason p;
    public final IssueType q;
    public final h01.p r;
    public final h01.j s;
    public final String t;
    public final String u;
    public final z01.p v;

    public r(String str, String str2, String str3, int i, ZonedDateTime zonedDateTime, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, IssueState issueState, CloseReason closeReason, IssueType issueType, h01.p pVar, h01.j jVar, String str4, String str5, z01.p pVar2) {
        k71.k.g(issueState, "state");
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
        this.o = issueState;
        this.p = closeReason;
        this.q = issueType;
        this.r = pVar;
        this.s = jVar;
        this.t = str4;
        this.u = str5;
        this.v = pVar2;
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
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return k71.k.b(this.a, rVar.a) && k71.k.b(this.b, rVar.b) && k71.k.b(this.c, rVar.c) && this.d == rVar.d && k71.k.b(this.e, rVar.e) && this.f == rVar.f && this.g == rVar.g && this.h == rVar.h && this.i == rVar.i && this.j == rVar.j && this.k == rVar.k && this.l == rVar.l && this.m == rVar.m && this.n == rVar.n && this.o == rVar.o && this.p == rVar.p && k71.k.b(this.q, rVar.q) && k71.k.b(this.r, rVar.r) && k71.k.b(this.s, rVar.s) && k71.k.b(this.t, rVar.t) && k71.k.b(this.u, rVar.u) && k71.k.b(this.v, rVar.v);
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
        int hashCode = (this.o.hashCode() + x.i.e(x.i.e(x.i.e(x.i.e(x.i.e(x.i.e(a0.s0.b(this.h, a0.s0.b(this.g, a0.s0.b(this.f, com.github.rudroid.m0.a(this.e, a0.s0.b(this.d, h1.i(h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), 31), 31), 31), 31), 31), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n)) * 31;
        CloseReason closeReason = this.p;
        int hashCode2 = (hashCode + (closeReason == null ? 0 : closeReason.hashCode())) * 31;
        IssueType issueType = this.q;
        int hashCode3 = (hashCode2 + (issueType == null ? 0 : issueType.hashCode())) * 31;
        h01.p pVar = this.r;
        int hashCode4 = (hashCode3 + (pVar == null ? 0 : pVar.hashCode())) * 31;
        h01.j jVar = this.s;
        int i = h1.i(h1.i((hashCode4 + (jVar == null ? 0 : jVar.hashCode())) * 31, this.t, 31), this.u, 31);
        z01.p pVar2 = this.v;
        return i + (pVar2 != null ? pVar2.hashCode() : 0);
    }

    @Override // l01.x
    public final boolean m() {
        return this.k;
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("IssueProjectContent(id=", this.a, ", title=", this.b, ", url=");
        a0.s0.w(this.d, this.c, ", number=", ", lastUpdatedAt=", o);
        o.append(this.e);
        o.append(", commentCount=");
        o.append(this.f);
        o.append(", completedNumberOfTasks=");
        a0.s0.z(o, this.g, ", totalNumberOfTasks=", this.h, ", isLocked=");
        com.github.rudroid.m0.A(o, this.i, ", viewerCanReopen=", this.j, ", viewerCanUpdate=");
        com.github.rudroid.m0.A(o, this.k, ", viewerDidAuthor=", this.l, ", viewerCanAssign=");
        com.github.rudroid.m0.A(o, this.m, ", viewerCanLabel=", this.n, ", state=");
        o.append(this.o);
        o.append(", closeReason=");
        o.append(this.p);
        o.append(", issueType=");
        o.append(this.q);
        o.append(", subIssueProgress=");
        o.append(this.r);
        o.append(", parentIssue=");
        o.append(this.s);
        o.append(", ownerLogin=");
        o.append(this.t);
        o.append(", repositoryName=");
        o.append(this.u);
        o.append(", duplicatedIssue=");
        o.append(this.v);
        o.append(")");
        return o.toString();
    }

    public Object i;
}
