package fo;

import com.github.service.models.BlockDuration;
import com.github.service.models.HideCommentReason;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c implements z01.d, yn.a {
    public final y71.i a(String str, String str2, String str3, BlockDuration blockDuration, boolean z, HideCommentReason hideCommentReason, String str4) {
        k71.k.g(blockDuration, "duration");
        k71.k.g(str4, "discussionId");
        return sy.c0.j();
    }

    public final y71.i b(String str, String str2, String str3, BlockDuration blockDuration, boolean z, HideCommentReason hideCommentReason, String str4) {
        k71.k.g(blockDuration, "duration");
        k71.k.g(str4, "issueOrPullId");
        return sy.c0.j();
    }

    public final y71.i c(String str, String str2, String str3) {
        k71.k.g(str, "userId");
        return x.i.q(str2, "organizationId", str3, "issueOrPullId");
    }

    public final y71.i d(String str, String str2, String str3) {
        k71.k.g(str, "userId");
        return x.i.q(str2, "organizationId", str3, "discussionId");
    }

    public final y71.i e(String str, String str2, String str3, BlockDuration blockDuration, boolean z, HideCommentReason hideCommentReason, String str4) {
        k71.k.g(blockDuration, "duration");
        k71.k.g(str4, "reviewId");
        return sy.c0.j();
    }

    public final y71.i f(String str, String str2, String str3) {
        return x.i.q(str, "userId", str2, "organizationId");
    }

    public final Object h() {
        return this;
    }
}
