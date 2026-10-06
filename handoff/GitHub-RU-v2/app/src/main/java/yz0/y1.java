package yz0;

import com.github.service.models.response.issueorpullrequest.CloseReason;
import com.github.service.models.response.issueorpullrequest.IssueType;
import com.github.service.models.response.type.IssueState;
import com.github.service.models.response.type.SubscriptionState;
import java.time.ZonedDateTime;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class y1 implements xz0.e {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final ZonedDateTime e;
    public final d3 f;
    public final boolean g;
    public final SubscriptionState h;
    public final SubscriptionState i;
    public final Object j;
    public final String k;
    public final int l;
    public final com.github.rudroid.common.b0 m;
    public final int n;
    public final IssueState o;
    public final int p;
    public final CloseReason q;
    public final IssueType r;
    public final h01.p s;
    public final String t;
    public final boolean u;
    public final z01.p v;

    public y1(String str, String str2, String str3, boolean z, ZonedDateTime zonedDateTime, d3 d3Var, boolean z2, SubscriptionState subscriptionState, SubscriptionState subscriptionState2, List list, String str4, int i, com.github.rudroid.common.b0 b0Var, int i2, IssueState issueState, int i3, CloseReason closeReason, IssueType issueType, h01.p pVar, String str5, boolean z3, z01.p pVar2) {
        k71.k.g(subscriptionState, "unsubscribeActionState");
        k71.k.g(issueState, "state");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = zonedDateTime;
        this.f = d3Var;
        this.g = z2;
        this.h = subscriptionState;
        this.i = subscriptionState2;
        this.j = list;
        this.k = str4;
        this.l = i;
        this.m = b0Var;
        this.n = i2;
        this.o = issueState;
        this.p = i3;
        this.q = closeReason;
        this.r = issueType;
        this.s = pVar;
        this.t = str5;
        this.u = z3;
        this.v = pVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y1)) {
            return false;
        }
        y1 y1Var = (y1) obj;
        return this.a.equals(y1Var.a) && this.b.equals(y1Var.b) && this.c.equals(y1Var.c) && this.d == y1Var.d && this.e.equals(y1Var.e) && this.f.equals(y1Var.f) && this.g == y1Var.g && this.h == y1Var.h && this.i == y1Var.i && this.j.equals(y1Var.j) && this.k.equals(y1Var.k) && this.l == y1Var.l && this.m.equals(y1Var.m) && this.n == y1Var.n && this.o == y1Var.o && this.p == y1Var.p && this.q == y1Var.q && k71.k.b(this.r, y1Var.r) && k71.k.b(this.s, y1Var.s) && k71.k.b(this.t, y1Var.t) && this.u == y1Var.u && k71.k.b(this.v, y1Var.v);
    }

    @Override // xz0.e
    public final String getTitle() {
        return this.b;
    }

    public final int hashCode() {
        int hashCode = (this.h.hashCode() + x.i.e((this.f.hashCode() + com.github.rudroid.m0.a(this.e, x.i.e(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), 31, this.d), 31)) * 31, 31, this.g)) * 31;
        SubscriptionState subscriptionState = this.i;
        int b = a0.s0.b(this.p, (this.o.hashCode() + a0.s0.b(this.n, (this.m.hashCode() + a0.s0.b(this.l, com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.h((hashCode + (subscriptionState == null ? 0 : subscriptionState.hashCode())) * 31, this.j, 31), this.k, 31), 31)) * 31, 31)) * 31, 31);
        CloseReason closeReason = this.q;
        int hashCode2 = (b + (closeReason == null ? 0 : closeReason.hashCode())) * 31;
        IssueType issueType = this.r;
        int hashCode3 = (hashCode2 + (issueType == null ? 0 : issueType.hashCode())) * 31;
        h01.p pVar = this.s;
        int hashCode4 = (hashCode3 + (pVar == null ? 0 : pVar.hashCode())) * 31;
        String str = this.t;
        int e = x.i.e((hashCode4 + (str == null ? 0 : str.hashCode())) * 31, 31, this.u);
        z01.p pVar2 = this.v;
        return e + (pVar2 != null ? pVar2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Issue(id=", this.a, ", title=", this.b, ", titleHTML=");
        com.github.rudroid.m0.x(o, this.c, ", isUnread=", this.d, ", lastUpdatedAt=");
        o.append(this.e);
        o.append(", owner=");
        o.append(this.f);
        o.append(", isSubscribed=");
        o.append(this.g);
        o.append(", unsubscribeActionState=");
        o.append(this.h);
        o.append(", subscribeActionState=");
        o.append(this.i);
        o.append(", labels=");
        o.append(this.j);
        o.append(", url=");
        a0.s0.w(this.l, this.k, ", number=", ", assignees=", o);
        o.append(this.m);
        o.append(", itemCount=");
        o.append(this.n);
        o.append(", state=");
        o.append(this.o);
        o.append(", relatedPullRequestsCount=");
        o.append(this.p);
        o.append(", closeReason=");
        o.append(this.q);
        o.append(", issueType=");
        o.append(this.r);
        o.append(", subIssueProgress=");
        o.append(this.s);
        o.append(", parentIssueId=");
        o.append(this.t);
        o.append(", repositoryIsPrivate=");
        o.append(this.u);
        o.append(", duplicateOf=");
        o.append(this.v);
        o.append(")");
        return o.toString();
    }
}
