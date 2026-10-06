package com.github.rudroid.home.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import g81.e;
import k71.k;
import k81.c1;
import kotlinx.serialization.KSerializer;

@e
/* loaded from: /home/user/work/p/classes.dex */
public final class FavoritesRoute implements Parcelable {

    /* renamed from: r, reason: collision with root package name */
    public SerializableSimpleRepositoryList f14994r;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<FavoritesRoute> CREATOR = new a();

    public static final class Companion {
        public final KSerializer serializer() {
            return FavoritesRoute$$serializer.INSTANCE;
        }
    }

    public static final class a implements Parcelable.Creator<FavoritesRoute> {
        @Override // android.os.Parcelable.Creator
        public final FavoritesRoute createFromParcel(Parcel parcel) {
            k.g(parcel, "parcel");
            return new FavoritesRoute(SerializableSimpleRepositoryList.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final FavoritesRoute[] newArray(int i) {
            return new FavoritesRoute[i];
        }
    }

    public /* synthetic */ FavoritesRoute(int i, SerializableSimpleRepositoryList serializableSimpleRepositoryList) {
        if (1 == (i & 1)) {
            this.f14994r = serializableSimpleRepositoryList;
        } else {
            c1.l(i, 1, FavoritesRoute$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FavoritesRoute) && k.b(this.f14994r, ((FavoritesRoute) obj).f14994r);
    }

    public final int hashCode() {
        return this.f14994r.f15003r.hashCode();
    }

    public final String toString() {
        return "FavoritesRoute(selectedRepositories=" + this.f14994r + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        this.f14994r.writeToParcel(parcel, i);
    }

    public FavoritesRoute(SerializableSimpleRepositoryList serializableSimpleRepositoryList) {
        k.g(serializableSimpleRepositoryList, "selectedRepositories");
        this.f14994r = serializableSimpleRepositoryList;
    }
}
