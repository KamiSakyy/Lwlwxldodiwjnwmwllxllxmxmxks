package com.github.service.models.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;
import com.github.service.models.response.Avatar;
import k71.k;
import t71.p;
import x.i;
import yz0.g;
import yz0.h;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a implements Parcelable {
    public static final Avatar A;
    public static final a B;
    public final String r;
    public final Avatar s;
    public final String t;
    public final boolean u;
    public final boolean v;
    public final String w;
    public final String x;
    public final Avatar y;
    public final String z;
    public static final g Companion = new g();
    public static final Parcelable.Creator<a> CREATOR = new h(0);

    static {
        Avatar avatar = new Avatar("https://avatars2.githubusercontent.com/u/10137?s=400&u=b1951d34a583cf12ec0d3b0781ba19be97726318&v=4", Avatar.Type.Organization);
        A = avatar;
        B = new a("ghost", avatar, (String) null, false, (String) null, 60);
    }

    public a(String str, Avatar avatar, String str2, boolean z, boolean z2, String str3) {
        k.g(str, "loginString");
        k.g(avatar, "authorAvatar");
        this.r = str;
        this.s = avatar;
        this.t = str2;
        this.u = z;
        this.v = z2;
        this.w = str3;
        String str4 = p.T(str) ? "ghost" : str;
        this.x = str4;
        this.y = p.T(str) ? A : avatar;
        this.z = (str2 == null || p.T(str2)) ? str4 : str2;
    }

    @Override // android.os.Parcelable
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
        return k.b(this.r, aVar.r) && k.b(this.s, aVar.s) && k.b(this.t, aVar.t) && this.u == aVar.u && this.v == aVar.v && k.b(this.w, aVar.w);
    }

    public final int hashCode() {
        int j = h1.j(this.s, this.r.hashCode() * 31, 31);
        String str = this.t;
        int e = i.e(i.e((j + (str == null ? 0 : str.hashCode())) * 31, 31, this.u), 31, this.v);
        String str2 = this.w;
        return e + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Author(loginString=");
        sb.append(this.r);
        sb.append(", authorAvatar=");
        sb.append(this.s);
        sb.append(", botDisplayName=");
        m0.x(sb, this.t, ", isCopilot=", this.u, ", isAgent=");
        return m0.l(sb, this.v, ", url=", this.w, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        parcel.writeString(this.r);
        this.s.writeToParcel(parcel, i);
        parcel.writeString(this.t);
        parcel.writeInt(this.u ? 1 : 0);
        parcel.writeInt(this.v ? 1 : 0);
        parcel.writeString(this.w);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(String str, Avatar avatar, String str2, boolean z, String str3, int i) {
        this(str, avatar, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? false : z, false, (i & 32) != 0 ? null : str3);
        if ((i & 2) != 0) {
            Avatar.Companion.getClass();
            avatar = Avatar.u;
        }
    }
    public Object z(Object p1) { return null; }
}
