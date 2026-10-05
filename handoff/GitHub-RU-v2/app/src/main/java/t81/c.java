package t81;

import java.util.ArrayList;
import java.util.TimeZone;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import k71.k;
import r81.g;
import sy.y;

/* loaded from: /home/user/work/p/classes5.dex */
public final class c {
    public final e a;
    public final String b;
    public boolean c;
    public a d;
    public final ArrayList e;
    public boolean f;

    public c(e eVar, String str) {
        k.g(str, "name");
        this.a = eVar;
        this.b = str;
        this.e = new ArrayList();
    }

    public static void b(c cVar, String str, long j, j71.a aVar, int i) {
        if ((i & 2) != 0) {
            j = 0;
        }
        boolean z = (i & 4) != 0;
        cVar.getClass();
        k.g(str, "name");
        k.g(aVar, "block");
        cVar.c(new b(aVar, str, z), j);
    }

    public final boolean a() {
        a aVar = this.d;
        if (aVar != null && aVar.b) {
            this.f = true;
        }
        ArrayList arrayList = this.e;
        boolean z = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((a) arrayList.get(size)).b) {
                Logger logger = this.a.b;
                a aVar2 = (a) arrayList.get(size);
                if (logger.isLoggable(Level.FINE)) {
                    y.a(logger, aVar2, this, "canceled");
                }
                arrayList.remove(size);
                z = true;
            }
        }
        return z;
    }

    public final void c(a aVar, long j) {
        k.g(aVar, "task");
        synchronized (this.a) {
            if (!this.c) {
                if (d(aVar, j, false)) {
                    this.a.c(this);
                }
            } else if (aVar.b) {
                Logger logger = this.a.b;
                if (logger.isLoggable(Level.FINE)) {
                    y.a(logger, aVar, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                Logger logger2 = this.a.b;
                if (logger2.isLoggable(Level.FINE)) {
                    y.a(logger2, aVar, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean d(a aVar, long j, boolean z) {
        Logger logger = this.a.b;
        k.g(aVar, "task");
        c cVar = aVar.c;
        if (cVar != this) {
            if (cVar != null) {
                throw new IllegalStateException("task is in multiple queues");
            }
            aVar.c = this;
        }
        long nanoTime = System.nanoTime();
        long j2 = nanoTime + j;
        ArrayList arrayList = this.e;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf != -1) {
            if (aVar.d <= j2) {
                if (logger.isLoggable(Level.FINE)) {
                    y.a(logger, aVar, this, "already scheduled");
                    return false;
                }
            }
            arrayList.remove(indexOf);
        }
        aVar.d = j2;
        if (logger.isLoggable(Level.FINE)) {
            y.a(logger, aVar, this, z ? "run again after ".concat(y.e(j2 - nanoTime)) : "scheduled after ".concat(y.e(j2 - nanoTime)));
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i = -1;
                break;
            }
            Object obj = arrayList.get(i2);
            i2++;
            if (((a) obj).d - nanoTime > j) {
                break;
            }
            i++;
        }
        if (i == -1) {
            i = arrayList.size();
        }
        arrayList.add(i, aVar);
        return i == 0;
    }

    public final void e() {
        e eVar = this.a;
        TimeZone timeZone = g.a;
        synchronized (eVar) {
            this.c = true;
            if (a()) {
                this.a.c(this);
            }
        }
    }

    public final String toString() {
        return this.b;
    }
}
