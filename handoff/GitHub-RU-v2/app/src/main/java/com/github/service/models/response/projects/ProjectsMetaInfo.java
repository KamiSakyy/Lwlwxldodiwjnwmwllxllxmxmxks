package com.github.service.models.response.projects;

import a0.s0;
import android.os.Parcel;
import android.os.Parcelable;
import com.github.rudroid.copilot.h1;
import g81.e;
import java.util.Iterator;
import java.util.List;
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
public final class ProjectsMetaInfo implements Parcelable {
    public static final h[] w;
    public String r;
    public String s;
    public String t;
    public j0 u;
    public List v;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<ProjectsMetaInfo> CREATOR = new c(25);

    public static final class Companion {
        public final KSerializer serializer() {
            return ProjectsMetaInfo$$serializer.INSTANCE;
        }
    }

    static {
        i iVar = i.r;
        w = new h[]{null, null, null, w.s(iVar, new kh.a(8)), w.s(iVar, new kh.a(9))};
    }

    public /* synthetic */ ProjectsMetaInfo(int i, String str, String str2, String str3, j0 j0Var, List list) {
        if (31 != (i & 31)) {
            c1.l(i, 31, ProjectsMetaInfo$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.r = str;
        this.s = str2;
        this.t = str3;
        this.u = j0Var;
        this.v = list;
    }

    public static ProjectsMetaInfo c(ProjectsMetaInfo projectsMetaInfo, j0 j0Var) {
        String str = projectsMetaInfo.r;
        String str2 = projectsMetaInfo.s;
        String str3 = projectsMetaInfo.t;
        List list = projectsMetaInfo.v;
        k.g(str, "viewId");
        k.g(str2, "itemId");
        k.g(str3, "fullDatabaseId");
        k.g(list, "viewGroupedByFields");
        return new ProjectsMetaInfo(str, str2, str3, j0Var, list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProjectsMetaInfo)) {
            return false;
        }
        ProjectsMetaInfo projectsMetaInfo = (ProjectsMetaInfo) obj;
        return k.b(this.r, projectsMetaInfo.r) && k.b(this.s, projectsMetaInfo.s) && k.b(this.t, projectsMetaInfo.t) && k.b(this.u, projectsMetaInfo.u) && k.b(this.v, projectsMetaInfo.v);
    }

    public final ProjectsMetaInfo h() {
        Object obj;
        Iterator it = this.v.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((j0) obj).l() == ProjectFieldType.MILESTONE) {
                break;
            }
        }
        return c(this, (j0) obj);
    }

    public final int hashCode() {
        int i = h1.i(h1.i(this.r.hashCode() * 31, this.s, 31), this.t, 31);
        j0 j0Var = this.u;
        return this.v.hashCode() + ((i + (j0Var == null ? 0 : j0Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("ProjectsMetaInfo(viewId=", this.r, ", itemId=", this.s, ", fullDatabaseId=");
        o.append(this.t);
        o.append(", groupedByField=");
        o.append(this.u);
        o.append(", viewGroupedByFields=");
        return x.i.l(o, this.v, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        parcel.writeString(this.r);
        parcel.writeString(this.s);
        parcel.writeString(this.t);
        parcel.writeParcelable(this.u, i);
        Iterator q = f1.e.q(this.v, parcel);
        while (q.hasNext()) {
            parcel.writeParcelable((Parcelable) q.next(), i);
        }
    }

    public ProjectsMetaInfo(String str, String str2, String str3, j0 j0Var, List list) {
        k.g(str, "viewId");
        k.g(str2, "itemId");
        k.g(str3, "fullDatabaseId");
        k.g(list, "viewGroupedByFields");
        this.r = str;
        this.s = str2;
        this.t = str3;
        this.u = j0Var;
        this.v = list;
    }
}
