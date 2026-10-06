package xn;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m implements Parcelable {
    public static final Parcelable.Creator<m> CREATOR = new l7.c0(21);
    public final boolean r;

    public m(boolean z) {
        this.r = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && this.r == ((m) obj).r;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.r);
    }

    public final String toString() {
        return com.github.rudroid.m0.i("AiModelSupports(toolCalls=", ")", this.r);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k71.k.g(parcel, "dest");
        parcel.writeInt(this.r ? 1 : 0);
    }
    public Object i = null;
}
