package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ib implements aaShadow.n0 {
    public static final eb Companion = new eb();
    public final String r;

    public ib(String str) {
        this.r = str;
    }

    public final aa.m d() {
        m10.vp.Companion.getClass();
        aa.q0 q0Var = m10.vp.A1;
        k71.k.g(q0Var, "type");
        List list = h10.v0.a;
        List list2 = h10.v0.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ib) && k71.k.b(this.r, ((ib) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(ep.n7.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "b96e78f77d7e3bbb36821e4a424445fc84befd6337b8a66b5af1947c1787cbfa";
    }

    public final String j() {
        Companion.getClass();
        return "mutation DisableAutoMerge($pullRequestId: ID!) { disablePullRequestAutoMerge(input: { pullRequestId: $pullRequestId } ) { actor { __typename ...actorFields } pullRequest { id viewerCanEnableAutoMerge viewerCanDisableAutoMerge autoMergeRequest { mergeMethod } __typename } } }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment actorFields on Actor { __typename login url ...avatarFragment ...NodeIdFragment ... on Bot { id displayName isCopilot isAgent } ... on User { id name } }";
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
