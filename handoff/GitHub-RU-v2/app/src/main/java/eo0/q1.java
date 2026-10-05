package eo0;

import java.util.List;
import java.util.Set;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q1 implements aa.a {
    public static final q1 a = new q1();
    public static final List b = sy.d0.o(new String[]{"__typename", "id"});

    public final Object a(ea.e eVar, aa.w wVar) {
        jn0.z2 z2Var;
        jn0.y2 y2Var;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Set set = wVar.b;
        Set set2 = wVar.a;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"CommitComment", "CommitCommentThread", "DependabotUpdate", "Discussion", "DiscussionCategory", "Issue", "IssueComment", "PinnedDiscussion", "PullRequest", "PullRequestCommitCommentThread", "PullRequestReview", "PullRequestReviewComment", "RepositoryAdvisoryComment", "RepositoryDependabotAlertsThread", "RepositoryVulnerabilityAlert"}), set2, str, set)) {
            eVar.s0();
            z2Var = s1.c(eVar, wVar);
        } else {
            z2Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"Issue", "PullRequest"}), set2, str, set)) {
            eVar.s0();
            y2Var = r1.c(eVar, wVar);
        } else {
            y2Var = null;
        }
        if (str2 != null) {
            return new jn0.x2(str, str2, z2Var, y2Var);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.x2 x2Var = (jn0.x2) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(x2Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, x2Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, x2Var.b);
        jn0.z2 z2Var = x2Var.c;
        if (z2Var != null) {
            s1.d(fVar, wVar, z2Var);
        }
        jn0.y2 y2Var = x2Var.d;
        if (y2Var != null) {
            r1.d(fVar, wVar, y2Var);
        }
    }
}
