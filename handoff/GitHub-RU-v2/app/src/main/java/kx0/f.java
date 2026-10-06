package kx0;

import a0.s0;
import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import com.github.rudroid.copilot.h1;
import t71.w;
import yz0.k2;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f implements k2 {
    public static final Parcelable.Creator<f> CREATOR = new gn.m(27);
    public String r;
    public String s;
    public String t;
    public int u;

    public f(int i, String str, String str2, String str3) {
        k71.k.g(str, "name");
        k71.k.g(str2, "id");
        k71.k.g(str3, "colorString");
        this.r = str;
        this.s = str2;
        this.t = str3;
        this.u = i;
    }

    @Override // yz0.k2
    public final String J() {
        return this.t;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return k71.k.b(this.r, fVar.r) && k71.k.b(this.s, fVar.s) && k71.k.b(this.t, fVar.t) && this.u == fVar.u;
    }

    @Override // yz0.k2
    public final int f() {
        return this.u;
    }

    @Override // yz0.k2
    public final String getId() {
        return this.s;
    }

    @Override // yz0.k2
    public final String getName() {
        return this.r;
    }

    public final int hashCode() {
        return Integer.hashCode(this.u) + h1.i(h1.i(this.r.hashCode() * 31, this.s, 31), this.t, 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("ApolloLabel(name=", this.r, ", id=", this.s, ", colorString=");
        o.append(this.t);
        o.append(", color=");
        o.append(this.u);
        o.append(")");
        return o.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k71.k.g(parcel, "dest");
        parcel.writeString(this.r);
        parcel.writeString(this.s);
        parcel.writeString(this.t);
        parcel.writeInt(this.u);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public f(String str, String str2, String str3) {
        this(r0, str, str2, str3);
        int i;
        try {
            if (!w.F(str3, "#", false)) {
                i = Color.parseColor("#".concat(str3));
            } else {
                i = Color.parseColor(str3);
            }
        } catch (Exception unused) {
            i = -16777216;
        }
    }
}
