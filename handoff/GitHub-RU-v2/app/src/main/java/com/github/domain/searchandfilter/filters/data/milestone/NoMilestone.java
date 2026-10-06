package com.github.domain.searchandfilter.filters.data.milestone;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.service.models.response.type.MilestoneState;
import f1.u5;
import f8.a;
import g81.e;
import java.time.ZonedDateTime;
import k71.k;
import kotlinx.serialization.KSerializer;
import sy.w;
import w61.h;
import w61.i;
import yz0.v2;

@e
/* loaded from: /home/user/work/p/classes3.dex */
public final class NoMilestone implements v2 {
    public final String r;
    public final String s;
    public final MilestoneState t;
    public final int u;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<NoMilestone> CREATOR = new a(19);
    public static final h[] v = {null, null, w.s(i.r, new u5(15)), null};
    public static final NoMilestone w = new NoMilestone();

    public static final class Companion {
        public final KSerializer serializer() {
            return NoMilestone$$serializer.INSTANCE;
        }
    }

    public NoMilestone() {
        this.r = "";
        this.s = "";
        this.t = MilestoneState.UNKNOWN__;
    }

    public final ZonedDateTime A() {
        return null;
    }

    public final int describeContents() {
        return 0;
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

    public final int v() {
        return this.u;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        parcel.writeInt(1);
    }

    public /* synthetic */ NoMilestone(int i, String str, String str2, MilestoneState milestoneState, int i2) {
        if ((i & 1) == 0) {
            this.r = "";
        } else {
            this.r = str;
        }
        if ((i & 2) == 0) {
            this.s = "";
        } else {
            this.s = str2;
        }
        if ((i & 4) == 0) {
            this.t = MilestoneState.UNKNOWN__;
        } else {
            this.t = milestoneState;
        }
        if ((i & 8) == 0) {
            this.u = 0;
        } else {
            this.u = i2;
        }
    }

    public static  s(Object... a) {
        return null;
    }
}
