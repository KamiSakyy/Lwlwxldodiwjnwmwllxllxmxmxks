package w51;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q extends d21.a {
    public static final Parcelable.Creator<q> CREATOR = new l7.c0(12);
    public final Bundle r;
    public x.e s;

    public q(Bundle bundle) {
        this.r = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int Z = m7.y.Z(parcel, 20293);
        m7.y.S(parcel, 2, this.r);
        m7.y.a0(parcel, Z);
    }
}
