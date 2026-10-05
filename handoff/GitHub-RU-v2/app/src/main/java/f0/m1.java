package f0;

import androidx.compose.foundation.MutationInterruptedException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /home/user/work/p/classes.dex */
public final class m1 {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f22335a = new AtomicReference(null);

    /* renamed from: b, reason: collision with root package name */
    public final e81.c f22336b = e81.d.a();

    public static final void a(m1 m1Var, k1 k1Var) {
        AtomicReference atomicReference = m1Var.f22335a;
        while (true) {
            k1 k1Var2 = (k1) atomicReference.get();
            if (k1Var2 != null && k1Var.f22326a.compareTo(k1Var2.f22326a) < 0) {
                throw new CancellationException("Current mutation had a higher priority");
            }
            while (!atomicReference.compareAndSet(k1Var2, k1Var)) {
                if (atomicReference.get() != k1Var2) {
                    break;
                }
            }
            if (k1Var2 != null) {
                k1Var2.f22327b.m(new MutationInterruptedException());
                return;
            }
            return;
        }
    }
}
