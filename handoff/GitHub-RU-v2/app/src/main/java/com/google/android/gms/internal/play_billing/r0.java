package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r0 implements Runnable {
    public final u0 r;
    public final y11.l s;

    public r0(u0 u0Var, y11.l lVar) {
        this.r = u0Var;
        this.s = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Throwable c;
        u0 u0Var = this.r;
        boolean z = u0Var instanceof x0;
        y11.l lVar = this.s;
        if (z && (c = ((x0) u0Var).c()) != null) {
            lVar.m(c);
            return;
        }
        try {
            if (!u0Var.isDone()) {
                throw new IllegalStateException(y9.a.P("Future was expected to be done: %s", new Object[]{u0Var}));
            }
            boolean z2 = false;
            Future future = u0Var;
            while (true) {
                try {
                    obj = future.get();
                    break;
                } catch (InterruptedException unused) {
                    z2 = true;
                    future = future;
                } catch (Throwable th) {
                    if (z2) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (z2) {
                Thread.currentThread().interrupt();
            }
            Integer num = (Integer) obj;
            int intValue = num.intValue();
            x9.w wVar = (x9.w) lVar.d;
            if (intValue <= 0) {
                ((Runnable) lVar.c).run();
                return;
            }
            int i = lVar.a;
            int intValue2 = num.intValue();
            wVar.getClass();
            x9.h a = x9.z.a("Billing override value was set by a license tester.", intValue2);
            wVar.I(93, i, a);
            ((z4.a) lVar.b).accept(a);
        } catch (ExecutionException e) {
            lVar.m(e.getCause());
        } catch (Throwable th2) {
            lVar.m(th2);
        }
    }

    public final String toString() {
        a5.s sVar = new a5.s(r0.class.getSimpleName(), 10);
        k kVar = new k();
        ((k) sVar.s).b = kVar;
        sVar.s = kVar;
        kVar.a = this.s;
        return sVar.toString();
    }
}
