package g91;

import com.github.rudroid.copilot.h1;
import com.google.android.gms.measurement.internal.t0;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import k71.k;
import u81.n;

/* loaded from: /home/user/work/p/classes5.dex */
public final class e extends t81.a {
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(t0 t0Var, String str) {
        super(str, true);
        this.f = t0Var;
    }

    @Override // t81.a
    public final long a() {
        n nVar;
        switch (this.e) {
            case 0:
                f fVar = (f) this.f;
                try {
                } catch (IOException e) {
                    f.c(fVar, e, null, 2);
                }
                return fVar.h() ? 0L : -1L;
            default:
                t0 t0Var = (t0) this.f;
                long nanoTime = System.nanoTime();
                long j = (nanoTime - t0Var.b) + 1;
                Iterator it = ((ConcurrentLinkedQueue) t0Var.e).iterator();
                k.f(it, "iterator(...)");
                long j2 = Long.MAX_VALUE;
                int i = 0;
                int i2 = 0;
                n nVar2 = null;
                n nVar3 = null;
                while (it.hasNext()) {
                    n nVar4 = (n) it.next();
                    k.d(nVar4);
                    synchronized (nVar4) {
                        if (t0Var.a(nVar4, nanoTime) > 0) {
                            i2++;
                        } else {
                            long j3 = j2;
                            long j4 = nVar4.r;
                            if (j4 < j) {
                                j = j4;
                                nVar2 = nVar4;
                            }
                            i++;
                            if (j4 < j3) {
                                j2 = j4;
                                nVar3 = nVar4;
                            } else {
                                j2 = j3;
                            }
                        }
                    }
                }
                long j5 = j2;
                if (nVar2 != null) {
                    nVar = nVar2;
                } else if (i > 5) {
                    nVar = nVar3;
                    j = j5;
                } else {
                    j = -1;
                    nVar = null;
                }
                if (nVar == null) {
                    if (nVar3 != null) {
                        return (j5 + t0Var.b) - nanoTime;
                    }
                    if (i2 > 0) {
                        return t0Var.b;
                    }
                    return -1L;
                }
                synchronized (nVar) {
                    if (nVar.q.isEmpty() && nVar.r == j) {
                        nVar.k = true;
                        ((ConcurrentLinkedQueue) t0Var.e).remove(nVar);
                        r81.g.c(nVar.e);
                        if (!((ConcurrentLinkedQueue) t0Var.e).isEmpty()) {
                            return 0L;
                        }
                        t81.c cVar = (t81.c) t0Var.c;
                        synchronized (cVar.a) {
                            if (cVar.a()) {
                                cVar.a.c(cVar);
                            }
                        }
                        return 0L;
                    }
                    return 0L;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar) {
        super(h1.p(new StringBuilder(), fVar.m, " writer"), true);
        this.f = fVar;
    }
    public Object g(Object p1, Object p2) { return null; }
}
