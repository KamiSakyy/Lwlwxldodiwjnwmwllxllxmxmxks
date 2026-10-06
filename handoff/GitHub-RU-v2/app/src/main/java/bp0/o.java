package bp0;

import java.util.List;
import pz0.wb;
import pz0.xd;
import v8.l0;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class o {
    public static final List a;

    static {
        xd.Companion.getClass();
        aa.x xVar = xd.a;
        aa.r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List r = x61.l.r(new String[]{"AddedToListFeedItem", "BecameSponsorableFeedItem", "CreatedDiscussionFeedItem", "CreatedRepositoryFeedItem", "FollowRecommendationFeedItem", "FollowedUserFeedItem", "ForkedRepositoryFeedItem", "MemberAddToRepositoryFeedItem", "MergedPullRequestFeedItem", "NearSponsorsGoalFeedItem", "PublishedReleaseFeedItem", "RepositoryRecommendationFeedItem", "SponsoredUserFeedItem", "StarredRepositoryFeedItem"});
        List list = h.a;
        List r2 = x61.l.r(new aa.s[]{mVar, no.a.c(list, "selections", "FeedItem", r, list)});
        aa.s mVar2 = new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n = sy.d0Shadow.n("ForkedRepositoryFeedItem");
        List list2 = n.a;
        aa.s c = no.a.c(list2, "selections", "ForkedRepositoryFeedItem", n, list2);
        wb.Companion.getClass();
        a = x61.l.r(new aa.s[]{mVar2, c, new aa.m("relatedItems", f1.e.e(wb.a), (String) null, rVar, rVar, r2)});
    }
}
