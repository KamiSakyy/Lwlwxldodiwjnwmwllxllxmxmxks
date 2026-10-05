package t00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ka implements y71.i {
    public final /* synthetic */ int r;
    public final /* synthetic */ y71.i s;
    public final /* synthetic */ yz0.y7 t;

    public /* synthetic */ ka(y71.i iVar, yz0.y7 y7Var, int i) {
        this.r = i;
        this.s = iVar;
        this.t = y7Var;
    }

    public final Object b(y71.j jVar, a71.c cVar) {
        switch (this.r) {
            case 0:
                Object b = this.s.b(new ja(jVar, this.t, 0), cVar);
                if (b != b71.a.r) {
                    break;
                }
                break;
            default:
                Object b2 = this.s.b(new ja(jVar, this.t, 1), cVar);
                if (b2 != b71.a.r) {
                    break;
                }
                break;
        }
        return w61.a0.a;
    }
}
