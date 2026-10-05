package ai;

import com.github.centrallogger.CentralUsageWorker;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c extends c71.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ CentralUsageWorker v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(CentralUsageWorker centralUsageWorker, c71.c cVar) {
        super(cVar);
        this.v = centralUsageWorker;
    }

    public final Object v(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.c(this);
    }
}
