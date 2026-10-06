package fo;

import com.github.service.models.response.fileschanged.CommentLevelType;
import com.github.service.models.response.type.DiffSide;
import com.github.service.models.response.type.ReportedContentClassifier;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public class e implements z01.f, yn.a {
    public final y71.i a(String str) {
        k71.k.g(str, "threadId");
        return sy.c0.j();
    }

    public final y71.i b(String str, String str2) {
        return x.i.q(str, "commentId", str2, "body");
    }

    public final y71.i c(String str, String str2) {
        return x.i.q(str, "parentId", str2, "commentId");
    }

    public final y71.i d(String str, String str2) {
        return x.i.q(str, "commentId", str2, "body");
    }

    public final y71.i e(String str) {
        k71.k.g(str, "subjectId");
        return sy.c0.j();
    }

    public final y71.i f(int i, CommentLevelType commentLevelType, DiffSide diffSide, DiffSide diffSide2, Integer num, String str, String str2, String str3) {
        k71.k.g(commentLevelType, "subjectType");
        return sy.c0.j();
    }

    public final y71.i g(String str) {
        k71.k.g(str, "commentId");
        return sy.c0.j();
    }

    public final Object h() {
        return this;
    }

    public final y71.i i(String str, ReportedContentClassifier reportedContentClassifier) {
        k71.k.g(str, "subjectId");
        k71.k.g(reportedContentClassifier, "reportedContentClassifier");
        return sy.c0.j();
    }

    public final y71.i j(String str, String str2) {
        return x.i.q(str, "threadId", str2, "body");
    }

    public final y71.i k(String str, String str2) {
        return x.i.q(str, "commentId", str2, "body");
    }

    public final y71.i l(String str, String str2, List list, String str3) {
        return x.i.q(str, "pullRequestId", str2, "currentOid");
    }

    public final y71.i m(String str) {
        k71.k.g(str, "threadId");
        return sy.c0.j();
    }

    public final y71.i n(String str, String str2, String str3, String str4, int i, String str5, Integer num, String str6, String str7, CommentLevelType commentLevelType, String str8, String str9) {
        k71.k.g(commentLevelType, "subjectType");
        return x.i.q(str8, "diffBaseOid", str9, "diffHeadOid");
    }

    public final y71.i o(String str, String str2) {
        return x.i.q(str, "issueOrPullId", str2, "body");
    }
}
