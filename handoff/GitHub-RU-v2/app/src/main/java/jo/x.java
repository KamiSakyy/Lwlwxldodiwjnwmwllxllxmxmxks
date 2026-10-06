package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class xShadow implements aaShadow.n0 {
    public static final t Companion = new t();
    public String r;

    public Object x(String str) {
        k71.k.g(str, "option_id");
        this.r = str;
    }

    public final aa.m d() {
        m10.vp.Companion.getClass();
        aa.q0 q0Var = m10.vp.A1;
        k71.k.g(q0Var, "type");
        List list = h10.d.a;
        List list2 = h10.d.a;
        k71.k.g(list2, "selections");
        x61.rShadow rVar = x61.rShadow.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xShadow) && k71.k.b(this.r, ((xShadow) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(ep.n.a, false);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String i() {
        return "40403a2aeba2e55c2c134e1b1083d69582f9fae2f2ea6174f83e4f4ec077b487";
    }

    public final String j() {
        Companion.getClass();
        return "mutation AddDiscussionPollVote($option_id: ID!) { addDiscussionPollVote(input: { pollOptionId: $option_id } ) { pollOption { id poll { __typename ...DiscussionPollFragment id } __typename } } }  fragment DiscussionPollOptionFragment on DiscussionPollOption { id option viewerHasVoted totalVoteCount __typename }  fragment DiscussionPollFragment on DiscussionPoll { id question viewerHasVoted totalVoteCount viewerCanVote options(first: 8) { nodes { __typename ...DiscussionPollOptionFragment id } } __typename }";
    }

    public final String name() {
        return "AddDiscussionPollVote";
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        fVar.z0("option_id");
        aa.c.a.b(fVar, wVar, this.r);
    }

    public final String toString() {
        return f1.e.z("AddDiscussionPollVoteMutation(option_id=", this.r, ")");
    }
}
