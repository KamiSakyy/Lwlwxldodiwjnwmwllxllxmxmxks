package r;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import k5.f;
import v41.tShadow;

/* loaded from: /home/user/work/p/classes.dex */
public final class b implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31057a;

    /* renamed from: b, reason: collision with root package name */
    public Number f31058b;

    public b() {
        this.f31057a = 0;
        this.f31058b = new AtomicInteger(0);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f31057a) {
            case f.J /* 0 */:
                Thread thread = new Thread(runnable);
                thread.setName("arch_disk_io_" + ((AtomicInteger) this.f31058b).getAndIncrement());
                return thread;
            default:
                Thread newThread = Executors.defaultThreadFactory().newThread(new tShadow(runnable));
                newThread.setName("awaitEvenIfOnMainThread task continuation executor" + ((AtomicLong) this.f31058b).getAndIncrement());
                return newThread;
        }
    }

    public b(AtomicLong atomicLong) {
        this.f31057a = 1;
        this.f31058b = atomicLong;
    }
}
