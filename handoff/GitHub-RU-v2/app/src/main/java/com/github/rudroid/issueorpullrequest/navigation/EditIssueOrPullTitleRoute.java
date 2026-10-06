package com.github.rudroid.issueorpullrequest.navigation;

import a0.s0;
import android.os.Parcel;
import android.os.Parcelable;
import com.github.rudroid.copilot.h1;
import g81.e;
import jo.f4Shadow;
import k71.k;
import k81.c1Shadow;
import kotlinx.serialization.KSerializer;

@e
/* loaded from: /home/user/work/p/classes.dex */
public final class EditIssueOrPullTitleRoute implements Parcelable {

    /* renamed from: r, reason: collision with root package name */
    public String f15766r;

    /* renamed from: s, reason: collision with root package name */
    public String f15767s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f15768t;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<EditIssueOrPullTitleRoute> CREATOR = new a();

    public static final class Companion {
        public final KSerializer serializer() {
            return EditIssueOrPullTitleRoute$$serializer.INSTANCE;
        }
    }

    public static final class a implements Parcelable.Creator<EditIssueOrPullTitleRoute> {
        @Override // android.os.Parcelable.Creator
        public final EditIssueOrPullTitleRoute createFromParcel(Parcel parcel) {
            k.g(parcel, "parcel");
            return new EditIssueOrPullTitleRoute(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final EditIssueOrPullTitleRoute[] newArray(int i) {
            return new EditIssueOrPullTitleRoute[i];
        }
    }

    public /* synthetic */ EditIssueOrPullTitleRoute(int i, String str, String str2, boolean z10) {
        if (7 != (i & 7)) {
            c1Shadow.l(i, 7, EditIssueOrPullTitleRoute$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f15766r = str;
        this.f15767s = str2;
        this.f15768t = z10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditIssueOrPullTitleRoute)) {
            return false;
        }
        EditIssueOrPullTitleRoute editIssueOrPullTitleRoute = (EditIssueOrPullTitleRoute) obj;
        return k.b(this.f15766r, editIssueOrPullTitleRoute.f15766r) && k.b(this.f15767s, editIssueOrPullTitleRoute.f15767s) && this.f15768t == editIssueOrPullTitleRoute.f15768t;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f15768t) + h1.i(this.f15766r.hashCode() * 31, this.f15767s, 31);
    }

    public final String toString() {
        return f4Shadow.s(s0.o("EditIssueOrPullTitleRoute(id=", this.f15766r, ", title=", this.f15767s, ", isPullRequest="), this.f15768t, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        parcel.writeString(this.f15766r);
        parcel.writeString(this.f15767s);
        parcel.writeInt(this.f15768t ? 1 : 0);
    }

    public EditIssueOrPullTitleRoute(String str, String str2, boolean z10) {
        k.g(str, "id");
        k.g(str2, "title");
        this.f15766r = str;
        this.f15767s = str2;
        this.f15768t = z10;
    }
}
