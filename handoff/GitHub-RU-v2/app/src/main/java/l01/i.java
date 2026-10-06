package l01;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.rudroid.copilot.h1;
import java.util.UUID;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i implements d0, Parcelable {
    public static final i u;
    public String r;
    public Double s;
    public String t;
    public static final h Companion = new h();
    public static final Parcelable.Creator<i> CREATOR = new c(4);

    static {
        String uuid = UUID.randomUUID().toString();
        k71.k.f(uuid, "toString(...)");
        u = new i(uuid, null, null);
    }

    public i(String str, Double d, String str2) {
        k71.k.g(str, "id");
        this.r = str;
        this.s = d;
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
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return k71.k.b(this.r, iVar.r) && k71.k.b(this.s, iVar.s) && k71.k.b(this.t, iVar.t);
    }

    public final int hashCode() {
        int hashCode = this.r.hashCode() * 31;
        Double d = this.s;
        int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        String str = this.t;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FieldNumberValue(id=");
        sb.append(this.r);
        sb.append(", number=");
        sb.append(this.s);
        sb.append(", fieldName=");
        return h1.p(sb, this.t, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k71.k.g(parcel, "dest");
        parcel.writeString(this.r);
        Double d = this.s;
        if (d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        }
        parcel.writeString(this.t);
    }
}
