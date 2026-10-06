package k;

import java.util.concurrent.Executor;

/* loaded from: /home/user/work/p/classes.dex */
public final class m implements Executor {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ m f27509s = new m(1);

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f27510r;

    public /* synthetic */ m(int i) {
        this.f27510r = i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f27510r) {
            case k5.f.J /* 0 */:
                new Thread(runnable).start();
                break;
            case 1:
                runnable.run();
                break;
            default:
                runnable.run();
                break;
        }
    }
    public Object s = null;
    public Object t = null;
    public m(int p1) {
    }
}
