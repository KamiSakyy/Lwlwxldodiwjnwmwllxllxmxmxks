package rm0;

import com.github.service.models.response.discussions.type.DiscussionCloseReason;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e1 implements y71.i {
    public final /* synthetic */ int r;
    public final /* synthetic */ t00.f8 s;
    public final /* synthetic */ DiscussionCloseReason t;
    public final /* synthetic */ String u;

    public /* synthetic */ e1(t00.f8 f8Var, DiscussionCloseReason discussionCloseReason, String str, int i) {
        this.r = i;
        this.s = f8Var;
        this.t = discussionCloseReason;
        this.u = str;
    }

    public final Object b(y71.j jVar, a71.c cVar) {
        switch (this.r) {
            case 0:
                Object b = this.s.b(new d1(jVar, this.t, this.u, 0), cVar);
                if (b != b71.a.r) {
                    break;
                }
                break;
            case 1:
                Object b2 = this.s.b(new d1(jVar, this.t, this.u, 1), cVar);
                if (b2 != b71.a.r) {
                    break;
                }
                break;
            case 2:
                Object b3 = this.s.b(new d1(jVar, this.t, this.u, 2), cVar);
                if (b3 != b71.a.r) {
                    break;
                }
                break;
            default:
                Object b4 = this.s.b(new d1(jVar, this.t, this.u, 3), cVar);
                if (b4 != b71.a.r) {
                    break;
                }
                break;
        }
        return w61.a0.a;
    }
}
