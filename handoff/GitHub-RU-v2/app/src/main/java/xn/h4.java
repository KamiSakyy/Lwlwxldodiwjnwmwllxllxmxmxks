package xn;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h4 implements Parcelable {
    public static final Parcelable.Creator<h4> CREATOR = new i0(4);
    public final String r;
    public final String s;
    public final String t;

    public h4(String str, String str2, String str3) {
        k71.k.g(str, "title");
        k71.k.g(str2, "url");
        k71.k.g(str3, "excerpt");
        this.r = str;
        this.s = str2;
        this.t = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h4)) {
            return false;
        }
        h4 h4Var = (h4) obj;
        return k71.k.b(this.r, h4Var.r) && k71.k.b(this.s, h4Var.s) && k71.k.b(this.t, h4Var.t);
    }

    public final int hashCode() {
        return this.t.hashCode() + com.github.rudroid.copilot.h1.i(this.r.hashCode() * 31, this.s, 31);
    }

    public final String toString() {
        return com.github.rudroid.copilot.h1.p(a0.s0.o("WebSearchReferenceResult(title=", this.r, ", url=", this.s, ", excerpt="), this.t, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k71.k.g(parcel, "dest");
        parcel.writeString(this.r);
        parcel.writeString(this.s);
        parcel.writeString(this.t);
    }
}
