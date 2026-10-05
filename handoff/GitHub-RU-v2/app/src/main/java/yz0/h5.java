package yz0;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h5 extends k5 {
    public static final Parcelable.Creator<h5> CREATOR = new e5(2);
    public final String s;
    public final String t;
    public final String u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5(String str, String str2, String str3) {
        super(str.hashCode());
        k71.k.g(str, "name");
        k71.k.g(str2, "about");
        k71.k.g(str3, "url");
        this.s = str;
        this.t = str2;
        this.u = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h5)) {
            return false;
        }
        h5 h5Var = (h5) obj;
        return k71.k.b(this.s, h5Var.s) && k71.k.b(this.t, h5Var.t) && k71.k.b(this.u, h5Var.u);
    }

    public final int hashCode() {
        return this.u.hashCode() + com.github.rudroid.copilot.h1.i(this.s.hashCode() * 31, this.t, 31);
    }

    public final String toString() {
        return com.github.rudroid.copilot.h1.p(a0.s0.o("IssueFormLink(name=", this.s, ", about=", this.t, ", url="), this.u, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k71.k.g(parcel, "dest");
        parcel.writeString(this.s);
        parcel.writeString(this.t);
        parcel.writeString(this.u);
    }
}
