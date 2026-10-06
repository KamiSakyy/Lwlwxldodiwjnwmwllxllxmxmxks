package t00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class xa implements y71.i {
    public final /* synthetic */ int r;
    public final /* synthetic */ y71.i s;
    public final /* synthetic */ Object t;

    public /* synthetic */ xa(y71.i iVar, Object obj, int i) {
        this.r = i;
        this.s = iVar;
        this.t = obj;
    }

    public final Object b(y71.j jVar, a71.c cVar) {
        switch (this.r) {
            case 0:
                Object b = this.s.b(new waShadow(jVar, this.t, 0), cVar);
                if (b != b71.a.r) {
                    break;
                }
                break;
            default:
                Object b2 = this.s.b(new waShadow(jVar, this.t, 1), cVar);
                if (b2 != b71.a.r) {
                    break;
                }
                break;
        }
        return w61.a0.a;
    }
}
