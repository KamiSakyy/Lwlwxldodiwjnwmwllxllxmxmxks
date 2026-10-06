package com.github.rudroid.repository.issuetypes;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.rudroid.fragments.g0;

/* loaded from: /home/user/work/p/classes.dex */
public final class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* renamed from: r, reason: collision with root package name */
    public g0 f19934r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f19935s;

    public static final class a implements Parcelable.Creator<d> {
        @Override // android.os.Parcelable.Creator
        public final d createFromParcel(Parcel parcel) {
            k71.k.g(parcel, "parcel");
            return new d(g0.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final d[] newArray(int i) {
            return new d[i];
        }
    }

    public d(g0 g0Var, boolean z10) {
        k71.k.g(g0Var, "bottomSheetDialogConfiguration");
        this.f19934r = g0Var;
        this.f19935s = z10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return k71.k.b(this.f19934r, dVar.f19934r) && this.f19935s == dVar.f19935s;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f19935s) + (this.f19934r.hashCode() * 31);
    }

    public final String toString() {
        return "RepositoryIssueTypesBottomSheetConfiguration(bottomSheetDialogConfiguration=" + this.f19934r + ", dismissOnItemSelect=" + this.f19935s + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k71.k.g(parcel, "dest");
        this.f19934r.writeToParcel(parcel, i);
        parcel.writeInt(this.f19935s ? 1 : 0);
    }
}
