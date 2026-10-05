package yz0;

import com.github.service.models.response.PullRequestState;
import com.github.service.models.response.type.ReviewDecision;
import com.github.service.models.response.type.StatusState;
import com.github.service.models.response.type.SubscriptionState;
import java.time.ZonedDateTime;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j3 implements xz0.e {
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
    public final StatusState o;
    public final boolean p;
    public final PullRequestState q;
    public final ReviewDecision r;
    public final int s;
    public final boolean t;
    public final Integer u;
    public final m01.a v;

    public j3(String str, String str2, String str3, boolean z, ZonedDateTime zonedDateTime, d3 d3Var, boolean z2, SubscriptionState subscriptionState, SubscriptionState subscriptionState2, List list, String str4, int i, com.github.rudroid.common.b0 b0Var, int i2, StatusState statusState, boolean z3, PullRequestState pullRequestState, ReviewDecision reviewDecision, int i3, boolean z4, Integer num, m01.a aVar) {
        k71.k.g(subscriptionState, "unsubscribeActionState");
        k71.k.g(pullRequestState, "pullRequestStatus");
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
        this.o = statusState;
        this.p = z3;
        this.q = pullRequestState;
        this.r = reviewDecision;
        this.s = i3;
        this.t = z4;
        this.u = num;
        this.v = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j3)) {
            return false;
        }
        j3 j3Var = (j3) obj;
        return this.a.equals(j3Var.a) && this.b.equals(j3Var.b) && this.c.equals(j3Var.c) && this.d == j3Var.d && this.e.equals(j3Var.e) && this.f.equals(j3Var.f) && this.g == j3Var.g && this.h == j3Var.h && this.i == j3Var.i && this.j.equals(j3Var.j) && this.k.equals(j3Var.k) && this.l == j3Var.l && this.m.equals(j3Var.m) && this.n == j3Var.n && this.o == j3Var.o && this.p == j3Var.p && this.q == j3Var.q && this.r == j3Var.r && this.s == j3Var.s && this.t == j3Var.t && k71.k.b(this.u, j3Var.u) && this.v.equals(j3Var.v);
    }

    @Override // xz0.e
    public final String getTitle() {
        return this.b;
    }

    public final int hashCode() {
        int hashCode = (this.h.hashCode() + x.i.e((this.f.hashCode() + com.github.rudroid.m0.a(this.e, x.i.e(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), 31, this.d), 31)) * 31, 31, this.g)) * 31;
        SubscriptionState subscriptionState = this.i;
        int b = a0.s0.b(this.n, (this.m.hashCode() + a0.s0.b(this.l, com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.h((hashCode + (subscriptionState == null ? 0 : subscriptionState.hashCode())) * 31, this.j, 31), this.k, 31), 31)) * 31, 31);
        StatusState statusState = this.o;
        int hashCode2 = (this.q.hashCode() + x.i.e((b + (statusState == null ? 0 : statusState.hashCode())) * 31, 31, this.p)) * 31;
        ReviewDecision reviewDecision = this.r;
        int e = x.i.e(a0.s0.b(this.s, (hashCode2 + (reviewDecision == null ? 0 : reviewDecision.hashCode())) * 31, 31), 31, this.t);
        Integer num = this.u;
        return this.v.hashCode() + ((e + (num != null ? num.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("PullRequest(id=", this.a, ", title=", this.b, ", titleHTML=");
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
        o.append(", commentsCount=");
        o.append(this.n);
        o.append(", status=");
        o.append(this.o);
        o.append(", isDraft=");
        o.append(this.p);
        o.append(", pullRequestStatus=");
        o.append(this.q);
        o.append(", reviewDecision=");
        o.append(this.r);
        o.append(", relatedIssuesCount=");
        com.github.rudroid.m0.w(o, this.s, ", isInMergeQueue=", this.t, ", mergeQueuePosition=");
        o.append(this.u);
        o.append(", viewerReviewerReviewStatus=");
        o.append(this.v);
        o.append(")");
        return o.toString();
    }
}
