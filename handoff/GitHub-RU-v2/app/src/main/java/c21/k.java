package c21;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k extends d21.a {
    public static final Parcelable.Creator<k> CREATOR = new bm.o(28);
    public int r;
    public boolean s;
    public boolean t;
    public int u;
    public int v;

    public k(int i, boolean z, boolean z2, int i2, int i3) {
        this.r = i;
        this.s = z;
        this.t = z2;
        this.u = i2;
        this.v = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int Z = m7.y.Z(parcel, 20293);
        m7.y.Y(parcel, 1, 4);
        parcel.writeInt(this.r);
        m7.y.Y(parcel, 2, 4);
        parcel.writeInt(this.s ? 1 : 0);
        m7.y.Y(parcel, 3, 4);
        parcel.writeInt(this.t ? 1 : 0);
        m7.y.Y(parcel, 4, 4);
        parcel.writeInt(this.u);
        m7.y.Y(parcel, 5, 4);
        parcel.writeInt(this.v);
        m7.y.a0(parcel, Z);
    }
}
