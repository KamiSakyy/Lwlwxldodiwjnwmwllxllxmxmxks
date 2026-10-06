package fb0;

import hc0.pm;
import java.util.List;
import jo.f4;

/* loaded from: /home/user/work/p/classes3.dex */
public final class p0 implements aa.w0 {
    public static final c Companion = new c();
    public aa1.b r;
    public aa1.b s;
    public aa1.b t;

    public p0(aa1.b bVar, aa1.b bVar2, aa1.b bVar3) {
        k71.k.g(bVar, "after");
        k71.k.g(bVar2, "filterBy");
        k71.k.g(bVar3, "query");
        this.r = bVar;
        this.s = bVar2;
        this.t = bVar3;
    }

    public final aa.m d() {
        pm.Companion.getClass();
        aa.q0 q0Var = pm.r;
        k71.k.g(q0Var, "type");
        List list = hb0.a.a;
        List list2 = hb0.a.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return k71.k.b(this.r, p0Var.r) && k71.k.b(this.s, p0Var.s) && k71.k.b(this.t, p0Var.t);
    }

    public final aa.p0 g() {
        return aa.c.c(gb0.c.a, false);
    }

    public final int hashCode() {
        return this.t.hashCode() + f1.e.a(this.s, f1.e.a(this.r, Integer.hashCode(30) * 31, 31), 31);
    }

    public final String i() {
        return "e4494bdba53903297ec0a269043ddcc02866c956826f237f057bcf5d2bbec3fc";
    }

    public final String j() {
        Companion.getClass();
        return "query NotificationsQuery($first: Int!, $after: String, $filterBy: NotificationThreadFilters, $query: String) { viewer { __typename ...WebNotificationsEnabled notificationThreads(first: $first, after: $after, filterBy: $filterBy, query: $query) { pageInfo { hasNextPage endCursor } nodes { id threadType title isUnread unreadItemsCount lastUpdatedAt subscriptionStatus summaryItemAuthor { __typename ...avatarFragment login id } summaryItemBody isArchived isSaved url list { __typename ... on Subscribable { __typename ...NodeIdFragment viewerSubscription } ... on Repository { id owner { id login } name } ... on User { login userName: name id } ... on Team { organization { login id __typename } slug id } ... on Organization { login id } } reason subject { __typename ... on Commit { id abbreviatedOid url } ... on Gist { url id } ... on TeamDiscussion { url id } ... on CheckSuite { id url conclusion status } ... on WorkflowRun { id url runNumber workflow { name id __typename } checkSuite { id __typename } } ... on Issue { id url number issueState: state repository { name owner { id login avatarUrl } id __typename } stateReason titleHTMLString: titleHTML } ... on PullRequest { id url isDraft number pullRequestState: state repository { name owner { id login avatarUrl } id __typename } titleHTML } ... on Release { id tagName url repository { id name owner { id login avatarUrl } __typename } } ... on RepositoryInvitation { id permalink } ... on RepositoryVulnerabilityAlert { id permalink } ... on RepositoryAdvisory { id url } ... on Discussion { id url number discussionStateReason: stateReason answer { id __typename } repository { name owner { id login avatarUrl } id __typename } } ... on RepositoryDependabotAlertsThread { id notificationsPermalink } ... on SecurityAdvisory { id notificationsPermalink } } __typename } } id } }  fragment WebNotificationsEnabled on User { notificationSettings { getsParticipatingWeb getsWatchingWeb } id __typename }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }";
    }

    public final String name() {
        return "NotificationsQuery";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("first");
        fVar.z(30);
        aa.u0 u0Var = this.r;
        if (u0Var instanceof aa.u0) {
            fVar.z0("after");
            aa.c.d(aa.c.i).d(fVar, wVar, u0Var);
        }
        aa.u0 u0Var2 = this.s;
        if (u0Var2 instanceof aa.u0) {
            fVar.z0("filterBy");
            aa.c.d(aa.c.b(aa.c.c(ic0.a.C, false))).d(fVar, wVar, u0Var2);
        }
        aa.u0 u0Var3 = this.t;
        if (u0Var3 instanceof aa.u0) {
            fVar.z0("query");
            aa.c.d(aa.c.i).d(fVar, wVar, u0Var3);
        }
    }

    public final String toString() {
        return f1.e.k(f4.u("NotificationsQuery(first=30, after=", this.r, ", filterBy=", this.s, ", query="), this.t, ")");
    }
}
