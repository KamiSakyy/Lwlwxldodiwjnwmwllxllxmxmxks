package c41;

import android.app.PendingIntent;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import x9.v;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class d extends Binder implements IInterface {
    public final /* synthetic */ int f;

    public boolean L(int i, Parcel parcel, Parcel parcel2) {
        return false;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        int i = this.f;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
    
        if (super.onTransact(r7, r8, r9, r10) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ea, code lost:
    
        if (super.onTransact(r7, r8, r9, r10) != false) goto L57;
     */
    @Override // android.os.Binder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean z;
        int i3 = 0;
        switch (this.f) {
            case 0:
                if (i > 16777215) {
                    break;
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                }
                b41.h hVar = (b41.h) this;
                if (i == 2) {
                    Parcelable.Creator creator = Bundle.CREATOR;
                    int i4 = e.a;
                    Bundle bundle = (Bundle) (parcel.readInt() != 0 ? (Parcelable) creator.createFromParcel(parcel) : null);
                    int dataAvail = parcel.dataAvail();
                    if (dataAvail > 0) {
                        throw new BadParcelableException(no.a.k("Parcel data not fully consumed, unread size: ", dataAvail));
                    }
                    hVar.u(bundle);
                } else {
                    if (i != 3) {
                        return false;
                    }
                    Parcelable.Creator creator2 = Bundle.CREATOR;
                    int i5 = e.a;
                    Bundle bundle2 = (Bundle) (parcel.readInt() != 0 ? (Parcelable) creator2.createFromParcel(parcel) : null);
                    int dataAvail2 = parcel.dataAvail();
                    if (dataAvail2 > 0) {
                        throw new BadParcelableException(no.a.k("Parcel data not fully consumed, unread size: ", dataAvail2));
                    }
                    hVar.c(bundle2);
                }
                return true;
            case 1:
                if (i > 16777215) {
                    z = super.onTransact(i, parcel, parcel2, i2);
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                    z = false;
                }
                if (!z) {
                    v vVar = (v) this;
                    if (i != 1) {
                        return false;
                    }
                    int readInt = parcel.readInt();
                    int i6 = com.google.android.gms.internal.play_billing.d.a;
                    int dataAvail3 = parcel.dataAvail();
                    if (dataAvail3 > 0) {
                        throw new BadParcelableException(no.a.k("Parcel data not fully consumed, unread size: ", dataAvail3));
                    }
                    vVar.g.a(Integer.valueOf(readInt));
                }
                return true;
            case 2:
                if (i > 16777215) {
                    break;
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                }
                g41.e eVar = (g41.e) this;
                if (i != 2) {
                    return false;
                }
                Parcelable.Creator creator3 = Bundle.CREATOR;
                int i7 = h41.a.a;
                Bundle bundle3 = (Bundle) (parcel.readInt() != 0 ? (Parcelable) creator3.createFromParcel(parcel) : null);
                int dataAvail4 = parcel.dataAvail();
                if (dataAvail4 > 0) {
                    throw new BadParcelableException(no.a.k("Parcel data not fully consumed, unread size: ", dataAvail4));
                }
                h41.h hVar2 = eVar.i.a;
                if (hVar2 != null) {
                    w21.g gVar = eVar.h;
                    synchronized (hVar2.f) {
                        hVar2.e.remove(gVar);
                    }
                    hVar2.a().post(new h41.g(i3, hVar2));
                }
                eVar.g.f("onGetLaunchReviewFlowInfo", new Object[0]);
                eVar.h.c(new g41.b((PendingIntent) bundle3.get("confirmation_intent"), bundle3.getBoolean("is_review_no_op")));
                return true;
            case 3:
            default:
                return super.onTransact(i, parcel, parcel2, i2);
            case 4:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return L(i, parcel, parcel2);
        }
    }

    public d(String str) {
        this.f = 4;
        attachInterface(this, str);
    }
}
