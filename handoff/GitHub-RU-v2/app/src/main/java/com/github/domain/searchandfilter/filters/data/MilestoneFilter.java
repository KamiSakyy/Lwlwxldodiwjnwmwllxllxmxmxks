package com.github.domain.searchandfilter.filters.data;

import android.os.Parcel;
import android.os.Parcelable;
import bm.l;
import com.github.domain.database.serialization.SerializableMilestone;
import com.github.domain.searchandfilter.filters.data.milestone.NoMilestone;
import com.github.rudroid.m0;
import com.github.service.models.response.type.MilestoneState;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k71.k;
import k71.s;
import k71.x;
import k81.c1;
import kotlinx.serialization.KSerializer;
import l81.n;
import sy.d0;
import sy.w;
import x61.m;
import x61.r;
import yz0.v2;

@g81.e
/* loaded from: /home/user/work/p/classes3.dex */
public final class MilestoneFilter extends d {
    public static final w61.h[] w;
    public static final c30.d x;
    public final List v;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<MilestoneFilter> CREATOR = new a21.g(29);

    public static final class Companion {
        public final KSerializer serializer() {
            return MilestoneFilter$$serializer.INSTANCE;
        }
    }

    static {
        w61.i iVar = w61.i.r;
        w = new w61.h[]{w.s(iVar, new bm.i(13)), null, w.s(iVar, new bm.i(14))};
        x = new c30.d(2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MilestoneFilter(int i, l lVar, String str, List list) {
        super(i, lVar, str);
        if (1 != (i & 1)) {
            c1.l(i, 1, MilestoneFilter$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i & 4) == 0) {
            this.v = r.r;
        } else {
            this.v = list;
        }
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
        return (obj instanceof MilestoneFilter) && k.b(this.v, ((MilestoneFilter) obj).v);
    }

    public final int hashCode() {
        return this.v.hashCode();
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final d j(ArrayList arrayList, boolean z) {
        ArrayList arrayList2 = new ArrayList();
        s sVar = new s();
        m.n0(arrayList, new bm.b(sVar, arrayList2, 2));
        if (sVar.r) {
            NoMilestone.Companion.getClass();
            return new MilestoneFilter(d0.n(NoMilestone.w));
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        return new MilestoneFilter(arrayList2);
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final String o() {
        List<v2> list = this.v;
        k.g(list, "<this>");
        com.github.domain.database.serialization.d.Companion.getClass();
        n nVar = com.github.domain.database.serialization.d.b;
        ArrayList arrayList = new ArrayList(x61.n.F(list, 10));
        for (v2 v2Var : list) {
            if (!(v2Var instanceof NoMilestone)) {
                String id = v2Var.getId();
                String name = v2Var.getName();
                MilestoneState state = v2Var.getState();
                int v = v2Var.v();
                ZonedDateTime A = v2Var.A();
                v2Var = new SerializableMilestone(id, name, state, v, A != null ? A.toString() : null);
            }
            arrayList.add(v2Var);
        }
        return nVar.b(new k81.d(b91.g.C(((l81.c) nVar).b, x.a(v2.class)), 0), arrayList);
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final String r(List list) {
        k.g(list, "otherFilters");
        return m.c0(this.v, " ", (String) null, (String) null, 0, new bf.c(12), 30);
    }

    public final String toString() {
        return m0.h("MilestoneFilter(milestones=", ")", this.v);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        Iterator q = f1.e.q(this.v, parcel);
        while (q.hasNext()) {
            parcel.writeParcelable((Parcelable) q.next(), i);
        }
    }

    public /* synthetic */ MilestoneFilter() {
        this(r.r);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MilestoneFilter(List list) {
        super(l.y, "FILTER_MILESTONE");
        k.g(list, "milestones");
        this.v = list;
    }
}
