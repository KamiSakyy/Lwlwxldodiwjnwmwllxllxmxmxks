package c21;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f extends d21.a {
    public static final Parcelable.Creator<f> CREATOR = new c0(0);
    public k r;
    public boolean s;
    public boolean t;
    public int[] u;
    public int v;
    public int[] w;

    public f(k kVar, boolean z, boolean z2, int[] iArr, int i, int[] iArr2) {
        this.r = kVar;
        this.s = z;
        this.t = z2;
        this.u = iArr;
        this.v = i;
        this.w = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int Z = m7.y.Z(parcel, 20293);
        m7.y.U(parcel, 1, this.r, i);
        m7.y.Y(parcel, 2, 4);
        parcel.writeInt(this.s ? 1 : 0);
        m7.y.Y(parcel, 3, 4);
        parcel.writeInt(this.t ? 1 : 0);
        int[] iArr = this.u;
        if (iArr != null) {
            int Z2 = m7.y.Z(parcel, 4);
            parcel.writeIntArray(iArr);
            m7.y.a0(parcel, Z2);
        }
        m7.y.Y(parcel, 5, 4);
        parcel.writeInt(this.v);
        int[] iArr2 = this.w;
        if (iArr2 != null) {
            int Z3 = m7.y.Z(parcel, 6);
            parcel.writeIntArray(iArr2);
            m7.y.a0(parcel, Z3);
        }
        m7.y.a0(parcel, Z);
    }
}
