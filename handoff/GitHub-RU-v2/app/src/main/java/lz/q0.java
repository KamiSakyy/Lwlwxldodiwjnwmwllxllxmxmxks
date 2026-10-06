package lz;

import java.util.List;
import jo.f4;
import m10.p00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class q0 implements aa.w0 {
    public static final c Companion = new c();
    public aa1.b r;
    public aa1.b s;
    public aa1.b t;

    public q0(aa1.b bVar, aa1.b bVar2, aa1.b bVar3) {
        k71.k.g(bVar, "after");
        k71.k.g(bVar2, "filterBy");
        k71.k.g(bVar3, "query");
        this.r = bVar;
        this.s = bVar2;
        this.t = bVar3;
    }

    public final aa.m d() {
        p00.Companion.getClass();
        aa.q0 q0Var = p00.F;
        k71.k.g(q0Var, "type");
        List list = nz.a.a;
        List list2 = nz.a.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return k71.k.b(this.r, q0Var.r) && k71.k.b(this.s, q0Var.s) && k71.k.b(this.t, q0Var.t);
    }

    public final aa.p0 g() {
        return aa.c.c(mz.c.a, false);
    }

    public final int hashCode() {
        return this.t.hashCode() + f1.e.a(this.s, f1.e.a(this.r, Integer.hashCode(30) * 31, 31), 31);
    }

    public final String i() {
        return "2383d1de4cc3def5be40e979487946af6b4d5879c14e120081574f86ea39f802";
    }

    public final String j() {
        Companion.getClass();
        return "query NotificationsQuery($first: Int!, $after: String, $filterBy: NotificationThreadFilters, $query: String) { viewer { __typename ...WebNotificationsEnabled notificationThreads(first: $first, after: $after, filterBy: $filterBy, query: $query) { pageInfo { hasNextPage endCursor } nodes { id threadType title isUnread unreadItemsCount lastUpdatedAt subscriptionStatus summaryItemAuthor { __typename ...avatarFragment login id } summaryItemBody isArchived isSaved url optionalList { __typename ...NodeIdFragment ... on Subscribable { __typename ...NodeIdFragment viewerSubscription } ... on Repository { id owner { id login } name } ... on User { login userName: name id } ... on Team { organization { login id __typename } slug id } ... on Organization { login id } } reason optionalSubject { __typename ...NodeIdFragment ... on Commit { id abbreviatedOid url } ... on Gist { url id } ... on CheckSuite { id url conclusion status } ... on WorkflowRun { id url runNumber workflow { name id __typename } checkSuite { id __typename } } ... on Issue { id url number issueState: state repository { name owner { id login avatarUrl } id __typename } stateReason titleHTMLString: titleHTML } ... on PullRequest { id url isDraft number pullRequestState: state repository { name owner { id login avatarUrl } id __typename } isInMergeQueue titleHTML } ... on Release { id tagName url repository { id name owner { id login avatarUrl } __typename } } ... on RepositoryInvitation { id permalink } ... on RepositoryVulnerabilityAlert { id permalink } ... on RepositoryAdvisory { id url } ... on Discussion { id url number discussionStateReason: stateReason answer { id __typename } repository { name owner { id login avatarUrl } id __typename } } ... on RepositoryDependabotAlertsThread { id notificationsPermalink } ... on SecurityAdvisory { id notificationsPermalink } ... on MemberFeatureRequestNotification { id } ... on ProjectV2 { id } } __typename } } id } id __typename }  fragment WebNotificationsEnabled on User { notificationSettings { getsParticipatingWeb getsWatchingWeb } id __typename }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }";
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
            aa.c.d(aa.c.b(aa.c.c(n10.b.o, false))).d(fVar, wVar, u0Var2);
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
