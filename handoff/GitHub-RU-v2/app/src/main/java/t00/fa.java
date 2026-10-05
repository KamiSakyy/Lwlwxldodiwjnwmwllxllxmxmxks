package t00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class fa implements y71.i {
    public final /* synthetic */ int r;
    public final /* synthetic */ y71.i s;
    public final /* synthetic */ yz0.w7 t;

    public /* synthetic */ fa(y71.i iVar, yz0.w7 w7Var, int i) {
        this.r = i;
        this.s = iVar;
        this.t = w7Var;
    }

    public final Object b(y71.j jVar, a71.c cVar) {
        switch (this.r) {
            case 0:
                Object b = this.s.b(new ea(jVar, this.t, 0), cVar);
                if (b != b71.a.r) {
                    break;
                }
                break;
            default:
                Object b2 = this.s.b(new ea(jVar, this.t, 1), cVar);
                if (b2 != b71.a.r) {
                    break;
                }
                break;
        }
        return w61.a0.a;
    }
}
