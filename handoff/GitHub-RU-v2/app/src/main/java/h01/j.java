package h01;

import a0.s0;
import android.os.Parcel;
import android.os.Parcelable;
import com.github.rudroid.copilot.h1;
import com.github.service.models.response.issueorpullrequest.CloseReason;
import com.github.service.models.response.type.IssueState;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j implements Parcelable {
    public static final Parcelable.Creator<j> CREATOR = new gn.m(17);
    public String r;
    public String s;
    public String t;
    public int u;
    public CloseReason v;
    public IssueState w;
    public String x;
    public String y;

    public j(String str, String str2, String str3, int i, CloseReason closeReason, IssueState issueState, String str4, String str5) {
        k71.k.g(str, "id");
        k71.k.g(str2, "title");
        k71.k.g(str3, "titleHTML");
        k71.k.g(issueState, "state");
        k71.k.g(str4, "repoOwner");
        k71.k.g(str5, "repoName");
        this.r = str;
        this.s = str2;
        this.t = str3;
        this.u = i;
        this.v = closeReason;
        this.w = issueState;
        this.x = str4;
        this.y = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return k71.k.b(this.r, jVar.r) && k71.k.b(this.s, jVar.s) && k71.k.b(this.t, jVar.t) && this.u == jVar.u && this.v == jVar.v && this.w == jVar.w && k71.k.b(this.x, jVar.x) && k71.k.b(this.y, jVar.y);
    }

    public final int hashCode() {
        int b = s0.b(this.u, h1.i(h1.i(this.r.hashCode() * 31, this.s, 31), this.t, 31), 31);
        CloseReason closeReason = this.v;
        return this.y.hashCode() + h1.i((this.w.hashCode() + ((b + (closeReason == null ? 0 : closeReason.hashCode())) * 31)) * 31, this.x, 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("ParentIssueData(id=", this.r, ", title=", this.s, ", titleHTML=");
        s0.w(this.u, this.t, ", number=", ", closeReason=", o);
        o.append(this.v);
        o.append(", state=");
        o.append(this.w);
        o.append(", repoOwner=");
        return x.i.k(o, this.x, ", repoName=", this.y, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k71.k.g(parcel, "dest");
        parcel.writeString(this.r);
        parcel.writeString(this.s);
        parcel.writeString(this.t);
        parcel.writeInt(this.u);
        CloseReason closeReason = this.v;
        if (closeReason == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(closeReason.name());
        }
        parcel.writeString(this.w.name());
        parcel.writeString(this.x);
        parcel.writeString(this.y);
    }
}
