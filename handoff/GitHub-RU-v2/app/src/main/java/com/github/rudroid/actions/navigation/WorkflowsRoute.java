package com.github.rudroid.actions.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import g81.e;
import k71.k;
import k81.c1;
import kotlinx.serialization.KSerializer;
import x.i;

@e
/* loaded from: /home/user/work/p/classes.dex */
public final class WorkflowsRoute implements Parcelable, sa.e {

    /* renamed from: r, reason: collision with root package name */
    public String f5124r;

    /* renamed from: s, reason: collision with root package name */
    public String f5125s;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<WorkflowsRoute> CREATOR = new a();

    public static final class Companion {
        public final KSerializer serializer() {
            return WorkflowsRoute$$serializer.INSTANCE;
        }
    }

    public static final class a implements Parcelable.Creator<WorkflowsRoute> {
        @Override // android.os.Parcelable.Creator
        public final WorkflowsRoute createFromParcel(Parcel parcel) {
            k.g(parcel, "parcel");
            return new WorkflowsRoute(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final WorkflowsRoute[] newArray(int i) {
            return new WorkflowsRoute[i];
        }
    }

    public /* synthetic */ WorkflowsRoute(String str, int i, String str2) {
        if (3 != (i & 3)) {
            c1.l(i, 3, WorkflowsRoute$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f5124r = str;
        this.f5125s = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WorkflowsRoute)) {
            return false;
        }
        WorkflowsRoute workflowsRoute = (WorkflowsRoute) obj;
        return k.b(this.f5124r, workflowsRoute.f5124r) && k.b(this.f5125s, workflowsRoute.f5125s);
    }

    public final int hashCode() {
        return this.f5125s.hashCode() + (this.f5124r.hashCode() * 31);
    }

    public final String toString() {
        return i.g("WorkflowsRoute(repositoryName=", this.f5124r, ", repositoryOwner=", this.f5125s, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        parcel.writeString(this.f5124r);
        parcel.writeString(this.f5125s);
    }

    public WorkflowsRoute(String str, String str2) {
        k.g(str, "repositoryName");
        k.g(str2, "repositoryOwner");
        this.f5124r = str;
        this.f5125s = str2;
    }
}
