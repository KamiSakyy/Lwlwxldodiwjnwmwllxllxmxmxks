package com.github.service.dotcom.models.response.copilot;

import com.github.rudroid.copilot.h1;
import g81.e;
import gz.a;
import java.util.List;
import k71.k;
import k81.c1;
import kotlinx.serialization.KSerializer;
import sy.w;
import w61.h;
import w61.i;
import xn.c4;

@e
/* loaded from: /home/user/work/p/classes3.dex */
public final class SteerAgentTaskRequest {
    public static final Companion Companion = new Companion();
    public static final h[] h = {null, null, null, null, null, null, w.s(i.r, new a(19))};
    public c4 a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public List g;

    public static final class Companion {
        public final KSerializer serializer() {
            return SteerAgentTaskRequest$$serializer.INSTANCE;
        }
    }

    public SteerAgentTaskRequest(c4 c4Var, String str, List list) {
        k.g(str, "type");
        this.a = c4Var;
        this.b = null;
        this.c = str;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SteerAgentTaskRequest)) {
            return false;
        }
        SteerAgentTaskRequest steerAgentTaskRequest = (SteerAgentTaskRequest) obj;
        return k.b(this.a, steerAgentTaskRequest.a) && k.b(this.b, steerAgentTaskRequest.b) && k.b(this.c, steerAgentTaskRequest.c) && k.b(this.d, steerAgentTaskRequest.d) && k.b(this.e, steerAgentTaskRequest.e) && k.b(this.f, steerAgentTaskRequest.f) && k.b(this.g, steerAgentTaskRequest.g);
    }

    public final int hashCode() {
        c4 c4Var = this.a;
        int hashCode = (c4Var == null ? 0 : c4Var.hashCode()) * 31;
        String str = this.b;
        int i = h1.i((hashCode + (str == null ? 0 : str.hashCode())) * 31, this.c, 31);
        String str2 = this.d;
        int hashCode2 = (i + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List list = this.g;
        return hashCode4 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SteerAgentTaskRequest(content=");
        sb.append(this.a);
        sb.append(", problemStatement=");
        sb.append(this.b);
        sb.append(", type=");
        f1.e.x(sb, this.c, ", model=", this.d, ", customAgent=");
        f1.e.x(sb, this.e, ", eventType=", this.f, ", eventIdentifiers=");
        return x.i.l(sb, this.g, ")");
    }

    public /* synthetic */ SteerAgentTaskRequest(int i, c4 c4Var, String str, String str2, String str3, String str4, String str5, List list) {
        if (4 != (i & 4)) {
            c1.l(i, 4, SteerAgentTaskRequest$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = c4Var;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        this.c = str2;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str4;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str5;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = list;
        }
    }
}
