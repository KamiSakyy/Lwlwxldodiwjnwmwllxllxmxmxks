package d;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class u {

    /* renamed from: b, reason: collision with root package name */
    public boolean f20926b;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f20925a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f20927c = new CopyOnWriteArrayList();

    public u(boolean z10) {
        this.f20926b = z10;
    }

    public void a() {
    }

    public abstract void b();

    public void c(a aVar) {
    }

    public void d(a aVar) {
    }

    public final void e() {
        boolean isTerminated;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f20927c;
        Iterator it = copyOnWriteArrayList.iterator();
        k71.k.f(it, "iterator(...)");
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                copyOnWriteArrayList.clear();
                ArrayList arrayList = this.f20925a;
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((t) obj).e();
                }
                arrayList.clear();
                return;
            }
            AutoCloseable autoCloseable = (AutoCloseable) it.next();
            if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
            } else if (autoCloseable instanceof ExecutorService) {
                ExecutorService executorService = (ExecutorService) autoCloseable;
                if (executorService != ForkJoinPool.commonPool() && !(isTerminated = executorService.isTerminated())) {
                    executorService.shutdown();
                    while (!isTerminated) {
                        try {
                            isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                        } catch (InterruptedException unused) {
                            if (i == 0) {
                                executorService.shutdownNow();
                                i = 1;
                            }
                        }
                    }
                    if (i != 0) {
                        Thread.currentThread().interrupt();
                    }
                }
            } else if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
            } else if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
            } else {
                if (!(autoCloseable instanceof MediaDrm)) {
                    throw new IllegalArgumentException();
                }
                ((MediaDrm) autoCloseable).release();
            }
        }
    }

    public final void f(boolean z10) {
        this.f20926b = z10;
        ArrayList arrayList = this.f20925a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            t tVar = (t) obj;
            tVar.f(tVar.f20924e && z10);
        }
    }

    public static  getValue(Object... a) {
        return null;
    }
}
