package yz0;

import com.github.service.models.response.issueorpullrequest.CloseReason;
import com.github.service.models.response.type.IssueState;
import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k7 extends s7 {
    public String a;
    public int b;
    public String c;
    public String d;
    public ZonedDateTime e;
    public IssueState f;
    public CloseReason g;

    public k7(String str, int i, String str2, String str3, ZonedDateTime zonedDateTime, IssueState issueState, CloseReason closeReason) {
        k71.k.g(str, "actorDisplayName");
        k71.k.g(issueState, "state");
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = str3;
        this.e = zonedDateTime;
        this.f = issueState;
        this.g = closeReason;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k7)) {
            return false;
        }
        k7 k7Var = (k7) obj;
        return k71.k.b(this.a, k7Var.a) && this.b == k7Var.b && k71.k.b(this.c, k7Var.c) && k71.k.b(this.d, k7Var.d) && k71.k.b(this.e, k7Var.e) && this.f == k7Var.f && this.g == k7Var.g;
    }

    public final int hashCode() {
        int hashCode = (this.f.hashCode() + com.github.rudroid.m0.a(this.e, com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(a0.s0.b(this.b, this.a.hashCode() * 31, 31), this.c, 31), this.d, 31), 31)) * 31;
        CloseReason closeReason = this.g;
        return hashCode + (closeReason == null ? 0 : closeReason.hashCode());
    }

    public final String toString() {
        StringBuilder n = a0.s0.n(this.b, "TimelineSubIssueAddedEvent(actorDisplayName=", this.a, ", number=", ", title=");
        f1.e.x(n, this.c, ", url=", this.d, ", createdAt=");
        n.append(this.e);
        n.append(", state=");
        n.append(this.f);
        n.append(", issueCloseReason=");
        n.append(this.g);
        n.append(")");
        return n.toString();
    }
}
