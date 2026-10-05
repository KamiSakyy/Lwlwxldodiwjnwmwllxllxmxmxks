package g41;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new f8.a(23);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        b bVar = (b) this;
        parcel.writeParcelable(bVar.r, 0);
        parcel.writeInt(bVar.s ? 1 : 0);
    }
}
