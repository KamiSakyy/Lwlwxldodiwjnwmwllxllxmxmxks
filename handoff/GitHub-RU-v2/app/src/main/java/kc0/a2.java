package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a2 implements aa.n0 {
    public static final x1 Companion = new x1();
    public final String r;

    public a2(String str) {
        this.r = str;
    }

    public final aa.m d() {
        gn0.wh.Companion.getClass();
        aa.q0 q0Var = gn0.wh.e1;
        k71.k.g(q0Var, "type");
        List list = en0.l.a;
        List list2 = en0.l.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a2) && k71.k.b(this.r, ((a2) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(fd0.b1.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "33605bcf65168f114c70738e8245a85e2531636064048073b668180af9ecd4c5";
    }

    public final String j() {
        Companion.getClass();
        return "mutation AddUpvoteDiscussion($subject_id: ID!) { addUpvote(input: { subjectId: $subject_id } ) { subject { __typename ...DiscussionVotableFragment } } }  fragment DiscussionVotableFragment on Votable { __typename ... on Discussion { id upvoteCount viewerCanUpvote viewerHasUpvoted } ... on DiscussionComment { id upvoteCount viewerCanUpvote viewerHasUpvoted } }";
    }

    public final String name() {
        return "AddUpvoteDiscussion";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("subject_id");
        aa.c.a.b(fVar, wVar, this.r);
    }

    public final String toString() {
        return f1.e.z("AddUpvoteDiscussionMutation(subject_id=", this.r, ")");
    }
}
