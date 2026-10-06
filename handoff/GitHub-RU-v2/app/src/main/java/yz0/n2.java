package yz0;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.service.models.response.PullRequestState;

/* loaded from: /home/user/work/p/classes4.dex */
public final class n2 implements o2 {
    public static final Parcelable.Creator<n2> CREATOR = new h(24);
    public boolean A;
    public PullRequestState r;
    public boolean s;
    public boolean t;
    public String u;
    public String v;
    public String w;
    public int x;
    public String y;
    public String z;

    public n2(PullRequestState pullRequestState, boolean z, boolean z2, String str, String str2, String str3, int i, String str4, String str5, boolean z3) {
        k71.k.g(pullRequestState, "state");
        k71.k.g(str, "id");
        k71.k.g(str2, "title");
        k71.k.g(str3, "url");
        k71.k.g(str4, "repoName");
        k71.k.g(str5, "owner");
        this.r = pullRequestState;
        this.s = z;
        this.t = z2;
        this.u = str;
        this.v = str2;
        this.w = str3;
        this.x = i;
        this.y = str4;
        this.z = str5;
        this.A = z3;
    }

    @Override // yz0.o2
    public final boolean O() {
        return this.A;
    }

    @Override // yz0.o2
    public final String a() {
        return this.z;
    }

    @Override // yz0.o2
    public final int b() {
        return this.x;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n2)) {
            return false;
        }
        n2 n2Var = (n2) obj;
        return this.r == n2Var.r && this.s == n2Var.s && this.t == n2Var.t && k71.k.b(this.u, n2Var.u) && k71.k.b(this.v, n2Var.v) && k71.k.b(this.w, n2Var.w) && this.x == n2Var.x && k71.k.b(this.y, n2Var.y) && k71.k.b(this.z, n2Var.z) && this.A == n2Var.A;
    }

    @Override // yz0.o2
    public final String getId() {
        return this.u;
    }

    @Override // yz0.o2
    public final String getTitle() {
        return this.v;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.A) + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(a0.s0.b(this.x, com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(x.i.e(x.i.e(this.r.hashCode() * 31, 31, this.s), 31, this.t), this.u, 31), this.v, 31), this.w, 31), 31), this.y, 31), this.z, 31);
    }

    @Override // yz0.o2
    public final String m() {
        return this.y;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LinkedPullRequest(state=");
        sb.append(this.r);
        sb.append(", isDraft=");
        sb.append(this.s);
        sb.append(", isInMergeQueue=");
        com.github.rudroid.m0.z(sb, this.t, ", id=", this.u, ", title=");
        f1.e.x(sb, this.v, ", url=", this.w, ", number=");
        x.i.r(this.x, ", repoName=", this.y, ", owner=", sb);
        return com.github.rudroid.m0.k(sb, this.z, ", isLinkedByUser=", this.A, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k71.k.g(parcel, "dest");
        parcel.writeString(this.r.name());
        parcel.writeInt(this.s ? 1 : 0);
        parcel.writeInt(this.t ? 1 : 0);
        parcel.writeString(this.u);
        parcel.writeString(this.v);
        parcel.writeString(this.w);
        parcel.writeInt(this.x);
        parcel.writeString(this.y);
        parcel.writeString(this.z);
        parcel.writeInt(this.A ? 1 : 0);
    }
}
