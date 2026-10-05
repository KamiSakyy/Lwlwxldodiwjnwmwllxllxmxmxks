package com.github.domain.searchandfilter.filters.data;

import android.os.Parcel;
import android.os.Parcelable;
import bm.l;
import bm.o;
import c30.o0;
import com.github.domain.searchandfilter.filters.data.notification.StatusNotificationFilter;
import java.util.List;
import k71.k;
import k81.c1;
import kotlinx.serialization.KSerializer;
import sy.w;

@g81.e
/* loaded from: /home/user/work/p/classes3.dex */
public final class NotificationFilterFilter extends d {
    public static final w61.h[] w;
    public static final o0 x;
    public final com.github.domain.searchandfilter.filters.data.notification.a v;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<NotificationFilterFilter> CREATOR = new o(0);

    public static final class Companion {
        public final KSerializer serializer() {
            return NotificationFilterFilter$$serializer.INSTANCE;
        }
    }

    static {
        w61.i iVar = w61.i.r;
        w = new w61.h[]{w.s(iVar, new bm.i(15)), null, w.s(iVar, new bm.i(16))};
        x = new o0(2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NotificationFilterFilter(int i, l lVar, String str, com.github.domain.searchandfilter.filters.data.notification.a aVar) {
        super(i, lVar, str);
        if (5 != (i & 5)) {
            c1.l(i, 5, NotificationFilterFilter$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.v = aVar;
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final boolean c() {
        com.github.domain.searchandfilter.filters.data.notification.a aVar = this.v;
        return !((aVar instanceof StatusNotificationFilter) && k.b(((StatusNotificationFilter) aVar).u, StatusFilter$Inbox.INSTANCE));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NotificationFilterFilter) && k.b(this.v, ((NotificationFilterFilter) obj).v);
    }

    public final int hashCode() {
        return this.v.hashCode();
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final String o() {
        l81.b bVar = l81.c.d;
        bVar.getClass();
        return bVar.b(com.github.domain.searchandfilter.filters.data.notification.a.Companion.serializer(), this.v);
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final String r(List list) {
        k.g(list, "otherFilters");
        return this.v.c();
    }

    public final String toString() {
        return "NotificationFilterFilter(filter=" + this.v + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        parcel.writeParcelable(this.v, i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationFilterFilter(com.github.domain.searchandfilter.filters.data.notification.a aVar) {
        super(l.R, "FILTER_NOTIFICATION_FILTER");
        k.g(aVar, "filter");
        this.v = aVar;
    }
}
