package com.github.service.dotcom.models.response.copilot;

import java.util.List;
import k71.k;
import k81.c1Shadow;
import k81.d0;
import k81.e1;
import k81.l0;
import k81.q1;
import k81.r0;
import k81.v;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import m71.a;
import w61.c;
import w61.h;
import xn.eShadow;
import xn.g3;

@c
/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class AgentTaskSessionResponse$$serializer implements d0 {
    public static final AgentTaskSessionResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        AgentTaskSessionResponse$$serializer agentTaskSessionResponse$$serializer = new AgentTaskSessionResponse$$serializer();
        INSTANCE = agentTaskSessionResponse$$serializer;
        e1 e1Var = new e1("com.github.service.dotcom.models.response.copilot.AgentTaskSessionResponse", agentTaskSessionResponse$$serializer, 27);
        e1Var.l("id", true);
        e1Var.l("name", true);
        e1Var.l("user_id", true);
        e1Var.l("owner_id", true);
        e1Var.l("repo_id", true);
        e1Var.l("agent_id", true);
        e1Var.l("agent_task_id", true);
        e1Var.l("task_id", true);
        e1Var.l("state", true);
        e1Var.l("created_at", true);
        e1Var.l("last_updated_at", true);
        e1Var.l("completed_at", true);
        e1Var.l("event_type", true);
        e1Var.l("event_url", true);
        e1Var.l("event_content", true);
        e1Var.l("event_identifiers", true);
        e1Var.l("resource_type", true);
        e1Var.l("resource_id", true);
        e1Var.l("resource_number", true);
        e1Var.l("resource_global_id", true);
        e1Var.l("resource_state", true);
        e1Var.l("head_ref", true);
        e1Var.l("base_ref", true);
        e1Var.l("workflow_run_id", true);
        e1Var.l("model", true);
        e1Var.l("premium_requests", true);
        e1Var.l("error", true);
        descriptor = e1Var;
    }

    private AgentTaskSessionResponse$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer[] childSerializers() {
        h[] hVarArr = AgentTaskSessionResponse.B;
        q1 q1Var = q1.a;
        r0 r0Var = r0.a;
        return new KSerializer[]{q1Var, q1Var, r0Var, r0Var, r0Var, r0Var, q1Var, q1Var, hVarArr[8].getValue(), q1Var, q1Var, a.z(q1Var), q1Var, q1Var, q1Var, hVarArr[15].getValue(), a.z(q1Var), r0Var, l0.a, a.z(q1Var), a.z((KSerializer) hVarArr[20].getValue()), a.z(q1Var), a.z(q1Var), r0Var, q1Var, v.a, a.z(AgentTaskSessionErrorResponse$$serializer.INSTANCE)};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final AgentTaskSessionResponse m101deserialize(Decoder decoder) {
        h[] hVarArr;
        int i;
        k.g(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        j81.a b = decoder.b(serialDescriptor);
        h[] hVarArr2 = AgentTaskSessionResponse.B;
        eShadow eVar = null;
        g3 g3Var = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        AgentTaskSessionErrorResponse agentTaskSessionErrorResponse = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        long j6 = 0;
        double d = 0.0d;
        int i2 = 0;
        boolean z = true;
        int i3 = 0;
        String str13 = null;
        List list = null;
        String str14 = null;
        String str15 = null;
        while (z) {
            int t = b.t(serialDescriptor);
            switch (t) {
                case -1:
                    z = false;
                case 0:
                    hVarArr = hVarArr2;
                    str2 = b.r(serialDescriptor, 0);
                    i2 |= 1;
                    hVarArr2 = hVarArr;
                case 1:
                    hVarArr = hVarArr2;
                    str3 = b.r(serialDescriptor, 1);
                    i2 |= 2;
                    hVarArr2 = hVarArr;
                case 2:
                    hVarArr = hVarArr2;
                    j = b.f(serialDescriptor, 2);
                    i2 |= 4;
                    hVarArr2 = hVarArr;
                case 3:
                    hVarArr = hVarArr2;
                    j2 = b.f(serialDescriptor, 3);
                    i2 |= 8;
                    hVarArr2 = hVarArr;
                case 4:
                    hVarArr = hVarArr2;
                    j3 = b.f(serialDescriptor, 4);
                    i2 |= 16;
                    hVarArr2 = hVarArr;
                case 5:
                    hVarArr = hVarArr2;
                    j4 = b.f(serialDescriptor, 5);
                    i2 |= 32;
                    hVarArr2 = hVarArr;
                case 6:
                    hVarArr = hVarArr2;
                    str5 = b.r(serialDescriptor, 6);
                    i2 |= 64;
                    hVarArr2 = hVarArr;
                case 7:
                    hVarArr = hVarArr2;
                    str6 = b.r(serialDescriptor, 7);
                    i2 |= 128;
                    hVarArr2 = hVarArr;
                case 8:
                    hVarArr = hVarArr2;
                    eVar = (eShadow) b.A(serialDescriptor, 8, (KSerializer) hVarArr[8].getValue(), eVar);
                    i2 |= 256;
                    hVarArr2 = hVarArr;
                case 9:
                    hVarArr = hVarArr2;
                    str7 = b.r(serialDescriptor, 9);
                    i2 |= 512;
                    hVarArr2 = hVarArr;
                case 10:
                    hVarArr = hVarArr2;
                    str8 = b.r(serialDescriptor, 10);
                    i2 |= 1024;
                    hVarArr2 = hVarArr;
                case 11:
                    hVarArr = hVarArr2;
                    str13 = (String) b.x(serialDescriptor, 11, q1.a, str13);
                    i2 |= 2048;
                    hVarArr2 = hVarArr;
                case 12:
                    hVarArr = hVarArr2;
                    str9 = b.r(serialDescriptor, 12);
                    i2 |= 4096;
                    hVarArr2 = hVarArr;
                case 13:
                    hVarArr = hVarArr2;
                    str10 = b.r(serialDescriptor, 13);
                    i2 |= 8192;
                    hVarArr2 = hVarArr;
                case 14:
                    hVarArr = hVarArr2;
                    str11 = b.r(serialDescriptor, 14);
                    i2 |= 16384;
                    hVarArr2 = hVarArr;
                case 15:
                    hVarArr = hVarArr2;
                    list = (List) b.A(serialDescriptor, 15, (KSerializer) hVarArr[15].getValue(), list);
                    i = 32768;
                    i2 |= i;
                    hVarArr2 = hVarArr;
                case 16:
                    hVarArr = hVarArr2;
                    str14 = (String) b.x(serialDescriptor, 16, q1.a, str14);
                    i = 65536;
                    i2 |= i;
                    hVarArr2 = hVarArr;
                case 17:
                    hVarArr = hVarArr2;
                    j5 = b.f(serialDescriptor, 17);
                    i = 131072;
                    i2 |= i;
                    hVarArr2 = hVarArr;
                case 18:
                    hVarArr = hVarArr2;
                    i3 = b.m(serialDescriptor, 18);
                    i = 262144;
                    i2 |= i;
                    hVarArr2 = hVarArr;
                case 19:
                    hVarArr = hVarArr2;
                    str15 = (String) b.x(serialDescriptor, 19, q1.a, str15);
                    i = 524288;
                    i2 |= i;
                    hVarArr2 = hVarArr;
                case 20:
                    hVarArr = hVarArr2;
                    g3Var = (g3) b.x(serialDescriptor, 20, (KSerializer) hVarArr[20].getValue(), g3Var);
                    i = 1048576;
                    i2 |= i;
                    hVarArr2 = hVarArr;
                case 21:
                    hVarArr = hVarArr2;
                    str = (String) b.x(serialDescriptor, 21, q1.a, str);
                    i = 2097152;
                    i2 |= i;
                    hVarArr2 = hVarArr;
                case 22:
                    hVarArr = hVarArr2;
                    str4 = (String) b.x(serialDescriptor, 22, q1.a, str4);
                    i = 4194304;
                    i2 |= i;
                    hVarArr2 = hVarArr;
                case 23:
                    hVarArr = hVarArr2;
                    j6 = b.f(serialDescriptor, 23);
                    i = 8388608;
                    i2 |= i;
                    hVarArr2 = hVarArr;
                case 24:
                    hVarArr = hVarArr2;
                    str12 = b.r(serialDescriptor, 24);
                    i = 16777216;
                    i2 |= i;
                    hVarArr2 = hVarArr;
                case 25:
                    hVarArr = hVarArr2;
                    d = b.z(serialDescriptor, 25);
                    i = 33554432;
                    i2 |= i;
                    hVarArr2 = hVarArr;
                case 26:
                    hVarArr = hVarArr2;
                    agentTaskSessionErrorResponse = (AgentTaskSessionErrorResponse) b.x(serialDescriptor, 26, AgentTaskSessionErrorResponse$$serializer.INSTANCE, agentTaskSessionErrorResponse);
                    i = 67108864;
                    i2 |= i;
                    hVarArr2 = hVarArr;
                default:
                    throw new UnknownFieldException(t);
            }
        }
        b.g(serialDescriptor);
        return new AgentTaskSessionResponse(i2, str2, str3, j, j2, j3, j4, str5, str6, eVar, str7, str8, str13, str9, str10, str11, list, str14, j5, i3, str15, g3Var, str, str4, j6, str12, d, agentTaskSessionErrorResponse);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v5 xn.e, still in use, count: 2, list:
          (r2v5 xn.e) from 0x0107: IF  (r2v5 xn.e) != (wrap:xn.e:0x0103: SGET  A[WRAPPED] (LINE:3) xn.eShadow.u xn.e)  -> B:36:0x0109 A[HIDDEN] (LINE:3)
          (r2v5 xn.e) from 0x0109: PHI (r2v33 xn.e) = (r2v5 xn.e) binds: [B:131:0x0107] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:125)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public final void serialize(kotlinx.serialization.encoding.Encoder r42, com.github.service.dotcom.models.response.copilot.AgentTaskSessionResponse r43) {
        /*
            Method dump skipped, instructions count: 657
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.service.dotcom.models.response.copilot.AgentTaskSessionResponse$$serializer.serialize(kotlinx.serialization.encoding.Encoder, com.github.service.dotcom.models.response.copilot.AgentTaskSessionResponse):void");
    }

    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1Shadow.b;
    }
}
