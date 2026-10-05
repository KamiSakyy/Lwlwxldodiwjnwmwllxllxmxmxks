package i5;

import android.os.Parcel;
import android.os.Parcelable;
import v1.p;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class b implements Parcelable {

    /* renamed from: r, reason: collision with root package name */
    public final Parcelable f26019r;

    /* renamed from: s, reason: collision with root package name */
    public static final a f26018s = new a();
    public static final Parcelable.Creator<b> CREATOR = new p(5);

    public b() {
        this.f26019r = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f26019r, i);
    }

    public b(Parcelable parcelable) {
        if (parcelable != null) {
            this.f26019r = parcelable == f26018s ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public b(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f26019r = readParcelable == null ? f26018s : readParcelable;
    }
}
