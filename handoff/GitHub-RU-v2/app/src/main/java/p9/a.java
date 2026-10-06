package p9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import k71.k;
import l7.c0;
import x61.s;

/* loaded from: /home/user/work/p/classes.dex */
public final class a implements Parcelable {

    @Deprecated
    public static final Parcelable.Creator<a> CREATOR = new c0(6);

    /* renamed from: r, reason: collision with root package name */
    public String f30440r;

    /* renamed from: s, reason: collision with root package name */
    public Map f30441s;

    public a(String str, Map map) {
        this.f30440r = str;
        this.f30441s = map;
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
        return k.b(this.f30440r, aVar.f30440r) && k.b(this.f30441s, aVar.f30441s);
    }

    public final int hashCode() {
        return this.f30441s.hashCode() + (this.f30440r.hashCode() * 31);
    }

    public final String toString() {
        return "Key(key=" + this.f30440r + ", extras=" + this.f30441s + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f30440r);
        Map map = this.f30441s;
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            parcel.writeString(str);
            parcel.writeString(str2);
        }
    }

    public /* synthetic */ a(String str) {
        this(str, s.r);
    }
}
