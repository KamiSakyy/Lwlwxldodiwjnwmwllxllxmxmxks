package com.github.rudroid.home.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.rudroid.repository.navigation.SerializableFilterList;
import g81.e;
import k71.k;
import kotlinx.serialization.KSerializer;

@e
/* loaded from: /home/user/work/p/classes.dex */
public final class HomeIssuesRoute implements Parcelable {

    /* renamed from: r, reason: collision with root package name */
    public SerializableFilterList f14997r;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<HomeIssuesRoute> CREATOR = new a();

    public static final class Companion {
        public final KSerializer serializer() {
            return HomeIssuesRoute$$serializer.INSTANCE;
        }
    }

    public static final class a implements Parcelable.Creator<HomeIssuesRoute> {
        @Override // android.os.Parcelable.Creator
        public final HomeIssuesRoute createFromParcel(Parcel parcel) {
            k.g(parcel, "parcel");
            return new HomeIssuesRoute(SerializableFilterList.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final HomeIssuesRoute[] newArray(int i) {
            return new HomeIssuesRoute[i];
        }
    }

    public /* synthetic */ HomeIssuesRoute(int i, SerializableFilterList serializableFilterList) {
        if ((i & 1) == 0) {
            this.f14997r = new SerializableFilterList();
        } else {
            this.f14997r = serializableFilterList;
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
        return (obj instanceof HomeIssuesRoute) && k.b(this.f14997r, ((HomeIssuesRoute) obj).f14997r);
    }

    public final int hashCode() {
        return this.f14997r.f20040r.hashCode();
    }

    public final String toString() {
        return "HomeIssuesRoute(deepLinkFilterSet=" + this.f14997r + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        this.f14997r.writeToParcel(parcel, i);
    }

    public HomeIssuesRoute(SerializableFilterList serializableFilterList) {
        k.g(serializableFilterList, "deepLinkFilterSet");
        this.f14997r = serializableFilterList;
    }
}
