package ep;

import java.util.List;
import java.util.Set;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t1 implements aa.a {
    public static final t1 a = new t1();
    public static final List b = sy.d0.o("__typename", "id");

    public final Object a(ea.e eVar, aa.w wVar) {
        jo.h3 h3Var;
        jo.d3 d3Var;
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
            h3Var = y1.c(eVar, wVar);
        } else {
            h3Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"Issue", "PullRequest"}), set2, str, set)) {
            eVar.s0();
            d3Var = u1.c(eVar, wVar);
        } else {
            d3Var = null;
        }
        if (str2 != null) {
            return new jo.c3(str, str2, h3Var, d3Var);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.c3 c3Var = (jo.c3) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(c3Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, c3Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, c3Var.b);
        jo.h3 h3Var = c3Var.c;
        if (h3Var != null) {
            y1.d(fVar, wVar, h3Var);
        }
        jo.d3 d3Var = c3Var.d;
        if (d3Var != null) {
            u1.d(fVar, wVar, d3Var);
        }
    }
}
