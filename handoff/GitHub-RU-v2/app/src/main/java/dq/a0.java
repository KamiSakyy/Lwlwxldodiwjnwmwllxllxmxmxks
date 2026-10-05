package dq;

import java.util.List;
import m10.af;
import m10.eh;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class a0 {
    public static final List a;

    static {
        eh.Companion.getClass();
        aa.x xVar = eh.a;
        aa.r b = v8.l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List r = x61.l.r(new String[]{"AddedToListFeedItem", "BecameSponsorableFeedItem", "CreatedDiscussionFeedItem", "CreatedRepositoryFeedItem", "FollowRecommendationFeedItem", "FollowedUserFeedItem", "ForkedRepositoryFeedItem", "MemberAddToRepositoryFeedItem", "MergedPullRequestFeedItem", "NearSponsorsGoalFeedItem", "PublishedReleaseFeedItem", "RepositoryRecommendationFeedItem", "SponsoredUserFeedItem", "StarredRepositoryFeedItem"});
        List list = k.a;
        List r2 = x61.l.r(new aa.s[]{mVar, no.a.c(list, "selections", "FeedItem", r, list)});
        aa.s mVar2 = new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n = sy.d0.n("PublishedReleaseFeedItem");
        List list2 = z.a;
        aa.s c = no.a.c(list2, "selections", "PublishedReleaseFeedItem", n, list2);
        af.Companion.getClass();
        a = x61.l.r(new aa.s[]{mVar2, c, new aa.m("relatedItems", f1.e.e(af.a), (String) null, rVar, rVar, r2)});
    }
}
