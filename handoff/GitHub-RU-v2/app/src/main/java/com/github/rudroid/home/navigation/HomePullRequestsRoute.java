package com.github.rudroid.home.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.rudroid.repository.navigation.SerializableFilterList;
import g81.e;
import k71.k;
import kotlinx.serialization.KSerializer;

@e
/* loaded from: /home/user/work/p/classes.dex */
public final class HomePullRequestsRoute implements Parcelable {

    /* renamed from: r, reason: collision with root package name */
    public SerializableFilterList f14998r;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<HomePullRequestsRoute> CREATOR = new a();

    public static final class Companion {
        public final KSerializer serializer() {
            return HomePullRequestsRoute$$serializer.INSTANCE;
        }
    }

    public static final class a implements Parcelable.Creator<HomePullRequestsRoute> {
        @Override // android.os.Parcelable.Creator
        public final HomePullRequestsRoute createFromParcel(Parcel parcel) {
            k.g(parcel, "parcel");
            return new HomePullRequestsRoute(SerializableFilterList.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final HomePullRequestsRoute[] newArray(int i) {
            return new HomePullRequestsRoute[i];
        }
    }

    public /* synthetic */ HomePullRequestsRoute(int i, SerializableFilterList serializableFilterList) {
        if ((i & 1) == 0) {
            this.f14998r = new SerializableFilterList();
        } else {
            this.f14998r = serializableFilterList;
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
        return (obj instanceof HomePullRequestsRoute) && k.b(this.f14998r, ((HomePullRequestsRoute) obj).f14998r);
    }

    public final int hashCode() {
        return this.f14998r.f20040r.hashCode();
    }

    public final String toString() {
        return "HomePullRequestsRoute(deepLinkFilterSet=" + this.f14998r + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        this.f14998r.writeToParcel(parcel, i);
    }

    public HomePullRequestsRoute(SerializableFilterList serializableFilterList) {
        k.g(serializableFilterList, "deepLinkFilterSet");
        this.f14998r = serializableFilterList;
    }
}
