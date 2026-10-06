package yz0;

import com.github.service.models.response.IssueOrPullRequest$ReviewerReviewState;
import java.time.ZonedDateTime;
import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l3 {
    public final String a;
    public final ArrayList b;
    public final t7 c;
    public final String d;
    public final s e;
    public final ZonedDateTime f;
    public final ArrayList g;
    public final boolean h;
    public final IssueOrPullRequest$ReviewerReviewState i;
    public final com.github.service.models.response.a j;
    public final boolean k;
    public final String l;
    public final boolean m;
    public final boolean n;

    public l3(String str, ArrayList arrayList, t7 t7Var, String str2, s sVar, ZonedDateTime zonedDateTime, ArrayList arrayList2, boolean z, IssueOrPullRequest$ReviewerReviewState issueOrPullRequest$ReviewerReviewState, com.github.service.models.response.a aVar, boolean z2, String str3, boolean z3, boolean z4) {
        k71.k.g(issueOrPullRequest$ReviewerReviewState, "state");
        this.a = str;
        this.b = arrayList;
        this.c = t7Var;
        this.d = str2;
        this.e = sVar;
        this.f = zonedDateTime;
        this.g = arrayList2;
        this.h = z;
        this.i = issueOrPullRequest$ReviewerReviewState;
        this.j = aVar;
        this.k = z2;
        this.l = str3;
        this.m = z3;
        this.n = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l3)) {
            return false;
        }
        l3 l3Var = (l3) obj;
        return this.a.equals(l3Var.a) && this.b.equals(l3Var.b) && this.c.equals(l3Var.c) && this.d.equals(l3Var.d) && this.e.equals(l3Var.e) && k71.k.b(this.f, l3Var.f) && this.g.equals(l3Var.g) && this.h == l3Var.h && this.i == l3Var.i && this.j.equals(l3Var.j) && this.k == l3Var.k && this.l.equals(l3Var.l) && this.m == l3Var.m && this.n == l3Var.n;
    }

    public final int hashCode() {
        int hashCode = (this.e.hashCode() + com.github.rudroid.copilot.h1.i((this.c.hashCode() + no.a.b(this.b, this.a.hashCode() * 31, 31)) * 31, this.d, 31)) * 31;
        ZonedDateTime zonedDateTime = this.f;
        return Boolean.hashCode(this.n) + x.i.e(com.github.rudroid.copilot.h1.i(x.i.e(jo.f4.b(this.j, (this.i.hashCode() + x.i.e(no.a.b(this.g, (hashCode + (zonedDateTime == null ? 0 : zonedDateTime.hashCode())) * 31, 31), 31, this.h)) * 31, 31), 31, this.k), this.l, 31), 31, this.m);
    }

    public final String toString() {
        StringBuilder p = com.github.rudroid.m0.p("PullRequestReview(id=", this.a, ", threads=", this.b, ", repo=");
        p.append(this.c);
        p.append(", repoOwnerId=");
        p.append(this.d);
        p.append(", body=");
        p.append(this.e);
        p.append(", submittedAt=");
        p.append(this.f);
        p.append(", reactions=");
        p.append(this.g);
        p.append(", viewerCanReact=");
        p.append(this.h);
        p.append(", state=");
        p.append(this.i);
        p.append(", author=");
        p.append(this.j);
        p.append(", authorCanPush=");
        com.github.rudroid.m0.z(p, this.k, ", url=", this.l, ", viewerCanBlockFromOrg=");
        return com.github.rudroid.m0.m(p, this.m, ", viewerCanUnblockFromOrg=", this.n, ")");
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class IssueOrPullRequest$ReviewerReviewState {
        public IssueOrPullRequest$ReviewerReviewState() {
        }
    }

    public l3(Object... a) {
    }
}
