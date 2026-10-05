package h01;

import com.github.service.models.response.issueorpullrequest.PullRequestMergeMethodStatus;
import java.util.Iterator;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l {
    public static PullRequestMergeMethodStatus a(String str) {
        Object obj;
        Iterator<E> it = PullRequestMergeMethodStatus.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (k71.k.b(((PullRequestMergeMethodStatus) obj).getRawValue(), str)) {
                break;
            }
        }
        PullRequestMergeMethodStatus pullRequestMergeMethodStatus = (PullRequestMergeMethodStatus) obj;
        return pullRequestMergeMethodStatus == null ? PullRequestMergeMethodStatus.UNKNOWN__ : pullRequestMergeMethodStatus;
    }
}
