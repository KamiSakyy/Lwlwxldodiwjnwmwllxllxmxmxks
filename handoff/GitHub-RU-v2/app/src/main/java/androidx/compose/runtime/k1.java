package androidx.compose.runtime;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /home/user/work/p/classes.dex */
public final class k1 implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1707a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f1707a) {
            case k5.f.J /* 0 */:
                return new l1(parcel.readFloat());
            case 1:
                return new m1(parcel.readInt());
            default:
                return new n1(parcel.readLong());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f1707a) {
            case k5.f.J /* 0 */:
                return new l1[i];
            case 1:
                return new m1[i];
            default:
                return new n1[i];
        }
    }
}
