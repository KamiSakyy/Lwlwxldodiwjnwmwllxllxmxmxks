package z50;

import aa.m;
import aa.r;
import aa.s;
import hc0.bb;
import hc0.ew;
import hc0.fb;
import java.util.List;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class a {
    public static final List a;

    static {
        fb.Companion.getClass();
        r b = l0.b(fb.a);
        x61.r rVar = x61.r.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List r = l.r(new String[]{"CommitComment", "Discussion", "DiscussionComment", "GistComment", "Issue", "IssueComment", "PullRequest", "PullRequestReview", "PullRequestReviewComment", "RepositoryAdvisory", "RepositoryAdvisoryComment", "TeamDiscussion", "TeamDiscussionComment"});
        List list = d40.a.a;
        s c = no.a.c(list, "selections", "Comment", r, list);
        List r2 = l.r(new String[]{"CommitComment", "Discussion", "DiscussionComment", "Issue", "IssueComment", "PullRequest", "PullRequestReview", "PullRequestReviewComment", "Release", "RepositoryAdvisory", "RepositoryAdvisoryComment", "TeamDiscussion", "TeamDiscussionComment"});
        List list2 = j80.a.a;
        s c2 = no.a.c(list2, "selections", "Reactable", r2, list2);
        List r3 = l.r(new String[]{"CommitComment", "Discussion", "DiscussionComment", "Issue", "IssueComment", "PullRequest", "PullRequestReview", "PullRequestReviewComment", "RepositoryAdvisoryComment"});
        List list3 = h70.a.a;
        s c3 = no.a.c(list3, "selections", "OrgBlockable", r3, list3);
        List r4 = l.r(new String[]{"CommitComment", "Discussion", "DiscussionComment", "GistComment", "Issue", "IssueComment", "PullRequestReview", "PullRequestReviewComment", "RepositoryAdvisoryComment", "TeamDiscussion", "TeamDiscussionComment"});
        List list4 = r40.a.a;
        s c4 = no.a.c(list4, "selections", "Deletable", r4, list4);
        List r5 = l.r(new String[]{"CommitComment", "DiscussionComment", "GistComment", "IssueComment", "PullRequestReviewComment"});
        List list5 = z60.a.a;
        s c5 = no.a.c(list5, "selections", "Minimizable", r5, list5);
        ew.Companion.getClass();
        s mVar2 = new m("url", l0.b(ew.a), (String) null, rVar, rVar, rVar);
        bb.Companion.getClass();
        a = l.r(new s[]{mVar, c, c2, c3, c4, c5, mVar2, new m("id", l0.b(bb.a), (String) null, rVar, rVar, rVar)});
    }
}
