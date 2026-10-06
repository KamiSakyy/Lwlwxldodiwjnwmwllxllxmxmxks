package l01;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.rudroid.copilot.h1;
import java.util.UUID;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o implements d0 {
    public static final o u;
    public final String r;
    public final String s;
    public final String t;
    public static final n Companion = new n();
    public static final Parcelable.Creator<o> CREATOR = new c(9);

    static {
        String uuid = UUID.randomUUID().toString();
        k71.k.f(uuid, "toString(...)");
        u = new o(uuid, null, null);
    }

    public o(String str, String str2, String str3) {
        k71.k.g(str, "id");
        this.r = str;
        this.s = str2;
        this.t = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return k71.k.b(this.r, oVar.r) && k71.k.b(this.s, oVar.s) && k71.k.b(this.t, oVar.t);
    }

    public final int hashCode() {
        int hashCode = this.r.hashCode() * 31;
        String str = this.s;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.t;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return h1.p(a0.s0.o("FieldTextValue(id=", this.r, ", text=", this.s, ", fieldName="), this.t, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k71.k.g(parcel, "dest");
        parcel.writeString(this.r);
        parcel.writeString(this.s);
        parcel.writeString(this.t);
    }
}
