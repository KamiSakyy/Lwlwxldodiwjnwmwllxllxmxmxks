package com.github.rudroid.actions.navigation;

import a0.s0;
import android.os.Parcel;
import android.os.Parcelable;
import com.github.rudroid.copilot.h1;
import g81.e;
import k71.k;
import k81.c1;
import kotlinx.serialization.KSerializer;

@e
/* loaded from: /home/user/work/p/classes.dex */
public final class ActionsRouterRoute implements Parcelable {

    /* renamed from: r, reason: collision with root package name */
    public final String f5103r;

    /* renamed from: s, reason: collision with root package name */
    public final String f5104s;

    /* renamed from: t, reason: collision with root package name */
    public final String f5105t;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<ActionsRouterRoute> CREATOR = new a();

    public static final class Companion {
        public final KSerializer serializer() {
            return ActionsRouterRoute$$serializer.INSTANCE;
        }
    }

    public static final class a implements Parcelable.Creator<ActionsRouterRoute> {
        @Override // android.os.Parcelable.Creator
        public final ActionsRouterRoute createFromParcel(Parcel parcel) {
            k.g(parcel, "parcel");
            return new ActionsRouterRoute(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ActionsRouterRoute[] newArray(int i) {
            return new ActionsRouterRoute[i];
        }
    }

    public /* synthetic */ ActionsRouterRoute(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            c1.l(i, 7, ActionsRouterRoute$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f5103r = str;
        this.f5104s = str2;
        this.f5105t = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionsRouterRoute)) {
            return false;
        }
        ActionsRouterRoute actionsRouterRoute = (ActionsRouterRoute) obj;
        return k.b(this.f5103r, actionsRouterRoute.f5103r) && k.b(this.f5104s, actionsRouterRoute.f5104s) && k.b(this.f5105t, actionsRouterRoute.f5105t);
    }

    public final int hashCode() {
        return this.f5105t.hashCode() + h1.i(this.f5103r.hashCode() * 31, this.f5104s, 31);
    }

    public final String toString() {
        return h1.p(s0.o("ActionsRouterRoute(url=", this.f5103r, ", repositoryOwner=", this.f5104s, ", repositoryName="), this.f5105t, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        parcel.writeString(this.f5103r);
        parcel.writeString(this.f5104s);
        parcel.writeString(this.f5105t);
    }

    public ActionsRouterRoute(String str, String str2, String str3) {
        k.g(str, "url");
        k.g(str2, "repositoryOwner");
        k.g(str3, "repositoryName");
        this.f5103r = str;
        this.f5104s = str2;
        this.f5105t = str3;
    }
}
