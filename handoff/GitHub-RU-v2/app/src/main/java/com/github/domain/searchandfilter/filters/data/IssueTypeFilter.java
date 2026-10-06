package com.github.domain.searchandfilter.filters.data;

import android.os.Parcel;
import android.os.Parcelable;
import bm.l;
import com.github.service.models.response.issueorpullrequest.IssueType;
import java.util.List;
import k71.k;
import k81.c1;
import kotlinx.serialization.KSerializer;
import sy.w;
import z70.j3;

@g81.e
/* loaded from: /home/user/work/p/classes3.dex */
public final class IssueTypeFilter extends d {
    public final IssueType v;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<IssueTypeFilter> CREATOR = new a21.g(25);
    public static final w61.h[] w = {w.s(w61.i.r, new bm.i(7)), null, null};
    public static final j3 x = new j3(1);

    public static final class Companion {
        public final KSerializer serializer() {
            return IssueTypeFilter$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ IssueTypeFilter(int i, l lVar, String str, IssueType issueType) {
        super(i, lVar, str);
        if (1 != (i & 1)) {
            c1.l(i, 1, IssueTypeFilter$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i & 4) == 0) {
            this.v = null;
        } else {
            this.v = issueType;
        }
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final boolean c() {
        return this.v != null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof IssueTypeFilter) && k.b(this.v, ((IssueTypeFilter) obj).v);
    }

    public final int hashCode() {
        IssueType issueType = this.v;
        if (issueType == null) {
            return 0;
        }
        return issueType.hashCode();
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final String o() {
        IssueType issueType = this.v;
        if (issueType == null) {
            return null;
        }
        l81.b bVar = l81.c.d;
        bVar.getClass();
        return bVar.b(IssueType.Companion.serializer(), issueType);
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final String r(List list) {
        k.g(list, "otherFilters");
        IssueType issueType = this.v;
        String g = issueType != null ? f1.e.g("type:", issueType.s) : null;
        return g == null ? "" : g;
    }

    public final String toString() {
        return "IssueTypeFilter(issueType=" + this.v + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        parcel.writeParcelable(this.v, i);
    }

    public IssueTypeFilter(IssueType issueType) {
        super(l.B, "FILTER_ISSUE_TYPE");
        this.v = issueType;
    }
}
