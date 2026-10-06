package kz0;

import java.util.List;
import pz0.e90;
import pz0.g7;
import pz0.hm;
import pz0.pd;
import pz0.qb;
import pz0.td;
import pz0.ub;
import pz0.w80;
import pz0.wb;
import pz0.xd;
import pz0.yb;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class k1 {
    public static final List a;

    static {
        pd.Companion.getClass();
        aa.x xVar = pd.a;
        aa.r b = v8.l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        aa.m mVar = new aa.m("isEnabled", b, (String) null, rVar, rVar, rVar);
        g7.Companion.getClass();
        List r = x61.l.r(new aa.m[]{mVar, new aa.m("filterGroup", v8.l0.b(g7.s), (String) null, rVar, rVar, rVar)});
        xd.Companion.getClass();
        aa.x xVar2 = xd.a;
        k71.k.g(xVar2, "type");
        List r2 = x61.l.r(new aa.m[]{new aa.m("endCursor", xVar2, (String) null, rVar, rVar, rVar), new aa.m("hasNextPage", v8.l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.m("hasPreviousPage", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.s mVar2 = new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        List n = sy.d0Shadow.n("CreatedDiscussionFeedItem");
        List list = bp0.c.a;
        aa.s c = no.a.c(list, "selections", "CreatedDiscussionFeedItem", n, list);
        List n2 = sy.d0Shadow.n("CreatedRepositoryFeedItem");
        List list2 = bp0.e.a;
        aa.s c2 = no.a.c(list2, "selections", "CreatedRepositoryFeedItem", n2, list2);
        List n3 = sy.d0Shadow.n("FollowRecommendationFeedItem");
        List list3 = bp0.j.a;
        aa.s c3 = no.a.c(list3, "selections", "FollowRecommendationFeedItem", n3, list3);
        List n4 = sy.d0Shadow.n("FollowedUserFeedItem");
        List list4 = bp0.m.a;
        aa.s c4 = no.a.c(list4, "selections", "FollowedUserFeedItem", n4, list4);
        List n5 = sy.d0Shadow.n("ForkedRepositoryFeedItem");
        List list5 = bp0.o.a;
        aa.s c5 = no.a.c(list5, "selections", "ForkedRepositoryFeedItem", n5, list5);
        List n6 = sy.d0Shadow.n("MergedPullRequestFeedItem");
        List list6 = bp0.q.a;
        aa.s c6 = no.a.c(list6, "selections", "MergedPullRequestFeedItem", n6, list6);
        List n7 = sy.d0Shadow.n("PublishedReleaseFeedItem");
        List list7 = bp0.t.a;
        aa.s c7 = no.a.c(list7, "selections", "PublishedReleaseFeedItem", n7, list7);
        List n8 = sy.d0Shadow.n("RepositoryRecommendationFeedItem");
        List list8 = bp0.c0.a;
        aa.s c8 = no.a.c(list8, "selections", "RepositoryRecommendationFeedItem", n8, list8);
        List n9 = sy.d0Shadow.n("StarredRepositoryFeedItem");
        List list9 = bp0.e0.a;
        List r3 = x61.l.r(new aa.s[]{mVar2, c, c2, c3, c4, c5, c6, c7, c8, no.a.c(list9, "selections", "StarredRepositoryFeedItem", n9, list9)});
        hm.Companion.getClass();
        aa.m mVar3 = new aa.m("pageInfo", v8.l0.b(hm.a), (String) null, rVar, rVar, r2);
        wb.Companion.getClass();
        List r4 = x61.l.r(new aa.m[]{mVar3, new aa.m("nodes", v8.l0.a(wb.a), (String) null, rVar, rVar, r3)});
        ub.Companion.getClass();
        aa.m mVar4 = new aa.m("filters", v8.l0.a(v8.l0.b(ub.a)), (String) null, rVar, rVar, r);
        yb.Companion.getClass();
        aa.r b2 = v8.l0.b(yb.a);
        qb.Companion.getClass();
        aa.m mVar5 = new aa.m("feed", v8.l0.b(qb.d), (String) null, rVar, rVar, x61.l.r(new aa.m[]{mVar4, new aa.m("items", b2, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(qb.a, new aa.u0(new aa.t("after"))), new aa.k(qb.b, new aa.u0(new aa.t("first"))), new aa.k(qb.c, new aa.u0(x61.l.r(new String[]{"CREATED_DISCUSSION_FEED_ITEM", "CREATED_REPOSITORY_FEED_ITEM", "FOLLOWED_USER_FEED_ITEM", "FOLLOW_RECOMMENDATION_FEED_ITEM", "FORKED_REPOSITORY_FEED_ITEM", "MERGED_PULL_REQUEST_FEED_ITEM", "PUBLISHED_RELEASE_FEED_ITEM", "REPOSITORY_RECOMMENDATION_FEED_ITEM", "STARRED_REPOSITORY_FEED_ITEM"})))}), r4)}));
        td.Companion.getClass();
        aa.x xVar3 = td.a;
        List r5 = x61.l.r(new aa.m[]{mVar5, new aa.m("id", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        aa.m mVar6 = new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        aa.m mVar7 = new aa.m("id", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar);
        e90.Companion.getClass();
        aa.q0 q0Var = e90.c;
        k71.k.g(q0Var, "type");
        List r6 = x61.l.r(new aa.m[]{mVar6, mVar7, new aa.m("dashboard", q0Var, (String) null, rVar, rVar, r5)});
        w80.Companion.getClass();
        a = x61.l.r(new aa.m[]{new aa.m("viewer", v8.l0.b(w80.W), (String) null, rVar, rVar, r6), new aa.m("id", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
    }
}
