package com.github.service.models.response;

import a0.s0;
import android.os.Parcel;
import android.os.Parcelable;
import com.github.rudroid.copilot.h1;
import g81.e;
import k71.k;
import k81.c1;
import kotlinx.serialization.KSerializer;
import x.i;
import yz0.h;

@e
/* loaded from: /home/user/work/p/classes4.dex */
public final class LegacyProjectWithNumber implements Parcelable {
    public SimpleLegacyProject r;
    public int s;
    public String t;
    public String u;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<LegacyProjectWithNumber> CREATOR = new h(21);

    public static final class Companion {
        public final KSerializer serializer() {
            return LegacyProjectWithNumber$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LegacyProjectWithNumber(int i, SimpleLegacyProject simpleLegacyProject, int i2, String str, String str2) {
        if (7 != (i & 7)) {
            c1.l(i, 7, LegacyProjectWithNumber$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.r = simpleLegacyProject;
        this.s = i2;
        this.t = str;
        if ((i & 8) == 0) {
            this.u = null;
        } else {
            this.u = str2;
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
        if (!(obj instanceof LegacyProjectWithNumber)) {
            return false;
        }
        LegacyProjectWithNumber legacyProjectWithNumber = (LegacyProjectWithNumber) obj;
        return k.b(this.r, legacyProjectWithNumber.r) && this.s == legacyProjectWithNumber.s && k.b(this.t, legacyProjectWithNumber.t) && k.b(this.u, legacyProjectWithNumber.u);
    }

    public final int hashCode() {
        int i = h1.i(s0.b(this.s, this.r.s.hashCode() * 31, 31), this.t, 31);
        String str = this.u;
        return i + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LegacyProjectWithNumber(simpleLegacyProject=");
        sb.append(this.r);
        sb.append(", number=");
        sb.append(this.s);
        sb.append(", owner=");
        return i.k(sb, this.t, ", repository=", this.u, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        this.r.writeToParcel(parcel, i);
        parcel.writeInt(this.s);
        parcel.writeString(this.t);
        parcel.writeString(this.u);
    }

    public LegacyProjectWithNumber(SimpleLegacyProject simpleLegacyProject, int i, String str, String str2) {
        k.g(simpleLegacyProject, "simpleLegacyProject");
        k.g(str, "owner");
        this.r = simpleLegacyProject;
        this.s = i;
        this.t = str;
        this.u = str2;
    }
}
