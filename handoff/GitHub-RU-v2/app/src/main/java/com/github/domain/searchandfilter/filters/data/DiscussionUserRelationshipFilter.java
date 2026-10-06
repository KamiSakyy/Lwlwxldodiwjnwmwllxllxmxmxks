package com.github.domain.searchandfilter.filters.data;

import a0.c2;
import android.os.Parcel;
import android.os.Parcelable;
import bm.l;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import k71.k;
import k81.c1;
import k81.z;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.serialization.KSerializer;
import sy.w;
import x61.m;
import x61.x;

@g81.e
/* loaded from: /home/user/work/p/classes3.dex */
public final class DiscussionUserRelationshipFilter extends d {
    public static final w61.h[] w;
    public static final bm.h x;
    public static final b y;
    public bm.h v;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<DiscussionUserRelationshipFilter> CREATOR = new a21.g(20);

    public static final class Companion {
        public final KSerializer serializer() {
            return DiscussionUserRelationshipFilter$$serializer.INSTANCE;
        }
    }

    static {
        w61.i iVar = w61.i.r;
        w = new w61.h[]{w.s(iVar, new c2(27)), null, w.s(iVar, new c2(28))};
        x = bm.h.r;
        y = new b();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DiscussionUserRelationshipFilter(int i, l lVar, String str, bm.h hVar) {
        super(i, lVar, str);
        if (1 != (i & 1)) {
            c1.l(i, 1, DiscussionUserRelationshipFilter$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i & 4) == 0) {
            this.v = x;
        } else {
            this.v = hVar;
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
        return (obj instanceof DiscussionUserRelationshipFilter) && this.v == ((DiscussionUserRelationshipFilter) obj).v;
    }

    public final int hashCode() {
        return this.v.hashCode();
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final d j(ArrayList arrayList, boolean z) {
        String str;
        bm.h[] values = bm.h.values();
        int s = x.s(values.length);
        if (s < 16) {
            s = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(s);
        for (bm.h hVar : values) {
            int ordinal = hVar.ordinal();
            if (ordinal == 0) {
                str = "author:@me";
            } else {
                if (ordinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "commenter:@me";
            }
            linkedHashMap.put(str, hVar);
        }
        k71.w wVar = new k71.w();
        m.n0(arrayList, new bm.g(linkedHashMap, wVar, 1));
        bm.h hVar2 = (bm.h) wVar.r;
        if (hVar2 != null) {
            return new DiscussionUserRelationshipFilter(hVar2);
        }
        return null;
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final String o() {
        l81.b bVar = l81.c.d;
        bVar.getClass();
        return bVar.b(new z("com.github.domain.searchandfilter.filters.data.DiscussionUserRelationshipFilter.Value", bm.h.values()), this.v);
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final String r(List list) {
        k.g(list, "otherFilters");
        int ordinal = this.v.ordinal();
        if (ordinal == 0) {
            return "author:@me";
        }
        if (ordinal == 1) {
            return "commenter:@me";
        }
        throw new NoWhenBranchMatchedException();
    }

    public final String toString() {
        return "DiscussionUserRelationshipFilter(filter=" + this.v + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        parcel.writeString(this.v.name());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiscussionUserRelationshipFilter(bm.h hVar) {
        super(l.M, "FILTER_DISCUSSION_USER_RELATIONSHIP");
        k.g(hVar, "filter");
        this.v = hVar;
    }
}
