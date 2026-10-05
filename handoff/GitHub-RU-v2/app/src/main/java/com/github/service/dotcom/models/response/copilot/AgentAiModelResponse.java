package com.github.service.dotcom.models.response.copilot;

import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;
import f1.u5;
import g81.e;
import k71.k;
import k81.c1;
import kotlinx.serialization.KSerializer;
import sy.w;
import w61.h;
import w61.i;

@e
/* loaded from: /home/user/work/p/classes3.dex */
public final class AgentAiModelResponse {
    public static final Companion Companion = new Companion();
    public static final h[] m = {null, null, null, null, null, w.s(i.r, new u5(29)), null, null, null, null, null, null};
    public final boolean a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final gz.e f;
    public final AiModelCapabilitiesResponse g;
    public final AiModelSupportsResponse h;
    public final AiModelPolicyResponse i;
    public final AiModelBillingResponse j;
    public final boolean k;
    public final boolean l;

    public static final class Companion {
        public final KSerializer serializer() {
            return AgentAiModelResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AgentAiModelResponse(int i, AiModelBillingResponse aiModelBillingResponse, AiModelCapabilitiesResponse aiModelCapabilitiesResponse, AiModelPolicyResponse aiModelPolicyResponse, AiModelSupportsResponse aiModelSupportsResponse, gz.e eVar, String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4) {
        if (1088 != (i & 1088)) {
            c1.l(i, 1088, AgentAiModelResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.a = false;
        } else {
            this.a = z;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = false;
        } else {
            this.e = z2;
        }
        this.f = (i & 32) == 0 ? gz.e.s : eVar;
        this.g = aiModelCapabilitiesResponse;
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = aiModelSupportsResponse;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = aiModelPolicyResponse;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = aiModelBillingResponse;
        }
        this.k = z3;
        if ((i & 2048) == 0) {
            this.l = false;
        } else {
            this.l = z4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AgentAiModelResponse)) {
            return false;
        }
        AgentAiModelResponse agentAiModelResponse = (AgentAiModelResponse) obj;
        return this.a == agentAiModelResponse.a && k.b(this.b, agentAiModelResponse.b) && k.b(this.c, agentAiModelResponse.c) && k.b(this.d, agentAiModelResponse.d) && this.e == agentAiModelResponse.e && this.f == agentAiModelResponse.f && k.b(this.g, agentAiModelResponse.g) && k.b(this.h, agentAiModelResponse.h) && k.b(this.i, agentAiModelResponse.i) && k.b(this.j, agentAiModelResponse.j) && this.k == agentAiModelResponse.k && this.l == agentAiModelResponse.l;
    }

    public final int hashCode() {
        int hashCode = (this.g.hashCode() + ((this.f.hashCode() + x.i.e(h1.i(h1.i(h1.i(Boolean.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31), 31, this.e)) * 31)) * 31;
        AiModelSupportsResponse aiModelSupportsResponse = this.h;
        int hashCode2 = (hashCode + (aiModelSupportsResponse == null ? 0 : Boolean.hashCode(aiModelSupportsResponse.a))) * 31;
        AiModelPolicyResponse aiModelPolicyResponse = this.i;
        int hashCode3 = (hashCode2 + (aiModelPolicyResponse == null ? 0 : aiModelPolicyResponse.hashCode())) * 31;
        AiModelBillingResponse aiModelBillingResponse = this.j;
        return Boolean.hashCode(this.l) + x.i.e((hashCode3 + (aiModelBillingResponse != null ? aiModelBillingResponse.hashCode() : 0)) * 31, 31, this.k);
    }

    public final String toString() {
        StringBuilder t = h1.t("AgentAiModelResponse(auto=", ", name=", this.b, ", id=", this.a);
        f1.e.x(t, this.c, ", vendor=", this.d, ", modelPickerEnabled=");
        t.append(this.e);
        t.append(", modelPickerCategory=");
        t.append(this.f);
        t.append(", capabilities=");
        t.append(this.g);
        t.append(", supports=");
        t.append(this.h);
        t.append(", policy=");
        t.append(this.i);
        t.append(", billing=");
        t.append(this.j);
        t.append(", isChatDefault=");
        return m0.m(t, this.k, ", preview=", this.l, ")");
    }
}
