package yz0;

import com.github.service.models.response.IssueOrPullRequestState;
import com.github.service.models.response.issueorpullrequest.CloseReason;
import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes4.dex */
public final class u6 extends s7 {
    public String a;
    public String b;
    public String c;
    public String d;
    public int e;
    public IssueOrPullRequestState f;
    public CloseReason g;
    public String h;
    public boolean i;
    public String j;
    public boolean k;
    public boolean l;
    public ZonedDateTime m;
    public z01.p n;

    public u6(String str, String str2, String str3, String str4, int i, IssueOrPullRequestState issueOrPullRequestState, CloseReason closeReason, String str5, boolean z, String str6, boolean z2, boolean z3, ZonedDateTime zonedDateTime, z01.p pVar) {
        k71.k.g(str2, "actorDisplayName");
        k71.k.g(issueOrPullRequestState, "state");
        k71.k.g(str5, "title");
        k71.k.g(str6, "id");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.f = issueOrPullRequestState;
        this.g = closeReason;
        this.h = str5;
        this.i = z;
        this.j = str6;
        this.k = z2;
        this.l = z3;
        this.m = zonedDateTime;
        this.n = pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u6)) {
            return false;
        }
        u6 u6Var = (u6) obj;
        return k71.k.b(this.a, u6Var.a) && k71.k.b(this.b, u6Var.b) && k71.k.b(this.c, u6Var.c) && k71.k.b(this.d, u6Var.d) && this.e == u6Var.e && this.f == u6Var.f && this.g == u6Var.g && k71.k.b(this.h, u6Var.h) && this.i == u6Var.i && k71.k.b(this.j, u6Var.j) && this.k == u6Var.k && this.l == u6Var.l && k71.k.b(this.m, u6Var.m) && k71.k.b(this.n, u6Var.n);
    }

    public final int hashCode() {
        int hashCode = (this.f.hashCode() + a0.s0.b(this.e, com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), this.d, 31), 31)) * 31;
        CloseReason closeReason = this.g;
        int a = com.github.rudroid.m0.a(this.m, x.i.e(x.i.e(com.github.rudroid.copilot.h1.i(x.i.e(com.github.rudroid.copilot.h1.i((hashCode + (closeReason == null ? 0 : closeReason.hashCode())) * 31, this.h, 31), 31, this.i), this.j, 31), 31, this.k), 31, this.l), 31);
        z01.p pVar = this.n;
        return a + (pVar != null ? pVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("TimelineMarkedAsDuplicateEvent(eventId=", this.a, ", actorDisplayName=", this.b, ", repoName=");
        f1.e.x(o, this.c, ", repoOwner=", this.d, ", number=");
        o.append(this.e);
        o.append(", state=");
        o.append(this.f);
        o.append(", closeReason=");
        o.append(this.g);
        o.append(", title=");
        o.append(this.h);
        o.append(", isCrossRepo=");
        com.github.rudroid.m0.z(o, this.i, ", id=", this.j, ", isInMergeQueue=");
        com.github.rudroid.m0.A(o, this.k, ", isDraft=", this.l, ", createdAt=");
        o.append(this.m);
        o.append(", duplicateOf=");
        o.append(this.n);
        o.append(")");
        return o.toString();
    }
}
