package vb0;

import java.util.List;
import java.util.Map;
import u10.y90;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d8 implements z01.l, y90 {
    @Override // z01.l
    public final y71.i a(String str, String str2, List list) {
        k71.k.g(str, "taskId");
        k71.k.g(str2, "content");
        return y41.t1.S("sendPlanReview", "3.10");
    }

    @Override // z01.l
    public final y71.i b(String str) {
        k71.k.g(str, "taskId");
        return y41.t1.S("abortAgentTask", "3.10");
    }

    @Override // z01.l
    public final y71.i c(String str, String str2, String str3, boolean z) {
        k71.k.g(str, "taskId");
        k71.k.g(str3, "answer");
        return y41.t1.S("steerAfterUserAsk", "3.10");
    }

    @Override // z01.l
    public final y71.i d(String str) {
        k71.k.g(str, "taskId");
        return y41.t1.S("fetchAgentTaskDetail", "3.10");
    }

    @Override // z01.l
    public final y71.i e(int i, String str, int i2) {
        return y41.t1.S("fetchTaskEventsPaged", "3.10");
    }

    @Override // z01.l
    public final y71.i f(String str) {
        k71.k.g(str, "sessionId");
        return y41.t1.S("fetchSessionTaskId", "3.10");
    }

    @Override // z01.l
    public final y71.i g(String str, String str2, boolean z, String str3, Boolean bool, String str4) {
        k71.k.g(str, "taskId");
        return y41.t1.S("steerAfterPlanApprove", "3.10");
    }

    public final Object h() {
        return this;
    }

    @Override // z01.l
    public final y71.i i(String str, String str2) {
        k71.k.g(str, "taskId");
        k71.k.g(str2, "message");
        return y41.t1.S("sendUserMessage", "3.10");
    }

    @Override // z01.l
    public final y71.i j(String str, String str2, xn.g1 g1Var, Map map) {
        k71.k.g(str, "taskId");
        return y41.t1.S("steerAfterElicitation", "3.10");
    }

    @Override // z01.l
    public final y71.i k(String str, String str2, String str3, boolean z) {
        k71.k.g(str, "taskId");
        return y41.t1.S("steerAfterPermission", "3.10");
    }

    @Override // z01.l
    public final y71.i l(String str, String str2, String str3) {
        k71.k.g(str, "ownerName");
        k71.k.g(str2, "repoName");
        k71.k.g(str3, "taskId");
        return y41.t1.S("createAgentTaskPullRequest", "3.10");
    }
}
