package l01;

import android.os.Parcel;
import android.os.Parcelable;
import yz0.v2;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g implements d0, Parcelable {
    public static final Parcelable.Creator<g> CREATOR = new c(3);
    public final String r;
    public final v2 s;

    public g(String str, v2 v2Var) {
        k71.k.g(str, "id");
        this.r = str;
        this.s = v2Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return k71.k.b(this.r, gVar.r) && k71.k.b(this.s, gVar.s);
    }

    public final int hashCode() {
        int hashCode = this.r.hashCode() * 31;
        v2 v2Var = this.s;
        return hashCode + (v2Var == null ? 0 : v2Var.hashCode());
    }

    public final String toString() {
        return "FieldMilestoneValue(id=" + this.r + ", milestone=" + this.s + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k71.k.g(parcel, "dest");
        parcel.writeString(this.r);
        parcel.writeParcelable(this.s, i);
    }
}
