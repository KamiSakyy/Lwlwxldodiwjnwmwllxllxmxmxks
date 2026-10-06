package yz0;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.service.models.response.organizations.OrganizationNameAndAvatarUrl;
import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o8 implements Parcelable {
    public static final Parcelable.Creator<o8> CREATOR = new e5(9);
    public String r;
    public String s;
    public boolean t;
    public String u;
    public OrganizationNameAndAvatarUrl v;
    public String w;
    public ZonedDateTime x;

    public o8(String str, String str2, boolean z, String str3, OrganizationNameAndAvatarUrl organizationNameAndAvatarUrl, String str4, ZonedDateTime zonedDateTime) {
        k71.k.g(str, "emojiHtml");
        k71.k.g(str2, "emoji");
        k71.k.g(str3, "message");
        this.r = str;
        this.s = str2;
        this.t = z;
        this.u = str3;
        this.v = organizationNameAndAvatarUrl;
        this.w = str4;
        this.x = zonedDateTime;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o8)) {
            return false;
        }
        o8 o8Var = (o8) obj;
        return k71.k.b(this.r, o8Var.r) && k71.k.b(this.s, o8Var.s) && this.t == o8Var.t && k71.k.b(this.u, o8Var.u) && k71.k.b(this.v, o8Var.v) && k71.k.b(this.w, o8Var.w) && k71.k.b(this.x, o8Var.x);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(x.i.e(com.github.rudroid.copilot.h1.i(this.r.hashCode() * 31, this.s, 31), 31, this.t), this.u, 31);
        OrganizationNameAndAvatarUrl organizationNameAndAvatarUrl = this.v;
        int hashCode = (i + (organizationNameAndAvatarUrl == null ? 0 : organizationNameAndAvatarUrl.hashCode())) * 31;
        String str = this.w;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        ZonedDateTime zonedDateTime = this.x;
        return hashCode2 + (zonedDateTime != null ? zonedDateTime.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Status(emojiHtml=", this.r, ", emoji=", this.s, ", indicatesLimitedAvailability=");
        com.github.rudroid.m0.z(o, this.t, ", message=", this.u, ", organizationNameAndAvatarUrl=");
        o.append(this.v);
        o.append(", organizationId=");
        o.append(this.w);
        o.append(", expiresAt=");
        return com.github.rudroid.copilot.h1.q(o, this.x, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k71.k.g(parcel, "dest");
        parcel.writeString(this.r);
        parcel.writeString(this.s);
        parcel.writeInt(this.t ? 1 : 0);
        parcel.writeString(this.u);
        OrganizationNameAndAvatarUrl organizationNameAndAvatarUrl = this.v;
        if (organizationNameAndAvatarUrl == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            organizationNameAndAvatarUrl.writeToParcel(parcel, i);
        }
        parcel.writeString(this.w);
        parcel.writeSerializable(this.x);
    }
}
