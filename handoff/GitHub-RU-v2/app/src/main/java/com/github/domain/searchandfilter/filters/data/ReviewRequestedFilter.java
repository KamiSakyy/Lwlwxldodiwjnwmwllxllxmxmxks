package com.github.domain.searchandfilter.filters.data;

import android.os.Parcel;
import android.os.Parcelable;
import bm.l;
import bm.o;
import bm.p;
import com.github.rudroid.m0;
import java.util.List;
import k71.k;
import k81.c1;
import kotlinx.serialization.KSerializer;
import sy.w;

@g81.e
/* loaded from: /home/user/work/p/classes3.dex */
public final class ReviewRequestedFilter extends d {
    public boolean v;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<ReviewRequestedFilter> CREATOR = new o(17);
    public static final w61.h[] w = {w.s(w61.i.r, new p(16)), null, null};
    public static final u31.f x = new u31.f(2);

    public static final class Companion {
        public final KSerializer serializer() {
            return ReviewRequestedFilter$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ReviewRequestedFilter(int i, l lVar, String str, boolean z) {
        super(i, lVar, str);
        if (1 != (i & 1)) {
            c1.l(i, 1, ReviewRequestedFilter$$serializer.INSTANCE.getDescriptor());
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
        return (obj instanceof ReviewRequestedFilter) && this.v == ((ReviewRequestedFilter) obj).v;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.v);
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
        return this.v ? "review-requested:@me" : "";
    }

    public final String toString() {
        return m0.i("ReviewRequestedFilter(enabled=", ")", this.v);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        parcel.writeInt(this.v ? 1 : 0);
    }

    public ReviewRequestedFilter(boolean z) {
        super(l.D, "FILTER_REVIEW_REQUESTED");
        this.v = z;
    }
}
