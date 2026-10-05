package xn;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r extends v {
    public static final r s = new r("Mistral");
    public static final Parcelable.Creator<r> CREATOR = new l7.c0(25);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof r);
    }

    public final int hashCode() {
        return -1771838;
    }

    public final String toString() {
        return "Mistral";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k71.k.g(parcel, "dest");
        parcel.writeInt(1);
    }
}
