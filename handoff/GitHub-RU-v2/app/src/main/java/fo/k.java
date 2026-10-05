package fo;

import java.util.List;
import java.util.Map;
import jn0.yf0;
import xn.g1;
import y41.t1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k implements z01.l, yn.a, yf0 {
    public final /* synthetic */ int r;

    public final y71.i a(String str, String str2, List list) {
        switch (this.r) {
            case 0:
                return x.i.q(str, "taskId", str2, "content");
            default:
                k71.k.g(str, "taskId");
                k71.k.g(str2, "content");
                return t1.S("sendPlanReview", "3.17");
        }
    }

    public final y71.i b(String str) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "taskId");
                return sy.c0.j();
            default:
                k71.k.g(str, "taskId");
                return t1.S("abortAgentTask", "3.17");
        }
    }

    public final y71.i c(String str, String str2, String str3, boolean z) {
        switch (this.r) {
            case 0:
                return x.i.q(str, "taskId", str3, "answer");
            default:
                k71.k.g(str, "taskId");
                k71.k.g(str3, "answer");
                return t1.S("steerAfterUserAsk", "3.17");
        }
    }

    public final y71.i d(String str) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "taskId");
                return sy.c0.j();
            default:
                k71.k.g(str, "taskId");
                return t1.S("fetchAgentTaskDetail", "3.17");
        }
    }

    public final y71.i e(int i, String str, int i2) {
        switch (this.r) {
            case 0:
                return sy.c0.j();
            default:
                return t1.S("fetchTaskEventsPaged", "3.17");
        }
    }

    public final y71.i f(String str) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "sessionId");
                return sy.c0.j();
            default:
                k71.k.g(str, "sessionId");
                return t1.S("fetchSessionTaskId", "3.17");
        }
    }

    public final y71.i g(String str, String str2, boolean z, String str3, Boolean bool, String str4) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "taskId");
                return sy.c0.j();
            default:
                k71.k.g(str, "taskId");
                return t1.S("steerAfterPlanApprove", "3.17");
        }
    }

    public final Object h() {
        int i = this.r;
        return this;
    }

    public final y71.i i(String str, String str2) {
        switch (this.r) {
            case 0:
                return x.i.q(str, "taskId", str2, "message");
            default:
                k71.k.g(str, "taskId");
                k71.k.g(str2, "message");
                return t1.S("sendUserMessage", "3.17");
        }
    }

    public final y71.i j(String str, String str2, g1 g1Var, Map map) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "taskId");
                return sy.c0.j();
            default:
                k71.k.g(str, "taskId");
                return t1.S("steerAfterElicitation", "3.17");
        }
    }

    public final y71.i k(String str, String str2, String str3, boolean z) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "taskId");
                return sy.c0.j();
            default:
                k71.k.g(str, "taskId");
                return t1.S("steerAfterPermission", "3.17");
        }
    }

    public final y71.i l(String str, String str2, String str3) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "ownerName");
                return x.i.q(str2, "repoName", str3, "taskId");
            default:
                k71.k.g(str, "ownerName");
                k71.k.g(str2, "repoName");
                k71.k.g(str3, "taskId");
                return t1.S("createAgentTaskPullRequest", "3.17");
        }
    }
}
