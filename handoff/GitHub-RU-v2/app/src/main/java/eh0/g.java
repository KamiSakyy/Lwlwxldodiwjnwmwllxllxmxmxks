package eh0;

import aa.w;
import java.util.List;
import java.util.Set;
import k71.k;
import sy.d0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g implements aa.a {
    public static final g a = new g();
    public static final List b = d0.n("__typename");

    public final Object a(ea.e eVar, w wVar) {
        c cVar;
        d dVar;
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        Set set = wVar.b;
        Set set2 = wVar.a;
        qj0.c cVar2 = null;
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"Issue"}), set2, str, set)) {
            eVar.s0();
            cVar = i.c(eVar, wVar);
        } else {
            cVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"PullRequest"}), set2, str, set)) {
            eVar.s0();
            dVar = j.c(eVar, wVar);
        } else {
            dVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"CommitComment", "CommitCommentThread", "DependabotUpdate", "Discussion", "DiscussionCategory", "Issue", "IssueComment", "PinnedDiscussion", "PullRequest", "PullRequestCommitCommentThread", "PullRequestReview", "PullRequestReviewComment", "RepositoryAdvisoryComment", "RepositoryDependabotAlertsThread", "RepositoryVulnerabilityAlert"}), set2, str, set)) {
            eVar.s0();
            cVar2 = qj0.d.c(eVar, wVar);
        }
        return new b(str, cVar, dVar, cVar2);
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        b bVar = (b) obj;
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(bVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, bVar.a);
        c cVar = bVar.b;
        if (cVar != null) {
            i.d(fVar, wVar, cVar);
        }
        d dVar = bVar.c;
        if (dVar != null) {
            j.d(fVar, wVar, dVar);
        }
        qj0.c cVar2 = bVar.d;
        if (cVar2 != null) {
            qj0.d.d(fVar, wVar, cVar2);
        }
    }

}
