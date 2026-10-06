package l01;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f0 implements Parcelable {
    public static final Parcelable.Creator<f0> CREATOR = new c(17);
    public final String r;
    public final String s;

    public f0(String str, String str2) {
        k71.k.g(str, "displayName");
        k71.k.g(str2, "avatarURL");
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
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return k71.k.b(this.r, f0Var.r) && k71.k.b(this.s, f0Var.s);
    }

    public final int hashCode() {
        return this.s.hashCode() + (this.r.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("ProjectReviewer(displayName=", this.r, ", avatarURL=", this.s, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k71.k.g(parcel, "dest");
        parcel.writeString(this.r);
        parcel.writeString(this.s);
    }
}
