package l01;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.rudroid.copilot.h1;
import com.github.service.models.response.Avatar;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e0 implements Parcelable {
    public static final Parcelable.Creator<e0> CREATOR = new c(16);
    public String r;
    public String s;
    public Avatar t;
    public boolean u;

    public e0(String str, String str2, Avatar avatar, boolean z) {
        k71.k.g(str, "ownerLogin");
        k71.k.g(str2, "repositoryName");
        k71.k.g(avatar, "ownerAvatar");
        this.r = str;
        this.s = str2;
        this.t = avatar;
        this.u = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return k71.k.b(this.r, e0Var.r) && k71.k.b(this.s, e0Var.s) && k71.k.b(this.t, e0Var.t) && this.u == e0Var.u;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.u) + h1.j(this.t, h1.i(this.r.hashCode() * 31, this.s, 31), 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("ProjectRepository(ownerLogin=", this.r, ", repositoryName=", this.s, ", ownerAvatar=");
        o.append(this.t);
        o.append(", viewerCanManage=");
        o.append(this.u);
        o.append(")");
        return o.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k71.k.g(parcel, "dest");
        parcel.writeString(this.r);
        parcel.writeString(this.s);
        this.t.writeToParcel(parcel, i);
        parcel.writeInt(this.u ? 1 : 0);
    }
}
