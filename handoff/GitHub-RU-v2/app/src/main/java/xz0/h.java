package xz0;

import a0.s0;
import android.os.Parcel;
import android.os.Parcelable;
import com.github.rudroid.copilot.h1;
import k71.k;
import x.i;
import xn.i0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new i0(5);
    public final String r;
    public final String s;
    public final String t;
    public final String u;

    public h(String str, String str2, String str3, String str4) {
        k.g(str, "id");
        k.g(str2, "slug");
        k.g(str3, "title");
        k.g(str4, "description");
        this.r = str;
        this.s = str2;
        this.t = str3;
        this.u = str4;
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
        return k.b(this.r, hVar.r) && k.b(this.s, hVar.s) && k.b(this.t, hVar.t) && k.b(this.u, hVar.u);
    }

    public final int hashCode() {
        return this.u.hashCode() + h1.i(h1.i(this.r.hashCode() * 31, this.s, 31), this.t, 31);
    }

    public final String toString() {
        return i.k(s0.o("UserListMetadata(id=", this.r, ", slug=", this.s, ", title="), this.t, ", description=", this.u, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        parcel.writeString(this.r);
        parcel.writeString(this.s);
        parcel.writeString(this.t);
        parcel.writeString(this.u);
    }
}
