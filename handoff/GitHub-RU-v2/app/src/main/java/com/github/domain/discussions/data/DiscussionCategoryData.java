package com.github.domain.discussions.data;

import a0.s0;
import android.os.Parcel;
import android.os.Parcelable;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;
import g81.e;
import gn.m;
import k71.k;
import k81.c1;
import kotlinx.serialization.KSerializer;
import x.i;

@e
/* loaded from: /home/user/work/p/classes3.dex */
public final class DiscussionCategoryData implements Parcelable {
    public final String r;
    public final String s;
    public final String t;
    public final boolean u;
    public final boolean v;
    public final String w;
    public final String x;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<DiscussionCategoryData> CREATOR = new m(19);

    public static final class Companion {
        public final KSerializer serializer() {
            return DiscussionCategoryData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DiscussionCategoryData(int i, String str, String str2, String str3, boolean z, boolean z2, String str4, String str5) {
        if (127 != (i & 127)) {
            c1.l(i, 127, DiscussionCategoryData$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.r = str;
        this.s = str2;
        this.t = str3;
        this.u = z;
        this.v = z2;
        this.w = str4;
        this.x = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DiscussionCategoryData)) {
            return false;
        }
        DiscussionCategoryData discussionCategoryData = (DiscussionCategoryData) obj;
        return k.b(this.r, discussionCategoryData.r) && k.b(this.s, discussionCategoryData.s) && k.b(this.t, discussionCategoryData.t) && this.u == discussionCategoryData.u && this.v == discussionCategoryData.v && k.b(this.w, discussionCategoryData.w) && k.b(this.x, discussionCategoryData.x);
    }

    public final int hashCode() {
        int i = h1.i(i.e(i.e(h1.i(h1.i(this.r.hashCode() * 31, this.s, 31), this.t, 31), 31, this.u), 31, this.v), this.w, 31);
        String str = this.x;
        return i + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder o = s0.o("DiscussionCategoryData(id=", this.r, ", name=", this.s, ", emojiHTML=");
        m0.x(o, this.t, ", isAnswerable=", this.u, ", isPollable=");
        m0.z(o, this.v, ", description=", this.w, ", formTemplateUrl=");
        return h1.p(o, this.x, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        parcel.writeString(this.r);
        parcel.writeString(this.s);
        parcel.writeString(this.t);
        parcel.writeInt(this.u ? 1 : 0);
        parcel.writeInt(this.v ? 1 : 0);
        parcel.writeString(this.w);
        parcel.writeString(this.x);
    }

    public DiscussionCategoryData(String str, String str2, String str3, boolean z, boolean z2, String str4, String str5) {
        k.g(str, "id");
        k.g(str2, "name");
        k.g(str3, "emojiHTML");
        k.g(str4, "description");
        this.r = str;
        this.s = str2;
        this.t = str3;
        this.u = z;
        this.v = z2;
        this.w = str4;
        this.x = str5;
    }
}
