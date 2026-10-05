package l01;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p implements d0, Parcelable {
    public static final Parcelable.Creator<p> CREATOR = new c(10);
    public final String r;

    public p(String str) {
        k71.k.g(str, "id");
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
        return (obj instanceof p) && k71.k.b(this.r, ((p) obj).r);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String toString() {
        return f1.e.z("FieldUnknownValue(id=", this.r, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k71.k.g(parcel, "dest");
        parcel.writeString(this.r);
    }
}
