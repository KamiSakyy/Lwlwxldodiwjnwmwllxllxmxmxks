package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n10 implements aa.n0 {
    public static final j10 Companion = new j10();
    public final String r;

    public n10(String str) {
        k71.k.g(str, "nodeId");
        this.r = str;
    }

    public final aa.m d() {
        hc0.wg.Companion.getClass();
        aa.q0 q0Var = hc0.wg.c1;
        k71.k.g(q0Var, "type");
        List list = fc0.u4.a;
        List list2 = fc0.u4.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n10) && k71.k.b(this.r, ((n10) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(p20.tp.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "67672f5dabf7e657cbc83b658de23fac8e993fd295f11fee8e9507766b7fd8e5";
    }

    public final String j() {
        Companion.getClass();
        return "mutation UnResolvePullRequestReviewThread($nodeId: ID!) { unresolveReviewThread(input: { threadId: $nodeId } ) { thread { __typename ...ReviewThreadFragment id } } }  fragment DiffLineFragment on DiffLine { type html left right text isMissingNewlineAtEnd }  fragment ReviewThreadFragment on PullRequestReviewThread { isResolved resolvedBy { login id __typename } path id viewerCanResolve viewerCanUnresolve subjectType comments(first: 5) { nodes { thread { diffLines(maxContextLines: 1) { __typename ...DiffLineFragment } id __typename } id __typename } } __typename }";
    }

    public final String name() {
        return "UnResolvePullRequestReviewThread";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("nodeId");
        aa.c.a.b(fVar, wVar, this.r);
    }

    public final String toString() {
        return f1.e.z("UnResolvePullRequestReviewThreadMutation(nodeId=", this.r, ")");
    }
}
