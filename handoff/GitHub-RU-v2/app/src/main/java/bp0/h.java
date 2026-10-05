package bp0;

import java.util.List;
import pz0.xd;
import v8.l0;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class h {
    public static final List a;

    static {
        xd.Companion.getClass();
        aa.r b = l0.b(xd.a);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0.n("CreatedDiscussionFeedItem");
        List list = b.a;
        aa.s c = no.a.c(list, "selections", "CreatedDiscussionFeedItem", n, list);
        List n2 = sy.d0.n("CreatedRepositoryFeedItem");
        List list2 = d.a;
        aa.s c2 = no.a.c(list2, "selections", "CreatedRepositoryFeedItem", n2, list2);
        List n3 = sy.d0.n("FollowRecommendationFeedItem");
        List list3 = i.a;
        aa.s c3 = no.a.c(list3, "selections", "FollowRecommendationFeedItem", n3, list3);
        List n4 = sy.d0.n("FollowedUserFeedItem");
        List list4 = l.a;
        aa.s c4 = no.a.c(list4, "selections", "FollowedUserFeedItem", n4, list4);
        List n5 = sy.d0.n("ForkedRepositoryFeedItem");
        List list5 = n.a;
        aa.s c5 = no.a.c(list5, "selections", "ForkedRepositoryFeedItem", n5, list5);
        List n6 = sy.d0.n("MergedPullRequestFeedItem");
        List list6 = p.a;
        aa.s c6 = no.a.c(list6, "selections", "MergedPullRequestFeedItem", n6, list6);
        List n7 = sy.d0.n("PublishedReleaseFeedItem");
        List list7 = s.a;
        aa.s c7 = no.a.c(list7, "selections", "PublishedReleaseFeedItem", n7, list7);
        List n8 = sy.d0.n("RepositoryRecommendationFeedItem");
        List list8 = b0.a;
        aa.s c8 = no.a.c(list8, "selections", "RepositoryRecommendationFeedItem", n8, list8);
        List n9 = sy.d0.n("StarredRepositoryFeedItem");
        List list9 = d0.a;
        a = x61.l.r(new aa.s[]{mVar, c, c2, c3, c4, c5, c6, c7, c8, no.a.c(list9, "selections", "StarredRepositoryFeedItem", n9, list9)});
    }
}
