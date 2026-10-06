package com.github.domain.searchandfilter.filters.data;

import a0Shadow.c2;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.lazy.layout.p1;
import bm.l;
import com.google.android.gms.internal.measurement.d5;
import java.util.ArrayList;
import java.util.List;
import k71.k;
import k71.xShadow;
import k81.c1Shadow;
import kotlinx.serialization.KSerializer;
import l81.n;
import sy.w;
import w80.a0Shadow;
import x61.m;

@g81.e
/* loaded from: /home/user/work/p/classes3.dex */
public final class AuthorFilter extends d {
    public static final w61.h[] w;
    public static final a0Shadow x;
    public yz0.f v;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<AuthorFilter> CREATOR = new a21.g(15);

    public static final class Companion {
        public final KSerializer serializer() {
            return AuthorFilter$$serializer.INSTANCE;
        }
    }

    static {
        w61.i iVar = w61.i.r;
        w = new w61.h[]{w.s(iVar, new c2(19)), null, w.s(iVar, new c2(20))};
        x = new a0Shadow(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AuthorFilter(int i, l lVar, String str, yz0.f fVar) {
        super(i, lVar, str);
        if (1 != (i & 1)) {
            c1Shadow.l(i, 1, AuthorFilter$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i & 4) == 0) {
            this.v = null;
        } else {
            this.v = fVar;
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
        return (obj instanceof AuthorFilter) && k.b(this.v, ((AuthorFilter) obj).v);
    }

    public final int hashCode() {
        yz0.f fVar = this.v;
        if (fVar == null) {
            return 0;
        }
        return fVar.hashCode();
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final d j(ArrayList arrayList, boolean z) {
        k71.w wVar = new k71.w();
        m.n0(arrayList, new p1(wVar, 1));
        yz0.f fVar = (yz0.f) wVar.r;
        if (fVar != null) {
            return new AuthorFilter(fVar);
        }
        return null;
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final String o() {
        yz0.f fVar = this.v;
        if (fVar == null) {
            return null;
        }
        com.github.domain.database.serialization.a.Companion.getClass();
        n nVar = com.github.domain.database.serialization.a.b;
        return nVar.b(b91.g.C(((l81.c) nVar).b, xShadow.a(yz0.f.class)), d5.U(fVar));
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final String r(List list) {
        k.g(list, "otherFilters");
        yz0.f fVar = this.v;
        if (fVar == null) {
            return "";
        }
        String g = fVar.s() ? "author:@copilot" : f1.e.g("author:", fVar.d());
        return g == null ? "" : g;
    }

    public final String toString() {
        return "AuthorFilter(author=" + this.v + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        parcel.writeParcelable(this.v, i);
    }

    public AuthorFilter(yz0.f fVar) {
        super(l.I, "FILTER_AUTHOR");
        this.v = fVar;
    }
}
