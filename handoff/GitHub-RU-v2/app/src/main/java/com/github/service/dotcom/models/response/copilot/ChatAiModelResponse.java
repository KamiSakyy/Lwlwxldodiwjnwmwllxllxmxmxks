package com.github.service.dotcom.models.response.copilot;

import a0.s0;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;
import g81.e;
import gz.a;
import k71.k;
import k81.c1Shadow;
import kotlinx.serialization.KSerializer;
import sy.w;
import w61.h;
import w61.i;

@e
/* loaded from: /home/user/work/p/classes3.dex */
public final class ChatAiModelResponse {
    public static final Companion Companion = new Companion();
    public static final h[] m = {null, null, null, null, w.s(i.r, new a(14)), null, null, null, null, null, null, null};
    public String a;
    public String b;
    public String c;
    public boolean d;
    public gz.e e;
    public AiModelCapabilitiesResponse f;
    public AiModelSupportsResponse g;
    public AiModelPolicyResponse h;
    public AiModelBillingResponse i;
    public boolean j;
    public boolean k;
    public boolean l;

    public static final class Companion {
        public final KSerializer serializer() {
            return ChatAiModelResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ChatAiModelResponse(int i, AiModelBillingResponse aiModelBillingResponse, AiModelCapabilitiesResponse aiModelCapabilitiesResponse, AiModelPolicyResponse aiModelPolicyResponse, AiModelSupportsResponse aiModelSupportsResponse, gz.e eVar, String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4) {
        if (1568 != (i & 1568)) {
            c1Shadow.l(i, 1568, ChatAiModelResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
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
            this.c = "";
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = false;
        } else {
            this.d = z;
        }
        this.e = (i & 16) == 0 ? gz.e.s : eVar;
        this.f = aiModelCapabilitiesResponse;
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = aiModelSupportsResponse;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = aiModelPolicyResponse;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = aiModelBillingResponse;
        }
        this.j = z2;
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
        if (!(obj instanceof ChatAiModelResponse)) {
            return false;
        }
        ChatAiModelResponse chatAiModelResponse = (ChatAiModelResponse) obj;
        return k.b(this.a, chatAiModelResponse.a) && k.b(this.b, chatAiModelResponse.b) && k.b(this.c, chatAiModelResponse.c) && this.d == chatAiModelResponse.d && this.e == chatAiModelResponse.e && k.b(this.f, chatAiModelResponse.f) && k.b(this.g, chatAiModelResponse.g) && k.b(this.h, chatAiModelResponse.h) && k.b(this.i, chatAiModelResponse.i) && this.j == chatAiModelResponse.j && this.k == chatAiModelResponse.k && this.l == chatAiModelResponse.l;
    }

    public final int hashCode() {
        int hashCode = (this.f.hashCode() + ((this.e.hashCode() + x.i.e(h1.i(h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), 31, this.d)) * 31)) * 31;
        AiModelSupportsResponse aiModelSupportsResponse = this.g;
        int hashCode2 = (hashCode + (aiModelSupportsResponse == null ? 0 : Boolean.hashCode(aiModelSupportsResponse.a))) * 31;
        AiModelPolicyResponse aiModelPolicyResponse = this.h;
        int hashCode3 = (hashCode2 + (aiModelPolicyResponse == null ? 0 : aiModelPolicyResponse.hashCode())) * 31;
        AiModelBillingResponse aiModelBillingResponse = this.i;
        return Boolean.hashCode(this.l) + x.i.e(x.i.e((hashCode3 + (aiModelBillingResponse != null ? aiModelBillingResponse.hashCode() : 0)) * 31, 31, this.j), 31, this.k);
    }

    public final String toString() {
        StringBuilder o = s0.o("ChatAiModelResponse(name=", this.a, ", id=", this.b, ", vendor=");
        m0.x(o, this.c, ", modelPickerEnabled=", this.d, ", modelPickerCategory=");
        o.append(this.e);
        o.append(", capabilities=");
        o.append(this.f);
        o.append(", supports=");
        o.append(this.g);
        o.append(", policy=");
        o.append(this.h);
        o.append(", billing=");
        o.append(this.i);
        o.append(", isChatDefault=");
        o.append(this.j);
        o.append(", isChatFallback=");
        return m0.m(o, this.k, ", preview=", this.l, ")");
    }
}
