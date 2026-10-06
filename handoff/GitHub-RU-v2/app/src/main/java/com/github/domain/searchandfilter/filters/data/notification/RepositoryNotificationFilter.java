package com.github.domain.searchandfilter.filters.data.notification;

import a0.s0;
import android.os.Parcel;
import android.os.Parcelable;
import com.github.rudroid.copilot.h1;
import com.github.service.models.response.Avatar;
import g81.e;
import k71.k;
import k81.c1Shadow;
import kotlinx.serialization.KSerializer;

@e
/* loaded from: /home/user/work/p/classes3.dex */
public final class RepositoryNotificationFilter extends a {
    public String s;
    public String t;
    public String u;
    public Avatar v;
    public int w;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<RepositoryNotificationFilter> CREATOR = new f8.a(25);

    public static final class Companion {
        public final KSerializer serializer() {
            return RepositoryNotificationFilter$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RepositoryNotificationFilter(int i, int i2, Avatar avatar, String str, String str2, String str3) {
        if (31 != (i & 31)) {
            c1Shadow.l(i, 31, RepositoryNotificationFilter$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.s = str;
        this.t = str2;
        this.u = str3;
        this.v = avatar;
        this.w = i2;
    }

    @Override // com.github.domain.searchandfilter.filters.data.notification.a
    public final String c() {
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
        if (!(obj instanceof RepositoryNotificationFilter)) {
            return false;
        }
        RepositoryNotificationFilter repositoryNotificationFilter = (RepositoryNotificationFilter) obj;
        return k.b(this.s, repositoryNotificationFilter.s) && k.b(this.t, repositoryNotificationFilter.t) && k.b(this.u, repositoryNotificationFilter.u) && k.b(this.v, repositoryNotificationFilter.v) && this.w == repositoryNotificationFilter.w;
    }

    @Override // com.github.domain.searchandfilter.filters.data.notification.a
    public final String getId() {
        return this.s;
    }

    public final int hashCode() {
        return Integer.hashCode(this.w) + h1.j(this.v, h1.i(h1.i(this.s.hashCode() * 31, this.t, 31), this.u, 31), 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("RepositoryNotificationFilter(id=", this.s, ", queryString=", this.t, ", nameWithOwner=");
        o.append(this.u);
        o.append(", avatar=");
        o.append(this.v);
        o.append(", count=");
        return s0.l(o, this.w, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        parcel.writeString(this.s);
        parcel.writeString(this.t);
        parcel.writeString(this.u);
        parcel.writeParcelable(this.v, i);
        parcel.writeInt(this.w);
    }

    public RepositoryNotificationFilter(String str, String str2, String str3, Avatar avatar, int i) {
        k.g(str, "id");
        k.g(str2, "queryString");
        k.g(str3, "nameWithOwner");
        k.g(avatar, "avatar");
        this.s = str;
        this.t = str2;
        this.u = str3;
        this.v = avatar;
        this.w = i;
    }
}
