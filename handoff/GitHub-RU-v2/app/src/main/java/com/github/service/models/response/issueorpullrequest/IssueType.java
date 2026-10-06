package com.github.service.models.response.issueorpullrequest;

import a0.s0;
import android.os.Parcel;
import android.os.Parcelable;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;
import g81.e;
import gn.m;
import gz.a;
import k71.k;
import k81.c1;
import kotlinx.serialization.KSerializer;
import sy.w;
import w61.h;
import w61.i;

@e
/* loaded from: /home/user/work/p/classes4.dex */
public final class IssueType implements Parcelable {
    public String r;
    public String s;
    public String t;
    public boolean u;
    public IssueTypeColor v;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<IssueType> CREATOR = new m(16);
    public static final h[] w = {null, null, null, null, w.s(i.r, new a(22))};

    public static final class Companion {
        public final KSerializer serializer() {
            return IssueType$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ IssueType(int i, String str, String str2, String str3, boolean z, IssueTypeColor issueTypeColor) {
        if (31 != (i & 31)) {
            c1.l(i, 31, IssueType$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.r = str;
        this.s = str2;
        this.t = str3;
        this.u = z;
        this.v = issueTypeColor;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IssueType)) {
            return false;
        }
        IssueType issueType = (IssueType) obj;
        return k.b(this.r, issueType.r) && k.b(this.s, issueType.s) && k.b(this.t, issueType.t) && this.u == issueType.u && this.v == issueType.v;
    }

    public final int hashCode() {
        int i = h1.i(this.r.hashCode() * 31, this.s, 31);
        String str = this.t;
        return this.v.hashCode() + x.i.e((i + (str == null ? 0 : str.hashCode())) * 31, 31, this.u);
    }

    public final String toString() {
        StringBuilder o = s0.o("IssueType(id=", this.r, ", name=", this.s, ", description=");
        m0.x(o, this.t, ", isEnabled=", this.u, ", color=");
        o.append(this.v);
        o.append(")");
        return o.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        parcel.writeString(this.r);
        parcel.writeString(this.s);
        parcel.writeString(this.t);
        parcel.writeInt(this.u ? 1 : 0);
        parcel.writeString(this.v.name());
    }

    public IssueType(String str, String str2, String str3, boolean z, IssueTypeColor issueTypeColor) {
        k.g(str, "id");
        k.g(str2, "name");
        k.g(issueTypeColor, "color");
        this.r = str;
        this.s = str2;
        this.t = str3;
        this.u = z;
        this.v = issueTypeColor;
    }
}
