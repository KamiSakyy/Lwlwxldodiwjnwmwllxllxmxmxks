package xn;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new l7.c0(19);
    public final i r;
    public final String s;

    public h(i iVar, String str) {
        k71.k.g(iVar, "type");
        k71.k.g(str, "family");
        this.r = iVar;
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
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.r == hVar.r && k71.k.b(this.s, hVar.s);
    }

    public final int hashCode() {
        return this.s.hashCode() + (this.r.hashCode() * 31);
    }

    public final String toString() {
        return "AiModelCapabilities(type=" + this.r + ", family=" + this.s + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k71.k.g(parcel, "dest");
        parcel.writeString(this.r.name());
        parcel.writeString(this.s);
    }
    public Object i = null;
}
