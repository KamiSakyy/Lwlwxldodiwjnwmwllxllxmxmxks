package com.github.domain.searchandfilter.filters.data;

import android.os.Parcel;
import android.os.Parcelable;
import bm.l;
import bm.o;
import com.github.rudroid.m0;
import java.util.Iterator;
import java.util.List;
import k71.k;
import k81.c1Shadow;
import kotlinx.serialization.KSerializer;
import sy.w;
import x61.m;

@g81.e
/* loaded from: /home/user/work/p/classes3.dex */
public final class NotificationRepositoriesFilter extends d {
    public static final w61.h[] w;
    public static final e50.e x;
    public List v;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<NotificationRepositoriesFilter> CREATOR = new o(3);

    public static final class Companion {
        public final KSerializer serializer() {
            return NotificationRepositoriesFilter$$serializer.INSTANCE;
        }
    }

    static {
        w61.i iVar = w61.i.r;
        w = new w61.h[]{w.s(iVar, new bm.i(19)), null, w.s(iVar, new bm.i(20))};
        x = new e50.e(2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NotificationRepositoriesFilter(int i, l lVar, String str, List list) {
        super(i, lVar, str);
        if (5 != (i & 5)) {
            c1Shadow.l(i, 5, NotificationRepositoriesFilter$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.v = list;
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final boolean c() {
        return !this.v.isEmpty();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NotificationRepositoriesFilter) && k.b(this.v, ((NotificationRepositoriesFilter) obj).v);
    }

    public final int hashCode() {
        return this.v.hashCode();
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final String o() {
        l81.b bVar = l81.c.d;
        bVar.getClass();
        return bVar.b(new k81.d(com.github.domain.searchandfilter.filters.data.notification.a.Companion.serializer(), 0), this.v);
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final String r(List list) {
        k.g(list, "otherFilters");
        return m.c0(this.v, " ", (String) null, (String) null, 0, new bf.c(13), 30);
    }

    public final String toString() {
        return m0.h("NotificationRepositoriesFilter(filters=", ")", this.v);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        Iterator q = f1.e.q(this.v, parcel);
        while (q.hasNext()) {
            parcel.writeParcelable((Parcelable) q.next(), i);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationRepositoriesFilter(List list) {
        super(l.S, "FILTER_NOTIFICATION_REPOSITORY");
        k.g(list, "filters");
        this.v = list;
    }
}
