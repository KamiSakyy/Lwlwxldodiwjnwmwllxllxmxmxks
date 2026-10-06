package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class uy implements aaShadow.n0 {
    public static final qy Companion = new qy();
    public String r;

    public uy(String str) {
        k71.k.g(str, "nodeId");
        this.r = str;
    }

    public final aa.m d() {
        gn0.wh.Companion.getClass();
        aa.q0 q0Var = gn0.wh.e1;
        k71.k.g(q0Var, "type");
        List list = en0.k4.a;
        List list2 = en0.k4.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uy) && k71.k.b(this.r, ((uy) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(fd0.tn.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "3509ea4de80ff37083a0decae65dedbc898738dc17b6411cb1c95473687089eb";
    }

    public final String j() {
        Companion.getClass();
        return "mutation ResolvePullRequestReviewThread($nodeId: ID!) { resolveReviewThread(input: { threadId: $nodeId } ) { thread { __typename ...ReviewThreadFragment id } } }  fragment DiffLineFragment on DiffLine { type html left right text isMissingNewlineAtEnd }  fragment ReviewThreadFragment on PullRequestReviewThread { isResolved resolvedBy { login id __typename } path id viewerCanResolve viewerCanUnresolve subjectType comments(first: 5) { nodes { thread { diffLines(maxContextLines: 1) { __typename ...DiffLineFragment } id __typename } id __typename } } __typename }";
    }

    public final String name() {
        return "ResolvePullRequestReviewThread";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("nodeId");
        aa.c.a.b(fVar, wVar, this.r);
    }

    public final String toString() {
        return f1.e.z("ResolvePullRequestReviewThreadMutation(nodeId=", this.r, ")");
    }
}
