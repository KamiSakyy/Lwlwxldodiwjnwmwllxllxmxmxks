package uc;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.service.models.response.home.NavLinkIdentifier;
import k71.k;

/* loaded from: /home/user/work/p/classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: r, reason: collision with root package name */
    public final NavLinkIdentifier f32294r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f32295s;

    public static final class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            k.g(parcel, "parcel");
            return new b(NavLinkIdentifier.valueOf(parcel.readString()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i) {
            return new b[i];
        }
    }

    public b(NavLinkIdentifier navLinkIdentifier, boolean z10) {
        k.g(navLinkIdentifier, "navLinkIdentifier");
        this.f32294r = navLinkIdentifier;
        this.f32295s = z10;
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
        return this.f32294r == bVar.f32294r && this.f32295s == bVar.f32295s;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f32295s) + (this.f32294r.hashCode() * 31);
    }

    public final String toString() {
        return "ListItemMyWorkEntry(navLinkIdentifier=" + this.f32294r + ", isHidden=" + this.f32295s + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        parcel.writeString(this.f32294r.name());
        parcel.writeInt(this.f32295s ? 1 : 0);
    }
    public Object s = null;
}
