package com.github.rudroid.profile.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.rudroid.copilot.h1;
import g81.e;
import k71.k;
import k81.c1;
import kotlinx.serialization.KSerializer;
import ze.d;

@e
/* loaded from: /home/user/work/p/classes.dex */
public final class UserOrOgProfileScreenRoute implements Parcelable, d {

    /* renamed from: r, reason: collision with root package name */
    public String f17332r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f17333s;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<UserOrOgProfileScreenRoute> CREATOR = new a();

    public static final class Companion {
        public final KSerializer serializer() {
            return UserOrOgProfileScreenRoute$$serializer.INSTANCE;
        }
    }

    public static final class a implements Parcelable.Creator<UserOrOgProfileScreenRoute> {
        @Override // android.os.Parcelable.Creator
        public final UserOrOgProfileScreenRoute createFromParcel(Parcel parcel) {
            k.g(parcel, "parcel");
            return new UserOrOgProfileScreenRoute(parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final UserOrOgProfileScreenRoute[] newArray(int i) {
            return new UserOrOgProfileScreenRoute[i];
        }
    }

    public /* synthetic */ UserOrOgProfileScreenRoute(int i, String str, boolean z10) {
        if (1 != (i & 1)) {
            c1.l(i, 1, UserOrOgProfileScreenRoute$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f17332r = str;
        if ((i & 2) == 0) {
            this.f17333s = false;
        } else {
            this.f17333s = z10;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserOrOgProfileScreenRoute)) {
            return false;
        }
        UserOrOgProfileScreenRoute userOrOgProfileScreenRoute = (UserOrOgProfileScreenRoute) obj;
        return k.b(this.f17332r, userOrOgProfileScreenRoute.f17332r) && this.f17333s == userOrOgProfileScreenRoute.f17333s;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f17333s) + (this.f17332r.hashCode() * 31);
    }

    public final String toString() {
        return h1.n("UserOrOgProfileScreenRoute(userOrOrgLogin=", this.f17332r, ", displayBlockDialog=", ")", this.f17333s);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        parcel.writeString(this.f17332r);
        parcel.writeInt(this.f17333s ? 1 : 0);
    }

    public UserOrOgProfileScreenRoute(String str, boolean z10) {
        k.g(str, "userOrOrgLogin");
        this.f17332r = str;
        this.f17333s = z10;
    }
}
