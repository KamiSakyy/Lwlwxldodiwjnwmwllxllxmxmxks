package fo;

import com.github.service.models.response.issueorpullrequest.PullRequestMergeAction;
import com.github.service.models.response.type.PullRequestMergeMethod;
import com.github.service.models.response.type.PullRequestUpdateBranchMethod;
import yz0.s2;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c0 implements z01.n0, yn.a {
    public final y71.i a(String str, PullRequestMergeMethod pullRequestMergeMethod, String str2, s2 s2Var, String str3) {
        k71.k.g(pullRequestMergeMethod, "method");
        return sy.c0.j();
    }

    public final y71.i b(String str) {
        k71.k.g(str, "pullId");
        return sy.c0.j();
    }

    public final y71.i c(String str, PullRequestUpdateBranchMethod pullRequestUpdateBranchMethod) {
        k71.k.g(pullRequestUpdateBranchMethod, "updateMethod");
        return sy.c0.j();
    }

    public final y71.i d(String str, PullRequestMergeAction pullRequestMergeAction, PullRequestMergeMethod pullRequestMergeMethod, boolean z) {
        k71.k.g(str, "pullId");
        k71.k.g(pullRequestMergeAction, "pullRequestMergeAction");
        k71.k.g(pullRequestMergeMethod, "pullRequestMergeMethod");
        return sy.c0.j();
    }

    public final Object h() {
        return this;
    }
}
