package fa1;

import com.google.android.gms.internal.measurement.b4;

/* loaded from: /home/user/work/p/classes5.dex */
public final class q extends s {
    public final /* synthetic */ int d;
    public final g e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(p0 p0Var, q81.d dVar, n nVar, g gVar, int i) {
        super(p0Var, dVar, nVar);
        this.d = i;
        this.e = gVar;
    }

    @Override // fa1.s
    public final Object a(z zVar, Object[] objArr) {
        int i = this.d;
        g gVar = this.e;
        switch (i) {
            case 0:
                return gVar.c(zVar);
            default:
                e eVar = (e) gVar.c(zVar);
                a71.c cVar = (a71.c) objArr[objArr.length - 1];
                try {
                    v71.l lVar = new v71.l(1, b4.T(cVar));
                    lVar.t();
                    lVar.v(new u(eVar, 2));
                    eVar.m(new f41.d(lVar, 5));
                    Object s = lVar.s();
                    b71.a aVar = b71.a.r;
                    return s;
                } catch (Exception e) {
                    x0.q(e, cVar);
                    return b71.a.r;
                }
        }
    }
}
