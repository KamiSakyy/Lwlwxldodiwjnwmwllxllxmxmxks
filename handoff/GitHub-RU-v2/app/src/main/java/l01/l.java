package l01;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l implements d0, Parcelable {
    public static final Parcelable.Creator<l> CREATOR = new c(7);
    public String r;
    public Object s;

    public l(String str, List list) {
        k71.k.g(str, "id");
        this.r = str;
        this.s = list;
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
        return k71.k.b(this.r, lVar.r) && this.s.equals(lVar.s);
    }

    public final int hashCode() {
        return this.s.hashCode() + (this.r.hashCode() * 31);
    }

    public final String toString() {
        return "FieldReviewersValue(id=" + this.r + ", reviewers=" + this.s + ")";
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k71.k.g(parcel, "dest");
        parcel.writeString(this.r);
        java.util.List r0 = (java.util.List) (this.s);
        parcel.writeInt(r0.size());
        Iterator it = r0.iterator();
        while (it.hasNext()) {
            ((f0) it.next()).writeToParcel(parcel, i);
        }
    }
}
