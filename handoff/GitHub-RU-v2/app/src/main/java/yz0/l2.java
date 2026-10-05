package yz0;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l2 implements Parcelable {
    public static final Parcelable.Creator<l2> CREATOR = new h(22);
    public final String r;

    public l2(String str) {
        k71.k.g(str, "displayName");
        this.r = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l2) && k71.k.b(this.r, ((l2) obj).r);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String toString() {
        return f1.e.z("License(displayName=", this.r, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k71.k.g(parcel, "dest");
        parcel.writeString(this.r);
    }
}
