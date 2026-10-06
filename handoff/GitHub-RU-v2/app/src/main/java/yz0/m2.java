package yz0;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.service.models.response.issueorpullrequest.CloseReason;
import com.github.service.models.response.type.IssueState;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m2 implements o2 {
    public static final Parcelable.Creator<m2> CREATOR = new h(23);
    public final IssueState r;
    public final CloseReason s;
    public final String t;
    public final String u;
    public final String v;
    public final int w;
    public final String x;
    public final String y;
    public final boolean z;

    public m2(IssueState issueState, CloseReason closeReason, String str, String str2, String str3, int i, String str4, String str5, boolean z) {
        k71.k.g(issueState, "state");
        k71.k.g(str, "id");
        k71.k.g(str2, "title");
        k71.k.g(str3, "url");
        k71.k.g(str4, "repoName");
        k71.k.g(str5, "owner");
        this.r = issueState;
        this.s = closeReason;
        this.t = str;
        this.u = str2;
        this.v = str3;
        this.w = i;
        this.x = str4;
        this.y = str5;
        this.z = z;
    }

    @Override // yz0.o2
    public final boolean O() {
        return this.z;
    }

    @Override // yz0.o2
    public final String a() {
        return this.y;
    }

    @Override // yz0.o2
    public final int b() {
        return this.w;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m2)) {
            return false;
        }
        m2 m2Var = (m2) obj;
        return this.r == m2Var.r && this.s == m2Var.s && k71.k.b(this.t, m2Var.t) && k71.k.b(this.u, m2Var.u) && k71.k.b(this.v, m2Var.v) && this.w == m2Var.w && k71.k.b(this.x, m2Var.x) && k71.k.b(this.y, m2Var.y) && this.z == m2Var.z;
    }

    @Override // yz0.o2
    public final String getId() {
        return this.t;
    }

    @Override // yz0.o2
    public final String getTitle() {
        return this.u;
    }

    public final int hashCode() {
        int hashCode = this.r.hashCode() * 31;
        CloseReason closeReason = this.s;
        return Boolean.hashCode(this.z) + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(a0.s0.b(this.w, com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i((hashCode + (closeReason == null ? 0 : closeReason.hashCode())) * 31, this.t, 31), this.u, 31), this.v, 31), 31), this.x, 31), this.y, 31);
    }

    @Override // yz0.o2
    public final String m() {
        return this.x;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LinkedIssue(state=");
        sb.append(this.r);
        sb.append(", closeReason=");
        sb.append(this.s);
        sb.append(", id=");
        f1.e.x(sb, this.t, ", title=", this.u, ", url=");
        a0.s0.w(this.w, this.v, ", number=", ", repoName=", sb);
        f1.e.x(sb, this.x, ", owner=", this.y, ", isLinkedByUser=");
        return jo.f4.s(sb, this.z, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k71.k.g(parcel, "dest");
        parcel.writeString(this.r.name());
        CloseReason closeReason = this.s;
        if (closeReason == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(closeReason.name());
        }
        parcel.writeString(this.t);
        parcel.writeString(this.u);
        parcel.writeString(this.v);
        parcel.writeInt(this.w);
        parcel.writeString(this.x);
        parcel.writeString(this.y);
        parcel.writeInt(this.z ? 1 : 0);
    }
}
