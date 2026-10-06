package com.github.domain.searchandfilter.filters.data;

import android.os.Parcel;
import android.os.Parcelable;
import bm.l;
import com.github.service.models.response.Language;
import java.util.List;
import k71.k;
import k81.c1;
import kotlinx.serialization.KSerializer;
import sy.w;

@g81.e
/* loaded from: /home/user/work/p/classes3.dex */
public final class LanguageFilter extends d {
    public Language v;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<LanguageFilter> CREATOR = new a21.g(28);
    public static final w61.h[] w = {w.s(w61.i.r, new bm.i(12)), null, null};
    public static final c21.j x = new c21.j(2);

    public static final class Companion {
        public final KSerializer serializer() {
            return LanguageFilter$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LanguageFilter(int i, l lVar, String str, Language language) {
        super(i, lVar, str);
        if (1 != (i & 1)) {
            c1.l(i, 1, LanguageFilter$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i & 4) == 0) {
            this.v = null;
        } else {
            this.v = language;
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
        return (obj instanceof LanguageFilter) && k.b(this.v, ((LanguageFilter) obj).v);
    }

    public final int hashCode() {
        Language language = this.v;
        if (language == null) {
            return 0;
        }
        return language.hashCode();
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final String o() {
        Language language = this.v;
        if (language == null) {
            return null;
        }
        l81.b bVar = l81.c.d;
        bVar.getClass();
        return bVar.b(Language.Companion.serializer(), language);
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final String r(List list) {
        String str;
        k.g(list, "otherFilters");
        Language language = this.v;
        return (language == null || (str = language.r) == null) ? "" : str;
    }

    public final String toString() {
        return "LanguageFilter(language=" + this.v + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        parcel.writeParcelable(this.v, i);
    }

    public LanguageFilter(Language language) {
        super(l.U, "FILTER_LANGUAGE");
        this.v = language;
    }
}
