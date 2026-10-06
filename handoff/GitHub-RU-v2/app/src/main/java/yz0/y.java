package yz0;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /home/user/work/p/classes4.dex */
public final class y extends z {
    public static final Parcelable.Creator<y> CREATOR = new h(6);
    public String s;
    public String t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(String str, String str2) {
        super(str2);
        k71.k.g(str, "discussionId");
        k71.k.g(str2, "threadId");
        this.s = str;
        this.t = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return k71.k.b(this.s, yVar.s) && k71.k.b(this.t, yVar.t);
    }

    public final int hashCode() {
        return this.t.hashCode() + (this.s.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("NewReplyDiscussionComment(discussionId=", this.s, ", threadId=", this.t, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k71.k.g(parcel, "dest");
        parcel.writeString(this.s);
        parcel.writeString(this.t);
    }
}
