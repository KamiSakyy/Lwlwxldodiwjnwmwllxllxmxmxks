package com.github.service.dotcom.models.response.copilot.serialization;

import k71.k;
import k71.x;
import k81.n0;
import kotlinx.serialization.KSerializer;
import l81.j;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d extends n0 {
    public static final d d = new d(x.a(c.class));

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public final KSerializer c(kotlinx.serialization.json.b bVar) {
        k.g(bVar, "element");
        kotlinx.serialization.json.b bVar2 = (kotlinx.serialization.json.b) j.e(bVar).get("type");
        String a = bVar2 != null ? j.f(bVar2).a() : null;
        if (a != null) {
            switch (a.hashCode()) {
                case -599445191:
                    if (a.equals("complete")) {
                        return ChatServerSentEventDataResponse$Complete.Companion.serializer();
                    }
                    break;
                case -211700138:
                    if (a.equals("functionCall")) {
                        return ChatServerSentEventDataResponse$FunctionCall.Companion.serializer();
                    }
                    break;
                case 95458899:
                    if (a.equals("debug")) {
                        return ChatServerSentEventDataResponse$Debug.Companion.serializer();
                    }
                    break;
                case 96784904:
                    if (a.equals("error")) {
                        return ChatServerSentEventDataResponse$Error.Companion.serializer();
                    }
                    break;
                case 951530617:
                    if (a.equals("content")) {
                        return ChatServerSentEventDataResponse$Content.Companion.serializer();
                    }
                    break;
                case 2099153973:
                    if (a.equals("confirmation")) {
                        return ChatServerSentEventDataResponse$AgentConfirmation.Companion.serializer();
                    }
                    break;
            }
        }
        return ChatServerSentEventDataResponse$Unknown.Companion.serializer();
    }
}
