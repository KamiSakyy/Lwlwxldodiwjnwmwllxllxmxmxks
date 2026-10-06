package yz0;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d0 extends f0 {
    public static final Parcelable.Creator<d0> CREATOR = new h(9);
    public final String s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(String str) {
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
        return (obj instanceof d0) && k71.k.b(this.s, ((d0) obj).s);
    }

    public final int hashCode() {
        return this.s.hashCode();
    }

    public final String toString() {
        return f1.e.z("EditIssueOrPullRequestComment(commentId=", this.s, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k71.k.g(parcel, "dest");
        parcel.writeString(this.s);
    }
}
