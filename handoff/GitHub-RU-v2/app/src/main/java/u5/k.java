package u5;

import java.util.concurrent.ThreadPoolExecutor;
import sy.d0;

/* loaded from: /home/user/work/p/classes.dex */
public final class k extends d0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d0 f32220a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f32221b;

    public k(d0 d0Var, ThreadPoolExecutor threadPoolExecutor) {
        this.f32220a = d0Var;
        this.f32221b = threadPoolExecutor;
    }

    public final void r(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f32221b;
        try {
            this.f32220a.r(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    public final void s(w51.r rVar) {
        ThreadPoolExecutor threadPoolExecutor = this.f32221b;
        try {
            this.f32220a.s(rVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
