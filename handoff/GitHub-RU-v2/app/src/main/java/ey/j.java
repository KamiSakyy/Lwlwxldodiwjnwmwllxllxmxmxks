package ey;

import aa.p0;
import aa.q0;
import aa.w;
import aa.w0;
import java.util.List;
import m10.p00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j implements w0 {
    public static final a Companion = new a();
    public String r;

    public j(String str) {
        k71.k.g(str, "nodeId");
        this.r = str;
    }

    public final aa.m d() {
        p00.Companion.getClass();
        q0 q0Var = p00.F;
        k71.k.g(q0Var, "type");
        List list = gy.a.a;
        List list2 = gy.a.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && k71.k.b(this.r, ((j) obj).r);
    }

    public final p0 g() {
        return aa.c.c(fy.a.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "5ec84bee9ea9792804dba85d67f828dd613f10e20439d070beea3f25a5a6a07c";
    }

    public final String j() {
        Companion.getClass();
        return "query PullRequestStatus($nodeId: ID!) { node(id: $nodeId) { __typename ... on PullRequest { id pullRequestStatus(includeMergeCommit: false) { statusChecks(first: 5) { nodes { __typename ...StatusCheckFragment id } } statusRollup { combinedState summary { count state } } } } id } id __typename }  fragment StatusCheckFragment on StatusCheck { id description durationInSeconds stateChangedAt isRequired displayName state targetUrl avatarUrl additionalContext underlyingContext { __typename ... on CheckRun { id } ... on StatusContext { id } } __typename }";
    }

    public final String name() {
        return "PullRequestStatus";
    }

    public final void o(ea.f fVar, w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("nodeId");
        aa.c.a.b(fVar, wVar, this.r);
    }

    public final String toString() {
        return f1.e.z("PullRequestStatusQuery(nodeId=", this.r, ")");
    }


}
