package com.github.rudroid.projects.triagesheet;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes.dex */
public final class m implements d, Parcelable {
    public static final Parcelable.Creator<m> CREATOR = new a();

    /* renamed from: r, reason: collision with root package name */
    public l01.s f18054r;

    /* renamed from: s, reason: collision with root package name */
    public String f18055s;

    /* renamed from: t, reason: collision with root package name */
    public String f18056t;

    /* renamed from: u, reason: collision with root package name */
    public ZonedDateTime f18057u;

    /* renamed from: v, reason: collision with root package name */
    public String f18058v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f18059w;

    public static final class a implements Parcelable.Creator<m> {
        @Override // android.os.Parcelable.Creator
        public final m createFromParcel(Parcel parcel) {
            k71.k.g(parcel, "parcel");
            return new m(parcel.readParcelable(m.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final m[] newArray(int i) {
            return new m[i];
        }
    }

    public m(l01.s sVar) {
        k71.k.g(sVar, "projectItem");
        this.f18054r = sVar;
        l01.t0 t0Var = sVar.s;
        this.f18055s = t0Var.s;
        this.f18056t = t0Var.r;
        this.f18057u = t0Var.t;
        this.f18058v = t0Var.u;
        this.f18059w = t0Var.v;
    }

    @Override // com.github.rudroid.projects.triagesheet.d
    public final String c() {
        return this.f18055s;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && k71.k.b(this.f18054r, ((m) obj).f18054r);
    }

    @Override // com.github.rudroid.projects.triagesheet.d
    public final String getDescription() {
        return this.f18058v;
    }

    @Override // com.github.rudroid.projects.triagesheet.d
    public final String h() {
        return this.f18056t;
    }

    public final int hashCode() {
        return this.f18054r.hashCode();
    }

    @Override // com.github.rudroid.projects.triagesheet.d
    public final ZonedDateTime j() {
        return this.f18057u;
    }

    @Override // com.github.rudroid.projects.triagesheet.d
    public final boolean o() {
        return this.f18059w;
    }

    public final String toString() {
        return "SelectedProjectPickerItem(projectItem=" + this.f18054r + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k71.k.g(parcel, "dest");
        parcel.writeParcelable(this.f18054r, i);
    }
}
