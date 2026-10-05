package c41;

import android.os.IBinder;
import android.os.RemoteException;
import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes4.dex */
public final /* synthetic */ class l implements IBinder.DeathRecipient {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        switch (this.a) {
            case 0:
                o oVar = (o) this.b;
                int i = 0;
                oVar.b.g("reportBinderDeath", new Object[0]);
                if (oVar.i.get() != null) {
                    throw new ClassCastException();
                }
                oVar.b.g("%s : Binder has died.", new Object[]{oVar.c});
                ArrayList arrayList = oVar.d;
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    RemoteException remoteException = new RemoteException(String.valueOf(oVar.c).concat(" : Binder has died."));
                    w21.g gVar = ((k) obj).r;
                    if (gVar != null) {
                        gVar.b(remoteException);
                    }
                }
                oVar.d.clear();
                synchronized (oVar.f) {
                    oVar.d();
                }
                return;
            default:
                h41.h hVar = (h41.h) this.b;
                int i2 = 0;
                hVar.b.f("reportBinderDeath", new Object[0]);
                if (hVar.i.get() != null) {
                    throw new ClassCastException();
                }
                hVar.b.f("%s : Binder has died.", new Object[]{hVar.c});
                ArrayList arrayList2 = hVar.d;
                int size2 = arrayList2.size();
                while (i2 < size2) {
                    Object obj2 = arrayList2.get(i2);
                    i2++;
                    RemoteException remoteException2 = new RemoteException(String.valueOf(hVar.c).concat(" : Binder has died."));
                    w21.g gVar2 = ((h41.e) obj2).r;
                    if (gVar2 != null) {
                        gVar2.b(remoteException2);
                    }
                }
                hVar.d.clear();
                synchronized (hVar.f) {
                    hVar.c();
                }
                return;
        }
    }
}
