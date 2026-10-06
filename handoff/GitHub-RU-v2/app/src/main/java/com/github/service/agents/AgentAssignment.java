package com.github.service.agents;

import a0.s0;
import android.os.Parcel;
import android.os.Parcelable;
import com.github.rudroid.copilot.h1;
import g81.e;
import k71.k;
import kotlinx.serialization.KSerializer;
import l7.c0;

@e
/* loaded from: /home/user/work/p/classes3.dex */
public final class AgentAssignment implements Parcelable {
    public String r;
    public String s;
    public String t;
    public String u;
    public String v;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<AgentAssignment> CREATOR = new c0(3);

    public static final class Companion {
        public final KSerializer serializer() {
            return AgentAssignment$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AgentAssignment(int i, String str, String str2, String str3, String str4, String str5) {
        if ((i & 1) == 0) {
            this.r = null;
        } else {
            this.r = str;
        }
        if ((i & 2) == 0) {
            this.s = null;
        } else {
            this.s = str2;
        }
        if ((i & 4) == 0) {
            this.t = null;
        } else {
            this.t = str3;
        }
        if ((i & 8) == 0) {
            this.u = null;
        } else {
            this.u = str4;
        }
        if ((i & 16) == 0) {
            this.v = null;
        } else {
            this.v = str5;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AgentAssignment)) {
            return false;
        }
        AgentAssignment agentAssignment = (AgentAssignment) obj;
        return k.b(this.r, agentAssignment.r) && k.b(this.s, agentAssignment.s) && k.b(this.t, agentAssignment.t) && k.b(this.u, agentAssignment.u) && k.b(this.v, agentAssignment.v);
    }

    public final int hashCode() {
        String str = this.r;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.s;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.t;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.u;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.v;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder o = s0.o("AgentAssignment(targetRepositoryId=", this.r, ", baseRef=", this.s, ", customInstructions=");
        f1.e.x(o, this.t, ", customAgent=", this.u, ", model=");
        return h1.p(o, this.v, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        parcel.writeString(this.r);
        parcel.writeString(this.s);
        parcel.writeString(this.t);
        parcel.writeString(this.u);
        parcel.writeString(this.v);
    }

    public AgentAssignment(String str, String str2, String str3, String str4, String str5) {
        this.r = str;
        this.s = str2;
        this.t = str3;
        this.u = str4;
        this.v = str5;
    }
}
