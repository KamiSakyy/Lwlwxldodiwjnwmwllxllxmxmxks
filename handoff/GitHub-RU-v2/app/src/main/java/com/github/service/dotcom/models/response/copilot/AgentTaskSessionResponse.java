package com.github.service.dotcom.models.response.copilot;

import a0.s0;
import com.github.rudroid.copilot.h1;
import g81.e;
import gz.a;
import java.util.List;
import k71.k;
import kotlinx.serialization.KSerializer;
import sy.w;
import w61.h;
import w61.i;
import x61.rShadow;
import xn.g3;

@e
/* loaded from: /home/user/work/p/classes3.dex */
public final class AgentTaskSessionResponse {
    public static final h[] B;
    public static final Companion Companion = new Companion();
    public AgentTaskSessionErrorResponse A;
    public String a;
    public String b;
    public long c;
    public long d;
    public long e;
    public long f;
    public String g;
    public String h;
    public xn.e i;
    public String j;
    public String k;
    public String l;
    public String m;
    public String n;
    public String o;
    public List p;
    public String q;
    public long r;
    public int s;
    public String t;
    public g3 u;
    public String v;
    public String w;
    public long x;
    public String y;
    public double z;

    public static final class Companion {
        public final KSerializer serializer() {
            return AgentTaskSessionResponse$$serializer.INSTANCE;
        }
    }

    static {
        i iVar = i.r;
        B = new h[]{null, null, null, null, null, null, null, null, w.s(iVar, new a(6)), null, null, null, null, null, null, w.s(iVar, new a(7)), null, null, null, null, w.s(iVar, new a(8)), null, null, null, null, null, null};
    }

