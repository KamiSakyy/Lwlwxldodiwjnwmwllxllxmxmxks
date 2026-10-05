package p20;

import java.util.List;
import java.util.Set;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m1 implements aa.a {
    public static final m1 a = new m1();
    public static final List b = sy.d0.o("__typename", "id");

    public final Object a(ea.e eVar, aa.w wVar) {
        u10.t2 t2Var;
        u10.s2 s2Var;
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
            t2Var = o1.c(eVar, wVar);
        } else {
            t2Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"Issue", "PullRequest"}), set2, str, set)) {
            eVar.s0();
            s2Var = n1.c(eVar, wVar);
        } else {
            s2Var = null;
        }
        if (str2 != null) {
            return new u10.r2(str, str2, t2Var, s2Var);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.r2 r2Var = (u10.r2) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(r2Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, r2Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, r2Var.b);
        u10.t2 t2Var = r2Var.c;
        if (t2Var != null) {
            o1.d(fVar, wVar, t2Var);
        }
        u10.s2 s2Var = r2Var.d;
        if (s2Var != null) {
            n1.d(fVar, wVar, s2Var);
        }
    }
}
