package com.github.domain.searchandfilter.filters.data;

import a0.c2;
import android.os.Parcel;
import android.os.Parcelable;
import bm.l;
import com.github.rudroid.m0;
import java.util.ArrayList;
import java.util.List;
import k71.k;
import k81.c1Shadow;
import kotlinx.serialization.KSerializer;
import sy.w;
import x61.m;
import z70.y1;

@g81.e
/* loaded from: /home/user/work/p/classes3.dex */
public final class DiscussionsIsUnansweredFilter extends d {
    public boolean v;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<DiscussionsIsUnansweredFilter> CREATOR = new a21.g(21);
    public static final w61.h[] w = {w.s(w61.i.r, new c2(29)), null, null};
    public static final y1 x = new y1(1);

    public static final class Companion {
        public final KSerializer serializer() {
            return DiscussionsIsUnansweredFilter$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DiscussionsIsUnansweredFilter(int i, l lVar, String str, boolean z) {
        super(i, lVar, str);
        if (1 != (i & 1)) {
            c1Shadow.l(i, 1, DiscussionsIsUnansweredFilter$$serializer.INSTANCE.getDescriptor());
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
        return (obj instanceof DiscussionsIsUnansweredFilter) && this.v == ((DiscussionsIsUnansweredFilter) obj).v;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.v);
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final d j(ArrayList arrayList, boolean z) {
        if (m.n0(arrayList, new bf.c(9))) {
            return new DiscussionsIsUnansweredFilter(true);
        }
        if (z) {
            return null;
        }
        return new DiscussionsIsUnansweredFilter(false);
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
        return this.v ? "is:unanswered" : "";
    }

    public final String toString() {
        return m0.i("DiscussionsIsUnansweredFilter(active=", ")", this.v);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        parcel.writeInt(this.v ? 1 : 0);
    }

    public DiscussionsIsUnansweredFilter(boolean z) {
        super(l.u, "FILTER_DISCUSSION_IS_UNANSWERED");
        this.v = z;
    }
}
