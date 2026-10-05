package l01;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.rudroid.copilot.h1;
import java.time.LocalDate;
import java.util.UUID;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d implements d0, Parcelable {
    public static final d u;
    public final String r;
    public final LocalDate s;
    public final String t;
    public static final b Companion = new b();
    public static final Parcelable.Creator<d> CREATOR = new c(0);

    static {
        String uuid = UUID.randomUUID().toString();
        k71.k.f(uuid, "toString(...)");
        u = new d(uuid, null, null);
    }

    public d(String str, LocalDate localDate, String str2) {
        k71.k.g(str, "id");
        this.r = str;
        this.s = localDate;
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
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return k71.k.b(this.r, dVar.r) && k71.k.b(this.s, dVar.s) && k71.k.b(this.t, dVar.t);
    }

    public final int hashCode() {
        int hashCode = this.r.hashCode() * 31;
        LocalDate localDate = this.s;
        int hashCode2 = (hashCode + (localDate == null ? 0 : localDate.hashCode())) * 31;
        String str = this.t;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FieldDateValue(id=");
        sb.append(this.r);
        sb.append(", date=");
        sb.append(this.s);
        sb.append(", fieldName=");
        return h1.p(sb, this.t, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k71.k.g(parcel, "dest");
        parcel.writeString(this.r);
        parcel.writeSerializable(this.s);
        parcel.writeString(this.t);
    }
}
