package y11;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.play_billing.t;
import d2.a0;
import java.util.Arrays;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeoutException;
import sy.n;
import w21.o;
import x9.w;
import x9.z;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l {
    public static l e;
    public int a;
    public final Object b;
    public Object c;
    public Object d;

    public l(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.d = new j(this);
        this.a = 1;
        this.c = scheduledExecutorService;
        this.b = context.getApplicationContext();
    }

    public static synchronized l n(Context context) {
        l lVar;
        synchronized (l.class) {
            try {
                if (e == null) {
                    e = new l(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new h21.a("MessengerIpcClient"))));
                }
                lVar = e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return lVar;
    }

    public int a() {
        Paint.Cap strokeCap = ((Paint) this.b).getStrokeCap();
        int i = strokeCap == null ? -1 : d2.h.a[strokeCap.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 2;
        }
        return 1;
    }

    public int b() {
        Paint.Join strokeJoin = ((Paint) this.b).getStrokeJoin();
        int i = strokeJoin == null ? -1 : d2.h.b[strokeJoin.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 2;
    }

    public void c(float f) {
        ((Paint) this.b).setAlpha((int) Math.rint(f * 255.0f));
    }

    public void d(int i) {
        if (this.a == i) {
            return;
        }
        this.a = i;
        Paint paint = (Paint) this.b;
        if (Build.VERSION.SDK_INT >= 29) {
            d2.b.c(paint, i);
        } else {
            paint.setXfermode(new PorterDuffXfermode(d2.b.e(i)));
        }
    }

    public void e(long j) {
        ((Paint) this.b).setColor(a0.y(j));
    }

    public void f(d2.l lVar) {
        this.d = lVar;
        ((Paint) this.b).setColorFilter(lVar != null ? lVar.a : null);
    }

    public void g(int i) {
        ((Paint) this.b).setFilterBitmap(!(i == 0));
    }

    public void h(Shader shader) {
        this.c = shader;
        ((Paint) this.b).setShader(shader);
    }

    public void i(int i) {
        ((Paint) this.b).setStrokeCap(i == 2 ? Paint.Cap.SQUARE : i == 1 ? Paint.Cap.ROUND : i == 0 ? Paint.Cap.BUTT : Paint.Cap.BUTT);
    }

    public void j(int i) {
        ((Paint) this.b).setStrokeJoin(i == 0 ? Paint.Join.MITER : i == 2 ? Paint.Join.BEVEL : i == 1 ? Paint.Join.ROUND : Paint.Join.MITER);
    }

    public void k(float f) {
        ((Paint) this.b).setStrokeWidth(f);
    }

    public void l(int i) {
        ((Paint) this.b).setStyle(i == 1 ? Paint.Style.STROKE : Paint.Style.FILL);
    }

    public void m(Throwable th) {
        w wVar = (w) this.d;
        if (th instanceof TimeoutException) {
            wVar.I(102, 28, z.r);
            t.h("BillingClientTesting");
        } else {
            wVar.I(95, 28, z.r);
            t.h("BillingClientTesting");
        }
        ((Runnable) this.c).run();
    }

    public synchronized o o(k kVar) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                "Queueing ".concat(kVar.toString());
            }
            if (!((j) this.d).d(kVar)) {
                j jVar = new j(this);
                this.d = jVar;
                jVar.d(kVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return kVar.b.a;
    }

    public l(w wVar, int i, z4.a aVar, Runnable runnable) {
        this.a = i;
        this.b = aVar;
        this.c = runnable;
        this.d = wVar;
    }

    public l(x6.k kVar, int i) {
        this.b = kVar.w;
        this.a = i;
        a7.c cVar = kVar.y;
        this.c = cVar.a();
        Bundle d = n.d((w61.k[]) Arrays.copyOf(new w61.k[0], 0));
        this.d = d;
        cVar.h.D(d);
    }

    public l(Paint paint) {
        this.b = paint;
        this.a = 3;
    }

    public l(Bundle bundle) {
        k71.k.g(bundle, "state");
        this.b = b4.P("nav-entry-state:id", bundle);
        this.a = b4.L("nav-entry-state:destination-id", bundle);
        this.c = b4.N("nav-entry-state:args", bundle);
        this.d = b4.N("nav-entry-state:saved-state", bundle);
    }

    public l(int i, a71.h hVar, x71.a aVar, y71.i iVar) {
        this.b = iVar;
        this.a = i;
        this.c = aVar;
        this.d = hVar;
    }

    public Object a = null;
}
