package c21;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b0 extends d21.a {
    public static final Parcelable.Creator<b0> CREATOR = new bm.o(29);
    public Bundle r;
    public z11.d[] s;
    public int t;
    public f u;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int Z = m7.y.Z(parcel, 20293);
        m7.y.S(parcel, 1, this.r);
        m7.y.W(parcel, 2, this.s, i);
        int i2 = this.t;
        m7.y.Y(parcel, 3, 4);
        parcel.writeInt(i2);
        m7.y.U(parcel, 4, this.u, i);
        m7.y.a0(parcel, Z);
    }
}
