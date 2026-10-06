package com.github.domain.searchandfilter.filters.data;

import android.os.Parcel;
import android.os.Parcelable;
import bm.l;
import bm.o;
import com.github.rudroid.m0;
import java.util.List;
import k71.k;
import k81.c1;
import kotlinx.serialization.KSerializer;
import sy.w;

@g81.e
/* loaded from: /home/user/work/p/classes3.dex */
public final class NotificationIsUnreadFilter extends d {
    public final boolean v;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<NotificationIsUnreadFilter> CREATOR = new o(2);
    public static final w61.h[] w = {w.s(w61.i.r, new bm.i(18)), null, null};
    public static final d9.e x = new d9.e(2);

    public static final class Companion {
        public final KSerializer serializer() {
            return NotificationIsUnreadFilter$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NotificationIsUnreadFilter(int i, l lVar, String str, boolean z) {
        super(i, lVar, str);
        if (1 != (i & 1)) {
            c1.l(i, 1, NotificationIsUnreadFilter$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i & 4) == 0) {
            this.v = false;
        } else {
            this.v = z;
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
        return (obj instanceof NotificationIsUnreadFilter) && this.v == ((NotificationIsUnreadFilter) obj).v;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.v);
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
        return this.v ? "is:unread" : "";
    }

    public final String toString() {
        return m0.i("NotificationIsUnreadFilter(active=", ")", this.v);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        parcel.writeInt(this.v ? 1 : 0);
    }

    public NotificationIsUnreadFilter(boolean z) {
        super(l.P, "FILTER_NOTIFICATION_IS_UNREAD");
        this.v = z;
    }
}
