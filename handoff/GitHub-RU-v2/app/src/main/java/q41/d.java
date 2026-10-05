package q41;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: /home/user/work/p/classes4.dex */
public final /* synthetic */ class d implements h {
    public final /* synthetic */ int r;
    public final /* synthetic */ g s;
    public final /* synthetic */ Runnable t;
    public final /* synthetic */ long u;
    public final /* synthetic */ long v;
    public final /* synthetic */ TimeUnit w;

    public /* synthetic */ d(g gVar, Runnable runnable, long j, long j2, TimeUnit timeUnit, int i) {
        this.r = i;
        this.s = gVar;
        this.t = runnable;
        this.u = j;
        this.v = j2;
        this.w = timeUnit;
    }

    @Override // q41.h
    public final ScheduledFuture a(kk.a aVar) {
        switch (this.r) {
            case 0:
                g gVar = this.s;
                return gVar.s.scheduleAtFixedRate(new e(gVar, this.t, aVar, 0), this.u, this.v, this.w);
            default:
                g gVar2 = this.s;
                return gVar2.s.scheduleWithFixedDelay(new e(gVar2, this.t, aVar, 2), this.u, this.v, this.w);
        }
    }
}
