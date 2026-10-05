package rm0;

import java.util.List;
import kc0.yb0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ta implements z01.i, yb0 {
    @Override // z01.i
    public final y71.i a(String str, String str2, xn.e0 e0Var, List list) {
        k71.k.g(str2, "messageId");
        return y41.t1.S("postMessageFeedback", "3.12");
    }

    @Override // z01.i
    public final y71.i b(String str) {
        return y41.t1.S("fetchThreadMessagesById", "3.12");
    }

    @Override // z01.i
    public final y71.i c(String str) {
        return y41.t1.S("patchThreadName", "3.12");
    }

    @Override // z01.i
    public final y71.i d() {
        return y41.t1.S("fetchThreads", "3.12");
    }

    @Override // z01.i
    public final y71.i e(String str) {
        return y41.t1.S("deleteThread", "3.12");
    }

    @Override // z01.i
    public final y71.i f(String str, String str2, String str3, String str4, List list, List list2) {
        k71.k.g(str, "threadId");
        k71.k.g(str2, "content");
        k71.k.g(list, "references");
        k71.k.g(list2, "confirmations");
        return y41.t1.S("postMessageToThread", "3.12");
    }

    @Override // z01.i
    public final y71.i g() {
        return y41.t1.S("createThread", "3.12");
    }

    public final Object h() {
        return this;
    }
}
