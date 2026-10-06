package com.github.domain.searchandfilter.filters.data;

import android.os.Parcel;
import android.os.Parcelable;
import bm.l;
import bm.o;
import bm.p;
import com.github.service.models.response.SpokenLanguage;
import java.util.List;
import k71.k;
import k81.c1Shadow;
import kotlinx.serialization.KSerializer;
import sy.w;
import w80.a0Shadow;

@g81.e
/* loaded from: /home/user/work/p/classes3.dex */
public final class SpokenLanguageFilter extends d {
    public SpokenLanguage v;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<SpokenLanguageFilter> CREATOR = new o(21);
    public static final w61.h[] w = {w.s(w61.i.r, new p(22)), null, null};
    public static final a0Shadow x = new a0Shadow(2);

    public static final class Companion {
        public final KSerializer serializer() {
            return SpokenLanguageFilter$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SpokenLanguageFilter(int i, l lVar, String str, SpokenLanguage spokenLanguage) {
        super(i, lVar, str);
        if (1 != (i & 1)) {
            c1Shadow.l(i, 1, SpokenLanguageFilter$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i & 4) == 0) {
            this.v = null;
        } else {
            this.v = spokenLanguage;
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
        return (obj instanceof SpokenLanguageFilter) && k.b(this.v, ((SpokenLanguageFilter) obj).v);
    }

    public final int hashCode() {
        SpokenLanguage spokenLanguage = this.v;
        if (spokenLanguage == null) {
            return 0;
        }
        return spokenLanguage.hashCode();
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final String o() {
        SpokenLanguage spokenLanguage = this.v;
        if (spokenLanguage == null) {
            return null;
        }
        l81.b bVar = l81.c.d;
        bVar.getClass();
        return bVar.b(SpokenLanguage.Companion.serializer(), spokenLanguage);
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final String r(List list) {
        String str;
        k.g(list, "otherFilters");
        SpokenLanguage spokenLanguage = this.v;
        return (spokenLanguage == null || (str = spokenLanguage.s) == null) ? "" : str;
    }

    public final String toString() {
        return "SpokenLanguageFilter(spokenLanguage=" + this.v + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        parcel.writeParcelable(this.v, i);
    }

    public SpokenLanguageFilter(SpokenLanguage spokenLanguage) {
        super(l.V, "FILTER_SPOKEN_LANGUAGE");
        this.v = spokenLanguage;
    }
}
