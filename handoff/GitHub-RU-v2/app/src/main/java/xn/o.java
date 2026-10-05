package xn;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o extends v {
    public static final o s = new o("Azure OpenAI");
    public static final Parcelable.Creator<o> CREATOR = new l7.c0(23);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof o);
    }

    public final int hashCode() {
        return -870966493;
    }

    public final String toString() {
        return "AzureOpenAI";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k71.k.g(parcel, "dest");
        parcel.writeInt(1);
    }
}
