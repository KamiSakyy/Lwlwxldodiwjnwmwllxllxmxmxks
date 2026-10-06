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
public final class WorkflowSummaryRoute implements Parcelable {

    /* renamed from: r, reason: collision with root package name */
    public String f5120r;

    /* renamed from: s, reason: collision with root package name */
    public String f5121s;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<WorkflowSummaryRoute> CREATOR = new a();

    public static final class Companion {
        public final KSerializer serializer() {
            return WorkflowSummaryRoute$$serializer.INSTANCE;
        }
    }

    public static final class a implements Parcelable.Creator<WorkflowSummaryRoute> {
        @Override // android.os.Parcelable.Creator
        public final WorkflowSummaryRoute createFromParcel(Parcel parcel) {
            k.g(parcel, "parcel");
            return new WorkflowSummaryRoute(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final WorkflowSummaryRoute[] newArray(int i) {
            return new WorkflowSummaryRoute[i];
        }
    }

    public /* synthetic */ WorkflowSummaryRoute(String str, int i, String str2) {
        if (1 != (i & 1)) {
            c1.l(i, 1, WorkflowSummaryRoute$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f5120r = str;
        if ((i & 2) == 0) {
            this.f5121s = null;
        } else {
            this.f5121s = str2;
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
        if (!(obj instanceof WorkflowSummaryRoute)) {
            return false;
        }
        WorkflowSummaryRoute workflowSummaryRoute = (WorkflowSummaryRoute) obj;
        return k.b(this.f5120r, workflowSummaryRoute.f5120r) && k.b(this.f5121s, workflowSummaryRoute.f5121s);
    }

    public final int hashCode() {
        int hashCode = this.f5120r.hashCode() * 31;
        String str = this.f5121s;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return i.g("WorkflowSummaryRoute(checkSuiteId=", this.f5120r, ", pullRequestId=", this.f5121s, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        parcel.writeString(this.f5120r);
        parcel.writeString(this.f5121s);
    }

    public WorkflowSummaryRoute(String str, String str2) {
        k.g(str, "checkSuiteId");
        this.f5120r = str;
        this.f5121s = str2;
    }
}
