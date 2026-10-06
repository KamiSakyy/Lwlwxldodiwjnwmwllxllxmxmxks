package l01;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.rudroid.copilot.h1;
import java.util.Map;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p0 implements Parcelable {
    public static final Parcelable.Creator<p0> CREATOR = new c(23);
    public final String r;
    public final String s;
    public final boolean t;
    public final e0 u;
    public final Map v;

    public p0(String str, String str2, boolean z, e0 e0Var, Map map) {
        k71.k.g(str, "id");
        k71.k.g(str2, "fullDatabaseId");
        k71.k.g(e0Var, "projectRepository");
        this.r = str;
        this.s = str2;
        this.t = z;
        this.u = e0Var;
        this.v = map;
    }

    public static p0 c(p0 p0Var, Map map) {
        String str = p0Var.r;
        String str2 = p0Var.s;
        boolean z = p0Var.t;
        e0 e0Var = p0Var.u;
        p0Var.getClass();
        k71.k.g(str, "id");
        k71.k.g(str2, "fullDatabaseId");
        k71.k.g(e0Var, "projectRepository");
        return new p0(str, str2, z, e0Var, map);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return k71.k.b(this.r, p0Var.r) && k71.k.b(this.s, p0Var.s) && this.t == p0Var.t && k71.k.b(this.u, p0Var.u) && k71.k.b(this.v, p0Var.v);
    }

    public final int hashCode() {
        return this.v.hashCode() + ((this.u.hashCode() + x.i.e(h1.i(this.r.hashCode() * 31, this.s, 31), 31, this.t)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("ProjectViewItem(id=", this.r, ", fullDatabaseId=", this.s, ", isArchived=");
        o.append(this.t);
        o.append(", projectRepository=");
        o.append(this.u);
        o.append(", fieldValues=");
        o.append(this.v);
        o.append(")");
        return o.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k71.k.g(parcel, "dest");
        parcel.writeString(this.r);
        parcel.writeString(this.s);
        parcel.writeInt(this.t ? 1 : 0);
        this.u.writeToParcel(parcel, i);
        Map map = this.v;
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            parcel.writeString(((y) entry.getKey()).r);
            parcel.writeParcelable((Parcelable) entry.getValue(), i);
        }
    }

    public /* synthetic */ p0(e0 e0Var) {
        this("", "", false, e0Var, x61.s.r);
    }
}
