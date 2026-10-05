package yz0;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.service.models.response.issueorpullrequest.IssueType;
import java.util.Iterator;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j5 extends k5 {
    public static final Parcelable.Creator<j5> CREATOR = new e5(4);
    public final String s;
    public final String t;
    public final String u;
    public final String v;
    public final String w;
    public final Object x;
    public final Object y;
    public final IssueType z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j5(String str, String str2, String str3, String str4, String str5, List list, List list2, IssueType issueType) {
        super(str.hashCode());
        k71.k.g(str, "name");
        this.s = str;
        this.t = str2;
        this.u = str3;
        this.v = str4;
        this.w = str5;
        this.x = list;
        this.y = list2;
        this.z = issueType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j5)) {
            return false;
        }
        j5 j5Var = (j5) obj;
        return k71.k.b(this.s, j5Var.s) && k71.k.b(this.t, j5Var.t) && k71.k.b(this.u, j5Var.u) && k71.k.b(this.v, j5Var.v) && k71.k.b(this.w, j5Var.w) && this.x.equals(j5Var.x) && this.y.equals(j5Var.y) && k71.k.b(this.z, j5Var.z);
    }

    public final int hashCode() {
        int hashCode = this.s.hashCode() * 31;
        String str = this.t;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.u;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.v;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.w;
        int h = com.github.rudroid.copilot.h1.h(com.github.rudroid.copilot.h1.h((hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31, this.x, 31), this.y, 31);
        IssueType issueType = this.z;
        return h + (issueType != null ? issueType.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Standard(name=", this.s, ", about=", this.t, ", title=");
        f1.e.x(o, this.u, ", body=", this.v, ", fileName=");
        o.append(this.w);
        o.append(", assignees=");
        o.append(this.x);
        o.append(", labels=");
        o.append(this.y);
        o.append(", issueType=");
        o.append(this.z);
        o.append(")");
        return o.toString();
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, java.util.List] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k71.k.g(parcel, "dest");
        parcel.writeString(this.s);
        parcel.writeString(this.t);
        parcel.writeString(this.u);
        parcel.writeString(this.v);
        parcel.writeString(this.w);
        ?? r0 = this.x;
        parcel.writeInt(r0.size());
        Iterator it = r0.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable((Parcelable) it.next(), i);
        }
        ?? r02 = this.y;
        parcel.writeInt(r02.size());
        Iterator it2 = r02.iterator();
        while (it2.hasNext()) {
            parcel.writeParcelable((Parcelable) it2.next(), i);
        }
        IssueType issueType = this.z;
        if (issueType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            issueType.writeToParcel(parcel, i);
        }
    }
}
