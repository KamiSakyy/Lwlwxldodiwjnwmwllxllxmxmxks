package com.github.service.models.response.projects;

import a0.s0;
import android.os.Parcel;
import android.os.Parcelable;
import com.github.rudroid.copilot.h1;
import g81.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k71.k;
import k81.c1Shadow;
import kotlinx.serialization.KSerializer;
import l01.c;
import l01.j0;
import sy.w;
import w61.h;
import w61.i;

@e
/* loaded from: /home/user/work/p/classes4.dex */
public final class ProjectV2Field$ProjectV2SingleSelectField implements j0 {
    public static final h[] w;
    public String r;
    public int s;
    public String t;
    public ProjectFieldType u;
    public List v;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<ProjectV2Field$ProjectV2SingleSelectField> CREATOR = new c(19);

    public static final class Companion {
        public final KSerializer serializer() {
            return ProjectV2Field$ProjectV2SingleSelectField$$serializer.INSTANCE;
        }
    }

    static {
        i iVar = i.r;
        w = new h[]{null, null, null, w.s(iVar, new kh.a(4)), w.s(iVar, new kh.a(5))};
    }

    public /* synthetic */ ProjectV2Field$ProjectV2SingleSelectField(int i, String str, int i2, String str2, ProjectFieldType projectFieldType, List list) {
        if (31 != (i & 31)) {
            c1Shadow.l(i, 31, ProjectV2Field$ProjectV2SingleSelectField$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.r = str;
        this.s = i2;
        this.t = str2;
        this.u = projectFieldType;
        this.v = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProjectV2Field$ProjectV2SingleSelectField)) {
            return false;
        }
        ProjectV2Field$ProjectV2SingleSelectField projectV2Field$ProjectV2SingleSelectField = (ProjectV2Field$ProjectV2SingleSelectField) obj;
        return k.b(this.r, projectV2Field$ProjectV2SingleSelectField.r) && this.s == projectV2Field$ProjectV2SingleSelectField.s && k.b(this.t, projectV2Field$ProjectV2SingleSelectField.t) && this.u == projectV2Field$ProjectV2SingleSelectField.u && k.b(this.v, projectV2Field$ProjectV2SingleSelectField.v);
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
        return this.v.hashCode() + ((this.u.hashCode() + h1.i(s0.b(this.s, this.r.hashCode() * 31, 31), this.t, 31)) * 31);
    }

    @Override // l01.j0
    public final ProjectFieldType l() {
        return this.u;
    }

    public final String toString() {
        StringBuilder n = s0.n(this.s, "ProjectV2SingleSelectField(id=", this.r, ", databaseId=", ", name=");
        n.append(this.t);
        n.append(", dataType=");
        n.append(this.u);
        n.append(", singleOptions=");
        return x.i.l(n, this.v, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        parcel.writeString(this.r);
        parcel.writeInt(this.s);
        parcel.writeString(this.t);
        parcel.writeString(this.u.name());
        Iterator q = f1.e.q(this.v, parcel);
        while (q.hasNext()) {
            ((ProjectFieldOption$SingleOption) q.next()).writeToParcel(parcel, i);
        }
    }

    public ProjectV2Field$ProjectV2SingleSelectField(String str, int i, String str2, ProjectFieldType projectFieldType, ArrayList arrayList) {
        k.g(str, "id");
        k.g(str2, "name");
        k.g(projectFieldType, "dataType");
        this.r = str;
        this.s = i;
        this.t = str2;
        this.u = projectFieldType;
        this.v = arrayList;
    }
}
