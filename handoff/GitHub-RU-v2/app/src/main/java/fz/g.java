package fz;

import a0.s0;
import android.os.Parcel;
import android.os.Parcelable;
import com.github.rudroid.copilot.h1;
import com.github.service.models.response.type.MilestoneState;
import java.time.ZonedDateTime;
import yz0.v2;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g implements v2 {
    public static final Parcelable.Creator<g> CREATOR = new f8.a(21);
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

    public final ZonedDateTime A() {
        return this.v;
    }

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

    public final String getId() {
        return this.r;
    }

    public final String getName() {
        return this.s;
    }

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

    public final int v() {
        return this.u;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        k71.k.g(parcel, "dest");
        parcel.writeString(this.r);
        parcel.writeString(this.s);
        parcel.writeString(this.t.name());
        parcel.writeInt(this.u);
        parcel.writeSerializable(this.v);
    }
}
