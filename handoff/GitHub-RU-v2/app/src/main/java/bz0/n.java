package bz0;

import com.github.service.models.response.PullsWidgetFilter;

/* loaded from: /home/user/work/p/classes4.dex */
public final class n implements y71.i {
    public final /* synthetic */ int r;
    public final /* synthetic */ y71.i s;
    public final /* synthetic */ PullsWidgetFilter t;

    public /* synthetic */ n(y71.i iVar, PullsWidgetFilter pullsWidgetFilter, int i) {
        this.r = i;
        this.s = iVar;
        this.t = pullsWidgetFilter;
    }

    public final Object b(y71.j jVar, a71.c cVar) {
        switch (this.r) {
            case 0:
                Object b = this.s.b(new m(jVar, this.t, 0), cVar);
                if (b != b71.a.r) {
                    break;
                }
                break;
            default:
                Object b2 = this.s.b(new m(jVar, this.t, 1), cVar);
                if (b2 != b71.a.r) {
                    break;
                }
                break;
        }
        return w61.a0.a;
    }
}
