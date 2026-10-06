package com.github.domain.searchandfilter.filters.data;

import a0.c2;
import android.os.Parcel;
import android.os.Parcelable;
import bm.l;
import com.github.domain.searchandfilter.filters.data.assignee.NoAssignee;
import com.github.rudroid.m0;
import com.google.android.gms.internal.measurement.d5;
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
import w80.t;
import x61.m;
import x61.r;

@g81.e
/* loaded from: /home/user/work/p/classes3.dex */
public final class AssigneeFilter extends d {
    public static final w61.h[] w;
    public static final t x;
    public List v;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<AssigneeFilter> CREATOR = new a21.g(14);

    public static final class Companion {
        public final KSerializer serializer() {
            return AssigneeFilter$$serializer.INSTANCE;
        }
    }

    static {
        w61.i iVar = w61.i.r;
        w = new w61.h[]{w.s(iVar, new c2(17)), null, w.s(iVar, new c2(18))};
        x = new t(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AssigneeFilter(int i, l lVar, String str, List list) {
        super(i, lVar, str);
        if (1 != (i & 1)) {
            c1.l(i, 1, AssigneeFilter$$serializer.INSTANCE.getDescriptor());
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
        return (obj instanceof AssigneeFilter) && k.b(this.v, ((AssigneeFilter) obj).v);
    }

    public final int hashCode() {
        return this.v.hashCode();
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final d j(ArrayList arrayList, boolean z) {
        ArrayList arrayList2 = new ArrayList();
        s sVar = new s();
        m.n0(arrayList, new bm.b(sVar, arrayList2, 0));
        if (sVar.r) {
            NoAssignee.Companion.getClass();
            return new AssigneeFilter(d0.n(NoAssignee.y));
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        return new AssigneeFilter(arrayList2);
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final String o() {
        List list = this.v;
        k.g(list, "<this>");
        com.github.domain.database.serialization.a.Companion.getClass();
        n nVar = com.github.domain.database.serialization.a.b;
        ArrayList arrayList = new ArrayList(x61.n.F(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(d5.U((yz0.f) it.next()));
        }
        return nVar.b(new k81.d(b91.g.C(((l81.c) nVar).b, x.a(yz0.f.class)), 0), arrayList);
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final String r(List list) {
        k.g(list, "otherFilters");
        return m.c0(this.v, " ", (String) null, (String) null, 0, new bf.c(7), 30);
    }

    public final String toString() {
        return m0.h("AssigneeFilter(assignees=", ")", this.v);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        Iterator q = f1.e.q(this.v, parcel);
        while (q.hasNext()) {
            parcel.writeParcelable((Parcelable) q.next(), i);
        }
    }

    public /* synthetic */ AssigneeFilter() {
        this(r.r);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssigneeFilter(List list) {
        super(l.r, "FILTER_ASSIGNEE");
        k.g(list, "assignees");
        this.v = list;
    }
}
