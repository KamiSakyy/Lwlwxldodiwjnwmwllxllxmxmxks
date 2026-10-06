package com.github.domain.searchandfilter.filters.data;

import a0.c2;
import android.os.Parcel;
import android.os.Parcelable;
import bm.l;
import com.github.domain.discussions.data.DiscussionCategoryData;
import com.github.rudroid.m0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k71.k;
import k81.c1;
import kotlinx.serialization.KSerializer;
import sy.w;
import x61.m;
import x61.r;

@g81.e
/* loaded from: /home/user/work/p/classes3.dex */
public final class DiscussionCategoryFilter extends d {
    public static final w61.h[] w;
    public static final y60.b x;
    public final List v;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<DiscussionCategoryFilter> CREATOR = new a21.g(18);

    public static final class Companion {
        public final KSerializer serializer() {
            return DiscussionCategoryFilter$$serializer.INSTANCE;
        }
    }

    static {
        w61.i iVar = w61.i.r;
        w = new w61.h[]{w.s(iVar, new c2(23)), null, w.s(iVar, new c2(24))};
        x = new y60.b(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DiscussionCategoryFilter(int i, l lVar, String str, List list) {
        super(i, lVar, str);
        if (1 != (i & 1)) {
            c1.l(i, 1, DiscussionCategoryFilter$$serializer.INSTANCE.getDescriptor());
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
        return (obj instanceof DiscussionCategoryFilter) && k.b(this.v, ((DiscussionCategoryFilter) obj).v);
    }

    public final int hashCode() {
        return this.v.hashCode();
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final d j(ArrayList arrayList, boolean z) {
        ArrayList arrayList2 = new ArrayList();
        m.n0(arrayList, new bm.f(0, arrayList2));
        if (arrayList2.isEmpty()) {
            return null;
        }
        return new DiscussionCategoryFilter(arrayList2);
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final String o() {
        l81.b bVar = l81.c.d;
        bVar.getClass();
        return bVar.b(new k81.d(DiscussionCategoryData.Companion.serializer(), 0), this.v);
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final String r(List list) {
        k.g(list, "otherFilters");
        return m.c0(this.v, " ", (String) null, (String) null, 0, new bf.c(8), 30);
    }

    public final String toString() {
        return m0.h("DiscussionCategoryFilter(categories=", ")", this.v);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        Iterator q = f1.e.q(this.v, parcel);
        while (q.hasNext()) {
            ((DiscussionCategoryData) q.next()).writeToParcel(parcel, i);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiscussionCategoryFilter(List list) {
        super(l.L, "FILTER_DISCUSSION_CATEGORY");
        k.g(list, "categories");
        this.v = list;
    }
}
