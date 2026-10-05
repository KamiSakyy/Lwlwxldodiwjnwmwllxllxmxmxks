package t81;

import android.view.MotionEvent;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import k71.k;
import sy.y;
import w2.t;
import w21.g;
import w21.l;
import x9.h;
import x9.u;
import x9.z;

/* loaded from: /home/user/work/p/classes5.dex */
public final class d implements Runnable {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;

    public /* synthetic */ d(int i, Object obj) {
        this.r = i;
        this.s = obj;
    }

    private final void a() {
        synchronized (((l) this.s).t) {
            ((w21.b) ((l) this.s).u).a();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        a b;
        long j;
        switch (this.r) {
            case 0:
                e eVar = (e) this.s;
                synchronized (eVar) {
                    eVar.g++;
                    b = eVar.b();
                }
                if (b == null) {
                    return;
                }
                Thread currentThread = Thread.currentThread();
                String name = currentThread.getName();
                do {
                    a aVar = b;
                    try {
                        currentThread.setName(aVar.a);
                        Logger logger = ((e) this.s).b;
                        c cVar = aVar.c;
                        k.d(cVar);
                        boolean isLoggable = logger.isLoggable(Level.FINE);
                        if (isLoggable) {
                            j = System.nanoTime();
                            y.a(logger, aVar, cVar, "starting");
                        } else {
                            j = -1;
                        }
                        try {
                            long a = aVar.a();
                            if (isLoggable) {
                                y.a(logger, aVar, cVar, "finished run in " + y.e(System.nanoTime() - j));
                            }
                            e eVar2 = (e) this.s;
                            synchronized (eVar2) {
                                e.a(eVar2, aVar, a, true);
                                b = eVar2.b();
                            }
                        } catch (Throwable th) {
                            if (isLoggable) {
                                y.a(logger, aVar, cVar, "failed a run in " + y.e(System.nanoTime() - j));
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        try {
                            e eVar3 = (e) this.s;
                            synchronized (eVar3) {
                                e.a(eVar3, aVar, -1L, false);
                                if (!(th2 instanceof InterruptedException)) {
                                    throw th2;
                                }
                                Thread.currentThread().interrupt();
                            }
                        } catch (Throwable th3) {
                            currentThread.setName(name);
                            throw th3;
                        }
                    }
                } while (b != null);
                currentThread.setName(name);
                return;
            case 1:
                v21.a aVar2 = (v21.a) this.s;
                synchronized (aVar2.a) {
                    try {
                        if (aVar2.b()) {
                            String.valueOf(aVar2.j).concat(" ** IS FORCE-RELEASED ON TIMEOUT **");
                            aVar2.d();
                            if (aVar2.b()) {
                                aVar2.c = 1;
                                aVar2.e();
                                return;
                            }
                            return;
                        }
                        return;
                    } finally {
                    }
                }
            case 2:
                t tVar = (t) this.s;
                tVar.removeCallbacks(this);
                MotionEvent motionEvent = tVar.L0;
                if (motionEvent != null) {
                    boolean z = motionEvent.getToolType(0) == 3;
                    int actionMasked = motionEvent.getActionMasked();
                    if (z) {
                        if (actionMasked == 10 || actionMasked == 1) {
                            return;
                        }
                    } else if (actionMasked == 1) {
                        return;
                    }
                    int i = 7;
                    if (actionMasked != 7 && actionMasked != 9) {
                        i = 2;
                    }
                    t tVar2 = (t) this.s;
                    tVar2.O(motionEvent, i, tVar2.M0, false);
                    return;
                }
                return;
            case 3:
                a();
                return;
            case 4:
                try {
                    ((x9.c) ((v2.t) this.s).t).A.b();
                    return;
                } catch (Throwable unused) {
                    com.google.android.gms.internal.play_billing.t.h("BillingClient");
                    return;
                }
            case 5:
                u uVar = (u) this.s;
                x9.c cVar2 = uVar.v;
                cVar2.t(0);
                h hVar = z.k;
                cVar2.s(24, uVar.u, hVar);
                uVar.c(hVar);
                return;
            case 6:
                ((g) this.s).b(new IOException("TIMEOUT"));
                return;
            default:
                CheckableImageButton checkableImageButton = ((TextInputLayout) this.s).t.x;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                return;
        }
    }
}
