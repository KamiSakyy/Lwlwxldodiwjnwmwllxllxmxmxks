package com.github.domain.searchandfilter.filters.data.notification;

import a0.s0;
import android.os.Parcel;
import android.os.Parcelable;
import com.github.rudroid.copilot.h1;
import g81.e;
import jo.f4;
import k71.k;
import k81.c1;
import kotlinx.serialization.KSerializer;

@e
/* loaded from: /home/user/work/p/classes3.dex */
public final class CustomNotificationFilter extends a {
    public final String s;
    public final String t;
    public final String u;
    public final int v;
    public final boolean w;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<CustomNotificationFilter> CREATOR = new f8.a(24);

    public static final class Companion {
        public final KSerializer serializer() {
            return CustomNotificationFilter$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CustomNotificationFilter(int i, int i2, String str, String str2, String str3, boolean z) {
        if (31 != (i & 31)) {
            c1.l(i, 31, CustomNotificationFilter$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.s = str;
        this.t = str2;
        this.u = str3;
        this.v = i2;
        this.w = z;
    }

    @Override // com.github.domain.searchandfilter.filters.data.notification.a
    public final String c() {
        return this.u;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomNotificationFilter)) {
            return false;
        }
        CustomNotificationFilter customNotificationFilter = (CustomNotificationFilter) obj;
        return k.b(this.s, customNotificationFilter.s) && k.b(this.t, customNotificationFilter.t) && k.b(this.u, customNotificationFilter.u) && this.v == customNotificationFilter.v && this.w == customNotificationFilter.w;
    }

    @Override // com.github.domain.searchandfilter.filters.data.notification.a
    public final String getId() {
        return this.s;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.w) + s0.b(this.v, h1.i(h1.i(this.s.hashCode() * 31, this.t, 31), this.u, 31), 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("CustomNotificationFilter(id=", this.s, ", name=", this.t, ", queryString=");
        s0.w(this.v, this.u, ", unreadCount=", ", isDefault=", o);
        return f4.s(o, this.w, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        parcel.writeString(this.s);
        parcel.writeString(this.t);
        parcel.writeString(this.u);
        parcel.writeInt(this.v);
        parcel.writeInt(this.w ? 1 : 0);
    }

    public CustomNotificationFilter(int i, String str, String str2, String str3, boolean z) {
        k.g(str, "id");
        k.g(str2, "name");
        k.g(str3, "queryString");
        this.s = str;
        this.t = str2;
        this.u = str3;
        this.v = i;
        this.w = z;
    }
}
