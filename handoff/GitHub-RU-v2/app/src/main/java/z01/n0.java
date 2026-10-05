package z01;

import com.github.service.models.response.issueorpullrequest.PullRequestMergeAction;
import com.github.service.models.response.type.PullRequestMergeMethod;
import com.github.service.models.response.type.PullRequestUpdateBranchMethod;
import yz0.s2;

/* loaded from: /home/user/work/p/classes4.dex */
public interface n0 {
    y71.i a(String str, PullRequestMergeMethod pullRequestMergeMethod, String str2, s2 s2Var, String str3);

    y71.i b(String str);

    y71.i c(String str, PullRequestUpdateBranchMethod pullRequestUpdateBranchMethod);

    y71.i d(String str, PullRequestMergeAction pullRequestMergeAction, PullRequestMergeMethod pullRequestMergeMethod, boolean z);
}
