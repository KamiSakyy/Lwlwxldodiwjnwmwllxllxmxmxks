package com.github.domain.database.serialization;

import a0.s0;
import android.os.Parcel;
import android.os.Parcelable;
import com.github.rudroid.copilot.h1;
import com.github.service.models.response.type.MilestoneState;
import f1.u5;
import g81.e;
import java.time.ZonedDateTime;
import k71.k;
import k81.c1;
import kotlinx.serialization.KSerializer;
import sy.w;
import w61.h;
import w61.i;
import yz0.v2;

@e
/* loaded from: /home/user/work/p/classes3.dex */
public final class SerializableMilestone implements v2 {
    public String r;
    public String s;
    public MilestoneState t;
    public int u;
    public String v;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<SerializableMilestone> CREATOR = new f8.a(16);
    public static final h[] w = {null, null, w.s(i.r, new u5(14)), null, null};

    public static final class Companion {
        public final KSerializer serializer() {
            return SerializableMilestone$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SerializableMilestone(int i, String str, String str2, MilestoneState milestoneState, int i2, String str3) {
        if (31 != (i & 31)) {
            c1.l(i, 31, SerializableMilestone$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.r = str;
        this.s = str2;
        this.t = milestoneState;
        this.u = i2;
        this.v = str3;
    }

    public final ZonedDateTime A() {
        String str = this.v;
        if (str != null) {
            return ZonedDateTime.parse(str);
        }
        return null;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SerializableMilestone)) {
            return false;
        }
        SerializableMilestone serializableMilestone = (SerializableMilestone) obj;
        return k.b(this.r, serializableMilestone.r) && k.b(this.s, serializableMilestone.s) && this.t == serializableMilestone.t && this.u == serializableMilestone.u && k.b(this.v, serializableMilestone.v);
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
        String str = this.v;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder o = s0.o("SerializableMilestone(id=", this.r, ", name=", this.s, ", state=");
        o.append(this.t);
        o.append(", progress=");
        o.append(this.u);
        o.append(", dueOnString=");
        return h1.p(o, this.v, ")");
    }

    public final int v() {
        return this.u;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        parcel.writeString(this.r);
        parcel.writeString(this.s);
        parcel.writeString(this.t.name());
        parcel.writeInt(this.u);
        parcel.writeString(this.v);
    }

    public SerializableMilestone(String str, String str2, MilestoneState milestoneState, int i, String str3) {
        k.g(str, "id");
        k.g(str2, "name");
        k.g(milestoneState, "state");
        this.r = str;
        this.s = str2;
        this.t = milestoneState;
        this.u = i;
        this.v = str3;
    }
}
