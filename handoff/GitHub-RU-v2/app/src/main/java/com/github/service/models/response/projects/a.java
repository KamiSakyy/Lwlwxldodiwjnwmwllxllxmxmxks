package com.github.service.models.response.projects;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.rudroid.copilot.h1;
import java.util.UUID;
import k71.k;
import l01.c;
import l01.d0;
import l01.e;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a implements d0, Parcelable {
    public static final a u;
    public final String r;
    public final ProjectFieldOption$Iteration s;
    public final String t;
    public static final e Companion = new e();
    public static final Parcelable.Creator<a> CREATOR = new c(1);

    static {
        String uuid = UUID.randomUUID().toString();
        k.f(uuid, "toString(...)");
        ProjectFieldOption$Iteration.Companion.getClass();
        u = new a(uuid, ProjectFieldOption$Iteration.w, null);
    }

    public a(String str, ProjectFieldOption$Iteration projectFieldOption$Iteration, String str2) {
        k.g(str, "id");
        k.g(projectFieldOption$Iteration, "iteration");
        this.r = str;
        this.s = projectFieldOption$Iteration;
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
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k.b(this.r, aVar.r) && k.b(this.s, aVar.s) && k.b(this.t, aVar.t);
    }

    public final int hashCode() {
        int hashCode = (this.s.hashCode() + (this.r.hashCode() * 31)) * 31;
        String str = this.t;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FieldIterationValue(id=");
        sb.append(this.r);
        sb.append(", iteration=");
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
    public Object z(Object p1) { return null; }
}
