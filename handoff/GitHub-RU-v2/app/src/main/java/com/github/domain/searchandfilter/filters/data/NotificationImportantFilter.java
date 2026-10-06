package com.github.domain.searchandfilter.filters.data;

import android.os.Parcel;
import android.os.Parcelable;
import bm.l;
import bm.o;
import c30.s0;
import java.util.List;
import k71.k;
import k81.c1;
import kotlinx.serialization.KSerializer;
import sy.w;

@g81.e
/* loaded from: /home/user/work/p/classes3.dex */
public final class NotificationImportantFilter extends d {
    public final boolean v;
    public final boolean w;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<NotificationImportantFilter> CREATOR = new o(1);
    public static final w61.h[] x = {w.s(w61.i.r, new bm.i(17)), null, null, null};
    public static final s0 y = new s0(2);

    public static final class Companion {
        public final KSerializer serializer() {
            return NotificationImportantFilter$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NotificationImportantFilter(int i, l lVar, String str, boolean z, boolean z2) {
        super(i, lVar, str);
        if (1 != (i & 1)) {
            c1.l(i, 1, NotificationImportantFilter$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i & 4) == 0) {
            this.v = false;
        } else {
            this.v = z;
        }
        if ((i & 8) == 0) {
            this.w = false;
        } else {
            this.w = z2;
        }
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final boolean c() {
        return this.v;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationImportantFilter)) {
            return false;
        }
        NotificationImportantFilter notificationImportantFilter = (NotificationImportantFilter) obj;
        return this.v == notificationImportantFilter.v && this.w == notificationImportantFilter.w;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.w) + (Boolean.hashCode(this.v) * 31);
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final String o() {
        l81.b bVar = l81.c.d;
        Boolean valueOf = Boolean.valueOf(this.v);
        bVar.getClass();
        return bVar.b(k81.g.a, valueOf);
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final String r(List list) {
        k.g(list, "otherFilters");
        return this.v ? "view:client_apps_important" : "";
    }

    public final String toString() {
        return "NotificationImportantFilter(active=" + this.v + ", isNew=" + this.w + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        parcel.writeInt(this.v ? 1 : 0);
        parcel.writeInt(this.w ? 1 : 0);
    }

    public /* synthetic */ NotificationImportantFilter(int i, boolean z, boolean z2) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
    }

    public NotificationImportantFilter(boolean z, boolean z2) {
        super(l.Q, "FILTER_NOTIFICATION_IS_IMPORTANT");
        this.v = z;
        this.w = z2;
    }
}
