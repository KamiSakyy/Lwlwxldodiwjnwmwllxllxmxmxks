package kx0;

import a0.s0;
import android.os.Parcel;
import android.os.Parcelable;
import com.github.rudroid.copilot.h1;
import com.github.service.models.response.type.MilestoneState;
import java.time.ZonedDateTime;
import yz0.v2;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g implements v2 {
    public static final Parcelable.Creator<g> CREATOR = new gn.m(28);
    public String r;
    public String s;
    public MilestoneState t;
    public int u;
    public ZonedDateTime v;

    public g(String str, String str2, MilestoneState milestoneState, int i, ZonedDateTime zonedDateTime) {
        k71.k.g(str, "id");
        k71.k.g(str2, "name");
        k71.k.g(milestoneState, "state");
        this.r = str;
        this.s = str2;
        this.t = milestoneState;
        this.u = i;
        this.v = zonedDateTime;
    }

    @Override // yz0.v2
    public final ZonedDateTime A() {
        return this.v;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return k71.k.b(this.r, gVar.r) && k71.k.b(this.s, gVar.s) && this.t == gVar.t && this.u == gVar.u && k71.k.b(this.v, gVar.v);
    }

    @Override // yz0.v2
    public final String getId() {
        return this.r;
    }

    @Override // yz0.v2
    public final String getName() {
        return this.s;
    }

    @Override // yz0.v2
    public final MilestoneState getState() {
        return this.t;
    }

    public final int hashCode() {
        int b = s0.b(this.u, (this.t.hashCode() + h1.i(this.r.hashCode() * 31, this.s, 31)) * 31, 31);
        ZonedDateTime zonedDateTime = this.v;
        return b + (zonedDateTime == null ? 0 : zonedDateTime.hashCode());
    }

    public final String toString() {
        StringBuilder o = s0.o("ApolloMilestone(id=", this.r, ", name=", this.s, ", state=");
        o.append(this.t);
        o.append(", progress=");
        o.append(this.u);
        o.append(", dueOn=");
        return h1.q(o, this.v, ")");
    }

    @Override // yz0.v2
    public final int v() {
        return this.u;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k71.k.g(parcel, "dest");
        parcel.writeString(this.r);
        parcel.writeString(this.s);
        parcel.writeString(this.t.name());
        parcel.writeInt(this.u);
        parcel.writeSerializable(this.v);
    }
}
