package com.github.domain.searchandfilter.filters.data.notification;

import a0.s0;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.github.domain.searchandfilter.filters.data.StatusFilter$Done;
import com.github.domain.searchandfilter.filters.data.StatusFilter$Inbox;
import com.github.domain.searchandfilter.filters.data.StatusFilter$Saved;
import com.github.domain.searchandfilter.filters.data.i;
import com.github.rudroid.copilot.h1;
import f1.u5;
import g81.e;
import k71.k;
import k81.c1;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.serialization.KSerializer;
import sy.w;
import w61.h;

@e
/* loaded from: /home/user/work/p/classes3.dex */
public final class StatusNotificationFilter extends a {
    public static final StatusNotificationFilter x;
    public static final StatusNotificationFilter y;
    public static final StatusNotificationFilter z;
    public final String s;
    public final String t;
    public final i u;
    public final int v;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<StatusNotificationFilter> CREATOR = new f8.a(27);
    public static final h[] w = {null, null, w.s(w61.i.r, new u5(19)), null};

    public static final class Companion {
        public final KSerializer serializer() {
            return StatusNotificationFilter$$serializer.INSTANCE;
        }
    }

    static {
        i.Companion.getClass();
        StatusFilter$Inbox statusFilter$Inbox = i.w;
        x = new StatusNotificationFilter(statusFilter$Inbox.v, "", statusFilter$Inbox, -1);
        StatusFilter$Saved statusFilter$Saved = StatusFilter$Saved.INSTANCE;
        y = new StatusNotificationFilter(statusFilter$Saved.v, "is:saved", statusFilter$Saved, -1);
        StatusFilter$Done statusFilter$Done = StatusFilter$Done.INSTANCE;
        z = new StatusNotificationFilter(statusFilter$Done.v, "is:done", statusFilter$Done, -1);
    }

    public /* synthetic */ StatusNotificationFilter(int i, String str, String str2, i iVar, int i2) {
        if (15 != (i & 15)) {
            c1.l(i, 15, StatusNotificationFilter$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.s = str;
        this.t = str2;
        this.u = iVar;
        this.v = i2;
    }

    @Override // com.github.domain.searchandfilter.filters.data.notification.a
    public final String c() {
        return this.t;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StatusNotificationFilter)) {
            return false;
        }
        StatusNotificationFilter statusNotificationFilter = (StatusNotificationFilter) obj;
        return k.b(this.s, statusNotificationFilter.s) && k.b(this.t, statusNotificationFilter.t) && k.b(this.u, statusNotificationFilter.u) && this.v == statusNotificationFilter.v;
    }

    @Override // com.github.domain.searchandfilter.filters.data.notification.a
    public final String getId() {
        return this.s;
    }

    public final String h(Context context) {
        int i;
        i iVar = this.u;
        k.g(iVar, "<this>");
        if (iVar.equals(StatusFilter$Inbox.INSTANCE)) {
            i = 2131953387;
        } else if (iVar.equals(StatusFilter$Saved.INSTANCE)) {
            i = 2131953388;
        } else {
            if (!iVar.equals(StatusFilter$Done.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            i = 2131953385;
        }
        String string = context.getString(i);
        k.f(string, "getString(...)");
        return string;
    }

    public final int hashCode() {
        return Integer.hashCode(this.v) + ((this.u.hashCode() + h1.i(this.s.hashCode() * 31, this.t, 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("StatusNotificationFilter(id=", this.s, ", queryString=", this.t, ", status=");
        o.append(this.u);
        o.append(", unreadCount=");
        o.append(this.v);
        o.append(")");
        return o.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        parcel.writeString(this.s);
        parcel.writeString(this.t);
        parcel.writeParcelable(this.u, i);
        parcel.writeInt(this.v);
    }

    public StatusNotificationFilter(String str, String str2, i iVar, int i) {
        k.g(str, "id");
        k.g(str2, "queryString");
        k.g(iVar, "status");
        this.s = str;
        this.t = str2;
        this.u = iVar;
        this.v = i;
    }
}
