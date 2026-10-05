package y11;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c implements Parcelable.Creator {
    public final /* synthetic */ int a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                int b0 = k41.b.b0(parcel);
                Intent intent = null;
                while (parcel.dataPosition() < b0) {
                    int readInt = parcel.readInt();
                    if (((char) readInt) != 1) {
                        k41.b.N(parcel, readInt);
                    } else {
                        intent = (Intent) k41.b.n(parcel, readInt, Intent.CREATOR);
                    }
                }
                k41.b.s(parcel, b0);
                return new a(intent);
            default:
                return new g(parcel.readStrongBinder());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new a[i];
            default:
                return new g[i];
        }
    }
}
