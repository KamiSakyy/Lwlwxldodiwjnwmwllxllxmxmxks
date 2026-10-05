package f81;

import java.util.concurrent.Executor;

/* loaded from: /home/user/work/p/classes5.dex */
public final class a implements Executor {
    public static final a r = new a();

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
