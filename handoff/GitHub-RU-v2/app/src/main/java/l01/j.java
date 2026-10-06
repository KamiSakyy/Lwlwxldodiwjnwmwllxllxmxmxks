package l01;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import yz0.n2;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j implements d0, Parcelable {
    public static final Parcelable.Creator<j> CREATOR = new c(5);
    public String r;
    public Object s;

    public j(String str, List list) {
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
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return k71.k.b(this.r, jVar.r) && this.s.equals(jVar.s);
    }

    public final int hashCode() {
        return this.s.hashCode() + (this.r.hashCode() * 31);
    }

    public final String toString() {
        return "FieldPullRequestsValue(id=" + this.r + ", pullRequests=" + this.s + ")";
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
            ((n2) it.next()).writeToParcel(parcel, i);
        }
    }
}
