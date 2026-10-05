package cq;

import java.util.List;
import java.util.Set;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class x0 implements aa.a {
    public static final List a = sy.d0.n("__typename");

    public static w0 c(ea.e eVar, aa.w wVar) {
        w wVar2;
        g0 g0Var;
        d1 d1Var;
        o1 o1Var;
        y1 y1Var;
        i2 i2Var;
        i3 i3Var;
        f6 f6Var;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Set set = wVar.b;
        Set set2 = wVar.a;
        o6 o6Var = null;
        String str = null;
        while (eVar.r0(a) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"CreatedDiscussionFeedItem"}), set2, str, set)) {
            eVar.s0();
            wVar2 = y.c(eVar, wVar);
        } else {
            wVar2 = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"CreatedRepositoryFeedItem"}), set2, str, set)) {
            eVar.s0();
            g0Var = i0.c(eVar, wVar);
        } else {
            g0Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"FollowRecommendationFeedItem"}), set2, str, set)) {
            eVar.s0();
            d1Var = e1.c(eVar, wVar);
        } else {
            d1Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"FollowedUserFeedItem"}), set2, str, set)) {
            eVar.s0();
            o1Var = p1.c(eVar, wVar);
        } else {
            o1Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"ForkedRepositoryFeedItem"}), set2, str, set)) {
            eVar.s0();
            y1Var = a2.c(eVar, wVar);
        } else {
            y1Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"MergedPullRequestFeedItem"}), set2, str, set)) {
            eVar.s0();
            i2Var = k2.c(eVar, wVar);
        } else {
            i2Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"PublishedReleaseFeedItem"}), set2, str, set)) {
            eVar.s0();
            i3Var = k3.c(eVar, wVar);
        } else {
            i3Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"RepositoryRecommendationFeedItem"}), set2, str, set)) {
            eVar.s0();
            f6Var = h6.c(eVar, wVar);
        } else {
            f6Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"StarredRepositoryFeedItem"}), set2, str, set)) {
            eVar.s0();
            o6Var = r6.c(eVar, wVar);
        }
        return new w0(str, wVar2, g0Var, d1Var, o1Var, y1Var, i2Var, i3Var, f6Var, o6Var);
    }

    public static void d(ea.f fVar, aa.w wVar, w0 w0Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(w0Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, w0Var.a);
        w wVar2 = w0Var.b;
        if (wVar2 != null) {
            y.d(fVar, wVar, wVar2);
        }
        g0 g0Var = w0Var.c;
        if (g0Var != null) {
            i0.d(fVar, wVar, g0Var);
        }
        d1 d1Var = w0Var.d;
        if (d1Var != null) {
            e1.d(fVar, wVar, d1Var);
        }
        o1 o1Var = w0Var.e;
        if (o1Var != null) {
            p1.d(fVar, wVar, o1Var);
        }
        y1 y1Var = w0Var.f;
        if (y1Var != null) {
            a2.d(fVar, wVar, y1Var);
        }
        i2 i2Var = w0Var.g;
        if (i2Var != null) {
            k2.d(fVar, wVar, i2Var);
        }
        i3 i3Var = w0Var.h;
        if (i3Var != null) {
            k3.d(fVar, wVar, i3Var);
        }
        f6 f6Var = w0Var.i;
        if (f6Var != null) {
            h6.d(fVar, wVar, f6Var);
        }
        o6 o6Var = w0Var.j;
        if (o6Var != null) {
            r6.d(fVar, wVar, o6Var);
        }
    }
}
