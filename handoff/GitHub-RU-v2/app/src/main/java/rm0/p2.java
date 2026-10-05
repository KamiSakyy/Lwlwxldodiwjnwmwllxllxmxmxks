package rm0;

import java.io.File;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p2 implements y71.i {
    public final /* synthetic */ int r;
    public final /* synthetic */ y00.l s;
    public final /* synthetic */ File t;
    public final /* synthetic */ String u;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ Object w;

    public /* synthetic */ p2(y00.l lVar, Object obj, File file, String str, boolean z, int i) {
        this.r = i;
        this.s = lVar;
        this.w = obj;
        this.t = file;
        this.u = str;
        this.v = z;
    }

    public final Object b(y71.j jVar, a71.c cVar) {
        switch (this.r) {
            case 0:
                Object b = this.s.b(new o2(jVar, (a3) this.w, this.t, this.u, this.v, 0), cVar);
                if (b != b71.a.r) {
                    break;
                }
                break;
            case 1:
                Object b2 = this.s.b(new o2(jVar, (a3) this.w, this.t, this.u, this.v, 1), cVar);
                if (b2 != b71.a.r) {
                    break;
                }
                break;
            case 2:
                Object b3 = this.s.b(new o2(jVar, (a3) this.w, this.t, this.u, this.v, 2), cVar);
                if (b3 != b71.a.r) {
                    break;
                }
                break;
            default:
                Object b4 = this.s.b(new o2(jVar, (a3) this.w, this.t, this.u, this.v, 3), cVar);
                if (b4 != b71.a.r) {
                    break;
                }
                break;
        }
        return w61.a0.a;
    }
}
