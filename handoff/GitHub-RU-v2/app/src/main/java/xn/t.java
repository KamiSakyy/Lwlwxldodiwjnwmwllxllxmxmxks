package xn;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t extends v {
    public static final Parcelable.Creator<t> CREATOR = new l7.c0(27);
    public String s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(String str) {
        super(str);
        k71.k.g(str, "displayName");
        this.s = str;
    }

    @Override // xn.v
    public final String c() {
        return this.s;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && k71.k.b(this.s, ((t) obj).s);
    }

    public final int hashCode() {
        return this.s.hashCode();
    }

    public final String toString() {
        return f1.e.z("Unknown(displayName=", this.s, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k71.k.g(parcel, "dest");
        parcel.writeString(this.s);
    }
}
