package y11;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import m7.y;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a extends d21.a {
    public static final Parcelable.Creator<a> CREATOR = new c(0);
    public Intent r;

    public a(Intent intent) {
        this.r = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int Z = y.Z(parcel, 20293);
        y.U(parcel, 1, this.r, i);
        y.a0(parcel, Z);
    }
}
