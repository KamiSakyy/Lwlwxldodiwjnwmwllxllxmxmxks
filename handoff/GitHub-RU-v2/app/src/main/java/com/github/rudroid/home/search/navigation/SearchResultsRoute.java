package com.github.rudroid.home.search.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.rudroid.copilot.h1;
import g81.e;
import hz.k;
import k81.c1;
import kotlinx.serialization.KSerializer;
import sy.w;
import w61.h;
import w61.i;

@e
/* loaded from: /home/user/work/p/classes.dex */
public final class SearchResultsRoute implements Parcelable {

    /* renamed from: r, reason: collision with root package name */
    public final SearchViewModelType f15055r;

    /* renamed from: s, reason: collision with root package name */
    public final String f15056s;

    /* renamed from: t, reason: collision with root package name */
    public final String f15057t;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<SearchResultsRoute> CREATOR = new a();

    /* renamed from: u, reason: collision with root package name */
    public static final h[] f15054u = {w.s(i.r, new k(29)), null, null};

    public static final class Companion {
        public final KSerializer serializer() {
            return SearchResultsRoute$$serializer.INSTANCE;
        }
    }

    public static final class a implements Parcelable.Creator<SearchResultsRoute> {
        @Override // android.os.Parcelable.Creator
        public final SearchResultsRoute createFromParcel(Parcel parcel) {
            k71.k.g(parcel, "parcel");
            return new SearchResultsRoute(SearchViewModelType.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SearchResultsRoute[] newArray(int i) {
            return new SearchResultsRoute[i];
        }
    }

    public /* synthetic */ SearchResultsRoute(int i, SearchViewModelType searchViewModelType, String str, String str2) {
        if (7 != (i & 7)) {
            c1.l(i, 7, SearchResultsRoute$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f15055r = searchViewModelType;
        this.f15056s = str;
        this.f15057t = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchResultsRoute)) {
            return false;
        }
        SearchResultsRoute searchResultsRoute = (SearchResultsRoute) obj;
        return this.f15055r == searchResultsRoute.f15055r && k71.k.b(this.f15056s, searchResultsRoute.f15056s) && k71.k.b(this.f15057t, searchResultsRoute.f15057t);
    }

    public final int hashCode() {
        return this.f15057t.hashCode() + h1.i(this.f15055r.hashCode() * 31, this.f15056s, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SearchResultsRoute(viewModelType=");
        sb2.append(this.f15055r);
        sb2.append(", query=");
        sb2.append(this.f15056s);
        sb2.append(", title=");
        return h1.p(sb2, this.f15057t, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k71.k.g(parcel, "dest");
        parcel.writeString(this.f15055r.name());
        parcel.writeString(this.f15056s);
        parcel.writeString(this.f15057t);
    }

    public SearchResultsRoute(SearchViewModelType searchViewModelType, String str, String str2) {
        k71.k.g(searchViewModelType, "viewModelType");
        k71.k.g(str, "query");
        k71.k.g(str2, "title");
        this.f15055r = searchViewModelType;
        this.f15056s = str;
        this.f15057t = str2;
    }
}
