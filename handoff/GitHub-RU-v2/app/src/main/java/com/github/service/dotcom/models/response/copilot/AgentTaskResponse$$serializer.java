package com.github.service.dotcom.models.response.copilot;

import java.util.List;
import k71.k;
import k81.c1;
import k81.d0;
import k81.e1;
import k81.g;
import k81.l0;
import k81.q1;
import k81.r0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import m71.a;
import w61.c;
import w61.h;
import xn.e;

@c
/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class AgentTaskResponse$$serializer implements d0 {
    public static final AgentTaskResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        AgentTaskResponse$$serializer agentTaskResponse$$serializer = new AgentTaskResponse$$serializer();
        INSTANCE = agentTaskResponse$$serializer;
        e1 e1Var = new e1("com.github.service.dotcom.models.response.copilot.AgentTaskResponse", agentTaskResponse$$serializer, 15);
        e1Var.l("id", true);
        e1Var.l("name", true);
        e1Var.l("state", true);
        e1Var.l("created_at", true);
        e1Var.l("last_updated_at", true);
        e1Var.l("archived_at", true);
        e1Var.l("creator_id", true);
        e1Var.l("owner_id", true);
        e1Var.l("repo_id", true);
        e1Var.l("session_count", true);
        e1Var.l("agent_collaborators", true);
        e1Var.l("artifacts", true);
        e1Var.l("user_collaborators", true);
        e1Var.l("remote_steerable", true);
        e1Var.l("sessions", true);
        descriptor = e1Var;
    }

    private AgentTaskResponse$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer[] childSerializers() {
        h[] hVarArr = AgentTaskResponse.p;
        q1 q1Var = q1.a;
        r0 r0Var = r0.a;
        return new KSerializer[]{q1Var, q1Var, hVarArr[2].getValue(), q1Var, q1Var, a.z(q1Var), r0Var, r0Var, r0Var, l0.a, hVarArr[10].getValue(), hVarArr[11].getValue(), hVarArr[12].getValue(), a.z(g.a), hVarArr[14].getValue()};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final AgentTaskResponse m99deserialize(Decoder decoder) {
        h[] hVarArr;
        k.g(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        j81.a b = decoder.b(serialDescriptor);
        h[] hVarArr2 = AgentTaskResponse.p;
        List list = null;
        Boolean bool = null;
        List list2 = null;
        String str = null;
        String str2 = null;
        e eVar = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        int i = 0;
        boolean z = true;
        int i2 = 0;
        List list3 = null;
        List list4 = null;
        while (z) {
            int t = b.t(serialDescriptor);
            switch (t) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    hVarArr = hVarArr2;
                    str = b.r(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    hVarArr = hVarArr2;
                    str2 = b.r(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    hVarArr = hVarArr2;
                    eVar = (e) b.A(serialDescriptor, 2, (KSerializer) hVarArr[2].getValue(), eVar);
                    i |= 4;
                    break;
                case 3:
                    hVarArr = hVarArr2;
                    str3 = b.r(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    hVarArr = hVarArr2;
                    str4 = b.r(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    hVarArr = hVarArr2;
                    str5 = (String) b.x(serialDescriptor, 5, q1.a, str5);
                    i |= 32;
                    break;
                case 6:
                    hVarArr = hVarArr2;
                    j = b.f(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    hVarArr = hVarArr2;
                    j2 = b.f(serialDescriptor, 7);
                    i |= 128;
                    break;
                case 8:
                    hVarArr = hVarArr2;
                    j3 = b.f(serialDescriptor, 8);
                    i |= 256;
                    break;
                case 9:
                    hVarArr = hVarArr2;
                    i2 = b.m(serialDescriptor, 9);
                    i |= 512;
                    break;
                case 10:
                    hVarArr = hVarArr2;
                    list = (List) b.A(serialDescriptor, 10, (KSerializer) hVarArr[10].getValue(), list);
                    i |= 1024;
                    break;
                case 11:
                    hVarArr = hVarArr2;
                    list3 = (List) b.A(serialDescriptor, 11, (KSerializer) hVarArr[11].getValue(), list3);
                    i |= 2048;
                    break;
                case 12:
                    hVarArr = hVarArr2;
                    list4 = (List) b.A(serialDescriptor, 12, (KSerializer) hVarArr[12].getValue(), list4);
                    i |= 4096;
                    break;
                case 13:
                    hVarArr = hVarArr2;
                    bool = (Boolean) b.x(serialDescriptor, 13, g.a, bool);
                    i |= 8192;
                    break;
                case 14:
                    hVarArr = hVarArr2;
                    list2 = (List) b.A(serialDescriptor, 14, (KSerializer) hVarArr2[14].getValue(), list2);
                    i |= 16384;
                    break;
                default:
                    throw new UnknownFieldException(t);
            }
            hVarArr2 = hVarArr;
        }
        b.g(serialDescriptor);
        return new AgentTaskResponse(i, str, str2, eVar, str3, str4, str5, j, j2, j3, i2, list, list3, list4, bool, list2);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v21 java.util.List, still in use, count: 2, list:
          (r1v21 java.util.List) from 0x00fd: INVOKE (r1v21 java.util.List), (r2v7 x61.r) STATIC call: k71.k.b(java.lang.Object, java.lang.Object):boolean A[WRAPPED]
          (r1v21 java.util.List) from 0x0103: PHI (r1v36 java.util.List) = (r1v21 java.util.List) binds: [B:69:0x0101] A[DONT_GENERATE, DONT_INLINE]
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
    public final void serialize(kotlinx.serialization.encoding.Encoder r24, com.github.service.dotcom.models.response.copilot.AgentTaskResponse r25) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.service.dotcom.models.response.copilot.AgentTaskResponse$$serializer.serialize(kotlinx.serialization.encoding.Encoder, com.github.service.dotcom.models.response.copilot.AgentTaskResponse):void");
    }

    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1.b;
    }
}
