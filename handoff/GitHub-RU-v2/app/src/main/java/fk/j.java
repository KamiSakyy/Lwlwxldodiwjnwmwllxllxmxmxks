package fk;

import android.os.Parcel;
import android.os.Parcelable;
import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j extends e {
    public static final Parcelable.Creator<j> CREATOR = new f8.a(9);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        parcel.writeInt(1);
    }
}
