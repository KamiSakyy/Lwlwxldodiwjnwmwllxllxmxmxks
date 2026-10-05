package b21;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;

/* loaded from: /home/user/work/p/classes4.dex */
public final class u extends o {
    public final w21.g b;

    public u(w21.g gVar) {
        super(4);
        this.b = gVar;
    }

    @Override // b21.o
    public final boolean a(j jVar) {
        if (jVar.k.get(null) == null) {
            return false;
        }
        throw new ClassCastException();
    }

    @Override // b21.o
    public final z11.d[] b(j jVar) {
        if (jVar.k.get(null) == null) {
            return null;
        }
        throw new ClassCastException();
    }

    @Override // b21.o
    public final void c(Status status) {
        this.b.b(new ApiException(status));
    }

    @Override // b21.o
    public final void d(Exception exc) {
        this.b.b(exc);
    }

    @Override // b21.o
    public final void e(j jVar) {
        try {
            h(jVar);
        } catch (DeadObjectException e) {
            c(o.g(e));
            throw e;
        } catch (RemoteException e2) {
            c(o.g(e2));
        } catch (RuntimeException e3) {
            this.b.b(e3);
        }
    }

    @Override // b21.o
    public final /* bridge */ /* synthetic */ void f(b1.m mVar, boolean z) {
    }

    public final void h(j jVar) {
        if (jVar.k.remove(null) != null) {
            throw new ClassCastException();
        }
        this.b.c(Boolean.FALSE);
    }
}
