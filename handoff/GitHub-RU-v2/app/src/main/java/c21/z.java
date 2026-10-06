package c21;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* loaded from: /home/user/work/p/classes4.dex */
public final class z extends p {
    public final IBinder g;
    public final /* synthetic */ e h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(e eVar, int i, IBinder iBinder, Bundle bundle) {
        super(eVar, i, bundle);
        this.h = eVar;
        this.g = iBinder;
    }

    @Override // c21.p
    public final boolean a() {
        String interfaceDescriptor;
        e eVar;
        IBinder iBinder = this.g;
        try {
            u.g(iBinder);
            interfaceDescriptor = iBinder.getInterfaceDescriptor();
            eVar = this.h;
        } catch (RemoteException unused) {
        }
        if (!eVar.v().equals(interfaceDescriptor)) {
            new StringBuilder(eVar.v().length() + 34 + String.valueOf(interfaceDescriptor).length());
            return false;
        }
        IInterface p = eVar.p(iBinder);
        if (p != null && (eVar.y(2, 4, p) || eVar.y(3, 4, p))) {
            eVar.t = null;
            b bVar = eVar.o;
            if (bVar == null) {
                return true;
            }
            bVar.f();
            return true;
        }
        return false;
    }

    @Override // c21.p
    public final void b(z11.b bVar) {
        c cVar = this.h.p;
        if (cVar != null) {
            cVar.g(bVar);
        }
        System.currentTimeMillis();
    }
}
