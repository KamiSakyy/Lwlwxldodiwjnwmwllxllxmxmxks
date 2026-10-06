package v10;

import aa.m;
import aa.p0;
import aa.q0;
import aa.u0;
import aa.w;
import aa.w0;
import hc0.pm;
import java.util.List;
import x61.rShadow;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l implements w0 {
    public static final c Companion = new c();
    public String r;
    public aa1.b s;
    public aa1.b t;

    public l(String str, aa1.b bVar, aa1.b bVar2) {
        k71.k.g(str, "login");
        k71.k.g(bVar, "first");
        k71.k.g(bVar2, "after");
        this.r = str;
        this.s = bVar;
        this.t = bVar2;
    }

    public final m d() {
        pm.Companion.getClass();
        q0 q0Var = pm.r;
        k71.k.g(q0Var, "type");
        List list = a20.a.a;
        List list2 = a20.a.a;
        k71.k.g(list2, "selections");
        rShadow rVar = rShadow.r;
        return new m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return k71.k.b(this.r, lVar.r) && k71.k.b(this.s, lVar.s) && k71.k.b(this.t, lVar.t);
    }

    public final p0 g() {
        return aa.c.c(w10.c.a, false);
    }

    public final int hashCode() {
        return this.t.hashCode() + f1.e.a(this.s, this.rShadow.hashCode() * 31, 31);
    }

    public final String i() {
        return "db2c32a4fd5a810a408986158feca5ac110b8611a8ff6ea682ac45c8969ee11d";
    }

    public final String j() {
        Companion.getClass();
        return "query UserAchievements($login: String!, $first: Int = 30 , $after: String = null ) { user(login: $login) { __typename ... on User { achievements(first: $first, after: $after) { totalCount pageInfo { endCursor hasNextPage hasPreviousPage } nodes { id localizedDescription(locale: EN) unlockedAt url achievable { name slug } tier(number: 1) { id highResolutionBadgeImageUrl backgroundColor __typename } tiers { unlockingModel { __typename ...UnlockingModelFragment } localizedUnlockingExplanation(locale: EN) id __typename } __typename } } } id } }  fragment NodeIdFragment on Node { id __typename }  fragment UnlockingModelFragment on UnlockingModel { __typename ...NodeIdFragment ... on AchievementRepositoryList { repositories(first: 3) { nodes { url nameWithOwner id __typename } totalCount } } ... on CommitComment { url repository { nameWithOwner id __typename } id } ... on Discussion { url number repository { nameWithOwner id __typename } id } ... on DiscussionComment { url discussion { number repository { nameWithOwner id __typename } id __typename } id } ... on Issue { url repository { nameWithOwner id __typename } number id } ... on IssueComment { url repository { nameWithOwner id __typename } issue { number id __typename } id } ... on PullRequest { repository { nameWithOwner id __typename } number url id } ... on PullRequestReview { url pullRequest { repository { nameWithOwner id __typename } number id __typename } id } ... on PullRequestReviewComment { url pullRequest { repository { nameWithOwner id __typename } number id __typename } id } ... on Release { repository { nameWithOwner id __typename } name url id } ... on Repository { url nameWithOwner id } ... on RepositoryAdvisory { url id } ... on RepositoryAdvisoryComment { url repository { nameWithOwner id __typename } id } ... on TeamDiscussion { url team { name id __typename } id } ... on TeamDiscussionComment { url id } }";
    }

    public final String name() {
        return "UserAchievements";
    }

    public final void o(ea.f fVar, w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("login");
        aa.c.a.b(fVar, wVar, this.r);
        u0 u0Var = this.s;
        if (u0Var instanceof u0) {
            fVar.z0("first");
            aa.c.d(aa.c.b(y20.a.a)).d(fVar, wVar, u0Var);
        } else if (z) {
            fVar.z0("first");
            aa.c.l.b(fVar, wVar, 30);
        }
        u0 u0Var2 = this.t;
        if (u0Var2 instanceof u0) {
            fVar.z0("after");
            aa.c.d(aa.c.i).d(fVar, wVar, u0Var2);
        } else if (z) {
            fVar.z0("after");
            aa.c.l.b(fVar, wVar, (Object) null);
        }
    }

    public final String toString() {
        return f1.e.k(f1.e.o(this.s, "UserAchievementsQuery(login=", this.r, ", first=", ", after="), this.t, ")");
    }
}
