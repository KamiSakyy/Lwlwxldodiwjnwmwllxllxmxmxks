package w41;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import t.q;
import w21.o;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b implements Executor {
    public final ExecutorService r;
    public final Object s = new Object();
    public o t = q.k((Object) null);

    public b(ExecutorService executorService) {
        this.r = executorService;
    }

    public final o a(Runnable runnable) {
        o f;
        synchronized (this.s) {
            f = this.t.f(this.r, new c5.b(28, runnable));
            this.t = f;
        }
        return f;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.r.execute(runnable);
    }
}
