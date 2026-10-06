package v71;

import java.util.concurrent.ScheduledFuture;

/* loaded from: /home/user/work/p/classes5.dex */
public final class i implements j {
    public final /* synthetic */ int r;
    public Object s;

    public /* synthetic */ i(int i, Object obj) {
        this.r = i;
        this.s = obj;
    }

    @Override // v71.j
    public final void b(Throwable th) {
        switch (this.r) {
            case 0:
                ((ScheduledFuture) this.s).cancel(false);
                break;
            case 1:
                ((j71.c) this.s).k(th);
                break;
            default:
                ((n0) this.s).a();
                break;
        }
    }

    public final String toString() {
        switch (this.r) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) this.s) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((j71.c) this.s).getClass().getSimpleName() + '@' + b0.q(this) + ']';
            default:
                return "DisposeOnCancel[" + ((n0) this.s) + ']';
        }
    }
}
