package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r9 implements aaShadow.n0 {
    public static final n9 Companion = new n9();
    public String r;

    public r9(String str) {
        this.r = str;
    }

    public final aa.m d() {
        gn0.wh.Companion.getClass();
        aa.q0 q0Var = gn0.wh.e1;
        k71.k.g(q0Var, "type");
        List list = en0.p0.a;
        List list2 = en0.p0.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r9) && k71.k.b(this.r, ((r9) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(fd0.j6.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "bbc0658fd3e9c555d343989f094e91b1ac71b195d01c81348e6f6ca91031935c";
    }

    public final String j() {
        Companion.getClass();
        return "mutation DisableAutoMerge($pullRequestId: ID!) { disablePullRequestAutoMerge(input: { pullRequestId: $pullRequestId } ) { actor { __typename ...actorFields } pullRequest { id viewerCanEnableAutoMerge viewerCanDisableAutoMerge autoMergeRequest { mergeMethod } __typename } } }  fragment NodeIdFragment on Node { id __typename }  fragment avatarFragment on Actor { __typename ...NodeIdFragment avatarUrl }  fragment actorFields on Actor { __typename login url ...avatarFragment ...NodeIdFragment }";
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
