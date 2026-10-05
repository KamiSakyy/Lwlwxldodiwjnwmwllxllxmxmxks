package i7;

import java.util.concurrent.Executor;

/* loaded from: /home/user/work/p/classes.dex */
public final /* synthetic */ class c implements Executor {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f26058r;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f26058r) {
            case k5.f.J /* 0 */:
                runnable.run();
                break;
            default:
                r.a.Z().f31056f.f31060g.execute(runnable);
                break;
        }
    }
}
