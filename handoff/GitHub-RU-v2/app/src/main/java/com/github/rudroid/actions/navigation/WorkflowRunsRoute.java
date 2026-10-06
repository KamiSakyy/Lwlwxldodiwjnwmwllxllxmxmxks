package com.github.rudroid.actions.navigation;

import a0.s0;
import android.os.Parcel;
import android.os.Parcelable;
import com.github.rudroid.copilot.h1;
import g81.e;
import k71.k;
import k81.c1Shadow;
import kotlinx.serialization.KSerializer;

@e
/* loaded from: /home/user/work/p/classes.dex */
public final class WorkflowRunsRoute implements Parcelable {

    /* renamed from: r, reason: collision with root package name */
    public String f5117r;

    /* renamed from: s, reason: collision with root package name */
    public String f5118s;

    /* renamed from: t, reason: collision with root package name */
    public String f5119t;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<WorkflowRunsRoute> CREATOR = new a();

    public static final class Companion {
        public final KSerializer serializer() {
            return WorkflowRunsRoute$$serializer.INSTANCE;
        }
    }

    public static final class a implements Parcelable.Creator<WorkflowRunsRoute> {
        @Override // android.os.Parcelable.Creator
        public final WorkflowRunsRoute createFromParcel(Parcel parcel) {
            k.g(parcel, "parcel");
            return new WorkflowRunsRoute(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final WorkflowRunsRoute[] newArray(int i) {
            return new WorkflowRunsRoute[i];
        }
    }

    public /* synthetic */ WorkflowRunsRoute(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            c1Shadow.l(i, 7, WorkflowRunsRoute$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f5117r = str;
        this.f5118s = str2;
        this.f5119t = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WorkflowRunsRoute)) {
            return false;
        }
        WorkflowRunsRoute workflowRunsRoute = (WorkflowRunsRoute) obj;
        return k.b(this.f5117r, workflowRunsRoute.f5117r) && k.b(this.f5118s, workflowRunsRoute.f5118s) && k.b(this.f5119t, workflowRunsRoute.f5119t);
    }

    public final int hashCode() {
        return this.f5119t.hashCode() + h1.i(this.f5117r.hashCode() * 31, this.f5118s, 31);
    }

    public final String toString() {
        return h1.p(s0.o("WorkflowRunsRoute(workflowId=", this.f5117r, ", repositoryOwner=", this.f5118s, ", repositoryName="), this.f5119t, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        parcel.writeString(this.f5117r);
        parcel.writeString(this.f5118s);
        parcel.writeString(this.f5119t);
    }

    public WorkflowRunsRoute(String str, String str2, String str3) {
        k.g(str, "workflowId");
        k.g(str2, "repositoryOwner");
        k.g(str3, "repositoryName");
        this.f5117r = str;
        this.f5118s = str2;
        this.f5119t = str3;
    }
}
