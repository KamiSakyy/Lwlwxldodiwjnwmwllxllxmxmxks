package yz0;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f5 extends k5 {
    public static final f5 s = new f5(64266548);
    public static final Parcelable.Creator<f5> CREATOR = new e5(0);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof f5);
    }

    public final int hashCode() {
        return 1987237312;
    }

    public final String toString() {
        return "Blank";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k71.k.g(parcel, "dest");
        parcel.writeInt(1);
    }

    public f5(Object... a) {
    }
}
