package c41;

import a61.c1;
import a81.t;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes4.dex */
public final class n extends k {
    public final /* synthetic */ IBinder s;
    public final /* synthetic */ c1 t;

    public n(c1 c1Var, IBinder iBinder) {
        this.t = c1Var;
        this.s = iBinder;
    }

    @Override // c41.k
    public final void a() {
        h fVar;
        o oVar = (o) this.t.s;
        int i = g.g;
        IBinder iBinder = this.s;
        if (iBinder == null) {
            fVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
            fVar = queryLocalInterface instanceof h ? (h) queryLocalInterface : new f(iBinder);
        }
        oVar.m = fVar;
        t tVar = oVar.b;
        int i2 = 0;
        tVar.g("linkToDeath", new Object[0]);
        try {
            oVar.m.asBinder().linkToDeath(oVar.j, 0);
        } catch (RemoteException e) {
            tVar.d(e, "linkToDeath failed", new Object[0]);
        }
        oVar.g = false;
        ArrayList arrayList = oVar.d;
        int size = arrayList.size();
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((Runnable) obj).run();
        }
        oVar.d.clear();
    }
}
