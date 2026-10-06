package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class lw implements aaShadow.n0 {
    public static final hw Companion = new hw();
    public String r;

    public lw(String str) {
        this.r = str;
    }

    public final aa.m d() {
        m10.vp.Companion.getClass();
        aa.q0 q0Var = m10.vp.A1;
        k71.k.g(q0Var, "type");
        List list = h10.y3.a;
        List list2 = h10.y3.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lw) && k71.k.b(this.r, ((lw) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(ep.im.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "be3909b10de86d8ff11bd7236a13458b6d1ecdd06f172d3f26fcf905ee2c7f38";
    }

    public final String j() {
        Companion.getClass();
        return "mutation RemoveUpvoteDiscussion($subject_id: ID!) { removeUpvote(input: { subjectId: $subject_id } ) { subject { __typename ...DiscussionVotableFragment } } }  fragment DiscussionVotableFragment on Votable { __typename ... on Discussion { id upvoteCount viewerCanUpvote viewerHasUpvoted } ... on DiscussionComment { id upvoteCount viewerCanUpvote viewerHasUpvoted } }";
    }

    public final String name() {
        return "RemoveUpvoteDiscussion";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("subject_id");
        aa.c.a.b(fVar, wVar, this.r);
    }

    public final String toString() {
        return f1.e.z("RemoveUpvoteDiscussionMutation(subject_id=", this.r, ")");
    }
}