    public /* synthetic */ AgentTaskSessionResponse(int i, String str, String str2, long j, long j2, long j3, long j4, String str3, String str4, xn.e eVar, String str5, String str6, String str7, String str8, String str9, String str10, List list, String str11, long j5, int i2, String str12, g3 g3Var, String str13, String str14, long j6, String str15, double d, AgentTaskSessionErrorResponse agentTaskSessionErrorResponse) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = 0L;
        } else {
            this.c = j;
        }
        if ((i & 8) == 0) {
            this.d = 0L;
        } else {
            this.d = j2;
        }
        if ((i & 16) == 0) {
            this.e = 0L;
        } else {
            this.e = j3;
        }
        if ((i & 32) == 0) {
            this.f = 0L;
        } else {
            this.f = j4;
        }
        if ((i & 64) == 0) {
            this.g = "";
        } else {
            this.g = str3;
        }
        if ((i & 128) == 0) {
            this.h = "";
        } else {
            this.h = str4;
        }
        this.i = (i & 256) == 0 ? xn.e.u : eVar;
        if ((i & 512) == 0) {
            this.j = "";
        } else {
            this.j = str5;
        }
        if ((i & 1024) == 0) {
            this.k = "";
        } else {
            this.k = str6;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = str7;
        }
        if ((i & 4096) == 0) {
            this.m = "";
        } else {
            this.m = str8;
        }
        if ((i & 8192) == 0) {
            this.n = "";
        } else {
            this.n = str9;
        }
        if ((i & 16384) == 0) {
            this.o = "";
        } else {
            this.o = str10;
        }
        this.p = (32768 & i) == 0 ? rShadow.r : list;
        if ((65536 & i) == 0) {
            this.q = null;
        } else {
            this.q = str11;
        }
        if ((131072 & i) == 0) {
            this.r = 0L;
        } else {
            this.r = j5;
        }
        this.s = (262144 & i) == 0 ? 0 : i2;
        if ((524288 & i) == 0) {
            this.t = null;
        } else {
            this.t = str12;
        }
        if ((1048576 & i) == 0) {
            this.u = null;
        } else {
            this.u = g3Var;
        }
        if ((2097152 & i) == 0) {
            this.v = null;
        } else {
            this.v = str13;
        }
        if ((4194304 & i) == 0) {
            this.w = null;
        } else {
            this.w = str14;
        }
        if ((8388608 & i) == 0) {
            this.x = 0L;
        } else {
            this.x = j6;
        }
        if ((16777216 & i) == 0) {
            this.y = "";
        } else {
            this.y = str15;
        }
        this.z = (33554432 & i) == 0 ? 0.0d : d;
        if ((i & 67108864) == 0) {
            this.A = null;
        } else {
            this.A = agentTaskSessionErrorResponse;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AgentTaskSessionResponse)) {
            return false;
        }
        AgentTaskSessionResponse agentTaskSessionResponse = (AgentTaskSessionResponse) obj;
        return k.b(this.a, agentTaskSessionResponse.a) && k.b(this.b, agentTaskSessionResponse.b) && this.c == agentTaskSessionResponse.c && this.d == agentTaskSessionResponse.d && this.e == agentTaskSessionResponse.e && this.f == agentTaskSessionResponse.f && k.b(this.g, agentTaskSessionResponse.g) && k.b(this.h, agentTaskSessionResponse.h) && this.i == agentTaskSessionResponse.i && k.b(this.j, agentTaskSessionResponse.j) && k.b(this.k, agentTaskSessionResponse.k) && k.b(this.l, agentTaskSessionResponse.l) && k.b(this.m, agentTaskSessionResponse.m) && k.b(this.n, agentTaskSessionResponse.n) && k.b(this.o, agentTaskSessionResponse.o) && k.b(this.p, agentTaskSessionResponse.p) && k.b(this.q, agentTaskSessionResponse.q) && this.r == agentTaskSessionResponse.r && this.s == agentTaskSessionResponse.s && k.b(this.t, agentTaskSessionResponse.t) && this.u == agentTaskSessionResponse.u && k.b(this.v, agentTaskSessionResponse.v) && k.b(this.w, agentTaskSessionResponse.w) && this.x == agentTaskSessionResponse.x && k.b(this.y, agentTaskSessionResponse.y) && Double.compare(this.z, agentTaskSessionResponse.z) == 0 && k.b(this.A, agentTaskSessionResponse.A);
    }

    public final int hashCode() {
        int i = h1.i(h1.i((this.i.hashCode() + h1.i(h1.i(x.i.c(x.i.c(x.i.c(x.i.c(h1.i(this.a.hashCode() * 31, this.b, 31), 31, this.c), 31, this.d), 31, this.e), 31, this.f), this.g, 31), this.h, 31)) * 31, this.j, 31), this.k, 31);
        String str = this.l;
        int c = f1.e.c(this.p, h1.i(h1.i(h1.i((i + (str == null ? 0 : str.hashCode())) * 31, this.m, 31), this.n, 31), this.o, 31), 31);
        String str2 = this.q;
        int b = s0.b(this.s, x.i.c((c + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.r), 31);
        String str3 = this.t;
        int hashCode = (b + (str3 == null ? 0 : str3.hashCode())) * 31;
        g3 g3Var = this.u;
        int hashCode2 = (hashCode + (g3Var == null ? 0 : g3Var.hashCode())) * 31;
        String str4 = this.v;
        int hashCode3 = (hashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.w;
        int hashCode4 = (Double.hashCode(this.z) + h1.i(x.i.c((hashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.x), this.y, 31)) * 31;
        AgentTaskSessionErrorResponse agentTaskSessionErrorResponse = this.A;
        return hashCode4 + (agentTaskSessionErrorResponse != null ? agentTaskSessionErrorResponse.a.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder o = s0.o("AgentTaskSessionResponse(id=", this.a, ", name=", this.b, ", userId=");
        o.append(this.c);
        o.append(", ownerId=");
        o.append(this.d);
        o.append(", repoId=");
        o.append(this.e);
        o.append(", agentId=");
        o.append(this.f);
        o.append(", agentTaskId=");
        f1.e.x(o, this.g, ", taskId=", this.h, ", state=");
        o.append(this.i);
        o.append(", createdAt=");
        o.append(this.j);
        o.append(", lastUpdatedAt=");
        f1.e.x(o, this.k, ", completedAt=", this.l, ", eventType=");
        f1.e.x(o, this.m, ", eventUrl=", this.n, ", eventContent=");
        o.append(this.o);
        o.append(", eventIdentifiers=");
        o.append(this.p);
        o.append(", resourceType=");
        o.append(this.q);
        o.append(", resourceId=");
        o.append(this.r);
        o.append(", resourceNumber=");
        o.append(this.s);
        o.append(", resourceGlobalId=");
        o.append(this.t);
        o.append(", resourceState=");
        o.append(this.u);
        o.append(", headRef=");
        o.append(this.v);
        o.append(", baseRef=");
        o.append(this.w);
        o.append(", workflowRunId=");
        o.append(this.x);
        o.append(", model=");
        o.append(this.y);
        o.append(", premiumRequests=");
        o.append(this.z);
        o.append(", error=");
        o.append(this.A);
        o.append(")");
        return o.toString();
    }
}
