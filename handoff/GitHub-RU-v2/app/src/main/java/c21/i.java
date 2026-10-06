package c21;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i extends d21.a {
    public static final Parcelable.Creator<i> CREATOR = new bm.o(27);
    public int r;
    public int s;
    public int t;
    public long u;
    public long v;
    public String w;
    public String x;
    public int y;
    public int z;

    public i(int i, int i2, int i3, long j, long j2, String str, String str2, int i4, int i5) {
        this.r = i;
        this.s = i2;
        this.t = i3;
        this.u = j;
        this.v = j2;
        this.w = str;
        this.x = str2;
        this.y = i4;
        this.z = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int Z = m7.y.Z(parcel, 20293);
        m7.y.Y(parcel, 1, 4);
        parcel.writeInt(this.r);
        m7.y.Y(parcel, 2, 4);
        parcel.writeInt(this.s);
        m7.y.Y(parcel, 3, 4);
        parcel.writeInt(this.t);
        m7.y.Y(parcel, 4, 8);
        parcel.writeLong(this.u);
        m7.y.Y(parcel, 5, 8);
        parcel.writeLong(this.v);
        m7.y.V(parcel, 6, this.w);
        m7.y.V(parcel, 7, this.x);
        m7.y.Y(parcel, 8, 4);
        parcel.writeInt(this.y);
        m7.y.Y(parcel, 9, 4);
        parcel.writeInt(this.z);
        m7.y.a0(parcel, Z);
    }
}
