package com.google.android.gms.common.api;

import a21.g;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import b1.m;
import c21.u;
import com.google.android.gms.common.internal.ReflectedParcelable;
import d21.a;
import java.util.Arrays;
import m7.y;
import z11.b;

/* loaded from: /home/user/work/p/classes4.dex */
public final class Status extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR = new g(1);
    public int r;
    public String s;
    public PendingIntent t;
    public b u;

    public Status(int i, String str, PendingIntent pendingIntent, b bVar) {
        this.r = i;
        this.s = str;
        this.t = pendingIntent;
        this.u = bVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.r == status.r && u.j(this.s, status.s) && u.j(this.t, status.t) && u.j(this.u, status.u);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.r), this.s, this.t, this.u});
    }

    public final String toString() {
        m mVar = new m(this);
        String str = this.s;
        if (str == null) {
            int i = this.r;
            switch (i) {
                case -1:
                    str = "SUCCESS_CACHE";
                    break;
                case 0:
                    str = "SUCCESS";
                    break;
                case 1:
                case 9:
                case 11:
                case 12:
                default:
                    StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 21);
                    sb.append("unknown status code: ");
                    sb.append(i);
                    str = sb.toString();
                    break;
                case 2:
                    str = "SERVICE_VERSION_UPDATE_REQUIRED";
                    break;
                case 3:
                    str = "SERVICE_DISABLED";
                    break;
                case 4:
                    str = "SIGN_IN_REQUIRED";
                    break;
                case 5:
                    str = "INVALID_ACCOUNT";
                    break;
                case 6:
                    str = "RESOLUTION_REQUIRED";
                    break;
                case 7:
                    str = "NETWORK_ERROR";
                    break;
                case 8:
                    str = "INTERNAL_ERROR";
                    break;
                case 10:
                    str = "DEVELOPER_ERROR";
                    break;
                case 13:
                    str = "ERROR";
                    break;
                case 14:
                    str = "INTERRUPTED";
                    break;
                case 15:
                    str = "TIMEOUT";
                    break;
                case 16:
                    str = "CANCELED";
                    break;
                case 17:
                    str = "API_NOT_CONNECTED";
                    break;
                case 18:
                    str = "DEAD_CLIENT";
                    break;
                case 19:
                    str = "REMOTE_EXCEPTION";
                    break;
                case 20:
                    str = "CONNECTION_SUSPENDED_DURING_CALL";
                    break;
                case 21:
                    str = "RECONNECTION_TIMED_OUT_DURING_UPDATE";
                    break;
                case 22:
                    str = "RECONNECTION_TIMED_OUT";
                    break;
            }
        }
        mVar.a(str, "statusCode");
        mVar.a(this.t, "resolution");
        return mVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int Z = y.Z(parcel, 20293);
        y.Y(parcel, 1, 4);
        parcel.writeInt(this.r);
        y.V(parcel, 2, this.s);
        y.U(parcel, 3, this.t, i);
        y.U(parcel, 4, this.u, i);
        y.a0(parcel, Z);
    }
}
