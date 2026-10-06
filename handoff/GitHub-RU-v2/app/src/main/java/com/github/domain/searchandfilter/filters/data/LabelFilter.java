package com.github.domain.searchandfilter.filters.data;

import android.os.Parcel;
import android.os.Parcelable;
import bm.l;
import com.github.domain.database.serialization.SerializableLabel;
import com.github.domain.searchandfilter.filters.data.label.NoLabel;
import com.github.rudroid.m0;
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
import yz0.k2;
import z70.x3;

@g81.e
/* loaded from: /home/user/work/p/classes3.dex */
public final class LabelFilter extends d {
    public static final w61.h[] w;
    public static final x3 x;
    public final List v;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<LabelFilter> CREATOR = new a21.g(27);

    public static final class Companion {
        public final KSerializer serializer() {
            return LabelFilter$$serializer.INSTANCE;
        }
    }

    static {
        w61.i iVar = w61.i.r;
        w = new w61.h[]{w.s(iVar, new bm.i(10)), null, w.s(iVar, new bm.i(11))};
        x = new x3(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LabelFilter(int i, l lVar, String str, List list) {
        super(i, lVar, str);
        if (1 != (i & 1)) {
            c1.l(i, 1, LabelFilter$$serializer.INSTANCE.getDescriptor());
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
        return (obj instanceof LabelFilter) && k.b(this.v, ((LabelFilter) obj).v);
    }

    public final int hashCode() {
        return this.v.hashCode();
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final d j(ArrayList arrayList, boolean z) {
        ArrayList arrayList2 = new ArrayList();
        s sVar = new s();
        m.n0(arrayList, new bm.b(sVar, arrayList2, 1));
        if (sVar.r) {
            NoLabel.Companion.getClass();
            return new LabelFilter(d0.n(NoLabel.v));
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        return new LabelFilter(arrayList2);
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final String o() {
        List<k2> list = this.v;
        k.g(list, "<this>");
        com.github.domain.database.serialization.c.Companion.getClass();
        n nVar = com.github.domain.database.serialization.c.b;
        ArrayList arrayList = new ArrayList(x61.n.F(list, 10));
        for (k2 k2Var : list) {
            if (!(k2Var instanceof NoLabel)) {
                k2Var = new SerializableLabel(k2Var.f(), k2Var.getName(), k2Var.getId(), k2Var.J());
            }
            arrayList.add(k2Var);
        }
        return nVar.b(new k81.d(b91.g.C(((l81.c) nVar).b, x.a(k2.class)), 0), arrayList);
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final String r(List list) {
        k.g(list, "otherFilters");
        return m.c0(this.v, " ", (String) null, (String) null, 0, new bf.c(11), 30);
    }

    public final String toString() {
        return m0.h("LabelFilter(labels=", ")", this.v);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        Iterator q = f1.e.q(this.v, parcel);
        while (q.hasNext()) {
            parcel.writeParcelable((Parcelable) q.next(), i);
        }
    }

    public /* synthetic */ LabelFilter() {
        this(r.r);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LabelFilter(List list) {
        super(l.x, "FILTER_LABEL");
        k.g(list, "labels");
        this.v = list;
    }
}
