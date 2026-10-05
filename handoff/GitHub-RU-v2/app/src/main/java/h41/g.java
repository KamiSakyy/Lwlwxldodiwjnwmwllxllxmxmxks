package h41;

import a61.c1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g extends e {
    public final /* synthetic */ int s;
    public final /* synthetic */ Object t;

    public /* synthetic */ g(int i, Object obj) {
        this.s = i;
        this.t = obj;
    }

    @Override // h41.e
    public final void a() {
        switch (this.s) {
            case 0:
                synchronized (((h) this.t).f) {
                    try {
                        if (((h) this.t).k.get() > 0 && ((h) this.t).k.decrementAndGet() > 0) {
                            ((h) this.t).b.f("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        h hVar = (h) this.t;
                        if (hVar.m != null) {
                            hVar.b.f("Unbind from service.", new Object[0]);
                            h hVar2 = (h) this.t;
                            hVar2.a.unbindService(hVar2.l);
                            h hVar3 = (h) this.t;
                            hVar3.g = false;
                            hVar3.m = null;
                            hVar3.l = null;
                        }
                        ((h) this.t).c();
                        return;
                    } finally {
                    }
                }
            default:
                h hVar4 = (h) ((c1) this.t).s;
                hVar4.b.f("unlinkToDeath", new Object[0]);
                hVar4.m.asBinder().unlinkToDeath(hVar4.j, 0);
                hVar4.m = null;
                hVar4.g = false;
                return;
        }
    }
}
