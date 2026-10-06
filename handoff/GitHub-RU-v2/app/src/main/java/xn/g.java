package xn;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g implements Parcelable {
    public static final Parcelable.Creator<g> CREATOR = new l7.c0(18);
    public boolean r;
    public double s;

    public g(double d, boolean z) {
        this.r = z;
        this.s = d;
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
        return this.r == gVar.r && Double.compare(this.s, gVar.s) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.s) + (Boolean.hashCode(this.r) * 31);
    }

    public final String toString() {
        return "AiModelBillingInformation(isPremium=" + this.r + ", multiplier=" + this.s + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k71.k.g(parcel, "dest");
        parcel.writeInt(this.r ? 1 : 0);
        parcel.writeDouble(this.s);
    }
}
