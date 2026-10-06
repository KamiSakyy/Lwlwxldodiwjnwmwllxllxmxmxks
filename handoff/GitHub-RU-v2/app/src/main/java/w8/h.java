package w8;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import kotlin.KotlinNullPointerException;

/* loaded from: /home/user/work/p/classes.dex */
public final class h implements Runnable {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f33399r;

    /* renamed from: s, reason: collision with root package name */
    public final com.google.common.util.concurrent.c f33400s;

    /* renamed from: t, reason: collision with root package name */
    public final v71.l f33401t;

    public /* synthetic */ h(com.google.common.util.concurrent.c cVar, v71.l lVar, int i) {
        this.f33399r = i;
        this.f33400s = cVar;
        this.f33401t = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f33399r) {
            case k5.f.J:
                Future future = this.f33400s;
                boolean isCancelled = future.isCancelled();
                v71.l lVar = this.f33401t;
                if (isCancelled) {
                    lVar.x((Throwable) null);
                    return;
                }
                boolean z10 = false;
                while (true) {
                    try {
                        try {
                            Object obj = future.get();
                            if (z10) {
                                Thread.currentThread().interrupt();
                            }
                            lVar.i(obj);
                            return;
                        } catch (ExecutionException e5) {
                            Throwable cause = e5.getCause();
                            k71.k.d(cause);
                            lVar.i(sy.y.d(cause));
                            return;
                        }
                    } catch (InterruptedException unused) {
                        z10 = true;
                    } catch (Throwable th) {
                        if (z10) {
                            Thread.currentThread().interrupt();
                        }
                        throw th;
                    }
                }
            default:
                com.google.common.util.concurrent.c cVar = this.f33400s;
                boolean isCancelled2 = cVar.isCancelled();
                v71.l lVar2 = this.f33401t;
                if (isCancelled2) {
                    lVar2.x((Throwable) null);
                    return;
                }
                try {
                    lVar2.i(x3.g.h(cVar));
                    return;
                } catch (ExecutionException e10) {
                    Throwable cause2 = e10.getCause();
                    if (cause2 != null) {
                        lVar2.i(sy.y.d(cause2));
                        return;
                    } else {
                        KotlinNullPointerException kotlinNullPointerException = new KotlinNullPointerException();
                        k71.k.l(kotlinNullPointerException, k71.k.class.getName());
                        throw kotlinNullPointerException;
                    }
                }
        }
    }
}
