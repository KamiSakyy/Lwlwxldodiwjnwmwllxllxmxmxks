package b21;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class o {
    public final int a;

    public o(int i) {
        this.a = i;
    }

    public static Status g(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage(), null, null);
    }

    public abstract boolean a(j jVar);

    public abstract z11.d[] b(j jVar);

    public abstract void c(Status status);

    public abstract void d(Exception exc);

    public abstract void e(j jVar);

    public abstract void f(b1.m mVar, boolean z);
}
