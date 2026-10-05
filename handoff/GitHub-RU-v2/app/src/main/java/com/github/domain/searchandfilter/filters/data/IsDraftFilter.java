package com.github.domain.searchandfilter.filters.data;

import android.os.Parcel;
import android.os.Parcelable;
import bm.l;
import bm.t;
import com.github.rudroid.m0;
import java.util.ArrayList;
import java.util.List;
import k71.k;
import k81.c1;
import kotlinx.serialization.KSerializer;
import sy.w;
import x61.m;
import z70.m2;

@g81.e
/* loaded from: /home/user/work/p/classes3.dex */
public final class IsDraftFilter extends d {
    public final boolean v;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<IsDraftFilter> CREATOR = new a21.g(23);
    public static final w61.h[] w = {w.s(w61.i.r, new bm.i(4)), null, null};
    public static final m2 x = new m2(1);

    public static final class Companion {
        public final KSerializer serializer() {
            return IsDraftFilter$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ IsDraftFilter(int i, l lVar, String str, boolean z) {
        super(i, lVar, str);
        if (1 != (i & 1)) {
            c1.l(i, 1, IsDraftFilter$$serializer.INSTANCE.getDescriptor());
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
        return (obj instanceof IsDraftFilter) && this.v == ((IsDraftFilter) obj).v;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.v);
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final d j(ArrayList arrayList, boolean z) {
        boolean z2;
        boolean z3;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                t tVar = (t) obj;
                if (k.b(tVar.a, "is:draft") || k.b(tVar.a, "draft:true")) {
                    z2 = true;
                    break;
                }
            }
        }
        z2 = false;
        if (!arrayList.isEmpty()) {
            int size2 = arrayList.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList.get(i2);
                i2++;
                t tVar2 = (t) obj2;
                if (k.b(tVar2.a, "-is:draft") || k.b(tVar2.a, "draft:false")) {
                    z3 = true;
                    break;
                }
            }
        }
        z3 = false;
        m.n0(arrayList, new bf.c(10));
        if (z2) {
            return new IsDraftFilter(true);
        }
        if (!z3 && z) {
            return null;
        }
        return new IsDraftFilter(false);
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
        return this.v ? "is:draft" : "";
    }

    public final String toString() {
        return m0.i("IsDraftFilter(enabled=", ")", this.v);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        parcel.writeInt(this.v ? 1 : 0);
    }

    public IsDraftFilter(boolean z) {
        super(l.d0, "FILTER_IS_DRAFT");
        this.v = z;
    }
}
