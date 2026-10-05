package l7;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /home/user/work/p/classes.dex */
public final class d0 implements Parcelable {
    public static final Parcelable.Creator<d0> CREATOR = new c0(0);

    /* renamed from: r, reason: collision with root package name */
    public int f28083r;

    /* renamed from: s, reason: collision with root package name */
    public int f28084s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f28085t;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f28083r);
        parcel.writeInt(this.f28084s);
        parcel.writeInt(this.f28085t ? 1 : 0);
    }
}
