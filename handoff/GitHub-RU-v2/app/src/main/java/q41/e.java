package q41;

import java.util.concurrent.ExecutorService;

/* loaded from: /home/user/work/p/classes4.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int r;
    public final /* synthetic */ g s;
    public final /* synthetic */ Runnable t;
    public final /* synthetic */ kk.a u;

    public /* synthetic */ e(g gVar, Runnable runnable, kk.a aVar, int i) {
        this.r = i;
        this.s = gVar;
        this.t = runnable;
        this.u = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.r) {
            case 0:
                ExecutorService executorService = this.s.r;
                final int i = 0;
                final Runnable runnable = this.t;
                final kk.a aVar = this.u;
                executorService.execute(new Runnable() { // from class: q41.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i) {
                            case 0:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e) {
                                    ((i) aVar.s).l(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e2) {
                                    ((i) aVar.s).l(e2);
                                    return;
                                }
                            default:
                                Runnable runnable2 = runnable;
                                i iVar = (i) aVar.s;
                                try {
                                    runnable2.run();
                                    iVar.k((Object) null);
                                    return;
                                } catch (Exception e3) {
                                    iVar.l(e3);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 1:
                ExecutorService executorService2 = this.s.r;
                final int i2 = 2;
                final Runnable runnable2 = this.t;
                final kk.a aVar2 = this.u;
                executorService2.execute(new Runnable() { // from class: q41.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i2) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e) {
                                    ((i) aVar2.s).l(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e2) {
                                    ((i) aVar2.s).l(e2);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable2;
                                i iVar = (i) aVar2.s;
                                try {
                                    runnable22.run();
                                    iVar.k((Object) null);
                                    return;
                                } catch (Exception e3) {
                                    iVar.l(e3);
                                    return;
                                }
                        }
                    }
                });
                break;
            default:
                ExecutorService executorService3 = this.s.r;
                final int i3 = 1;
                final Runnable runnable3 = this.t;
                final kk.a aVar3 = this.u;
                executorService3.execute(new Runnable() { // from class: q41.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i3) {
                            case 0:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e) {
                                    ((i) aVar3.s).l(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e2) {
                                    ((i) aVar3.s).l(e2);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable3;
                                i iVar = (i) aVar3.s;
                                try {
                                    runnable22.run();
                                    iVar.k((Object) null);
                                    return;
                                } catch (Exception e3) {
                                    iVar.l(e3);
                                    return;
                                }
                        }
                    }
                });
                break;
        }
    }
}
