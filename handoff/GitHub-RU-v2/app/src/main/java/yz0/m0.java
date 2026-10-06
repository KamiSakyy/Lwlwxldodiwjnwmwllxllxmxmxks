package yz0;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m0 extends n0 {
    public static final Parcelable.Creator<m0> CREATOR = new h(16);
    public String s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(String str) {
        super(str);
        k71.k.g(str, "threadId");
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
        return (obj instanceof m0) && k71.k.b(this.s, ((m0) obj).s);
    }

    public final int hashCode() {
        return this.s.hashCode();
    }

    public final String toString() {
        return f1.e.z("ReplyPullRequestReviewComment(threadId=", this.s, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k71.k.g(parcel, "dest");
        parcel.writeString(this.s);
    }
    public static Object A(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
    public static Object a(Object p1, Object p2, Object p3) { return null; }
    public static Object f(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
    public static Object g(Object p1, Object p2, Object p3) { return null; }
    public static Object j(Object p1, Object p2, Object p3) { return null; }
    public static Object k(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
    public static Object l(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
    public static Object m(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
    public static Object o(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
    public static Object p(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
    public static Object v(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
    public static Object w(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
    public static Object x(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
    public static Object y(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
    public static Object z(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
}
