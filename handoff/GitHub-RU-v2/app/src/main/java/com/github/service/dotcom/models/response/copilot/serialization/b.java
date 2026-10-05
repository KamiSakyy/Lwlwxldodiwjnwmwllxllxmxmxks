package com.github.service.dotcom.models.response.copilot.serialization;

import k71.k;
import k71.x;
import k81.n0;
import kotlinx.serialization.KSerializer;
import l81.j;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b extends n0 {
    public static final b d = new b(x.a(a.class));

    public final KSerializer c(kotlinx.serialization.json.b bVar) {
        k.g(bVar, "element");
        kotlinx.serialization.json.b bVar2 = (kotlinx.serialization.json.b) j.e(bVar).get("type");
        String a = bVar2 != null ? j.f(bVar2).a() : null;
        if (a != null) {
            int hashCode = a.hashCode();
            if (hashCode != -406233535) {
                if (hashCode != 3143036) {
                    if (hashCode == 1950800714 && a.equals("repository")) {
                        return ChatMessageReferenceResponse$RepositoryReferenceResponse.Companion.serializer();
                    }
                } else if (a.equals("file")) {
                    return ChatMessageReferenceResponse$FileReferenceResponse.Companion.serializer();
                }
            } else if (a.equals("web-search")) {
                return ChatMessageReferenceResponse$WebSearchReferenceResponse.Companion.serializer();
            }
        }
        return ChatMessageReferenceResponse$UnknownReferenceResponse.Companion.serializer();
    }
}
