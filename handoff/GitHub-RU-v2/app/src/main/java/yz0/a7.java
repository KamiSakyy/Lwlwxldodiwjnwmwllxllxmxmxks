package yz0;

import com.github.service.models.response.TimelineItem$TimelinePullRequestReview$ReviewState;
import java.time.ZonedDateTime;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a7 extends s7 {
    public String a;
    public boolean b;
    public int c;
    public s d;
    public List e;
    public boolean f;
    public final TimelineItem$TimelinePullRequestReview$ReviewState g;
    public ZonedDateTime h;
    public boolean i;
    public boolean j;

    public a7(String str, boolean z, int i, s sVar, List list, boolean z2, TimelineItem$TimelinePullRequestReview$ReviewState timelineItem$TimelinePullRequestReview$ReviewState, ZonedDateTime zonedDateTime, boolean z3, boolean z4) {
        k71.k.g(sVar, "comment");
        k71.k.g(timelineItem$TimelinePullRequestReview$ReviewState, "state");
        k71.k.g(zonedDateTime, "submittedAt");
        this.a = str;
        this.b = z;
        this.c = i;
        this.d = sVar;
        this.e = list;
        this.f = z2;
        this.g = timelineItem$TimelinePullRequestReview$ReviewState;
        this.h = zonedDateTime;
        this.i = z3;
        this.j = z4;
    }

    public static a7 a(a7 a7Var, s sVar, List list, boolean z, boolean z2, boolean z3, int i) {
        String str = a7Var.a;
        boolean z4 = a7Var.b;
        int i2 = a7Var.c;
        if ((i & 8) != 0) {
            sVar = a7Var.d;
        }
        s sVar2 = sVar;
        if ((i & 16) != 0) {
            list = a7Var.e;
        }
        List list2 = list;
        if ((i & 32) != 0) {
            z = a7Var.f;
        }
        boolean z5 = z;
        TimelineItem$TimelinePullRequestReview$ReviewState timelineItem$TimelinePullRequestReview$ReviewState = a7Var.g;
        ZonedDateTime zonedDateTime = a7Var.h;
        boolean z6 = (i & 256) != 0 ? a7Var.i : z2;
        boolean z7 = (i & 512) != 0 ? a7Var.j : z3;
        a7Var.getClass();
        k71.k.g(str, "pullRequestId");
        k71.k.g(sVar2, "comment");
        k71.k.g(list2, "reactions");
        k71.k.g(timelineItem$TimelinePullRequestReview$ReviewState, "state");
        k71.k.g(zonedDateTime, "submittedAt");
        return new a7(str, z4, i2, sVar2, list2, z5, timelineItem$TimelinePullRequestReview$ReviewState, zonedDateTime, z6, z7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a7)) {
            return false;
        }
        a7 a7Var = (a7) obj;
        return k71.k.b(this.a, a7Var.a) && this.b == a7Var.b && this.c == a7Var.c && k71.k.b(this.d, a7Var.d) && k71.k.b(this.e, a7Var.e) && this.f == a7Var.f && this.g == a7Var.g && k71.k.b(this.h, a7Var.h) && this.i == a7Var.i && this.j == a7Var.j;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.j) + x.i.e(com.github.rudroid.m0.a(this.h, (this.g.hashCode() + x.i.e(f1.e.c(this.e, (this.d.hashCode() + a0.s0.b(this.c, x.i.e(this.a.hashCode() * 31, 31, this.b), 31)) * 31, 31), 31, this.f)) * 31, 31), 31, this.i);
    }

    public final String toString() {
        StringBuilder o = com.github.rudroid.m0.o("TimelinePullRequestReview(pullRequestId=", this.a, ", reviewerCanPush=", ", commentCount=", this.b);
        o.append(this.c);
        o.append(", comment=");
        o.append(this.d);
        o.append(", reactions=");
        com.github.rudroid.copilot.h1.C(o, this.e, ", viewerCanReact=", this.f, ", state=");
        o.append(this.g);
        o.append(", submittedAt=");
        o.append(this.h);
        o.append(", viewerCanBlockFromOrg=");
        return com.github.rudroid.m0.m(o, this.i, ", viewerCanUnblockFromOrg=", this.j, ")");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ a7(s sVar, boolean z, TimelineItem$TimelinePullRequestReview$ReviewState timelineItem$TimelinePullRequestReview$ReviewState) {
        this("", false, 0, sVar, x61.r.r, z, timelineItem$TimelinePullRequestReview$ReviewState, r8, false, false);
        ZonedDateTime now = ZonedDateTime.now();
        k71.k.f(now, "now(...)");
    }

    public Object i;
}
