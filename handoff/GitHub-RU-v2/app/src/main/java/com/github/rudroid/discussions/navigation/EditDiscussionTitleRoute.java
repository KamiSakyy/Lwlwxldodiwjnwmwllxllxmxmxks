package com.github.rudroid.discussions.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import g81.e;
import k71.k;
import k81.c1Shadow;
import kotlinx.serialization.KSerializer;
import x.i;

@e
/* loaded from: /home/user/work/p/classes.dex */
public final class EditDiscussionTitleRoute implements Parcelable {

    /* renamed from: r, reason: collision with root package name */
    public String f11577r;

    /* renamed from: s, reason: collision with root package name */
    public String f11578s;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<EditDiscussionTitleRoute> CREATOR = new a();

    public static final class Companion {
        public final KSerializer serializer() {
            return EditDiscussionTitleRoute$$serializer.INSTANCE;
        }
    }

    public static final class a implements Parcelable.Creator<EditDiscussionTitleRoute> {
        @Override // android.os.Parcelable.Creator
        public final EditDiscussionTitleRoute createFromParcel(Parcel parcel) {
            k.g(parcel, "parcel");
            return new EditDiscussionTitleRoute(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final EditDiscussionTitleRoute[] newArray(int i) {
            return new EditDiscussionTitleRoute[i];
        }
    }

    public /* synthetic */ EditDiscussionTitleRoute(String str, int i, String str2) {
        if (3 != (i & 3)) {
            c1Shadow.l(i, 3, EditDiscussionTitleRoute$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f11577r = str;
        this.f11578s = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditDiscussionTitleRoute)) {
            return false;
        }
        EditDiscussionTitleRoute editDiscussionTitleRoute = (EditDiscussionTitleRoute) obj;
        return k.b(this.f11577r, editDiscussionTitleRoute.f11577r) && k.b(this.f11578s, editDiscussionTitleRoute.f11578s);
    }

    public final int hashCode() {
        return this.f11578s.hashCode() + (this.f11577r.hashCode() * 31);
    }

    public final String toString() {
        return i.g("EditDiscussionTitleRoute(id=", this.f11577r, ", title=", this.f11578s, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        parcel.writeString(this.f11577r);
        parcel.writeString(this.f11578s);
    }

    public EditDiscussionTitleRoute(String str, String str2) {
        k.g(str, "id");
        k.g(str2, "title");
        this.f11577r = str;
        this.f11578s = str2;
    }
}
