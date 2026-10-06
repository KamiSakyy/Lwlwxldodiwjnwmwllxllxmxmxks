package z11;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import c21.u;
import java.util.Arrays;
import m7.y;
import xn.i0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b extends d21.a {
    public int r;
    public int s;
    public PendingIntent t;
    public String u;
    public Integer v;
    public static final b w = new b(0, null, null);
    public static final Parcelable.Creator<b> CREATOR = new i0(6);

    public b(int i, int i2, PendingIntent pendingIntent, String str, Integer num) {
        this.r = i;
        this.s = i2;
        this.t = pendingIntent;
        this.u = str;
        this.v = num;
    }

    public static String j(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    case 25:
                        return "API_INSTALL_REQUIRED";
                    default:
                        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 20);
                        sb.append("UNKNOWN_ERROR_CODE(");
                        sb.append(i);
                        sb.append(")");
                        return sb.toString();
                }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.s == bVar.s && u.j(this.t, bVar.t) && u.j(this.u, bVar.u) && u.j(this.v, bVar.v);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.s), this.t, this.u, this.v});
    }

    public final String toString() {
        b1.m mVar = new b1.m(this);
        mVar.a(j(this.s), "statusCode");
        mVar.a(this.t, "resolution");
        mVar.a(this.u, "message");
        mVar.a(this.v, "clientMethodKey");
        return mVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int Z = y.Z(parcel, 20293);
        y.Y(parcel, 1, 4);
        parcel.writeInt(this.r);
        y.Y(parcel, 2, 4);
        parcel.writeInt(this.s);
        y.U(parcel, 3, this.t, i);
        y.V(parcel, 4, this.u);
        Integer num = this.v;
        if (num != null) {
            y.Y(parcel, 5, 4);
            parcel.writeInt(num.intValue());
        }
        y.a0(parcel, Z);
    }

    public b(int i, PendingIntent pendingIntent, String str) {
        this(1, i, pendingIntent, str, null);
    }
}
