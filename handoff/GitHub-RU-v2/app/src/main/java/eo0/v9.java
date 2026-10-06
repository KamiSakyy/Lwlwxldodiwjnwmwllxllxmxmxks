package eo0;

import java.util.List;
import java.util.Set;

/* loaded from: /home/user/work/p/classes4.dex */
public final class v9 implements aaShadow.a {
    public static final v9 a = new v9();
    public static final List b = sy.d0Shadow.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        ap0.j jVar;
        ap0.t tVar;
        ap0.r0 r0Var;
        ap0.b1 b1Var;
        ap0.l1 l1Var;
        ap0.v1 v1Var;
        ap0.h2 h2Var;
        ap0.f5 f5Var;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Set set = wVar.b;
        Set set2 = wVar.a;
        ap0.n5 n5Var = null;
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"CreatedDiscussionFeedItem"}), set2, str, set)) {
            eVar.s0();
            jVar = ap0.k.c(eVar, wVar);
        } else {
            jVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"CreatedRepositoryFeedItem"}), set2, str, set)) {
            eVar.s0();
            tVar = ap0.u.c(eVar, wVar);
        } else {
            tVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"FollowRecommendationFeedItem"}), set2, str, set)) {
            eVar.s0();
            r0Var = ap0.s0.c(eVar, wVar);
        } else {
            r0Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"FollowedUserFeedItem"}), set2, str, set)) {
            eVar.s0();
            b1Var = ap0.c1.c(eVar, wVar);
        } else {
            b1Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"ForkedRepositoryFeedItem"}), set2, str, set)) {
            eVar.s0();
            l1Var = ap0.m1.c(eVar, wVar);
        } else {
            l1Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"MergedPullRequestFeedItem"}), set2, str, set)) {
            eVar.s0();
            v1Var = ap0.w1.c(eVar, wVar);
        } else {
            v1Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"PublishedReleaseFeedItem"}), set2, str, set)) {
            eVar.s0();
            h2Var = ap0.i2.c(eVar, wVar);
        } else {
            h2Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"RepositoryRecommendationFeedItem"}), set2, str, set)) {
            eVar.s0();
            f5Var = ap0.h5.c(eVar, wVar);
        } else {
            f5Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"StarredRepositoryFeedItem"}), set2, str, set)) {
            eVar.s0();
            n5Var = ap0.p5.c(eVar, wVar);
        }
        return new jn0.qe(str, jVar, tVar, r0Var, b1Var, l1Var, v1Var, h2Var, f5Var, n5Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.qe qeVar = (jn0.qe) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(qeVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, qeVar.a);
        ap0.j jVar = qeVar.b;
        if (jVar != null) {
            ap0.k.d(fVar, wVar, jVar);
        }
        ap0.t tVar = qeVar.c;
        if (tVar != null) {
            ap0.u.d(fVar, wVar, tVar);
        }
        ap0.r0 r0Var = qeVar.d;
        if (r0Var != null) {
            ap0.s0.d(fVar, wVar, r0Var);
        }
        ap0.b1 b1Var = qeVar.e;
        if (b1Var != null) {
            ap0.c1.d(fVar, wVar, b1Var);
        }
        ap0.l1 l1Var = qeVar.f;
        if (l1Var != null) {
            ap0.m1.d(fVar, wVar, l1Var);
        }
        ap0.v1 v1Var = qeVar.g;
        if (v1Var != null) {
            ap0.w1.d(fVar, wVar, v1Var);
        }
        ap0.h2 h2Var = qeVar.h;
        if (h2Var != null) {
            ap0.i2.d(fVar, wVar, h2Var);
        }
        ap0.f5 f5Var = qeVar.i;
        if (f5Var != null) {
            ap0.h5.d(fVar, wVar, f5Var);
        }
        ap0.n5 n5Var = qeVar.j;
        if (n5Var != null) {
            ap0.p5.d(fVar, wVar, n5Var);
        }
    }
}
