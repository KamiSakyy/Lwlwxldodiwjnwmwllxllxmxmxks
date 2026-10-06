package yz0;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i5 extends k5 {
    public static final Parcelable.Creator<i5> CREATOR = new e5(3);
    public final String s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i5(String str) {
        super(str.hashCode());
        k71.k.g(str, "url");
        this.s = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i5) && k71.k.b(this.s, ((i5) obj).s);
    }

    public final int hashCode() {
        return this.s.hashCode();
    }

    public final String toString() {
        return f1.e.z("SecurityPolicy(url=", this.s, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k71.k.g(parcel, "dest");
        parcel.writeString(this.s);
    }
}
