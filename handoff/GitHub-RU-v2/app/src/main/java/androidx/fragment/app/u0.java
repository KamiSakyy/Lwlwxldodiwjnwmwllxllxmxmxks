package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /home/user/work/p/classes.dex */
public final class u0 implements Parcelable {
    public static final Parcelable.Creator<u0> CREATOR = new a21.g(5);

    /* renamed from: r, reason: collision with root package name */
    public String f2648r;

    /* renamed from: s, reason: collision with root package name */
    public int f2649s;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f2648r);
        parcel.writeInt(this.f2649s);
    }
}
