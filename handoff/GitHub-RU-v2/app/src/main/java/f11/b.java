package f11;

import android.os.Parcel;
import android.os.Parcelable;
import c21.c0;
import com.github.rudroid.copilot.h1;
import com.github.service.models.response.type.MobileAuthRequestType;
import f1.e;
import k71.k;
import x.i;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new c0(28);
    public int r;
    public String s;
    public String t;
    public String u;
    public boolean v;
    public MobileAuthRequestType w;

    public b(int i, String str, String str2, String str3, boolean z, MobileAuthRequestType mobileAuthRequestType) {
        k.g(str, "payload");
        k.g(str2, "userEmail");
        k.g(str3, "userLogin");
        k.g(mobileAuthRequestType, "type");
        this.r = i;
        this.s = str;
        this.t = str2;
        this.u = str3;
        this.v = z;
        this.w = mobileAuthRequestType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.r == bVar.r && k.b(this.s, bVar.s) && k.b(this.t, bVar.t) && k.b(this.u, bVar.u) && this.v == bVar.v && this.w == bVar.w;
    }

    public final int hashCode() {
        return this.w.hashCode() + i.e(h1.i(h1.i(h1.i(Integer.hashCode(this.r) * 31, this.s, 31), this.t, 31), this.u, 31), 31, this.v);
    }

    public final String toString() {
        StringBuilder n = i.n(this.r, "MobileAuthRequest(id=", ", payload=", this.s, ", userEmail=");
        e.x(n, this.t, ", userLogin=", this.u, ", requireChallenge=");
        n.append(this.v);
        n.append(", type=");
        n.append(this.w);
        n.append(")");
        return n.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        parcel.writeInt(this.r);
        parcel.writeString(this.s);
        parcel.writeString(this.t);
        parcel.writeString(this.u);
        parcel.writeInt(this.v ? 1 : 0);
        parcel.writeString(this.w.name());
    }
}
