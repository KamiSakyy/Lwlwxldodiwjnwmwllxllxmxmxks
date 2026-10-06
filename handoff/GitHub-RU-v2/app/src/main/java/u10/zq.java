package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class zq implements aaShadow.n0 {
    public static final vq Companion = new vq();
    public final String r;

    public zq(String str) {
        this.r = str;
    }

    public final aa.m d() {
        hc0.wg.Companion.getClass();
        aa.q0 q0Var = hc0.wg.c1;
        k71.k.g(q0Var, "type");
        List list = fc0.f3.a;
        List list2 = fc0.f3.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zq) && k71.k.b(this.r, ((zq) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(p20.ki.a, false);
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
