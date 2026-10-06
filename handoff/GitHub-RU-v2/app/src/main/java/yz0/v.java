package yz0;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /home/user/work/p/classes4.dex */
public final class v extends z {
    public static final Parcelable.Creator<v> CREATOR = new h(3);
    public String s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(String str) {
        super(str);
        k71.k.g(str, "commentId");
        this.s = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && k71.k.b(this.s, ((v) obj).s);
    }

    public final int hashCode() {
        return this.s.hashCode();
    }

    public final String toString() {
        return f1.e.z("ExistingDiscussionCommentThreadBody(commentId=", this.s, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k71.k.g(parcel, "dest");
        parcel.writeString(this.s);
    }
}
