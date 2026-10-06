package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class pi implements aaShadow.a {
    public static final pi a = new pi();
    public static final List b = sy.d0Shadow.o(new String[]{"__typename", "id"});

    public final Object a(ea.e eVar, aa.w wVar) {
        jn0.gr grVar;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
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
        if (m71.a.v(m71.a.O(new String[]{"CommitComment", "Discussion", "DiscussionComment", "Issue", "IssueComment", "PullRequest", "PullRequestReview", "PullRequestReviewComment", "Release", "RepositoryAdvisory", "RepositoryAdvisoryComment", "TeamDiscussion", "TeamDiscussionComment"}), wVar.a, str, wVar.b)) {
            eVar.s0();
            grVar = qi.c(eVar, wVar);
        } else {
            grVar = null;
        }
        if (str2 != null) {
            return new jn0.fr(str, str2, grVar);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.fr frVar = (jn0.fr) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(frVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, frVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, frVar.b);
        jn0.gr grVar = frVar.c;
        if (grVar != null) {
            qi.d(fVar, wVar, grVar);
        }
    }
}
