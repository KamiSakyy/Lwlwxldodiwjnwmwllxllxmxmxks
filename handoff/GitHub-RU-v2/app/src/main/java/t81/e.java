package t81;

import java.util.ArrayList;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;
import k71.k;
import r81.f;
import r81.g;

/* loaded from: /home/user/work/p/classes5.dex */
public final class e {
    public static final Logger k;
    public static final e l;
    public final s21.a a;
    public final Logger b;
    public int c;
    public boolean d;
    public long e;
    public int f;
    public int g;
    public final ArrayList h;
    public final ArrayList i;
    public final d j;

    /* JADX WARN: Type inference failed for: r3v3, types: [r81.f] */
    static {
        Logger logger = Logger.getLogger(e.class.getName());
        k.f(logger, "getLogger(...)");
        k = logger;
        final String str = g.b + " TaskRunner";
        k.g(str, "name");
        final boolean z = true;
        l = new e(new s21.a((f) new ThreadFactory() { // from class: r81.f
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable, str);
                thread.setDaemon(z);
                return thread;
            }
        }));
    }

    public e(s21.a aVar) {
        Logger logger = k;
        k.g(logger, "logger");
        this.a = aVar;
        this.b = logger;
        this.c = 10000;
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.j = new d(0, this);
    }

    public static final void a(e eVar, a aVar, long j, boolean z) {
        TimeZone timeZone = g.a;
        c cVar = aVar.c;
        k.d(cVar);
        if (cVar.d != aVar) {
            throw new IllegalStateException("Check failed.");
        }
        boolean z2 = cVar.f;
        cVar.f = false;
        cVar.d = null;
        eVar.h.remove(cVar);
        if (j != -1 && !z2 && !cVar.c) {
            cVar.d(aVar, j, true);
        }
        if (cVar.e.isEmpty()) {
            return;
        }
        eVar.i.add(cVar);
        if (z) {
            return;
        }
        eVar.e();
    }

    public final a b() {
        long j;
        a aVar;
        boolean z;
        TimeZone timeZone = g.a;
        while (true) {
            ArrayList arrayList = this.i;
            if (arrayList.isEmpty()) {
                return null;
            }
            long nanoTime = System.nanoTime();
            int size = arrayList.size();
            long j2 = Long.MAX_VALUE;
            int i = 0;
            a aVar2 = null;
            while (true) {
                if (i >= size) {
                    j = nanoTime;
                    aVar = null;
                    z = false;
                    break;
                }
                Object obj = arrayList.get(i);
                i++;
                a aVar3 = (a) ((c) obj).e.get(0);
                j = nanoTime;
                aVar = null;
                long max = Math.max(0L, aVar3.d - j);
                if (max > 0) {
                    j2 = Math.min(max, j2);
                } else {
                    if (aVar2 != null) {
                        z = true;
                        break;
                    }
                    aVar2 = aVar3;
                }
                nanoTime = j;
            }
            ArrayList arrayList2 = this.h;
            if (aVar2 != null) {
                TimeZone timeZone2 = g.a;
                aVar2.d = -1L;
                c cVar = aVar2.c;
                k.d(cVar);
                cVar.e.remove(aVar2);
                arrayList.remove(cVar);
                cVar.d = aVar2;
                arrayList2.add(cVar);
                if (z || (!this.d && !arrayList.isEmpty())) {
                    e();
                }
                return aVar2;
            }
            if (this.d) {
                if (j2 >= this.e - j) {
                    return aVar;
                }
                notify();
                return aVar;
            }
            this.d = true;
            this.e = j + j2;
            try {
                try {
                    TimeZone timeZone3 = g.a;
                    if (j2 > 0) {
                        long j3 = j2 / 1000000;
                        long j4 = j2 - (1000000 * j3);
                        if (j3 > 0 || j2 > 0) {
                            wait(j3, (int) j4);
                        }
                    }
                } catch (InterruptedException unused) {
                    TimeZone timeZone4 = g.a;
                    for (int size2 = arrayList2.size() - 1; -1 < size2; size2--) {
                        ((c) arrayList2.get(size2)).a();
                    }
                    for (int size3 = arrayList.size() - 1; -1 < size3; size3--) {
                        c cVar2 = (c) arrayList.get(size3);
                        cVar2.a();
                        if (cVar2.e.isEmpty()) {
                            arrayList.remove(size3);
                        }
                    }
                }
            } finally {
                this.d = false;
            }
        }
    }

    public final void c(c cVar) {
        k.g(cVar, "taskQueue");
        TimeZone timeZone = g.a;
        if (cVar.d == null) {
            boolean isEmpty = cVar.e.isEmpty();
            ArrayList arrayList = this.i;
            if (isEmpty) {
                arrayList.remove(cVar);
            } else {
                byte[] bArr = r81.e.a;
                k.g(arrayList, "<this>");
                if (!arrayList.contains(cVar)) {
                    arrayList.add(cVar);
                }
            }
        }
        if (this.d) {
            notify();
        } else {
            e();
        }
    }

    public final c d() {
        int i;
        synchronized (this) {
            i = this.c;
            this.c = i + 1;
        }
        return new c(this, no.a.k("Q", i));
    }

    public final void e() {
        TimeZone timeZone = g.a;
        int i = this.f;
        if (i > this.g) {
            return;
        }
        this.f = i + 1;
        d dVar = this.j;
        k.g(dVar, "runnable");
        ((ThreadPoolExecutor) this.a.s).execute(dVar);
    }
}
