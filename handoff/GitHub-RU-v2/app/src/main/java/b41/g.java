package b41;

import a81.t;
import android.os.RemoteException;
import c41.o;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g extends c41.k {
    public final /* synthetic */ int s;
    public final /* synthetic */ w21.g t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj, w21.g gVar, w21.g gVar2, Object obj2, int i) {
        super(gVar);
        this.s = i;
        this.v = obj;
        this.t = gVar2;
        this.u = obj2;
    }

    @Override // c41.k
    public final void a() {
        switch (this.s) {
            case 0:
                w21.g gVar = this.t;
                k kVar = (k) this.v;
                String str = (String) this.u;
                try {
                    kVar.a.m.K(kVar.b, k.a(kVar, str), new j(kVar, gVar, str));
                    return;
                } catch (RemoteException e) {
                    k.e.d(e, "requestUpdateInfo(%s)", new Object[]{str});
                    gVar.b(new RuntimeException(e));
                    return;
                }
            case 1:
                w21.g gVar2 = this.t;
                k kVar2 = (k) this.v;
                try {
                    kVar2.a.m.C(kVar2.b, k.b(), new i(kVar2, new t("OnCompleteUpdateCallback", 3), gVar2));
                    return;
                } catch (RemoteException e2) {
                    k.e.d(e2, "completeUpdate(%s)", new Object[]{(String) this.u});
                    gVar2.b(new RuntimeException(e2));
                    return;
                }
            default:
                synchronized (((o) this.v).f) {
                    try {
                        o oVar = (o) this.v;
                        w21.g gVar3 = this.t;
                        oVar.e.add(gVar3);
                        gVar3.a.b(new b1.m(19, oVar, gVar3));
                        if (((o) this.v).k.getAndIncrement() > 0) {
                            ((o) this.v).b.g("Already connected to the service.", new Object[0]);
                        }
                        o.b((o) this.v, (c41.k) this.u);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(k kVar, w21.g gVar, String str, w21.g gVar2) {
        super(gVar);
        this.s = 0;
        this.v = kVar;
        this.u = str;
        this.t = gVar2;
    }
}
