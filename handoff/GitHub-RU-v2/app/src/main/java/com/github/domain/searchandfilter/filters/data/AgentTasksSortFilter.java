package com.github.domain.searchandfilter.filters.data;

import a0.c2;
import android.os.Parcel;
import android.os.Parcelable;
import bm.l;
import java.util.List;
import k71.k;
import k81.c1Shadow;
import kotlinx.serialization.KSerializer;
import sy.w;

@g81.e
/* loaded from: /home/user/work/p/classes3.dex */
public final class AgentTasksSortFilter extends d {
    public static final w61.h[] w;
    public static final on.g x;
    public static final a y;
    public on.g v;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<AgentTasksSortFilter> CREATOR = new a21.g(12);

    public static final class Companion {
        public final KSerializer serializer() {
            return AgentTasksSortFilter$$serializer.INSTANCE;
        }
    }

    static {
        w61.i iVar = w61.i.r;
        w = new w61.h[]{w.s(iVar, new c2(12)), null, w.s(iVar, new c2(13))};
        x = on.g.s;
        y = new a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AgentTasksSortFilter(int i, l lVar, String str, on.g gVar) {
        super(i, lVar, str);
        if (1 != (i & 1)) {
            c1Shadow.l(i, 1, AgentTasksSortFilter$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i & 4) == 0) {
            this.v = x;
        } else {
            this.v = gVar;
        }
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final boolean c() {
        return this.v != x;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AgentTasksSortFilter) && this.v == ((AgentTasksSortFilter) obj).v;
    }

    public final int hashCode() {
        return this.v.hashCode();
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final String o() {
        l81.b bVar = l81.c.d;
        bVar.getClass();
        return bVar.b(on.g.Companion.serializer(), this.v);
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final String r(List list) {
        k.g(list, "otherFilters");
        return "";
    }

    public final String toString() {
        return "AgentTasksSortFilter(order=" + this.v + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        parcel.writeString(this.v.name());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AgentTasksSortFilter(on.g gVar) {
        super(l.f0, "FILTER_AGENT_TASK_SORT");
        k.g(gVar, "order");
        this.v = gVar;
    }
}
