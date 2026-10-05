package y11;

import java.util.concurrent.Executor;

/* loaded from: /home/user/work/p/classes4.dex */
public final /* synthetic */ class h implements Executor {
    public static final /* synthetic */ h s = new h(0);
    public static final /* synthetic */ h t = new h(1);
    public final /* synthetic */ int r;

    public /* synthetic */ h(int i) {
        this.r = i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.r) {
            case 0:
                runnable.run();
                break;
            default:
                runnable.run();
                break;
        }
    }
}
