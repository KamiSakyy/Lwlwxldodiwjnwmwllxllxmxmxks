package com.github.domain.searchandfilter.filters.data;

import a0.c2;
import android.os.Parcel;
import android.os.Parcelable;
import bm.l;
import java.util.ArrayList;
import java.util.List;
import k71.k;
import k81.c1Shadow;
import k81.z;
import kotlinx.serialization.KSerializer;
import sy.w;
import w50.m;

@g81.e
/* loaded from: /home/user/work/p/classes3.dex */
public final class AgentTasksStateFilter extends d implements bm.a {
    public static final w61.h[] x;
    public static final cm.a y;
    public static final m z;
    public cm.a v;
    public List w;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<AgentTasksStateFilter> CREATOR = new a21.g(13);

    public static final class Companion {
        public final KSerializer serializer() {
            return AgentTasksStateFilter$$serializer.INSTANCE;
        }
    }

    static {
        w61.i iVar = w61.i.r;
        x = new w61.h[]{w.s(iVar, new c2(14)), null, w.s(iVar, new c2(15)), w.s(iVar, new c2(16))};
        y = cm.a.s;
        z = new m(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AgentTasksStateFilter(int i, l lVar, String str, cm.a aVar, List list) {
        super(i, lVar, str);
        if (1 != (i & 1)) {
            c1Shadow.l(i, 1, AgentTasksStateFilter$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i & 4) == 0) {
            this.v = y;
        } else {
            this.v = aVar;
        }
        if ((i & 8) == 0) {
            this.w = this.v.r;
        } else {
            this.w = list;
        }
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final boolean c() {
        return this.v != y;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AgentTasksStateFilter) && this.v == ((AgentTasksStateFilter) obj).v;
    }

    public final int hashCode() {
        return this.v.hashCode();
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final d j(ArrayList arrayList, boolean z2) {
        return null;
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final String o() {
        l81.b bVar = l81.c.d;
        bVar.getClass();
        return bVar.b(new z("com.github.domain.searchandfilter.filters.data.agent.AgentTaskStatus", cm.a.values()), this.v);
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final String r(List list) {
        k.g(list, "otherFilters");
        return "";
    }

    public final String toString() {
        return "AgentTasksStateFilter(filter=" + this.v + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        parcel.writeString(this.v.name());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AgentTasksStateFilter(cm.a aVar) {
        super(l.e0, "FILTER_AGENT_TASK_STATE_COMBINED");
        k.g(aVar, "filter");
        this.v = aVar;
        this.w = aVar.r;
    }
}
