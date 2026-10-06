package yz0;

import com.github.service.models.response.IssueOrPullRequestState;
import com.github.service.models.response.issueorpullrequest.CloseReason;
import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h6 extends s7 implements r5 {
    public com.github.service.models.response.a a;
    public String b;
    public boolean c;
    public int d;
    public String e;
    public String f;
    public String g;
    public String h;
    public IssueOrPullRequestState i;
    public CloseReason j;
    public boolean k;
    public boolean l;
    public boolean m;
    public ZonedDateTime n;

    public h6(com.github.service.models.response.a aVar, String str, boolean z, int i, String str2, String str3, String str4, String str5, IssueOrPullRequestState issueOrPullRequestState, CloseReason closeReason, boolean z2, boolean z3, boolean z4, ZonedDateTime zonedDateTime) {
        k71.k.g(str2, "title");
        k71.k.g(str3, "repositoryId");
        k71.k.g(str4, "repositoryOwner");
        k71.k.g(str5, "repositoryName");
        k71.k.g(issueOrPullRequestState, "state");
        this.a = aVar;
        this.b = str;
        this.c = z;
        this.d = i;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = issueOrPullRequestState;
        this.j = closeReason;
        this.k = z2;
        this.l = z3;
        this.m = z4;
        this.n = zonedDateTime;
    }

    @Override // yz0.r5
    public final int b() {
        return this.d;
    }

    @Override // yz0.r5
    public final CloseReason c() {
        return this.j;
    }

    @Override // yz0.r5
    public final boolean d() {
        return this.k;
    }

    @Override // yz0.r5
    public final String e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h6)) {
            return false;
        }
        h6 h6Var = (h6) obj;
        return k71.k.b(this.a, h6Var.a) && k71.k.b(this.b, h6Var.b) && this.c == h6Var.c && this.d == h6Var.d && k71.k.b(this.e, h6Var.e) && k71.k.b(this.f, h6Var.f) && k71.k.b(this.g, h6Var.g) && k71.k.b(this.h, h6Var.h) && this.i == h6Var.i && this.j == h6Var.j && this.k == h6Var.k && this.l == h6Var.l && this.m == h6Var.m && k71.k.b(this.n, h6Var.n);
    }

    @Override // yz0.r5
    public final boolean f() {
        return this.m;
    }

    @Override // yz0.r5
    public final String g() {
        return this.b;
    }

    @Override // yz0.r5
    public final IssueOrPullRequestState getState() {
        return this.i;
    }

    @Override // yz0.r5
    public final String getTitle() {
        return this.e;
    }

    public final int hashCode() {
        int hashCode = (this.i.hashCode() + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(a0.s0.b(this.d, x.i.e(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), 31, this.c), 31), this.e, 31), this.f, 31), this.g, 31), this.h, 31)) * 31;
        CloseReason closeReason = this.j;
        return this.n.hashCode() + x.i.e(x.i.e(x.i.e((hashCode + (closeReason == null ? 0 : closeReason.hashCode())) * 31, 31, this.k), 31, this.l), 31, this.m);
    }

    @Override // yz0.r5
    public final boolean i() {
        return this.l;
    }

    @Override // yz0.r5
    public final String k() {
        return this.h;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TimelineCrossReferencedEvent(author=");
        sb.append(this.a);
        sb.append(", eventId=");
        sb.append(this.b);
        sb.append(", isCrossRepository=");
        com.github.rudroid.m0.y(sb, this.c, ", number=", this.d, ", title=");
        f1.e.x(sb, this.e, ", repositoryId=", this.f, ", repositoryOwner=");
        f1.e.x(sb, this.g, ", repositoryName=", this.h, ", state=");
        sb.append(this.i);
        sb.append(", closeReason=");
        sb.append(this.j);
        sb.append(", isPrivate=");
        com.github.rudroid.m0.A(sb, this.k, ", isInMergeQueue=", this.l, ", isDraft=");
        sb.append(this.m);
        sb.append(", createdAt=");
        sb.append(this.n);
        sb.append(")");
        return sb.toString();
    }
}
