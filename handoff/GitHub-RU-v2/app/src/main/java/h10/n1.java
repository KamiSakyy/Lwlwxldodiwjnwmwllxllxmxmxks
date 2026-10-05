package h10;

import java.util.List;
import m10.af;
import m10.ah;
import m10.cf;
import m10.eh;
import m10.ka;
import m10.mr;
import m10.rf0;
import m10.ue;
import m10.wg;
import m10.ye;
import m10.zf0;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class n1 {
    public static final List a;

    static {
        wg.Companion.getClass();
        aa.x xVar = wg.a;
        aa.r b = v8.l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.m mVar = new aa.m("isEnabled", b, (String) null, rVar, rVar, rVar);
        ka.Companion.getClass();
        List r = x61.l.r(new aa.m[]{mVar, new aa.m("filterGroup", v8.l0.b(ka.s), (String) null, rVar, rVar, rVar)});
        eh.Companion.getClass();
        aa.x xVar2 = eh.a;
        k71.k.g(xVar2, "type");
        List r2 = x61.l.r(new aa.m[]{new aa.m("endCursor", xVar2, (String) null, rVar, rVar, rVar), new aa.m("hasNextPage", v8.l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.m("hasPreviousPage", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.s mVar2 = new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        List n = sy.d0.n("CreatedDiscussionFeedItem");
        List list = dq.f.a;
        aa.s c = no.a.c(list, "selections", "CreatedDiscussionFeedItem", n, list);
        List n2 = sy.d0.n("CreatedRepositoryFeedItem");
        List list2 = dq.h.a;
        aa.s c2 = no.a.c(list2, "selections", "CreatedRepositoryFeedItem", n2, list2);
        List n3 = sy.d0.n("FollowRecommendationFeedItem");
        List list3 = dq.m.a;
        aa.s c3 = no.a.c(list3, "selections", "FollowRecommendationFeedItem", n3, list3);
        List n4 = sy.d0.n("FollowedUserFeedItem");
        List list4 = dq.p.a;
        aa.s c4 = no.a.c(list4, "selections", "FollowedUserFeedItem", n4, list4);
        List n5 = sy.d0.n("ForkedRepositoryFeedItem");
        List list5 = dq.r.a;
        aa.s c5 = no.a.c(list5, "selections", "ForkedRepositoryFeedItem", n5, list5);
        List n6 = sy.d0.n("MergedPullRequestFeedItem");
        List list6 = dq.t.a;
        aa.s c6 = no.a.c(list6, "selections", "MergedPullRequestFeedItem", n6, list6);
        List n7 = sy.d0.n("PublishedReleaseFeedItem");
        List list7 = dq.a0.a;
        aa.s c7 = no.a.c(list7, "selections", "PublishedReleaseFeedItem", n7, list7);
        List n8 = sy.d0.n("RepositoryRecommendationFeedItem");
        List list8 = dq.j0.a;
        aa.s c8 = no.a.c(list8, "selections", "RepositoryRecommendationFeedItem", n8, list8);
        List n9 = sy.d0.n("StarredRepositoryFeedItem");
        List list9 = dq.l0.a;
        List r3 = x61.l.r(new aa.s[]{mVar2, c, c2, c3, c4, c5, c6, c7, c8, no.a.c(list9, "selections", "StarredRepositoryFeedItem", n9, list9)});
        mr.Companion.getClass();
        aa.m mVar3 = new aa.m("pageInfo", v8.l0.b(mr.a), (String) null, rVar, rVar, r2);
        af.Companion.getClass();
        List r4 = x61.l.r(new aa.m[]{mVar3, new aa.m("nodes", v8.l0.a(af.a), (String) null, rVar, rVar, r3)});
        ye.Companion.getClass();
        aa.m mVar4 = new aa.m("filters", v8.l0.a(v8.l0.b(ye.a)), (String) null, rVar, rVar, r);
        cf.Companion.getClass();
        aa.r b2 = v8.l0.b(cf.a);
        ue.Companion.getClass();
        aa.m mVar5 = new aa.m("feed", v8.l0.b(ue.d), (String) null, rVar, rVar, x61.l.r(new aa.m[]{mVar4, new aa.m("items", b2, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(ue.a, new aa.u0(new aa.t("after"))), new aa.k(ue.b, new aa.u0(new aa.t("first"))), new aa.k(ue.c, new aa.u0(x61.l.r(new String[]{"CREATED_DISCUSSION_FEED_ITEM", "CREATED_REPOSITORY_FEED_ITEM", "FOLLOWED_USER_FEED_ITEM", "FOLLOW_RECOMMENDATION_FEED_ITEM", "FORKED_REPOSITORY_FEED_ITEM", "MERGED_PULL_REQUEST_FEED_ITEM", "PUBLISHED_RELEASE_FEED_ITEM", "REPOSITORY_RECOMMENDATION_FEED_ITEM", "STARRED_REPOSITORY_FEED_ITEM"})))}), r4)}));
        ah.Companion.getClass();
        aa.x xVar3 = ah.a;
        List r5 = x61.l.r(new aa.m[]{mVar5, new aa.m("id", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        aa.m mVar6 = new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        aa.m mVar7 = new aa.m("id", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar);
        zf0.Companion.getClass();
        aa.q0 q0Var = zf0.c;
        k71.k.g(q0Var, "type");
        List r6 = x61.l.r(new aa.m[]{mVar6, mVar7, new aa.m("dashboard", q0Var, (String) null, rVar, rVar, r5)});
        rf0.Companion.getClass();
        a = x61.l.r(new aa.m[]{new aa.m("viewer", v8.l0.b(rf0.g0), (String) null, rVar, rVar, r6), new aa.m("id", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
    }
}
