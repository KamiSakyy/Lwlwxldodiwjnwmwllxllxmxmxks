package ig;

import android.os.Parcel;
import android.os.Parcelable;
import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0024a();
    public wm.b r;
    public wm.b s;

    /* renamed from: ig.a$a, reason: collision with other inner class name */
    public static final class C0024a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            k.g(parcel, "parcel");
            return new a((wm.b) parcel.readParcelable(a.class.getClassLoader()), (wm.b) parcel.readParcelable(a.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i) {
            return new a[i];
        }
    }

    public a(wm.b bVar, wm.b bVar2) {
        k.g(bVar2, "output");
        this.r = bVar;
        this.s = bVar2;
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
        return k.b(this.r, aVar.r) && k.b(this.s, aVar.s);
    }

    public final int hashCode() {
        wm.b bVar = this.r;
        return this.s.hashCode() + ((bVar == null ? 0 : bVar.hashCode()) * 31);
    }

    public final String toString() {
        return "ConfigureShortcutResult(input=" + this.r + ", output=" + this.s + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        parcel.writeParcelable(this.r, i);
        parcel.writeParcelable(this.s, i);
    }
}
