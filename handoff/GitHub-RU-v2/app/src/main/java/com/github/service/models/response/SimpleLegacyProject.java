package com.github.service.models.response;

import a0.s0;
import android.os.Parcel;
import android.os.Parcelable;
import g81.e;
import k71.k;
import k81.c1Shadow;
import kotlinx.serialization.KSerializer;
import sy.w;
import w61.i;
import yz0.h;

@e
/* loaded from: /home/user/work/p/classes4.dex */
public final class SimpleLegacyProject implements Parcelable {
    public String r;
    public String s;
    public ProjectState t;
    public String u;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<SimpleLegacyProject> CREATOR = new h(27);
    public static final w61.h[] v = {null, null, w.s(i.r, new wm.a(25)), null};

    public static final class Companion {
        public final KSerializer serializer() {
            return SimpleLegacyProject$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SimpleLegacyProject(int i, String str, String str2, ProjectState projectState, String str3) {
        if (15 != (i & 15)) {
            c1Shadow.l(i, 15, SimpleLegacyProject$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.r = str;
        this.s = str2;
        this.t = projectState;
        this.u = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof SimpleLegacyProject) {
            return k.b(this.s, ((SimpleLegacyProject) obj).s);
        }
        return false;
    }

    public final int hashCode() {
        return this.s.hashCode();
    }

    public final String toString() {
        StringBuilder o = s0.o("SimpleLegacyProject(name=", this.r, ", id=", this.s, ", state=");
        o.append(this.t);
        o.append(", column=");
        o.append(this.u);
        o.append(")");
        return o.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        parcel.writeString(this.r);
        parcel.writeString(this.s);
        parcel.writeString(this.t.name());
        parcel.writeString(this.u);
    }

    public SimpleLegacyProject(String str, String str2, ProjectState projectState, String str3) {
        k.g(str, "name");
        k.g(str2, "id");
        k.g(projectState, "state");
        this.r = str;
        this.s = str2;
        this.t = projectState;
        this.u = str3;
    }
}
