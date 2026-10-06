package androidx.compose.foundation.lazy.layout;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /home/user/work/p/classes.dex */
public final class h implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new g();

    /* renamed from: r, reason: collision with root package name */
    public final int f1399r;

    public h(int i) {
        this.f1399r = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && this.f1399r == ((h) obj).f1399r;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f1399r);
    }

    public final String toString() {
        return x.i.j(new StringBuilder("DefaultLazyKey(index="), this.f1399r, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f1399r);
    }
}
