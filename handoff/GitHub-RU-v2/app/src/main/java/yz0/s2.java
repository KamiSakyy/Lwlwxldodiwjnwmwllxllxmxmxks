package yz0;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /home/user/work/p/classes4.dex */
public final class s2 implements Parcelable {
    public static final Parcelable.Creator<s2> CREATOR = new h(25);
    public final String r;
    public final String s;

    public s2(String str, String str2) {
        k71.k.g(str, "messageHeadline");
        k71.k.g(str2, "messageBody");
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
        if (!(obj instanceof s2)) {
            return false;
        }
        s2 s2Var = (s2) obj;
        return k71.k.b(this.r, s2Var.r) && k71.k.b(this.s, s2Var.s);
    }

    public final int hashCode() {
        return this.s.hashCode() + (this.r.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("MergeMessage(messageHeadline=", this.r, ", messageBody=", this.s, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k71.k.g(parcel, "dest");
        parcel.writeString(this.r);
        parcel.writeString(this.s);
    }

    public s2(Object... a) {
    }
}
