package ep;

import java.util.List;
import java.util.Set;

/* loaded from: /home/user/work/p/classes3.dex */
public final class la implements aa.a {
    public static final la a = new la();
    public static final List b = sy.d0.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        cq.r rVar;
        cq.b0 b0Var;
        cq.z0 z0Var;
        cq.j1 j1Var;
        cq.t1 t1Var;
        cq.d2 d2Var;
        cq.d3 d3Var;
        cq.b6 b6Var;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Set set = wVar.b;
        Set set2 = wVar.a;
        cq.j6 j6Var = null;
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"CreatedDiscussionFeedItem"}), set2, str, set)) {
            eVar.s0();
            rVar = cq.s.c(eVar, wVar);
        } else {
            rVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"CreatedRepositoryFeedItem"}), set2, str, set)) {
            eVar.s0();
            b0Var = cq.c0.c(eVar, wVar);
        } else {
            b0Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"FollowRecommendationFeedItem"}), set2, str, set)) {
            eVar.s0();
            z0Var = cq.a1.c(eVar, wVar);
        } else {
            z0Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"FollowedUserFeedItem"}), set2, str, set)) {
            eVar.s0();
            j1Var = cq.k1.c(eVar, wVar);
        } else {
            j1Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"ForkedRepositoryFeedItem"}), set2, str, set)) {
            eVar.s0();
            t1Var = cq.u1.c(eVar, wVar);
        } else {
            t1Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"MergedPullRequestFeedItem"}), set2, str, set)) {
            eVar.s0();
            d2Var = cq.e2.c(eVar, wVar);
        } else {
            d2Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"PublishedReleaseFeedItem"}), set2, str, set)) {
            eVar.s0();
            d3Var = cq.e3.c(eVar, wVar);
        } else {
            d3Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"RepositoryRecommendationFeedItem"}), set2, str, set)) {
            eVar.s0();
            b6Var = cq.d6.c(eVar, wVar);
        } else {
            b6Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"StarredRepositoryFeedItem"}), set2, str, set)) {
            eVar.s0();
            j6Var = cq.l6.c(eVar, wVar);
        }
        return new jo.of(str, rVar, b0Var, z0Var, j1Var, t1Var, d2Var, d3Var, b6Var, j6Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.of ofVar = (jo.of) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ofVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, ofVar.a);
        cq.r rVar = ofVar.b;
        if (rVar != null) {
            cq.s.d(fVar, wVar, rVar);
        }
        cq.b0 b0Var = ofVar.c;
        if (b0Var != null) {
            cq.c0.d(fVar, wVar, b0Var);
        }
        cq.z0 z0Var = ofVar.d;
        if (z0Var != null) {
            cq.a1.d(fVar, wVar, z0Var);
        }
        cq.j1 j1Var = ofVar.e;
        if (j1Var != null) {
            cq.k1.d(fVar, wVar, j1Var);
        }
        cq.t1 t1Var = ofVar.f;
        if (t1Var != null) {
            cq.u1.d(fVar, wVar, t1Var);
        }
        cq.d2 d2Var = ofVar.g;
        if (d2Var != null) {
            cq.e2.d(fVar, wVar, d2Var);
        }
        cq.d3 d3Var = ofVar.h;
        if (d3Var != null) {
            cq.e3.d(fVar, wVar, d3Var);
        }
        cq.b6 b6Var = ofVar.i;
        if (b6Var != null) {
            cq.d6.d(fVar, wVar, b6Var);
        }
        cq.j6 j6Var = ofVar.j;
        if (j6Var != null) {
            cq.l6.d(fVar, wVar, j6Var);
        }
    }
}
