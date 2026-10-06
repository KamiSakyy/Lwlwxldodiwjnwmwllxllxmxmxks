package com.github.rudroid.draft.navigation;

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
public final class DraftIssueRoute implements Parcelable {

    /* renamed from: r, reason: collision with root package name */
    public String f12102r;

    /* renamed from: s, reason: collision with root package name */
    public String f12103s;

    /* renamed from: t, reason: collision with root package name */
    public SerializableProjectV2FieldList f12104t;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<DraftIssueRoute> CREATOR = new a();

    public static final class Companion {
        public final KSerializer serializer() {
            return DraftIssueRoute$$serializer.INSTANCE;
        }
    }

    public static final class a implements Parcelable.Creator<DraftIssueRoute> {
        @Override // android.os.Parcelable.Creator
        public final DraftIssueRoute createFromParcel(Parcel parcel) {
            k.g(parcel, "parcel");
            return new DraftIssueRoute(parcel.readString(), parcel.readString(), SerializableProjectV2FieldList.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final DraftIssueRoute[] newArray(int i) {
            return new DraftIssueRoute[i];
        }
    }

    public /* synthetic */ DraftIssueRoute(int i, String str, String str2, SerializableProjectV2FieldList serializableProjectV2FieldList) {
        if (7 != (i & 7)) {
            c1.l(i, 7, DraftIssueRoute$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f12102r = str;
        this.f12103s = str2;
        this.f12104t = serializableProjectV2FieldList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DraftIssueRoute)) {
            return false;
        }
        DraftIssueRoute draftIssueRoute = (DraftIssueRoute) obj;
        return k.b(this.f12102r, draftIssueRoute.f12102r) && k.b(this.f12103s, draftIssueRoute.f12103s) && k.b(this.f12104t, draftIssueRoute.f12104t);
    }

    public final int hashCode() {
        return this.f12104t.f12106r.hashCode() + h1.i(this.f12102r.hashCode() * 31, this.f12103s, 31);
    }

    public final String toString() {
        StringBuilder o5 = s0.o("DraftIssueRoute(nodeId=", this.f12102r, ", selectedViewId=", this.f12103s, ", viewGroupedByFields=");
        o5.append(this.f12104t);
        o5.append(")");
        return o5.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        parcel.writeString(this.f12102r);
        parcel.writeString(this.f12103s);
        this.f12104t.writeToParcel(parcel, i);
    }

    public DraftIssueRoute(String str, String str2, SerializableProjectV2FieldList serializableProjectV2FieldList) {
        k.g(str, "nodeId");
        k.g(str2, "selectedViewId");
        k.g(serializableProjectV2FieldList, "viewGroupedByFields");
        this.f12102r = str;
        this.f12103s = str2;
        this.f12104t = serializableProjectV2FieldList;
    }
}
