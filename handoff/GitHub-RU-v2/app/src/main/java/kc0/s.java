package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class s implements aaShadow.n0 {
    public static final o Companion = new o();
    public final String r;

    public s(String str) {
        k71.k.g(str, "option_id");
        this.r = str;
    }

    public final aa.m d() {
        gn0.wh.Companion.getClass();
        aa.q0 q0Var = gn0.wh.e1;
        k71.k.g(q0Var, "type");
        List list = en0.c.a;
        List list2 = en0.c.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && k71.k.b(this.r, ((s) obj).r);
    }

    public final aa.p0 g() {
        return aa.c.c(fd0.k.a, false);
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
