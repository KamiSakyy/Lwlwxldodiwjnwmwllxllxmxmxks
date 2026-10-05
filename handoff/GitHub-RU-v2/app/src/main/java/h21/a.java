package h21;

import java.io.Serializable;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import x9.c;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a implements ThreadFactory {
    public final /* synthetic */ int a;
    public final ThreadFactory b;
    public final Serializable c;

    public a(String str) {
        this.a = 0;
        this.b = Executors.defaultThreadFactory();
        this.c = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.a) {
            case 0:
                Thread newThread = this.b.newThread(new b(runnable, 0));
                newThread.setName((String) this.c);
                return newThread;
            default:
                AtomicInteger atomicInteger = (AtomicInteger) this.c;
                Thread newThread2 = this.b.newThread(runnable);
                newThread2.setName("PlayBillingLibrary-" + atomicInteger.getAndIncrement());
                return newThread2;
        }
    }

    public a(c cVar) {
        this.a = 1;
        this.b = Executors.defaultThreadFactory();
        this.c = new AtomicInteger(1);
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class c<T1,T2,T3,T4> {
        public c() {
        }
    }
}
