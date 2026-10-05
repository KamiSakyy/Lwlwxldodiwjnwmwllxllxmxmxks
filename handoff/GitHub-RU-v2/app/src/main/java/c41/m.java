package c41;

import a61.c1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m extends k {
    public final /* synthetic */ int s;
    public final /* synthetic */ Object t;

    public /* synthetic */ m(int i, Object obj) {
        this.s = i;
        this.t = obj;
    }

    @Override // c41.k
    public final void a() {
        switch (this.s) {
            case 0:
                synchronized (((o) this.t).f) {
                    try {
                        if (((o) this.t).k.get() > 0 && ((o) this.t).k.decrementAndGet() > 0) {
                            ((o) this.t).b.g("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        o oVar = (o) this.t;
                        if (oVar.m != null) {
                            oVar.b.g("Unbind from service.", new Object[0]);
                            o oVar2 = (o) this.t;
                            oVar2.a.unbindService(oVar2.l);
                            o oVar3 = (o) this.t;
                            oVar3.g = false;
                            oVar3.m = null;
                            oVar3.l = null;
                        }
                        ((o) this.t).d();
                        return;
                    } finally {
                    }
                }
            default:
                o oVar4 = (o) ((c1) this.t).s;
                oVar4.b.g("unlinkToDeath", new Object[0]);
                oVar4.m.asBinder().unlinkToDeath(oVar4.j, 0);
                oVar4.m = null;
                oVar4.g = false;
                return;
        }
    }
}
