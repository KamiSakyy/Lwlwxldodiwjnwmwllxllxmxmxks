package com.github.rudroid.starredreposandlists.navigation;

import g81.e;
import k71.k;
import k81.c1;
import kotlinx.serialization.KSerializer;
import mg.c;

@e
/* loaded from: /home/user/work/p/classes3.dex */
public final class StarredReposAndListsEntryPointRoute implements c {
    public static final Companion Companion = new Companion();
    public final String a;

    public static final class Companion {
        public final KSerializer serializer() {
            return StarredReposAndListsEntryPointRoute$$serializer.INSTANCE;
        }
    }

    public StarredReposAndListsEntryPointRoute(String str) {
        k.g(str, "login");
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StarredReposAndListsEntryPointRoute) && k.b(this.a, ((StarredReposAndListsEntryPointRoute) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1.e.z("StarredReposAndListsEntryPointRoute(login=", this.a, ")");
    }

    public /* synthetic */ StarredReposAndListsEntryPointRoute(String str, int i) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            c1.l(i, 1, StarredReposAndListsEntryPointRoute$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }
}
