package m7;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.room.MultiInstanceInvalidationService;

/* loaded from: /home/user/work/p/classes.dex */
public final class h extends Binder implements e {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f28987f;

    public h(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f28987f = multiInstanceInvalidationService;
        attachInterface(this, e.f28965e);
    }

    @Override // m7.e
    public final void I(int i, String[] strArr) {
        k71.k.g(strArr, "tables");
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.f28987f;
        synchronized (multiInstanceInvalidationService.f3096t) {
            try {
                String str = (String) multiInstanceInvalidationService.f3095s.get(Integer.valueOf(i));
                if (str == null) {
                    return;
                }
                int beginBroadcast = multiInstanceInvalidationService.f3096t.beginBroadcast();
                for (int i10 = 0; i10 < beginBroadcast; i10++) {
                    try {
                        Object broadcastCookie = multiInstanceInvalidationService.f3096t.getBroadcastCookie(i10);
                        k71.k.e(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                        Integer num = (Integer) broadcastCookie;
                        int intValue = num.intValue();
                        String str2 = (String) multiInstanceInvalidationService.f3095s.get(num);
                        if (i != intValue && str.equals(str2)) {
                            try {
                                ((d) multiInstanceInvalidationService.f3096t.getBroadcastItem(i10)).k(strArr);
                            } catch (RemoteException unused) {
                            }
                        }
                    } finally {
                        multiInstanceInvalidationService.f3096t.finishBroadcast();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i10) {
        String str = e.f28965e;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        d dVar = null;
        d dVar2 = null;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return super.onTransact(i, parcel, parcel2, i10);
                }
                I(parcel.readInt(), parcel.createStringArray());
                return true;
            }
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(d.f28964d);
                if (queryLocalInterface == null || !(queryLocalInterface instanceof d)) {
                    c cVar = new c();
                    cVar.f28960f = readStrongBinder;
                    dVar2 = cVar;
                } else {
                    dVar2 = (d) queryLocalInterface;
                }
            }
            int readInt = parcel.readInt();
            k71.k.g(dVar2, "callback");
            MultiInstanceInvalidationService multiInstanceInvalidationService = this.f28987f;
            synchronized (multiInstanceInvalidationService.f3096t) {
                multiInstanceInvalidationService.f3096t.unregister(dVar2);
            }
            parcel2.writeNoException();
            return true;
        }
        IBinder readStrongBinder2 = parcel.readStrongBinder();
        if (readStrongBinder2 != null) {
            IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface(d.f28964d);
            if (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof d)) {
                c cVar2 = new c();
                cVar2.f28960f = readStrongBinder2;
                dVar = cVar2;
            } else {
                dVar = (d) queryLocalInterface2;
            }
        }
        String readString = parcel.readString();
        k71.k.g(dVar, "callback");
        int i11 = 0;
        if (readString != null) {
            MultiInstanceInvalidationService multiInstanceInvalidationService2 = this.f28987f;
            synchronized (multiInstanceInvalidationService2.f3096t) {
                try {
                    int i12 = multiInstanceInvalidationService2.f3094r + 1;
                    multiInstanceInvalidationService2.f3094r = i12;
                    if (multiInstanceInvalidationService2.f3096t.register(dVar, Integer.valueOf(i12))) {
                        multiInstanceInvalidationService2.f3095s.put(Integer.valueOf(i12), readString);
                        i11 = i12;
                    } else {
                        multiInstanceInvalidationService2.f3094r--;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        parcel2.writeNoException();
        parcel2.writeInt(i11);
        return true;
    }
}
