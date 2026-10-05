package em;

import a0.s0;
import android.os.Parcel;
import android.os.Parcelable;
import c21.c0;
import com.github.rudroid.copilot.h1;
import k71.k;
import yz0.k2;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a implements k2 {
    public static final Parcelable.Creator<a> CREATOR = new c0(27);
    public final String r;
    public final String s;
    public final String t;
    public final int u;

    public a(int i, String str, String str2, String str3) {
        k.g(str, "name");
        k.g(str2, "id");
        k.g(str3, "colorString");
        this.r = str;
        this.s = str2;
        this.t = str3;
        this.u = i;
    }

    public final String J() {
        return this.t;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k.b(this.r, aVar.r) && k.b(this.s, aVar.s) && k.b(this.t, aVar.t) && this.u == aVar.u;
    }

    public final int f() {
        return this.u;
    }

    public final String getId() {
        return this.s;
    }

    public final String getName() {
        return this.r;
    }

    public final int hashCode() {
        return Integer.hashCode(this.u) + h1.i(h1.i(this.r.hashCode() * 31, this.s, 31), this.t, 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("SimpleLabel(name=", this.r, ", id=", this.s, ", colorString=");
        o.append(this.t);
        o.append(", color=");
        o.append(this.u);
        o.append(")");
        return o.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        parcel.writeString(this.r);
        parcel.writeString(this.s);
        parcel.writeString(this.t);
        parcel.writeInt(this.u);
    }
}
