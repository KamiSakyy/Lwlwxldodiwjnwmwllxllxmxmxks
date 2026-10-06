package xn;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k implements Parcelable {
    public static final Parcelable.Creator<k> CREATOR = new l7.c0(20);
    public final l r;
    public final String s;

    public k(l lVar, String str) {
        k71.k.g(lVar, "state");
        k71.k.g(str, "terms");
        this.r = lVar;
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
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.r == kVar.r && k71.k.b(this.s, kVar.s);
    }

    public final int hashCode() {
        return this.s.hashCode() + (this.r.hashCode() * 31);
    }

    public final String toString() {
        return "AiModelPolicy(state=" + this.r + ", terms=" + this.s + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k71.k.g(parcel, "dest");
        parcel.writeString(this.r.name());
        parcel.writeString(this.s);
    }
}
