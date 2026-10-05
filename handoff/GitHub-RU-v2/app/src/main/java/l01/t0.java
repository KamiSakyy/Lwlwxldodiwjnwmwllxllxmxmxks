package l01;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.ZonedDateTime;
import java.util.Map;

/* loaded from: /home/user/work/p/classes4.dex */
public final class t0 implements Parcelable {
    public static final Parcelable.Creator<t0> CREATOR = new c(24);
    public final boolean A;
    public final String r;
    public final String s;
    public final ZonedDateTime t;
    public final String u;
    public final boolean v;
    public final Object w;
    public final boolean x;
    public final int y;
    public final String z;

    public t0(String str, String str2, ZonedDateTime zonedDateTime, String str3, boolean z, Map map, boolean z2, int i, String str4, boolean z3) {
        k71.k.g(str, "id");
        k71.k.g(str2, "title");
        k71.k.g(zonedDateTime, "updatedAt");
        k71.k.g(str4, "url");
        this.r = str;
        this.s = str2;
        this.t = zonedDateTime;
        this.u = str3;
        this.v = z;
        this.w = map;
        this.x = z2;
        this.y = i;
        this.z = str4;
        this.A = z3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.Map] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k71.k.g(parcel, "dest");
        parcel.writeString(this.r);
        parcel.writeString(this.s);
        parcel.writeSerializable(this.t);
        parcel.writeString(this.u);
        parcel.writeInt(this.v ? 1 : 0);
        ?? r0 = this.w;
        parcel.writeInt(r0.size());
        for (Map.Entry entry : r0.entrySet()) {
            parcel.writeString(((y) entry.getKey()).r);
            parcel.writeParcelable((Parcelable) entry.getValue(), i);
        }
        parcel.writeInt(this.x ? 1 : 0);
        parcel.writeInt(this.y);
        parcel.writeString(this.z);
        parcel.writeInt(this.A ? 1 : 0);
    }
}
