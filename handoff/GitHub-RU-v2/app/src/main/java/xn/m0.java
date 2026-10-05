package xn;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m0 implements Parcelable {
    public static final Parcelable.Creator<m0> CREATOR = new i0(2);
    public final String r;
    public final String s;

    public m0(String str, String str2) {
        k71.k.g(str, "name");
        k71.k.g(str2, "type");
        this.r = str;
        this.s = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return k71.k.b(this.r, m0Var.r) && k71.k.b(this.s, m0Var.s);
    }

    public final int hashCode() {
        return this.s.hashCode() + (this.r.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("ChatMessageReferenceInfo(name=", this.r, ", type=", this.s, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k71.k.g(parcel, "dest");
        parcel.writeString(this.r);
        parcel.writeString(this.s);
    }
}
