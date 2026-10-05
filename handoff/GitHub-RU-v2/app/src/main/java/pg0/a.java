package pg0;

import aa.m;
import aa.r;
import aa.s;
import gn0.mx;
import gn0.pb;
import gn0.tb;
import java.util.List;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a {
    public static final List a;

    static {
        tb.Companion.getClass();
        r b = l0.b(tb.a);
        x61.r rVar = x61.r.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List r = l.r(new String[]{"CommitComment", "Discussion", "DiscussionComment", "GistComment", "Issue", "IssueComment", "PullRequest", "PullRequestReview", "PullRequestReviewComment", "RepositoryAdvisory", "RepositoryAdvisoryComment", "TeamDiscussion", "TeamDiscussionComment"});
        List list = te0.a.a;
        s c = no.a.c(list, "selections", "Comment", r, list);
        List r2 = l.r(new String[]{"CommitComment", "Discussion", "DiscussionComment", "Issue", "IssueComment", "PullRequest", "PullRequestReview", "PullRequestReviewComment", "Release", "RepositoryAdvisory", "RepositoryAdvisoryComment", "TeamDiscussion", "TeamDiscussionComment"});
        List list2 = bj0.a.a;
        s c2 = no.a.c(list2, "selections", "Reactable", r2, list2);
        List r3 = l.r(new String[]{"CommitComment", "Discussion", "DiscussionComment", "Issue", "IssueComment", "PullRequest", "PullRequestReview", "PullRequestReviewComment", "RepositoryAdvisoryComment"});
        List list3 = zh0.a.a;
        s c3 = no.a.c(list3, "selections", "OrgBlockable", r3, list3);
        List r4 = l.r(new String[]{"CommitComment", "Discussion", "DiscussionComment", "GistComment", "Issue", "IssueComment", "PullRequestReview", "PullRequestReviewComment", "RepositoryAdvisoryComment", "TeamDiscussion", "TeamDiscussionComment"});
        List list4 = hf0.a.a;
        s c4 = no.a.c(list4, "selections", "Deletable", r4, list4);
        List r5 = l.r(new String[]{"CommitComment", "DiscussionComment", "GistComment", "IssueComment", "PullRequestReview", "PullRequestReviewComment"});
        List list5 = rh0.a.a;
        s c5 = no.a.c(list5, "selections", "Minimizable", r5, list5);
        mx.Companion.getClass();
        s mVar2 = new m("url", l0.b(mx.a), (String) null, rVar, rVar, rVar);
        pb.Companion.getClass();
        a = l.r(new s[]{mVar, c, c2, c3, c4, c5, mVar2, new m("id", l0.b(pb.a), (String) null, rVar, rVar, rVar)});
    }
}
