package com.github.rudroid.agents.copilothome.navigation;

import com.github.rudroid.agents.p;
import kotlinx.serialization.KSerializer;
import sy.w;

@g81.e
/* loaded from: /home/user/work/p/classes.dex */
public final class CopilotHomeEntryPointRoute {
    public static final CopilotHomeEntryPointRoute INSTANCE = new CopilotHomeEntryPointRoute();

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ Object f6785a = w.s(w61.i.r, new p(3));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof CopilotHomeEntryPointRoute);
    }

    public final int hashCode() {
        return 460752276;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, w61.h] */
    public final KSerializer serializer() {
        return (KSerializer) f6785a.getValue();
    }

    public final String toString() {
        return "CopilotHomeEntryPointRoute";
    }
}
