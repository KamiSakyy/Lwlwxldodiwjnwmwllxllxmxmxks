package o31;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /home/user/work/p/classes4.dex */
public class b extends i5.b {
    public static final Parcelable.Creator<b> CREATOR = new v1.p(9);
    public boolean t;

    public b(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.t = parcel.readInt() == 1;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.t ? 1 : 0);
    }
}
