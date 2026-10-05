package z11;

import android.os.Parcel;
import android.os.Parcelable;
import m7.y;
import xn.i0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p extends d21.a {
    public static final Parcelable.Creator<p> CREATOR = new i0(8);
    public final boolean r;
    public final String s;
    public final int t;
    public final int u;
    public final long v;

    public p(boolean z, String str, int i, int i2, long j) {
        this.r = z;
        this.s = str;
        this.t = sy.o.o(i) - 1;
        this.u = sy.n.M(i2) - 1;
        this.v = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int Z = y.Z(parcel, 20293);
        y.Y(parcel, 1, 4);
        parcel.writeInt(this.r ? 1 : 0);
        y.V(parcel, 2, this.s);
        y.Y(parcel, 3, 4);
        parcel.writeInt(this.t);
        y.Y(parcel, 4, 4);
        parcel.writeInt(this.u);
        y.Y(parcel, 5, 8);
        parcel.writeLong(this.v);
        y.a0(parcel, Z);
    }
}
