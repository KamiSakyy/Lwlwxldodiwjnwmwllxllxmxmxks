package xn;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /home/user/work/p/classes3.dex */
public final class u extends v {
    public static final u s = new u("xAI");
    public static final Parcelable.Creator<u> CREATOR = new l7.c0(28);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof u);
    }

    public final int hashCode() {
        return 237657186;
    }

    public final String toString() {
        return "XAI";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k71.k.g(parcel, "dest");
        parcel.writeInt(1);
    }
}
