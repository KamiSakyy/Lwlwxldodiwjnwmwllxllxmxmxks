package com.github.service.models.response.projects;

import a0.s0;
import android.os.Parcel;
import android.os.Parcelable;
import g81.e;
import k71.k;
import k81.c1;
import kotlinx.serialization.KSerializer;
import l01.c;
import l01.z;

@e
/* loaded from: /home/user/work/p/classes4.dex */
public final class ProjectFieldOption$SingleOption implements z {
    public final String r;
    public final String s;
    public final String t;
    public final int u;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<ProjectFieldOption$SingleOption> CREATOR = new c(15);
    public static final ProjectFieldOption$SingleOption v = new ProjectFieldOption$SingleOption(0, "", "", "");

    public static final class Companion {
        public final KSerializer serializer() {
            return ProjectFieldOption$SingleOption$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ProjectFieldOption$SingleOption(int i, int i2, String str, String str2, String str3) {
        if (15 != (i & 15)) {
            c1.l(i, 15, ProjectFieldOption$SingleOption$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.r = str;
        this.s = str2;
        this.t = str3;
        this.u = i2;
    }

    @Override // l01.z
    public final String N() {
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
        if (!(obj instanceof ProjectFieldOption$SingleOption)) {
            return false;
        }
        ProjectFieldOption$SingleOption projectFieldOption$SingleOption = (ProjectFieldOption$SingleOption) obj;
        return k.b(this.r, projectFieldOption$SingleOption.r) && k.b(this.s, projectFieldOption$SingleOption.s) && k.b(this.t, projectFieldOption$SingleOption.t) && this.u == projectFieldOption$SingleOption.u;
    }

    @Override // l01.z
    public final String getId() {
        return this.r;
    }

    @Override // l01.z
    public final String getName() {
        return this.s;
    }

    @Override // l01.z
    public final Integer getPosition() {
        return Integer.valueOf(this.u);
    }

    public final int hashCode() {
        int hashCode = this.r.hashCode() * 31;
        String str = this.s;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.t;
        return Integer.hashCode(this.u) + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("SingleOption(id=", this.r, ", name=", this.s, ", nameHtml=");
        o.append(this.t);
        o.append(", position=");
        o.append(this.u);
        o.append(")");
        return o.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        parcel.writeString(this.r);
        parcel.writeString(this.s);
        parcel.writeString(this.t);
        parcel.writeInt(this.u);
    }

    public ProjectFieldOption$SingleOption(int i, String str, String str2, String str3) {
        k.g(str, "id");
        this.r = str;
        this.s = str2;
        this.t = str3;
        this.u = i;
    }
}
