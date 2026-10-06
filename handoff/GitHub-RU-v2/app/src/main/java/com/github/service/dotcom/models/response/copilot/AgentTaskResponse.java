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

@e
/* loaded from: /home/user/work/p/classes3.dex */
public final class AgentTaskResponse {
    public static final Companion Companion = new Companion();
    public static final h[] p;
    public String a;
    public String b;
    public xn.e c;
    public String d;
    public String e;
    public String f;
    public long g;
    public long h;
    public long i;
    public int j;
    public List k;
    public List l;
    public List m;
    public Boolean n;
    public List o;

    public static final class Companion {
        public final KSerializer serializer() {
            return AgentTaskResponse$$serializer.INSTANCE;
        }
    }

    static {
        i iVar = i.r;
        p = new h[]{null, null, w.s(iVar, new a(1)), null, null, null, null, null, null, null, w.s(iVar, new a(2)), w.s(iVar, new a(3)), w.s(iVar, new a(4)), null, w.s(iVar, new a(5))};
    }

    public /* synthetic */ AgentTaskResponse(int i, String str, String str2, xn.e eVar, String str3, String str4, String str5, long j, long j2, long j3, int i2, List list, List list2, List list3, Boolean bool, List list4) {
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
            this.c = xn.e.u;
        } else {
            this.c = eVar;
        }
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = "";
        } else {
            this.e = str4;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str5;
        }
        if ((i & 64) == 0) {
            this.g = 0L;
        } else {
            this.g = j;
        }
        if ((i & 128) == 0) {
            this.h = 0L;
        } else {
            this.h = j2;
        }
        if ((i & 256) == 0) {
            this.i = 0L;
        } else {
            this.i = j3;
        }
        this.j = (i & 512) == 0 ? 0 : i2;
        int i3 = i & 1024;
        rShadow rVar = rShadow.r;
        if (i3 == 0) {
            this.k = rVar;
        } else {
            this.k = list;
        }
        if ((i & 2048) == 0) {
            this.l = rVar;
        } else {
            this.l = list2;
        }
        if ((i & 4096) == 0) {
            this.m = rVar;
        } else {
            this.m = list3;
        }
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = bool;
        }
        if ((i & 16384) == 0) {
            this.o = rVar;
        } else {
            this.o = list4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AgentTaskResponse)) {
            return false;
        }
        AgentTaskResponse agentTaskResponse = (AgentTaskResponse) obj;
        return k.b(this.a, agentTaskResponse.a) && k.b(this.b, agentTaskResponse.b) && this.c == agentTaskResponse.c && k.b(this.d, agentTaskResponse.d) && k.b(this.e, agentTaskResponse.e) && k.b(this.f, agentTaskResponse.f) && this.g == agentTaskResponse.g && this.h == agentTaskResponse.h && this.i == agentTaskResponse.i && this.j == agentTaskResponse.j && k.b(this.k, agentTaskResponse.k) && k.b(this.l, agentTaskResponse.l) && k.b(this.m, agentTaskResponse.m) && k.b(this.n, agentTaskResponse.n) && k.b(this.o, agentTaskResponse.o);
    }

    public final int hashCode() {
        int i = h1.i(h1.i((this.c.hashCode() + h1.i(this.a.hashCode() * 31, this.b, 31)) * 31, this.d, 31), this.e, 31);
        String str = this.f;
        int c = f1.e.c(this.m, f1.e.c(this.l, f1.e.c(this.k, s0.b(this.j, x.i.c(x.i.c(x.i.c((i + (str == null ? 0 : str.hashCode())) * 31, 31, this.g), 31, this.h), 31, this.i), 31), 31), 31), 31);
        Boolean bool = this.n;
        return this.o.hashCode() + ((c + (bool != null ? bool.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("AgentTaskResponse(id=", this.a, ", name=", this.b, ", state=");
        o.append(this.c);
        o.append(", createdAt=");
        o.append(this.d);
        o.append(", lastUpdatedAt=");
        f1.e.x(o, this.e, ", archivedAt=", this.f, ", creatorId=");
        o.append(this.g);
        o.append(", ownerId=");
        o.append(this.h);
        o.append(", repoId=");
        o.append(this.i);
        o.append(", sessionCount=");
        o.append(this.j);
        o.append(", agentCollaborators=");
        o.append(this.k);
        o.append(", artifacts=");
        o.append(this.l);
        o.append(", userCollaborators=");
        o.append(this.m);
        o.append(", remoteSteerable=");
        o.append(this.n);
        o.append(", sessions=");
        o.append(this.o);
        o.append(")");
        return o.toString();
    }
}
