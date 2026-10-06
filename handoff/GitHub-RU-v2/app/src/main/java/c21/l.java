package c21;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l extends d21.a {
    public static final Parcelable.Creator<l> CREATOR = new bm.o(26);
    public final int r;
    public List s;

    public l(int i, List list) {
        this.r = i;
        this.s = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int Z = m7.y.Z(parcel, 20293);
        m7.y.Y(parcel, 1, 4);
        parcel.writeInt(this.r);
        m7.y.X(parcel, 2, this.s);
        m7.y.a0(parcel, Z);
    }
}
