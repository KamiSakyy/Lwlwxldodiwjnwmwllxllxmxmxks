package l7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: /home/user/work/p/classes.dex */
public final class w1 implements Parcelable {
    public static final Parcelable.Creator<w1> CREATOR = new c0(1);

    /* renamed from: r, reason: collision with root package name */
    public int f28323r;

    /* renamed from: s, reason: collision with root package name */
    public int f28324s;

    /* renamed from: t, reason: collision with root package name */
    public int[] f28325t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f28326u;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f28323r + ", mGapDir=" + this.f28324s + ", mHasUnwantedGapAfter=" + this.f28326u + ", mGapPerSpan=" + Arrays.toString(this.f28325t) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f28323r);
        parcel.writeInt(this.f28324s);
        parcel.writeInt(this.f28326u ? 1 : 0);
        int[] iArr = this.f28325t;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f28325t);
        }
    }
}
