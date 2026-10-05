package t00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m3 implements y71.i {
    public final /* synthetic */ int r;
    public final /* synthetic */ y71.i s;
    public final /* synthetic */ r3 t;
    public final /* synthetic */ String u;
    public final /* synthetic */ dw.h5 v;

    public /* synthetic */ m3(y71.i iVar, r3 r3Var, String str, dw.h5 h5Var, int i) {
        this.r = i;
        this.s = iVar;
        this.t = r3Var;
        this.u = str;
        this.v = h5Var;
    }

    public final Object b(y71.j jVar, a71.c cVar) {
        switch (this.r) {
            case 0:
                Object b = this.s.b(new l3(jVar, this.t, this.u, this.v, 0), cVar);
                if (b != b71.a.r) {
                    break;
                }
                break;
            default:
                Object b2 = this.s.b(new l3(jVar, this.t, this.u, this.v, 1), cVar);
                if (b2 != b71.a.r) {
                    break;
                }
                break;
        }
        return w61.a0.a;
    }
}
