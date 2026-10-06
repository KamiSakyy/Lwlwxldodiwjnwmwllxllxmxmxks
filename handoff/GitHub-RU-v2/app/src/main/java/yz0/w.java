package yz0;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /home/user/work/p/classes4.dex */
public final class w extends z {
    public static final Parcelable.Creator<w> CREATOR = new h(4);
    public String s;
    public String t;
    public String u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(String str, String str2, String str3) {
        super(str3);
        k71.k.g(str, "discussionId");
        k71.k.g(str2, "threadId");
        k71.k.g(str3, "replyId");
        this.s = str;
        this.t = str2;
        this.u = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return k71.k.b(this.s, wVar.s) && k71.k.b(this.t, wVar.t) && k71.k.b(this.u, wVar.u);
    }

    public final int hashCode() {
        return this.u.hashCode() + com.github.rudroid.copilot.h1.i(this.s.hashCode() * 31, this.t, 31);
    }

    public final String toString() {
        return com.github.rudroid.copilot.h1.p(a0.s0.o("ExistingDiscussionCommentThreadReply(discussionId=", this.s, ", threadId=", this.t, ", replyId="), this.u, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k71.k.g(parcel, "dest");
        parcel.writeString(this.s);
        parcel.writeString(this.t);
        parcel.writeString(this.u);
    }
}
