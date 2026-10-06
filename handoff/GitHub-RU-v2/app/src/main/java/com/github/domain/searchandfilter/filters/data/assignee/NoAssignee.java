package com.github.domain.searchandfilter.filters.data.assignee;

import android.os.Parcel;
import android.os.Parcelable;
import c21.c0;
import com.github.service.models.response.Avatar;
import g81.e;
import k71.k;
import kotlinx.serialization.KSerializer;
import yz0.f;

@e
/* loaded from: /home/user/work/p/classes3.dex */
public final class NoAssignee implements f {
    public String r;
    public Avatar s;
    public String t;
    public String u;
    public boolean v;
    public boolean w;
    public boolean x;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<NoAssignee> CREATOR = new c0(16);
    public static final NoAssignee y = new NoAssignee();

    public static final class Companion {
        public final KSerializer serializer() {
            return NoAssignee$$serializer.INSTANCE;
        }
    }

    public NoAssignee() {
        this.r = "";
        Avatar.Companion.getClass();
        this.s = Avatar.u;
        this.t = "";
        this.u = "";
    }

    public final String d() {
        return this.r;
    }

    public final int describeContents() {
        return 0;
    }

    public final Avatar e() {
        return this.s;
    }

    public final String getId() {
        return this.t;
    }

    public final String getName() {
        return this.u;
    }

    public final boolean q() {
        return this.v;
    }

    public final boolean s() {
        return this.w;
    }

    public final boolean u() {
        return this.x;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        parcel.writeInt(1);
    }

    public NoAssignee(int i, String str, Avatar avatar, String str2, String str3, boolean z, boolean z2, boolean z3) {
        if ((i & 1) == 0) {
            this.r = "";
        } else {
            this.r = str;
        }
        if ((i & 2) == 0) {
            Avatar.Companion.getClass();
            this.s = Avatar.u;
        } else {
            this.s = avatar;
        }
        if ((i & 4) == 0) {
            this.t = "";
        } else {
            this.t = str2;
        }
        if ((i & 8) == 0) {
            this.u = "";
        } else {
            this.u = str3;
        }
        if ((i & 16) == 0) {
            this.v = false;
        } else {
            this.v = z;
        }
        if ((i & 32) == 0) {
            this.w = false;
        } else {
            this.w = z2;
        }
        if ((i & 64) == 0) {
            this.x = false;
        } else {
            this.x = z3;
        }
    }
}
