package fo;

import kc0.yb0;
import y41.t1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n implements z01.o, yn.a, yb0 {
    public final /* synthetic */ int r;

    public final y71.i a(String str) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "id");
                return sy.c0.j();
            default:
                k71.k.g(str, "id");
                return t1.S("observeDraftIssue", "3.12");
        }
    }

    public final y71.i b(String str, String str2) {
        switch (this.r) {
            case 0:
                k71.k.g(str2, "title");
                return sy.c0.j();
            default:
                k71.k.g(str2, "title");
                return t1.S("updateDraftIssue", "3.12");
        }
    }

    public final Object h() {
        int i = this.r;
        return this;
    }
}
