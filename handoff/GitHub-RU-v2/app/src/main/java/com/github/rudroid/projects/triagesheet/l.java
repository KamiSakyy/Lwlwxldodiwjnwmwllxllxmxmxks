package com.github.rudroid.projects.triagesheet;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes.dex */
public final class l implements d, Parcelable {
    public static final Parcelable.Creator<l> CREATOR = new a();

    /* renamed from: r, reason: collision with root package name */
    public final l01.w0 f18044r;

    /* renamed from: s, reason: collision with root package name */
    public final String f18045s;

    /* renamed from: t, reason: collision with root package name */
    public final String f18046t;

    /* renamed from: u, reason: collision with root package name */
    public final ZonedDateTime f18047u;

    /* renamed from: v, reason: collision with root package name */
    public final String f18048v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f18049w;

    public static final class a implements Parcelable.Creator<l> {
        @Override // android.os.Parcelable.Creator
        public final l createFromParcel(Parcel parcel) {
            k71.k.g(parcel, "parcel");
            return new l(parcel.readParcelable(l.class.getClassLoader()), parcel.readString(), parcel.readString(), (ZonedDateTime) parcel.readSerializable(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final l[] newArray(int i) {
            return new l[i];
        }
    }

    public l(l01.w0 w0Var, String str, String str2, ZonedDateTime zonedDateTime, String str3, boolean z10) {
        k71.k.g(w0Var, "simpleProject");
        k71.k.g(str2, "projectId");
        k71.k.g(zonedDateTime, "projectUpdatedAt");
        this.f18044r = w0Var;
        this.f18045s = str;
        this.f18046t = str2;
        this.f18047u = zonedDateTime;
        this.f18048v = str3;
        this.f18049w = z10;
    }

    @Override // com.github.rudroid.projects.triagesheet.d
    public final String c() {
        return this.f18045s;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return k71.k.b(this.f18044r, lVar.f18044r) && k71.k.b(this.f18045s, lVar.f18045s) && k71.k.b(this.f18046t, lVar.f18046t) && k71.k.b(this.f18047u, lVar.f18047u) && k71.k.b(this.f18048v, lVar.f18048v) && this.f18049w == lVar.f18049w;
    }

    @Override // com.github.rudroid.projects.triagesheet.d
    public final String getDescription() {
        return this.f18048v;
    }

    @Override // com.github.rudroid.projects.triagesheet.d
    public final String h() {
        return this.f18046t;
    }

    public final int hashCode() {
        int hashCode = this.f18044r.hashCode() * 31;
        String str = this.f18045s;
        int a10 = com.github.rudroid.m0.a(this.f18047u, com.github.rudroid.copilot.h1.i((hashCode + (str == null ? 0 : str.hashCode())) * 31, this.f18046t, 31), 31);
        String str2 = this.f18048v;
        return Boolean.hashCode(this.f18049w) + ((a10 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // com.github.rudroid.projects.triagesheet.d
    public final ZonedDateTime j() {
        return this.f18047u;
    }

    @Override // com.github.rudroid.projects.triagesheet.d
    public final boolean o() {
        return this.f18049w;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectableProjectPickerItem(simpleProject=");
        sb2.append(this.f18044r);
        sb2.append(", projectTitle=");
        sb2.append(this.f18045s);
        sb2.append(", projectId=");
        com.github.rudroid.copilot.h1.A(this.f18046t, ", projectUpdatedAt=", ", description=", sb2, this.f18047u);
        return com.github.rudroid.m0.k(sb2, this.f18048v, ", isPublic=", this.f18049w, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k71.k.g(parcel, "dest");
        parcel.writeParcelable(this.f18044r, i);
        parcel.writeString(this.f18045s);
        parcel.writeString(this.f18046t);
        parcel.writeSerializable(this.f18047u);
        parcel.writeString(this.f18048v);
        parcel.writeInt(this.f18049w ? 1 : 0);
    }
}
