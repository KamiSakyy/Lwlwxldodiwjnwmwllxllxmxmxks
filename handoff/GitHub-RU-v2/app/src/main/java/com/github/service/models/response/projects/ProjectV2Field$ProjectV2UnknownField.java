package com.github.service.models.response.projects;

import a0.s0;
import android.os.Parcel;
import android.os.Parcelable;
import com.github.rudroid.copilot.h1;
import g81.e;
import k71.k;
import kotlinx.serialization.KSerializer;
import l01.c;
import l01.j0;
import sy.w;
import w61.h;
import w61.i;

@e
/* loaded from: /home/user/work/p/classes4.dex */
public final class ProjectV2Field$ProjectV2UnknownField implements j0 {
    public String r;
    public int s;
    public String t;
    public ProjectFieldType u;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<ProjectV2Field$ProjectV2UnknownField> CREATOR = new c(21);
    public static final h[] v = {null, null, null, w.s(i.r, new kh.a(7))};

    public static final class Companion {
        public final KSerializer serializer() {
            return ProjectV2Field$ProjectV2UnknownField$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ProjectV2Field$ProjectV2UnknownField(int i, String str, int i2, String str2, ProjectFieldType projectFieldType) {
        if ((i & 1) == 0) {
            this.r = "";
        } else {
            this.r = str;
        }
        if ((i & 2) == 0) {
            this.s = 0;
        } else {
            this.s = i2;
        }
        if ((i & 4) == 0) {
            this.t = "";
        } else {
            this.t = str2;
        }
        if ((i & 8) == 0) {
            this.u = ProjectFieldType.UNKNOWN;
        } else {
            this.u = projectFieldType;
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
        if (!(obj instanceof ProjectV2Field$ProjectV2UnknownField)) {
            return false;
        }
        ProjectV2Field$ProjectV2UnknownField projectV2Field$ProjectV2UnknownField = (ProjectV2Field$ProjectV2UnknownField) obj;
        return k.b(this.r, projectV2Field$ProjectV2UnknownField.r) && this.s == projectV2Field$ProjectV2UnknownField.s && k.b(this.t, projectV2Field$ProjectV2UnknownField.t) && this.u == projectV2Field$ProjectV2UnknownField.u;
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
        StringBuilder n = s0.n(this.s, "ProjectV2UnknownField(id=", this.r, ", databaseId=", ", name=");
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

    public ProjectV2Field$ProjectV2UnknownField(String str, int i, String str2, ProjectFieldType projectFieldType) {
        k.g(str, "id");
        k.g(str2, "name");
        k.g(projectFieldType, "dataType");
        this.r = str;
        this.s = i;
        this.t = str2;
        this.u = projectFieldType;
    }

    public /* synthetic */ ProjectV2Field$ProjectV2UnknownField() {
        this("", 0, "", ProjectFieldType.UNKNOWN);
    }
}
