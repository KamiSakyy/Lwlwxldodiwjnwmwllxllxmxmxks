package x4;

import android.os.Process;

/* loaded from: /home/user/work/p/classes.dex */
public final class i extends Thread {

    /* renamed from: r, reason: collision with root package name */
    public final int f33781r;

    public i(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f33781r = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.f33781r);
        super.run();
    }
}
