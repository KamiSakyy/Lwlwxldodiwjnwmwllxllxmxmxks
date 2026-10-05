package com.github.rudroid.agents.chatthreads.navigation;

import a0.c2;
import g81.e;
import kotlinx.serialization.KSerializer;
import sy.w;
import w61.i;

@e
/* loaded from: /home/user/work/p/classes.dex */
public final class ChatThreadsNavRoute {
    public static final ChatThreadsNavRoute INSTANCE = new ChatThreadsNavRoute();

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ Object f6697a = w.s(i.r, new c2(9));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ChatThreadsNavRoute);
    }

    public final int hashCode() {
        return 1448198941;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, w61.h] */
    public final KSerializer serializer() {
        return (KSerializer) f6697a.getValue();
    }

    public final String toString() {
        return "ChatThreadsNavRoute";
    }
}
