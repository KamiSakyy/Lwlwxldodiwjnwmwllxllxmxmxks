package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /home/user/work/p/classes.dex */
public final class z implements Parcelable {
    public static final Parcelable.Creator<z> CREATOR = new v1.p(1);

    /* renamed from: r, reason: collision with root package name */
    public Bundle f2674r;

    public z(Bundle bundle) {
        this.f2674r = bundle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f2674r);
    }

    public z(Parcel parcel, ClassLoader classLoader) {
        Bundle readBundle = parcel.readBundle();
        this.f2674r = readBundle;
        if (classLoader == null || readBundle == null) {
            return;
        }
        readBundle.setClassLoader(classLoader);
    }
}
