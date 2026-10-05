package com.github.rudroid.shortcuts.navigation;

import g81.e;
import hz.k;
import kotlinx.serialization.KSerializer;
import sy.w;
import w61.i;

@e
/* loaded from: /home/user/work/p/classes3.dex */
public final class ShortcutsOverviewRoute {
    public static final ShortcutsOverviewRoute INSTANCE = new ShortcutsOverviewRoute();
    public static final /* synthetic */ Object a = w.s(i.r, new k(20));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ShortcutsOverviewRoute);
    }

    public final int hashCode() {
        return -503257633;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, w61.h] */
    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }

    public final String toString() {
        return "ShortcutsOverviewRoute";
    }
}
