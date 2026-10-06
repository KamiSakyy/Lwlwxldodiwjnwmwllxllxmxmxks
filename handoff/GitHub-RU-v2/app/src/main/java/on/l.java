package on;

import a0.s0;
import android.os.Parcel;
import android.os.Parcelable;
import com.github.rudroid.copilot.h1;
import l7.c0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l implements Parcelable {
    public static final Parcelable.Creator<l> CREATOR = new c0(4);
    public String r;
    public String s;
    public String t;

    public l(String str, String str2, String str3) {
        k71.k.g(str, "name");
        k71.k.g(str2, "displayName");
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
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return k71.k.b(this.r, lVar.r) && k71.k.b(this.s, lVar.s) && k71.k.b(this.t, lVar.t);
    }

    public final int hashCode() {
        int i = h1.i(this.r.hashCode() * 31, this.s, 31);
        String str = this.t;
        return i + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return h1.p(s0.o("Subagent(name=", this.r, ", displayName=", this.s, ", description="), this.t, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k71.k.g(parcel, "dest");
        parcel.writeString(this.r);
        parcel.writeString(this.s);
        parcel.writeString(this.t);
    }
}
