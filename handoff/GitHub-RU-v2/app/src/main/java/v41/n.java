package v41;

/* loaded from: /home/user/work/p/classes4.dex */
public final /* synthetic */ class n implements Runnable {
    public final /* synthetic */ int r;
    public final /* synthetic */ p s;
    public final /* synthetic */ long t;
    public final /* synthetic */ String u;

    public /* synthetic */ n(p pVar, long j, String str, int i) {
        this.r = i;
        this.s = pVar;
        this.t = j;
        this.u = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.r) {
            case 0:
                p pVar = this.s;
                pVar.p.b.a(new n(pVar, this.t, this.u, 1));
                break;
            default:
                l lVar = this.s.h;
                rShadow rVar = lVar.n;
                if (rVar == null || !rVar.e.get()) {
                    ((x41.d) lVar.i.s).f(this.u, this.t);
                    break;
                }
                break;
        }
    }
}
