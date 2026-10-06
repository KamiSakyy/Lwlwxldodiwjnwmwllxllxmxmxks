package yz0;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /home/user/work/p/classes4.dex */
public final class t2 implements Parcelable {
    public static final Parcelable.Creator<t2> CREATOR = new h(26);
    public final s2 r;
    public final s2 s;

    public t2(s2 s2Var, s2 s2Var2) {
        k71.k.g(s2Var, "mergeCommitMessage");
        k71.k.g(s2Var2, "squashMessage");
        this.r = s2Var;
        this.s = s2Var2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t2)) {
            return false;
        }
        t2 t2Var = (t2) obj;
        return k71.k.b(this.r, t2Var.r) && k71.k.b(this.s, t2Var.s);
    }

    public final int hashCode() {
        return this.s.hashCode() + (this.r.hashCode() * 31);
    }

    public final String toString() {
        return "MergeMessageByMethod(mergeCommitMessage=" + this.r + ", squashMessage=" + this.s + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k71.k.g(parcel, "dest");
        this.r.writeToParcel(parcel, i);
        this.s.writeToParcel(parcel, i);
    }
}
