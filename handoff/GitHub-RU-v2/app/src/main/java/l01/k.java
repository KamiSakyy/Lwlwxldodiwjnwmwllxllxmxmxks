package l01;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k implements d0, Parcelable {
    public static final Parcelable.Creator<k> CREATOR = new c(6);
    public String r;
    public String s;

    public k(String str, String str2) {
        k71.k.g(str, "id");
        k71.k.g(str2, "repositoryName");
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
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return k71.k.b(this.r, kVar.r) && k71.k.b(this.s, kVar.s);
    }

    public final int hashCode() {
        return this.s.hashCode() + (this.r.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("FieldRepositoryValue(id=", this.r, ", repositoryName=", this.s, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k71.k.g(parcel, "dest");
        parcel.writeString(this.r);
        parcel.writeString(this.s);
    }
}
