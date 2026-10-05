package b21;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.measurement.h4;
import java.util.Map;

/* loaded from: /home/user/work/p/classes4.dex */
public final class t extends o {
    public final h4 b;
    public final w21.g c;
    public final rb0.b d;

    public t(h4 h4Var, w21.g gVar, rb0.b bVar) {
        super(2);
        this.c = gVar;
        this.b = h4Var;
        this.d = bVar;
        if (h4Var.a) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // b21.o
    public final boolean a(j jVar) {
        return this.b.a;
    }

    @Override // b21.o
    public final z11.d[] b(j jVar) {
        return (z11.d[]) this.b.b;
    }

    @Override // b21.o
    public final void c(Status status) {
        this.d.getClass();
        this.c.b(status.t != null ? new ResolvableApiException(status) : new ApiException(status));
    }

    @Override // b21.o
    public final void d(Exception exc) {
        this.c.b(exc);
    }

    @Override // b21.o
    public final void e(j jVar) {
        w21.g gVar = this.c;
        try {
            this.b.b(jVar.g, gVar);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            c(o.g(e2));
        } catch (RuntimeException e3) {
            gVar.b(e3);
        }
    }

    @Override // b21.o
    public final void f(b1.m mVar, boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        Map map = (Map) mVar.t;
        w21.g gVar = this.c;
        map.put(gVar, valueOf);
        gVar.a.b(new b1.m(mVar, gVar, false, 10));
    }
}
