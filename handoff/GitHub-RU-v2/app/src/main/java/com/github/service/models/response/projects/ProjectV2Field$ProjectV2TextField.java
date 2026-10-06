package com.github.service.models.response.projects;

import a0.s0;
import android.os.Parcel;
import android.os.Parcelable;
import com.github.rudroid.copilot.h1;
import g81.e;
import k71.k;
import k81.c1;
import kotlinx.serialization.KSerializer;
import l01.c;
import l01.j0;
import sy.w;
import w61.h;
import w61.i;

@e
/* loaded from: /home/user/work/p/classes4.dex */
public final class ProjectV2Field$ProjectV2TextField implements j0 {
    public String r;
    public int s;
    public String t;
    public ProjectFieldType u;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<ProjectV2Field$ProjectV2TextField> CREATOR = new c(20);
    public static final h[] v = {null, null, null, w.s(i.r, new kh.a(6))};

    public static final class Companion {
        public final KSerializer serializer() {
            return ProjectV2Field$ProjectV2TextField$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ProjectV2Field$ProjectV2TextField(int i, String str, int i2, String str2, ProjectFieldType projectFieldType) {
        if (15 != (i & 15)) {
            c1.l(i, 15, ProjectV2Field$ProjectV2TextField$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.r = str;
        this.s = i2;
        this.t = str2;
        this.u = projectFieldType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProjectV2Field$ProjectV2TextField)) {
            return false;
        }
        ProjectV2Field$ProjectV2TextField projectV2Field$ProjectV2TextField = (ProjectV2Field$ProjectV2TextField) obj;
        return k.b(this.r, projectV2Field$ProjectV2TextField.r) && this.s == projectV2Field$ProjectV2TextField.s && k.b(this.t, projectV2Field$ProjectV2TextField.t) && this.u == projectV2Field$ProjectV2TextField.u;
    }

    @Override // l01.j0
    public final String getId() {
        return this.r;
    }

    @Override // l01.j0
    public final String getName() {
        return this.t;
    }

    public final int hashCode() {
        return this.u.hashCode() + h1.i(s0.b(this.s, this.r.hashCode() * 31, 31), this.t, 31);
    }

    @Override // l01.j0
    public final ProjectFieldType l() {
        return this.u;
    }

    public final String toString() {
        StringBuilder n = s0.n(this.s, "ProjectV2TextField(id=", this.r, ", databaseId=", ", name=");
        n.append(this.t);
        n.append(", dataType=");
        n.append(this.u);
        n.append(")");
        return n.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        parcel.writeString(this.r);
        parcel.writeInt(this.s);
        parcel.writeString(this.t);
        parcel.writeString(this.u.name());
    }

    public ProjectV2Field$ProjectV2TextField(String str, int i, String str2, ProjectFieldType projectFieldType) {
        k.g(str, "id");
        k.g(str2, "name");
        k.g(projectFieldType, "dataType");
        this.r = str;
        this.s = i;
        this.t = str2;
        this.u = projectFieldType;
    }
}
