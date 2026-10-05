package l01;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import jo.f4;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f implements d0, Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new c(2);
    public final String r;
    public final List s;

    public f(String str, List list) {
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
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return k71.k.b(this.r, fVar.r) && k71.k.b(this.s, fVar.s);
    }

    public final int hashCode() {
        return this.s.hashCode() + (this.r.hashCode() * 31);
    }

    public final String toString() {
        return f4.o("FieldLabelsValue(id=", this.r, ", labels=", ")", this.s);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k71.k.g(parcel, "dest");
        parcel.writeString(this.r);
        Iterator q = f1.e.q(this.s, parcel);
        while (q.hasNext()) {
            parcel.writeParcelable((Parcelable) q.next(), i);
        }
    }
}
