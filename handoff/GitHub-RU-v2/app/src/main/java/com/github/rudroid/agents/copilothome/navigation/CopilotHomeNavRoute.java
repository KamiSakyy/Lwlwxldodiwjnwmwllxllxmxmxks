package com.github.rudroid.agents.copilothome.navigation;

import com.github.rudroid.agents.p;
import kotlinx.serialization.KSerializer;
import sy.w;

@g81.e
/* loaded from: /home/user/work/p/classes.dex */
public final class CopilotHomeNavRoute {
    public static final CopilotHomeNavRoute INSTANCE = new CopilotHomeNavRoute();

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ Object f6786a = w.s(w61.i.r, new p(4));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof CopilotHomeNavRoute);
    }

    public final int hashCode() {
        return 867236381;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, w61.h] */
    public final KSerializer serializer() {
        return (KSerializer) f6786a.getValue();
    }

    public final String toString() {
        return "CopilotHomeNavRoute";
    }
}
