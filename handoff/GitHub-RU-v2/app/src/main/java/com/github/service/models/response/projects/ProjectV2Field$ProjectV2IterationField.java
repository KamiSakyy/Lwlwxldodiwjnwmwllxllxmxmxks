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
public final class ProjectV2Field$ProjectV2IterationField implements j0 {
    public static final h[] y;
    public String r;
    public int s;
    public String t;
    public ProjectFieldType u;
    public List v;
    public List w;
    public int x;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<ProjectV2Field$ProjectV2IterationField> CREATOR = new c(18);

    public static final class Companion {
        public final KSerializer serializer() {
            return ProjectV2Field$ProjectV2IterationField$$serializer.INSTANCE;
        }
    }

    static {
        i iVar = i.r;
        y = new h[]{null, null, null, w.s(iVar, new kh.a(1)), w.s(iVar, new kh.a(2)), w.s(iVar, new kh.a(3)), null};
    }

    public /* synthetic */ ProjectV2Field$ProjectV2IterationField(int i, String str, int i2, String str2, ProjectFieldType projectFieldType, List list, List list2, int i3) {
        if (127 != (i & 127)) {
            c1Shadow.l(i, 127, ProjectV2Field$ProjectV2IterationField$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.r = str;
        this.s = i2;
        this.t = str2;
        this.u = projectFieldType;
        this.v = list;
        this.w = list2;
        this.x = i3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProjectV2Field$ProjectV2IterationField)) {
            return false;
        }
        ProjectV2Field$ProjectV2IterationField projectV2Field$ProjectV2IterationField = (ProjectV2Field$ProjectV2IterationField) obj;
        return k.b(this.r, projectV2Field$ProjectV2IterationField.r) && this.s == projectV2Field$ProjectV2IterationField.s && k.b(this.t, projectV2Field$ProjectV2IterationField.t) && this.u == projectV2Field$ProjectV2IterationField.u && k.b(this.v, projectV2Field$ProjectV2IterationField.v) && k.b(this.w, projectV2Field$ProjectV2IterationField.w) && this.x == projectV2Field$ProjectV2IterationField.x;
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
        return Integer.hashCode(this.x) + f1.e.c(this.w, f1.e.c(this.v, (this.u.hashCode() + h1.i(s0.b(this.s, this.r.hashCode() * 31, 31), this.t, 31)) * 31, 31), 31);
    }

    @Override // l01.j0
    public final ProjectFieldType l() {
        return this.u;
    }

    public final String toString() {
        StringBuilder n = s0.n(this.s, "ProjectV2IterationField(id=", this.r, ", databaseId=", ", name=");
        n.append(this.t);
        n.append(", dataType=");
        n.append(this.u);
        n.append(", completedIterations=");
        n.append(this.v);
        n.append(", availableIterations=");
        n.append(this.w);
        n.append(", durationInDays=");
        return s0.l(n, this.x, ")");
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
            ((ProjectFieldOption$Iteration) q.next()).writeToParcel(parcel, i);
        }
        Iterator q2 = f1.e.q(this.w, parcel);
        while (q2.hasNext()) {
            ((ProjectFieldOption$Iteration) q2.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.x);
    }

    public ProjectV2Field$ProjectV2IterationField(String str, int i, String str2, ProjectFieldType projectFieldType, ArrayList arrayList, ArrayList arrayList2, int i2) {
        k.g(str, "id");
        k.g(str2, "name");
        k.g(projectFieldType, "dataType");
        this.r = str;
        this.s = i;
        this.t = str2;
        this.u = projectFieldType;
        this.v = arrayList;
        this.w = arrayList2;
        this.x = i2;
    }
}
