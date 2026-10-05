package dq;

import java.util.List;
import m10.eh;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class k {
    public static final List a;

    static {
        eh.Companion.getClass();
        aa.r b = v8.l0.b(eh.a);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0.n("CreatedDiscussionFeedItem");
        List list = e.a;
        aa.s c = no.a.c(list, "selections", "CreatedDiscussionFeedItem", n, list);
        List n2 = sy.d0.n("CreatedRepositoryFeedItem");
        List list2 = g.a;
        aa.s c2 = no.a.c(list2, "selections", "CreatedRepositoryFeedItem", n2, list2);
        List n3 = sy.d0.n("FollowRecommendationFeedItem");
        List list3 = l.a;
        aa.s c3 = no.a.c(list3, "selections", "FollowRecommendationFeedItem", n3, list3);
        List n4 = sy.d0.n("FollowedUserFeedItem");
        List list4 = o.a;
        aa.s c4 = no.a.c(list4, "selections", "FollowedUserFeedItem", n4, list4);
        List n5 = sy.d0.n("ForkedRepositoryFeedItem");
        List list5 = q.a;
        aa.s c5 = no.a.c(list5, "selections", "ForkedRepositoryFeedItem", n5, list5);
        List n6 = sy.d0.n("MergedPullRequestFeedItem");
        List list6 = s.a;
        aa.s c6 = no.a.c(list6, "selections", "MergedPullRequestFeedItem", n6, list6);
        List n7 = sy.d0.n("PublishedReleaseFeedItem");
        List list7 = z.a;
        aa.s c7 = no.a.c(list7, "selections", "PublishedReleaseFeedItem", n7, list7);
        List n8 = sy.d0.n("RepositoryRecommendationFeedItem");
        List list8 = i0.a;
        aa.s c8 = no.a.c(list8, "selections", "RepositoryRecommendationFeedItem", n8, list8);
        List n9 = sy.d0.n("StarredRepositoryFeedItem");
        List list9 = k0.a;
        a = x61.l.r(new aa.s[]{mVar, c, c2, c3, c4, c5, c6, c7, c8, no.a.c(list9, "selections", "StarredRepositoryFeedItem", n9, list9)});
    }
}
