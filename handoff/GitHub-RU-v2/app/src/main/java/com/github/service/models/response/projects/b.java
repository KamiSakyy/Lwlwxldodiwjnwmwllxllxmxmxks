package com.github.service.models.response.projects;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.rudroid.copilot.h1;
import java.util.UUID;
import k71.k;
import l01.c;
import l01.d0;
import l01.m;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b implements d0, Parcelable {
    public static final b u;
    public final String r;
    public final ProjectFieldOption$SingleOption s;
    public final String t;
    public static final m Companion = new m();
    public static final Parcelable.Creator<b> CREATOR = new c(8);

    static {
        String uuid = UUID.randomUUID().toString();
        k.f(uuid, "toString(...)");
        ProjectFieldOption$SingleOption.Companion.getClass();
        u = new b(uuid, ProjectFieldOption$SingleOption.v, null);
    }

    public b(String str, ProjectFieldOption$SingleOption projectFieldOption$SingleOption, String str2) {
        k.g(str, "id");
        k.g(projectFieldOption$SingleOption, "option");
        this.r = str;
        this.s = projectFieldOption$SingleOption;
        this.t = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return k.b(this.r, bVar.r) && k.b(this.s, bVar.s) && k.b(this.t, bVar.t);
    }

    public final int hashCode() {
        int hashCode = (this.s.hashCode() + (this.r.hashCode() * 31)) * 31;
        String str = this.t;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FieldSingleOptionValue(id=");
        sb.append(this.r);
        sb.append(", option=");
        sb.append(this.s);
        sb.append(", fieldName=");
        return h1.p(sb, this.t, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        parcel.writeString(this.r);
        this.s.writeToParcel(parcel, i);
        parcel.writeString(this.t);
    }
}
