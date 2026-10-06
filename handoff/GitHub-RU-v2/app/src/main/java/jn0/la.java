package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class la implements aaShadow.n0 {
    public static final ha Companion = new ha();
    public String r;

    public la(String str) {
        this.r = str;
    }

    public final aa.m d() {
        pz0.sk.Companion.getClass();
        aa.q0 q0Var = pz0.sk.v1;
        k71.k.g(q0Var, "type");
        List list = kz0.s0.a;
        List list2 = kz0.s0.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof la) && k71.k.b(this.r, ((la) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.x6.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "bddf7991fb5b76f3f2c8b1989430b92b89e43243ba309ffc91639acc354ed01a";
    }

    public final String j() {
        Companion.getClass();
        return "mutation DisableAutoMerge($pullRequestId: ID!) { disablePullRequestAutoMerge(input: { pullRequestId: $pullRequestId } ) { actor { __typename ...actorFields } pullRequest { id viewerCanEnableAutoMerge viewerCanDisableAutoMerge autoMergeRequest { mergeMethod } __typename } } }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment actorFields on Actor { __typename login url ...avatarFragment ...NodeIdFragment ... on Bot { id isCopilot } ... on User { id name } }";
    }

    public final String name() {
        return "DisableAutoMerge";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("pullRequestId");
        aa.c.a.b(fVar, wVar, this.r);
    }

    public final String toString() {
        return f1.e.z("DisableAutoMergeMutation(pullRequestId=", this.r, ")");
    }
}
