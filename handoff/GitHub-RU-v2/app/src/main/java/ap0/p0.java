package ap0;

import java.util.List;
import java.util.Set;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class p0 implements aa.a {
    public static final List a = sy.d0.n("__typename");

    public static o0 c(ea.e eVar, aa.w wVar) {
        o oVar;
        y yVar;
        v0 v0Var;
        g1 g1Var;
        q1 q1Var;
        a2 a2Var;
        m2 m2Var;
        j5 j5Var;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Set set = wVar.b;
        Set set2 = wVar.a;
        s5 s5Var = null;
        String str = null;
        while (eVar.r0(a) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"CreatedDiscussionFeedItem"}), set2, str, set)) {
            eVar.s0();
            oVar = q.c(eVar, wVar);
        } else {
            oVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"CreatedRepositoryFeedItem"}), set2, str, set)) {
            eVar.s0();
            yVar = a0.c(eVar, wVar);
        } else {
            yVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"FollowRecommendationFeedItem"}), set2, str, set)) {
            eVar.s0();
            v0Var = w0.c(eVar, wVar);
        } else {
            v0Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"FollowedUserFeedItem"}), set2, str, set)) {
            eVar.s0();
            g1Var = h1.c(eVar, wVar);
        } else {
            g1Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"ForkedRepositoryFeedItem"}), set2, str, set)) {
            eVar.s0();
            q1Var = s1.c(eVar, wVar);
        } else {
            q1Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"MergedPullRequestFeedItem"}), set2, str, set)) {
            eVar.s0();
            a2Var = c2.c(eVar, wVar);
        } else {
            a2Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"PublishedReleaseFeedItem"}), set2, str, set)) {
            eVar.s0();
            m2Var = o2.c(eVar, wVar);
        } else {
            m2Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"RepositoryRecommendationFeedItem"}), set2, str, set)) {
            eVar.s0();
            j5Var = l5.c(eVar, wVar);
        } else {
            j5Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"StarredRepositoryFeedItem"}), set2, str, set)) {
            eVar.s0();
            s5Var = v5.c(eVar, wVar);
        }
        return new o0(str, oVar, yVar, v0Var, g1Var, q1Var, a2Var, m2Var, j5Var, s5Var);
    }

    public static void d(ea.f fVar, aa.w wVar, o0 o0Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(o0Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, o0Var.a);
        o oVar = o0Var.b;
        if (oVar != null) {
            q.d(fVar, wVar, oVar);
        }
        y yVar = o0Var.c;
        if (yVar != null) {
            a0.d(fVar, wVar, yVar);
        }
        v0 v0Var = o0Var.d;
        if (v0Var != null) {
            w0.d(fVar, wVar, v0Var);
        }
        g1 g1Var = o0Var.e;
        if (g1Var != null) {
            h1.d(fVar, wVar, g1Var);
        }
        q1 q1Var = o0Var.f;
        if (q1Var != null) {
            s1.d(fVar, wVar, q1Var);
        }
        a2 a2Var = o0Var.g;
        if (a2Var != null) {
            c2.d(fVar, wVar, a2Var);
        }
        m2 m2Var = o0Var.h;
        if (m2Var != null) {
            o2.d(fVar, wVar, m2Var);
        }
        j5 j5Var = o0Var.i;
        if (j5Var != null) {
            l5.d(fVar, wVar, j5Var);
        }
        s5 s5Var = o0Var.j;
        if (s5Var != null) {
            v5.d(fVar, wVar, s5Var);
        }
    }
}
