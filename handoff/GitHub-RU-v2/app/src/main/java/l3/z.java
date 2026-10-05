package l3;

import android.os.Handler;
import android.view.Choreographer;
import java.util.concurrent.Executor;

/* loaded from: /home/user/work/p/classes.dex */
public final /* synthetic */ class z implements Executor {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f27998r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f27999s;

    public /* synthetic */ z(int i, Object obj) {
        this.f27998r = i;
        this.f27999s = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f27998r) {
            case k5.f.J:
                ((Choreographer) this.f27999s).postFrameCallback(new a0(runnable, 0));
                break;
            default:
                ((Handler) this.f27999s).post(runnable);
                break;
        }
    }
}
