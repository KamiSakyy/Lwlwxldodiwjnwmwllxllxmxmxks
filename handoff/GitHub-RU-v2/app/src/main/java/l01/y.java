package l01;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /home/user/work/p/classes4.dex */
public final class y implements Parcelable {
    public static final Parcelable.Creator<y> CREATOR = new c(13);
    public final String r;

    public /* synthetic */ y(String str) {
        this.r = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof y) {
            return k71.k.b(this.r, ((y) obj).r);
        }
        return false;
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String toString() {
        return f1.e.z("ProjectFieldIdMapKey(id=", this.r, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k71.k.g(parcel, "dest");
        parcel.writeString(this.r);
    }
}
