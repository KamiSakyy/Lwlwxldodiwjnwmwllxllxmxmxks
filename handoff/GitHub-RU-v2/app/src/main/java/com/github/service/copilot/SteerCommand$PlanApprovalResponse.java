package com.github.service.copilot;

import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;
import g81.e;
import k71.k;
import k81.c1Shadow;
import kotlinx.serialization.KSerializer;
import x.i;
import xn.c4;

@e
/* loaded from: /home/user/work/p/classes3.dex */
public final class SteerCommand$PlanApprovalResponse implements c4 {
    public static final Companion Companion = new Companion();
    public String a;
    public boolean b;
    public String c;
    public Boolean d;
    public String e;

    public static final class Companion {
        public final KSerializer serializer() {
            return SteerCommand$PlanApprovalResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SteerCommand$PlanApprovalResponse(int i, String str, boolean z, String str2, Boolean bool, String str3) {
        if (3 != (i & 3)) {
            c1Shadow.l(i, 3, SteerCommand$PlanApprovalResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = z;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = bool;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SteerCommand$PlanApprovalResponse)) {
            return false;
        }
        SteerCommand$PlanApprovalResponse steerCommand$PlanApprovalResponse = (SteerCommand$PlanApprovalResponse) obj;
        return k.b(this.a, steerCommand$PlanApprovalResponse.a) && this.b == steerCommand$PlanApprovalResponse.b && k.b(this.c, steerCommand$PlanApprovalResponse.c) && k.b(this.d, steerCommand$PlanApprovalResponse.d) && k.b(this.e, steerCommand$PlanApprovalResponse.e);
    }

    @Override // xn.c4
    public final String getType() {
        return "plan_approval_response";
    }

    public final int hashCode() {
        int e = i.e(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int hashCode = (e + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.d;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.e;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder o = m0.o("PlanApprovalResponse(promptId=", this.a, ", approved=", ", selectedAction=", this.b);
        o.append(this.c);
        o.append(", autoApproveEdits=");
        o.append(this.d);
        o.append(", feedback=");
        return h1.p(o, this.e, ")");
    }

    public SteerCommand$PlanApprovalResponse(String str, boolean z, String str2, Boolean bool, String str3) {
        this.a = str;
        this.b = z;
        this.c = str2;
        this.d = bool;
        this.e = str3;
    }
}
