package yz0;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o0 extends q0 {
    public static final Parcelable.Creator<o0> CREATOR = new h(17);
    public final String s;
    public final String t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(String str, String str2) {
        super(str2);
        k71.k.g(str, "reviewId");
        k71.k.g(str2, "issueOrPullRequestId");
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
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return k71.k.b(this.s, o0Var.s) && k71.k.b(this.t, o0Var.t);
    }

    public final int hashCode() {
        return this.t.hashCode() + (this.s.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("DismissPullRequestReview(reviewId=", this.s, ", issueOrPullRequestId=", this.t, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k71.k.g(parcel, "dest");
        parcel.writeString(this.s);
        parcel.writeString(this.t);
    }
}
