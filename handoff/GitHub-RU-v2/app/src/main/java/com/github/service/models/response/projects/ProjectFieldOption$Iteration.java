package com.github.service.models.response.projects;

import a0.s0;
import android.os.Parcel;
import android.os.Parcelable;
import com.github.rudroid.copilot.h1;
import g81.e;
import java.time.LocalDate;
import k71.k;
import k81.c1;
import kotlinx.serialization.KSerializer;
import l01.c;
import l01.z;

@e
/* loaded from: /home/user/work/p/classes4.dex */
public final class ProjectFieldOption$Iteration implements z {
    public static final ProjectFieldOption$Iteration w;
    public String r;
    public String s;
    public String t;
    public int u;
    public LocalDate v;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<ProjectFieldOption$Iteration> CREATOR = new c(14);

    public static final class Companion {
        public final KSerializer serializer() {
            return ProjectFieldOption$Iteration$$serializer.INSTANCE;
        }
    }

    static {
        LocalDate localDate = LocalDate.MIN;
        k.f(localDate, "MIN");
        w = new ProjectFieldOption$Iteration("", "", "", 0, localDate);
    }

    public /* synthetic */ ProjectFieldOption$Iteration(int i, String str, String str2, String str3, int i2, LocalDate localDate) {
        if (31 != (i & 31)) {
            c1.l(i, 31, ProjectFieldOption$Iteration$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.r = str;
        this.s = str2;
        this.t = str3;
        this.u = i2;
        this.v = localDate;
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
        if (!(obj instanceof ProjectFieldOption$Iteration)) {
            return false;
        }
        ProjectFieldOption$Iteration projectFieldOption$Iteration = (ProjectFieldOption$Iteration) obj;
        return k.b(this.r, projectFieldOption$Iteration.r) && k.b(this.s, projectFieldOption$Iteration.s) && k.b(this.t, projectFieldOption$Iteration.t) && this.u == projectFieldOption$Iteration.u && k.b(this.v, projectFieldOption$Iteration.v);
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
        return null;
    }

    public final int hashCode() {
        return this.v.hashCode() + s0.b(this.u, h1.i(h1.i(this.r.hashCode() * 31, this.s, 31), this.t, 31), 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("Iteration(id=", this.r, ", name=", this.s, ", nameHtml=");
        s0.w(this.u, this.t, ", durationInDays=", ", startDate=", o);
        o.append(this.v);
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
        parcel.writeSerializable(this.v);
    }

    public ProjectFieldOption$Iteration(String str, String str2, String str3, int i, LocalDate localDate) {
        k.g(str, "id");
        k.g(str2, "name");
        k.g(str3, "nameHtml");
        k.g(localDate, "startDate");
        this.r = str;
        this.s = str2;
        this.t = str3;
        this.u = i;
        this.v = localDate;
    }
}
