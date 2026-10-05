package fo;

import java.util.List;
import jn0.yf0;
import y41.t1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h implements z01.i, yn.a, yf0 {
    public final /* synthetic */ int r;

    public final y71.i a(String str, String str2, xn.e0 e0Var, List list) {
        switch (this.r) {
            case 0:
                k71.k.g(str2, "messageId");
                return sy.c0.j();
            default:
                k71.k.g(str2, "messageId");
                return t1.S("postMessageFeedback", "3.17");
        }
    }

    public final y71.i b(String str) {
        switch (this.r) {
            case 0:
                return sy.c0.j();
            default:
                return t1.S("fetchThreadMessagesById", "3.17");
        }
    }

    public final y71.i c(String str) {
        switch (this.r) {
            case 0:
                return sy.c0.j();
            default:
                return t1.S("patchThreadName", "3.17");
        }
    }

    public final y71.i d() {
        switch (this.r) {
            case 0:
                return sy.c0.j();
            default:
                return t1.S("fetchThreads", "3.17");
        }
    }

    public final y71.i e(String str) {
        switch (this.r) {
            case 0:
                return sy.c0.j();
            default:
                return t1.S("deleteThread", "3.17");
        }
    }

    public final y71.i f(String str, String str2, String str3, String str4, List list, List list2) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "threadId");
                k71.k.g(str2, "content");
                k71.k.g(list, "references");
                k71.k.g(list2, "confirmations");
                return sy.c0.j();
            default:
                k71.k.g(str, "threadId");
                k71.k.g(str2, "content");
                k71.k.g(list, "references");
                k71.k.g(list2, "confirmations");
                return t1.S("postMessageToThread", "3.17");
        }
    }

    public final y71.i g() {
        switch (this.r) {
            case 0:
                return sy.c0.j();
            default:
                return t1.S("createThread", "3.17");
        }
    }

    public final Object h() {
        int i = this.r;
        return this;
    }
}
