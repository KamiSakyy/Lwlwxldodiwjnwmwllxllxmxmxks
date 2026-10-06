package z11;

import android.os.Parcel;
import android.os.Parcelable;
import c21.u;
import java.util.Arrays;
import m7.y;
import xn.i0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d extends d21.a {
    public static final Parcelable.Creator<d> CREATOR = new i0(7);
    public String r;
    public int s;
    public long t;
    public boolean u;

    public d(String str, int i, long j, boolean z) {
        this.r = str;
        this.s = i;
        this.t = j;
        this.u = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (u.j(this.r, dVar.r) && j() == dVar.j() && this.u == dVar.u) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.r, Long.valueOf(j()), Boolean.valueOf(this.u)});
    }

    public final long j() {
        long j = this.t;
        return j == -1 ? this.s : j;
    }

    public final String toString() {
        b1.m mVar = new b1.m(this);
        mVar.a(this.r, "name");
        mVar.a(Long.valueOf(j()), "version");
        mVar.a(Boolean.valueOf(this.u), "is_fully_rolled_out");
        return mVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int Z = y.Z(parcel, 20293);
        y.V(parcel, 1, this.r);
        y.Y(parcel, 2, 4);
        parcel.writeInt(this.s);
        long j = j();
        y.Y(parcel, 3, 8);
        parcel.writeLong(j);
        y.Y(parcel, 4, 4);
        parcel.writeInt(this.u ? 1 : 0);
        y.a0(parcel, Z);
    }
    public Object d(Object p1, Object p2) { return null; }
    public Object f(Object p1, Object p2) { return null; }
    public Object d(Object, int) { return null; }
    public Object f(Object, int) { return null; }
}
