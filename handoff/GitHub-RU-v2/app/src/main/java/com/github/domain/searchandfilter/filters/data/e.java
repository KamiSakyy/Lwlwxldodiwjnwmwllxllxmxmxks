package com.github.domain.searchandfilter.filters.data;

import android.os.Parcel;
import android.os.Parcelable;
import bm.l;
import bm.o;
import bm.q;
import com.github.rudroid.m0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k71.k;
import k71.x;
import k81.c1;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import l01.w0;
import x61.m;
import x61.r;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e extends d {
    public final List v;
    public static final q Companion = new q();
    public static final Parcelable.Creator<e> CREATOR = new o(9);
    public static final k50.c w = new k50.c(2);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(List list) {
        super(l.w, "FILTER_PROJECT_V2");
        k.g(list, "projects");
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
        return (obj instanceof e) && k.b(this.v, ((e) obj).v);
    }

    public final int hashCode() {
        return this.v.hashCode();
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final d j(ArrayList arrayList, boolean z) {
        ArrayList arrayList2 = new ArrayList();
        m.n0(arrayList, new bm.f(3, arrayList2));
        if (arrayList2.isEmpty()) {
            return null;
        }
        return new e(arrayList2);
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final String o() {
        l81.b bVar = l81.c.d;
        b21.l lVar = ((l81.c) bVar).b;
        k71.e a = x.a(w0.class);
        k.g(lVar, "module");
        KSerializer a2 = lVar.a(a, r.r);
        if (a2 != null) {
            return bVar.b(new k81.d(a2, 0), this.v);
        }
        throw new SerializationException(c1.k(a));
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final String r(List list) {
        k.g(list, "otherFilters");
        return m.c0(this.v, " ", (String) null, (String) null, 0, new bf.c(16), 30);
    }

    public final String toString() {
        return m0.h("ProjectV2Filter(projects=", ")", this.v);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        Iterator q = f1.e.q(this.v, parcel);
        while (q.hasNext()) {
            parcel.writeParcelable((Parcelable) q.next(), i);
        }
    }
    public Object z(Object p1, Object p2, Object p3) { return null; }
}
