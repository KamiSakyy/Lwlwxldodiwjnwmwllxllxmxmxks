package com.github.rudroid.shortcuts.navigation;

import g81.e;
import ig.c;
import k71.k;
import k81.c1;
import kotlinx.serialization.KSerializer;

@e
/* loaded from: /home/user/work/p/classes3.dex */
public final class ShortcutViewRoute implements c {
    public static final Companion Companion = new Companion();
    public String a;

    public static final class Companion {
        public final KSerializer serializer() {
            return ShortcutViewRoute$$serializer.INSTANCE;
        }
    }

    public ShortcutViewRoute(String str) {
        k.g(str, "shortcutId");
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ShortcutViewRoute) && k.b(this.a, ((ShortcutViewRoute) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1.e.z("ShortcutViewRoute(shortcutId=", this.a, ")");
    }

    public /* synthetic */ ShortcutViewRoute(String str, int i) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            c1.l(i, 1, ShortcutViewRoute$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }
}
