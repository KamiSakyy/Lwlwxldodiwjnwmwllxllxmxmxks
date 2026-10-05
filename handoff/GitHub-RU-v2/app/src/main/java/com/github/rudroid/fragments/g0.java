package com.github.rudroid.fragments;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /home/user/work/p/classes.dex */
public final class g0 implements Parcelable {

    /* renamed from: r, reason: collision with root package name */
    public final boolean f13907r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f13908s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f13909t;
    public static final a Companion = new a();
    public static final Parcelable.Creator<g0> CREATOR = new b();

    /* renamed from: u, reason: collision with root package name */
    public static final g0 f13904u = new g0(false, false, false);

    /* renamed from: v, reason: collision with root package name */
    public static final g0 f13905v = new g0(true, true, false);

    /* renamed from: w, reason: collision with root package name */
    public static final g0 f13906w = new g0(false, true, false);

    public static final class a {
    }

    public static final class b implements Parcelable.Creator<g0> {
        @Override // android.os.Parcelable.Creator
        public final g0 createFromParcel(Parcel parcel) {
            k71.k.g(parcel, "parcel");
            return new g0(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final g0[] newArray(int i) {
            return new g0[i];
        }
    }

    public g0(boolean z10, boolean z11, boolean z12) {
        this.f13907r = z10;
        this.f13908s = z11;
        this.f13909t = z12;
    }

    public static g0 c(g0 g0Var) {
        return new g0(g0Var.f13907r, g0Var.f13908s, true);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return this.f13907r == g0Var.f13907r && this.f13908s == g0Var.f13908s && this.f13909t == g0Var.f13909t;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f13909t) + x.i.e(Boolean.hashCode(this.f13907r) * 31, 31, this.f13908s);
    }

    public final String toString() {
        return jo.f4.s(com.github.rudroid.copilot.h1.u("BottomSheetDialogConfiguration(fullscreen=", this.f13907r, ", ensureExpanded=", this.f13908s, ", showDimOverlay="), this.f13909t, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k71.k.g(parcel, "dest");
        parcel.writeInt(this.f13907r ? 1 : 0);
        parcel.writeInt(this.f13908s ? 1 : 0);
        parcel.writeInt(this.f13909t ? 1 : 0);
    }
}
