package c81;

import a0.s0;
import v71.b0;

/* loaded from: /home/user/work/p/classes5.dex */
public final class j extends i {
    public Runnable t;

    public j(Runnable runnable, long j, boolean z) {
        super(z, j);
        this.t = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.t.run();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.t;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(b0.q(runnable));
        sb.append(", ");
        sb.append(this.r);
        sb.append(", ");
        return s0.m(sb, this.s ? "Blocking" : "Non-blocking", ']');
    }
}
