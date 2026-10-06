package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e70 implements aaShadow.n0 {
    public static final a70 Companion = new a70();
    public final String r;

    public e70(String str) {
        k71.k.g(str, "nodeId");
        this.r = str;
    }

    public final aa.m d() {
        pz0.sk.Companion.getClass();
        aa.q0 q0Var = pz0.sk.v1;
        k71.k.g(q0Var, "type");
        List list = kz0.m5.a;
        List list2 = kz0.m5.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e70) && k71.k.b(this.r, ((e70) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(eo0.bu.a, false);
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
