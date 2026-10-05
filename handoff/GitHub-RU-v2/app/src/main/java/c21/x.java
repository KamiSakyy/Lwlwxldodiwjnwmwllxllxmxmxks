package c21;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;

/* loaded from: /home/user/work/p/classes4.dex */
public final class x extends c41.d {
    public e g;
    public final int h;

    public x(e eVar, int i) {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
        this.g = eVar;
        this.h = i;
    }

    @Override // c41.d
    public final boolean L(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            int readInt = parcel.readInt();
            IBinder readStrongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) o21.g.a(parcel, Bundle.CREATOR);
            o21.g.c(parcel);
            u.h(this.g, "onPostInitComplete can be called only once per call to getRemoteService");
            e eVar = this.g;
            int i2 = this.h;
            eVar.getClass();
            z zVar = new z(eVar, readInt, readStrongBinder, bundle);
            w wVar = eVar.f;
            wVar.sendMessage(wVar.obtainMessage(1, i2, -1, zVar));
            this.g = null;
        } else if (i == 2) {
            parcel.readInt();
            o21.g.c(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i != 3) {
                return false;
            }
            int readInt2 = parcel.readInt();
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            b0 b0Var = (b0) o21.g.a(parcel, b0.CREATOR);
            o21.g.c(parcel);
            e eVar2 = this.g;
            u.h(eVar2, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            u.g(b0Var);
            eVar2.v = b0Var;
            Bundle bundle2 = b0Var.r;
            u.h(this.g, "onPostInitComplete can be called only once per call to getRemoteService");
            e eVar3 = this.g;
            int i3 = this.h;
            eVar3.getClass();
            z zVar2 = new z(eVar3, readInt2, readStrongBinder2, bundle2);
            w wVar2 = eVar3.f;
            wVar2.sendMessage(wVar2.obtainMessage(1, i3, -1, zVar2));
            this.g = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
