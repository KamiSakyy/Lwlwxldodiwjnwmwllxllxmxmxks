package dm;

import android.os.Parcel;
import android.os.Parcelable;
import c21.c0;
import com.github.service.models.response.Avatar;
import k71.k;
import yz0.f;

/* loaded from: /home/user/work/p/classes3.dex */
public class b implements f {
    public static final Parcelable.Creator<b> CREATOR = new c0(18);
    public String r;
    public Avatar s;
    public String t;
    public String u;

    public b(String str) {
        k.g(str, "login");
        this.r = str;
        Avatar.Companion.getClass();
        this.s = Avatar.u;
        this.t = "";
        this.u = "";
    }

    public final String d() {
        return this.r;
    }

    public final int describeContents() {
        return 0;
    }

    public final Avatar e() {
        return this.s;
    }

    public final String getId() {
        return this.t;
    }

    public final String getName() {
        return this.u;
    }

    public final boolean q() {
        return false;
    }

    public final boolean s() {
        return false;
    }

    public final boolean u() {
        return false;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        parcel.writeString(this.r);
    }
}
